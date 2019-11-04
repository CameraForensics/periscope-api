package com.cameraforensics.periscope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video implements Serializable {

    private String session;

    @JsonProperty("replay_url")
    private String replayUrl;

    @JsonProperty("hls_is_encrypted")
    private Boolean hlsIsEncrypted;

    @JsonProperty("lhls_is_encrypted")
    private Boolean lhlsIsEncrypted;

    private String type;

    @JsonProperty("media_configuration")
    private String mediaConfiguration;

    @JsonProperty("chat_token")
    private String chatToken;

    @JsonProperty("life_cycle_token")
    private String lifeCycleToken;

    private Broadcast broadcast;

    @JsonProperty("share_url")
    private String shareUrl;

    @JsonProperty("autoplay_view_threshold")
    private Integer autoplayViewThreshold;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getReplayUrl() {
        return replayUrl;
    }

    public void setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
    }

    public Boolean getHlsIsEncrypted() {
        return hlsIsEncrypted;
    }

    public void setHlsIsEncrypted(Boolean hlsIsEncrypted) {
        this.hlsIsEncrypted = hlsIsEncrypted;
    }

    public Boolean getLhlsIsEncrypted() {
        return lhlsIsEncrypted;
    }

    public void setLhlsIsEncrypted(Boolean lhlsIsEncrypted) {
        this.lhlsIsEncrypted = lhlsIsEncrypted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaConfiguration() {
        return mediaConfiguration;
    }

    public void setMediaConfiguration(String mediaConfiguration) {
        this.mediaConfiguration = mediaConfiguration;
    }

    public String getChatToken() {
        return chatToken;
    }

    public void setChatToken(String chatToken) {
        this.chatToken = chatToken;
    }

    public String getLifeCycleToken() {
        return lifeCycleToken;
    }

    public void setLifeCycleToken(String lifeCycleToken) {
        this.lifeCycleToken = lifeCycleToken;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Integer getAutoplayViewThreshold() {
        return autoplayViewThreshold;
    }

    public void setAutoplayViewThreshold(Integer autoplayViewThreshold) {
        this.autoplayViewThreshold = autoplayViewThreshold;
    }
}