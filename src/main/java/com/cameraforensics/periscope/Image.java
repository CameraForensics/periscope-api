package com.cameraforensics.periscope;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

    private String url;

    @JsonProperty("ssl_url")
    private String sslUrl;

    private Integer width;

    private Integer height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSslUrl() {
        return sslUrl;
    }

    public void setSslUrl(String sslUrl) {
        this.sslUrl = sslUrl;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
