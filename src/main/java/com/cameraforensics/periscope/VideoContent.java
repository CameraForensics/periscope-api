package com.cameraforensics.periscope;

import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class VideoContent {

    private File temporaryVideoFile;

    private FFmpegProbeResult probeMetadata;

    public VideoContent(File temporaryVideoFile, FFmpegProbeResult probeMetadata) {
        this.temporaryVideoFile = temporaryVideoFile;
        this.probeMetadata = probeMetadata;
    }

    public File getTemporaryVideoFile() {
        return temporaryVideoFile;
    }

    public byte[] getContent() throws IOException {
        return FileUtils.readFileToByteArray(temporaryVideoFile);
    }

    public FFmpegProbeResult getProbeMetadata() {
        return probeMetadata;
    }
}
