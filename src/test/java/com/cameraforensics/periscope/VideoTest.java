package com.cameraforensics.periscope;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class VideoTest {

    @Test
    public void can_deserialize_video() throws JsonProcessingException {
        // given
        String videoJson = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/sample-video.json")))
                .lines().collect(Collectors.joining("\n"));

        ObjectMapper objectMapper = new ObjectMapper();

        // when
        Video video = objectMapper.readValue(videoJson, Video.class);

        // then
        assertNotNull(video);
        assertNotNull(video.getBroadcast());
        assertEquals("https://www.pscp.tv/w/1BRJjrkddvdJw", video.getShareUrl());
        assertEquals("https://prod-fastly-eu-central-1.video.periscope.tv/Transcoding/v1/hls/2y-1rl7KaGdQWF_cIumAW1M3RE7F2n7q29TbdHEi2xolBMexSaJ1qIodey68s0-LH8vSxDcGU7BF5zEp9qVP2Q/non_transcode/eu-central-1/periscope-replay-direct-prod-eu-central-1-public/master_dynamic_16925355504020822570.m3u8?type=replay", video.getReplayUrl());
        assertFalse(video.getHlsIsEncrypted());
        assertFalse(video.getLhlsIsEncrypted());
        assertEquals("StreamTypeReplay", video.getType());
        assertEquals("Interleaved", video.getMediaConfiguration());
        assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhbWJpZ3VvdXNfdXNlcl9pZCI6ImV5SlFkV0pzYVdOVmMyVnlTV1FpT2lKM1pXSXRZemt6WVRCa09XSXROekZpWXkwME1UbGhMVFl3TmpjdE5USm1ZVFV3TjJZNFpUUmxJbjA9IiwiYnJvYWRjYXN0X2lkIjoiMUJSSmpya2RkdmRKdyIsImV4cCI6MTU3MjM1NzQzOCwibG93X2xhdGVuY3kiOmZhbHNlLCJwYXJ0aWNpcGFudF9pbmRleCI6MCwicmVhZF9vbmx5Ijp0cnVlfQ.zOKheMmluk1wzCsV0KyXYmL-fGLj4tjPQayp11f2M1E", video.getChatToken());
        assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJicm9hZGNhc3RfaWQiOiIxQlJKanJrZGR2ZEp3IiwiY3JlYXRlZCI6MTU3MjI3MTAzOCwiZXhwIjoxNTcyMzU3NDM4LCJpZ25vcmUiOmZhbHNlLCJpc19oaWdobGlnaHRzIjpmYWxzZSwiaXNfbGl2ZSI6ZmFsc2UsInBhcnRpY2lwYW50X2luZGV4IjowLCJ0b2tlbl92ZXJzaW9uIjoxfQ.AvHxcYTAQvXieYMfA6wBWWrPdtIblEf85m7tEoLkOYc", video.getLifeCycleToken());
    }

}
