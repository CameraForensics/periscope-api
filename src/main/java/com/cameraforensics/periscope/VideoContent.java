package com.cameraforensics.periscope;

import net.bramp.ffmpeg.probe.FFmpegProbeResult;

import java.io.File;

public class VideoContent {

    private File temporaryVideoFile;

    private byte[] content;

    private FFmpegProbeResult probeMetadata;

    public VideoContent(File temporaryVideoFile, byte[] content, FFmpegProbeResult probeMetadata) {
        this.temporaryVideoFile = temporaryVideoFile;
        this.content = content;
        this.probeMetadata = probeMetadata;
    }

    public File getTemporaryVideoFile() {
        return temporaryVideoFile;
    }

    public byte[] getContent() {
        return content;
    }

    public FFmpegProbeResult getProbeMetadata() {
        return probeMetadata;
    }
}
