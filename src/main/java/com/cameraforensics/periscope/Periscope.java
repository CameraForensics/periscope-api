package com.cameraforensics.periscope;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.zip.GZIPInputStream;

public class Periscope {

    private static Logger log = LoggerFactory.getLogger(Periscope.class);

    private static final String API_ENDPOINT = "https://api.periscope.tv/api/v2/";
    private static final String BROADCAST_SEARCH_PUBLIC = API_ENDPOINT + "broadcastSearchPublic";
    private static final String ACCESS_VIDEO_PUBLIC = API_ENDPOINT + "accessVideoPublic";
    private static final String GET_USER_PUBLIC = API_ENDPOINT + "getUserPublic";

    private ObjectMapper objectMapper = new ObjectMapper();

    public VideoContent downloadVideo(final Video video) throws IOException {
        String fileName = UUID.randomUUID().toString();
        File file = File.createTempFile(fileName, ".mp4");
        log.info("Writing video file to temporary file: {}", file.getAbsolutePath());

        List<String> args = Arrays.asList("-y", "-i", video.getReplayUrl(), "-c", "copy", "-bsf:a", "aac_adtstoasc", file.getAbsolutePath());

        FFmpeg ffmpeg = new FFmpeg();
        ffmpeg.run(args);

        log.info("Video retrieval complete. Extracting frame data...");

        FFprobe ffprobe = new FFprobe();
        FFmpegProbeResult probeResult = ffprobe.probe(file.getAbsolutePath());

        return new VideoContent(file, probeResult);
    }

    public Video accessVideoPublic(final String broadcastId) throws IOException {
        String json = accessVideoPublicAsString(broadcastId);
        if (json != null && json.length() > 0) {
            return objectMapper.readValue(json, Video.class);
        }

        return null;
    }

    public String accessVideoPublicAsString(final String broadcastId) throws IOException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("broadcast_id", broadcastId);
        parameters.put("replay_redirect", "false");

        return doGet(ACCESS_VIDEO_PUBLIC, parameters);
    }

    public List<Broadcast> broadcastSearchPublic(final String search) throws IOException {
        String json = broadcastSearchPublicAsString(search);
        if (json != null && json.length() > 0) {
            log.debug("Response body={}", json);
            return Arrays.asList(objectMapper.readValue(json, Broadcast[].class));
        }

        return null;
    }

    public String broadcastSearchPublicAsString(final String search) throws IOException {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("search", search);
        parameters.put("include_replay", true);

        return doPost(BROADCAST_SEARCH_PUBLIC, objectMapper.writeValueAsString(parameters));
    }

    public User getUserPublic(final String userId) throws IOException {
        String json = getUserPublicAsString(userId);
        if (json != null && json.length() > 0) {
            UserSearchResult result = objectMapper.readValue(json, UserSearchResult.class);
            if (result != null) {
                return result.getUser();
            }
        }

        return null;
    }

    public String getUserPublicAsString(final String userId) throws IOException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("user_id", userId);

        return doGet(GET_USER_PUBLIC, parameters);
    }

    private String processResponse(Response response) throws IOException {
        log.debug("Response: successful={} code={}", response.isSuccessful(), response.code());
        if (response.isSuccessful() && response.code() >= 200 && response.code() < 300) {
            String contentEncoding = response.header("Content-Encoding");
            InputStream is;
            if (contentEncoding != null && !contentEncoding.contains("gzip")) {
                is = response.body().byteStream();
            }
            else {
                is = new GZIPInputStream(response.body().byteStream());
            }
            String json = IOUtils.toString(is, "UTF-8");

            return json;
        }

        return null;
    }


    private String doPost(final String endpoint, final String payload) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, payload);
        Request request = new Request.Builder()
                .url(endpoint)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Host", "api.periscope.tv")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Content-Length", (payload != null ? String.valueOf(payload.length()) : "0"))
                .addHeader("Connection", "keep-alive")
                .build();


        Response response = client.newCall(request).execute();
        return processResponse(response);
    }

    private String doGet(final String endpoint, final Map<String, String> parameters) throws IOException {

        HttpUrl.Builder httpBuilder = HttpUrl.parse(endpoint).newBuilder();
        if (parameters != null) {
            for(Map.Entry<String, String> param : parameters.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(httpBuilder.build())
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "*/*")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Host", "api.periscope.tv")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Connection", "keep-alive")
                .build();

        Response response = client.newCall(request).execute();
        return processResponse(response);
    }

}
