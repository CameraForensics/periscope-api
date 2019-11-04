package com.cameraforensics.periscope;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

    @JsonProperty("class_name")
    private String className;

    private String id;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'")
    private Date createdAt;

    @JsonProperty("is_beta_user")
    private Boolean isBetaUser;

    @JsonProperty("is_employee")
    private Boolean isEmployee;

    @JsonProperty("is_twitter_verified")
    private Boolean isTwitterVerified;

    @JsonProperty("twitter_screen_name")
    private String twitterScreenName;

    private String username;

    @JsonProperty("display_name")
    private String displayName;

    private String description;

    @JsonProperty("profile_image_urls")
    private List<Image> profileImageUrls;

    @JsonProperty("twitter_id")
    private String twitterId;

    private String initials;

    @JsonProperty("n_followers")
    private Integer numberOfFollowers;

    @JsonProperty("n_following")
    private Integer numberFollowing;

    @JsonProperty("n_hearts")
    private Long numberOfHearts;

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

    public Boolean getBetaUser() {
        return isBetaUser;
    }

    public void setBetaUser(Boolean betaUser) {
        isBetaUser = betaUser;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    public Boolean getTwitterVerified() {
        return isTwitterVerified;
    }

    public void setTwitterVerified(Boolean twitterVerified) {
        isTwitterVerified = twitterVerified;
    }

    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getProfileImageUrls() {
        return profileImageUrls;
    }

    public void setProfileImageUrls(List<Image> profileImageUrls) {
        this.profileImageUrls = profileImageUrls;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Integer getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(Integer numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public Integer getNumberFollowing() {
        return numberFollowing;
    }

    public void setNumberFollowing(Integer numberFollowing) {
        this.numberFollowing = numberFollowing;
    }

    public Long getNumberOfHearts() {
        return numberOfHearts;
    }

    public void setNumberOfHearts(Long numberOfHearts) {
        this.numberOfHearts = numberOfHearts;
    }
}
