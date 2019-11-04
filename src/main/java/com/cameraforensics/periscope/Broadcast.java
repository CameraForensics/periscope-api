package com.cameraforensics.periscope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Broadcast implements Serializable {

    @JsonProperty("class_name")
    private String className;

    private String id;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_display_name")
    private String userDisplayName;

    private String username;

    @JsonProperty("twitter_id")
    private String twitterId;

    @JsonProperty("twitter_username")
    private String twitterUsername;

    @JsonProperty("tweet_id")
    private String tweetId;

    @JsonProperty("profile_image_url")
    private String profileImageUrl;

    private String state;

    @JsonProperty("is_locked")
    private Boolean isLocked;

    @JsonProperty("private_chat")
    private Boolean privateChat;

    @JsonProperty("friend_chat")
    private Boolean friendChat;

    private String language;

    private Integer version;

    private Date start;

    private Date ping;

    private Date timedout;

    private Date end;

    @JsonProperty("replay_edited_start_time")
    private Integer replayEditedStartTime;

    @JsonProperty("replay_edited_thumbnail_time")
    private Integer replayEditedThumbnailTime;

    @JsonProperty("has_moderation")
    private Boolean hasModeration;

    @JsonProperty("moderator_channel")
    private String moderatorChannel;

    @JsonProperty("has_moderators")
    private Boolean hasModerators;

    @JsonProperty("enabled_sparkles")
    private Boolean enabledSparkles;

    @JsonProperty("accept_guests")
    private Boolean acceptGuests;

    @JsonProperty("has_location")
    private Boolean hasLocation;

    private String city;

    private String country;

    @JsonProperty("country_state")
    private String countryState;

    @JsonProperty("iso_code")
    private String countryISOCode;

    @JsonProperty("ip_lat")
    private Double ipLat;

    @JsonProperty("ip_lng")
    private Double ipLng;

    private Integer width;

    private Integer height;

    @JsonProperty("camera_rotation")
    private Integer cameraRotation;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("image_url_small")
    private String imageUrlSmall;

    @JsonProperty("image_url_medium")
    private String imageUrlMedium;

    private String status;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("broadcast_source")
    private String broadcastSource;

    @JsonProperty("available_for_replay")
    private Boolean availableForReplay;

    // In tests this was always -1, but could be something else, like a date. Watch for errors here!
    private Integer expiration;

    @JsonProperty("media_key")
    private String mediaKey;

    @JsonProperty("sort_score")
    private Integer sortScore;

    @JsonProperty("is_trusted")
    private Boolean isTrusted;

    @JsonProperty("n_total_watching")
    private Integer numberTotalWatching;

    @JsonProperty("n_watching")
    private Integer numberWatching;

    @JsonProperty("n_web_watching")
    private Integer numberWebWatching;

    @JsonProperty("is_360")
    private Boolean is360;

    @JsonProperty("is_high_latency")
    private Boolean isHighLatency;

    @JsonProperty("tweet_external")
    private Boolean tweetExternal;

    private List<String> tags;

    @JsonProperty("heart_theme")
    private List<String> heartTheme;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Boolean getPrivateChat() {
        return privateChat;
    }

    public void setPrivateChat(Boolean privateChat) {
        this.privateChat = privateChat;
    }

    public Boolean getFriendChat() {
        return friendChat;
    }

    public void setFriendChat(Boolean friendChat) {
        this.friendChat = friendChat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getPing() {
        return ping;
    }

    public void setPing(Date ping) {
        this.ping = ping;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getReplayEditedStartTime() {
        return replayEditedStartTime;
    }

    public void setReplayEditedStartTime(Integer replayEditedStartTime) {
        this.replayEditedStartTime = replayEditedStartTime;
    }

    public Integer getReplayEditedThumbnailTime() {
        return replayEditedThumbnailTime;
    }

    public void setReplayEditedThumbnailTime(Integer replayEditedThumbnailTime) {
        this.replayEditedThumbnailTime = replayEditedThumbnailTime;
    }

    public Boolean getHasModeration() {
        return hasModeration;
    }

    public void setHasModeration(Boolean hasModeration) {
        this.hasModeration = hasModeration;
    }

    public String getModeratorChannel() {
        return moderatorChannel;
    }

    public void setModeratorChannel(String moderatorChannel) {
        this.moderatorChannel = moderatorChannel;
    }

    public Boolean getHasModerators() {
        return hasModerators;
    }

    public void setHasModerators(Boolean hasModerators) {
        this.hasModerators = hasModerators;
    }

    public Boolean getEnabledSparkles() {
        return enabledSparkles;
    }

    public void setEnabledSparkles(Boolean enabledSparkles) {
        this.enabledSparkles = enabledSparkles;
    }

    public Boolean getAcceptGuests() {
        return acceptGuests;
    }

    public void setAcceptGuests(Boolean acceptGuests) {
        this.acceptGuests = acceptGuests;
    }

    public Boolean getHasLocation() {
        return hasLocation;
    }

    public void setHasLocation(Boolean hasLocation) {
        this.hasLocation = hasLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryState() {
        return countryState;
    }

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public Double getIpLat() {
        return ipLat;
    }

    public void setIpLat(Double ipLat) {
        this.ipLat = ipLat;
    }

    public Double getIpLng() {
        return ipLng;
    }

    public void setIpLng(Double ipLng) {
        this.ipLng = ipLng;
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

    public Integer getCameraRotation() {
        return cameraRotation;
    }

    public void setCameraRotation(Integer cameraRotation) {
        this.cameraRotation = cameraRotation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }

    public String getImageUrlMedium() {
        return imageUrlMedium;
    }

    public void setImageUrlMedium(String imageUrlMedium) {
        this.imageUrlMedium = imageUrlMedium;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBroadcastSource() {
        return broadcastSource;
    }

    public void setBroadcastSource(String broadcastSource) {
        this.broadcastSource = broadcastSource;
    }

    public Boolean getAvailableForReplay() {
        return availableForReplay;
    }

    public void setAvailableForReplay(Boolean availableForReplay) {
        this.availableForReplay = availableForReplay;
    }

    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public String getMediaKey() {
        return mediaKey;
    }

    public void setMediaKey(String mediaKey) {
        this.mediaKey = mediaKey;
    }

    public Integer getSortScore() {
        return sortScore;
    }

    public void setSortScore(Integer sortScore) {
        this.sortScore = sortScore;
    }

    public Boolean getTrusted() {
        return isTrusted;
    }

    public void setTrusted(Boolean trusted) {
        isTrusted = trusted;
    }

    public Integer getNumberTotalWatching() {
        return numberTotalWatching;
    }

    public void setNumberTotalWatching(Integer numberTotalWatching) {
        this.numberTotalWatching = numberTotalWatching;
    }

    public Integer getNumberWatching() {
        return numberWatching;
    }

    public void setNumberWatching(Integer numberWatching) {
        this.numberWatching = numberWatching;
    }

    public Integer getNumberWebWatching() {
        return numberWebWatching;
    }

    public void setNumberWebWatching(Integer numberWebWatching) {
        this.numberWebWatching = numberWebWatching;
    }

    public Boolean getIs360() {
        return is360;
    }

    public void setIs360(Boolean is360) {
        this.is360 = is360;
    }

    public Boolean getHighLatency() {
        return isHighLatency;
    }

    public void setHighLatency(Boolean highLatency) {
        isHighLatency = highLatency;
    }

    public Date getTimedout() {
        return timedout;
    }

    public void setTimedout(Date timedout) {
        this.timedout = timedout;
    }

    public Boolean getTweetExternal() {
        return tweetExternal;
    }

    public void setTweetExternal(Boolean tweetExternal) {
        this.tweetExternal = tweetExternal;
    }

    public List<String> getHeartTheme() {
        return heartTheme;
    }

    public void setHeartTheme(List<String> heartTheme) {
        this.heartTheme = heartTheme;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}