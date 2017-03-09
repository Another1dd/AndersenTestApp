package com.another1dd.andersentestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ChildData {
    @SerializedName("contest_mode")
    @Expose
    public Boolean contestMode;
    @SerializedName("banned_by")
    @Expose
    public Object bannedBy;
    @SerializedName("media_embed")
    @Expose
    public MediaEmbed mediaEmbed;
    @SerializedName("subreddit")
    @Expose
    public String subreddit;
    @SerializedName("selftext_html")
    @Expose
    public Object selftextHtml;
    @SerializedName("selftext")
    @Expose
    public String selftext;
    @SerializedName("likes")
    @Expose
    public Object likes;
    @SerializedName("suggested_sort")
    @Expose
    public Object suggestedSort;
    @SerializedName("user_reports")
    @Expose
    public List<Object> userReports = null;
    @SerializedName("secure_media")
    @Expose
    public Object secureMedia;
    @SerializedName("link_flair_text")
    @Expose
    public String linkFlairText;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("gilded")
    @Expose
    public Integer gilded;
    @SerializedName("secure_media_embed")
    @Expose
    public SecureMediaEmbed secureMediaEmbed;
    @SerializedName("clicked")
    @Expose
    public Boolean clicked;
    @SerializedName("score")
    @Expose
    public Integer score;
    @SerializedName("report_reasons")
    @Expose
    public Object reportReasons;
    @SerializedName("author")
    @Expose
    public String author;
    @SerializedName("saved")
    @Expose
    public Boolean saved;
    @SerializedName("mod_reports")
    @Expose
    public List<Object> modReports = null;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("subreddit_name_prefixed")
    @Expose
    public String subredditNamePrefixed;
    @SerializedName("approved_by")
    @Expose
    public Object approvedBy;
    @SerializedName("over_18")
    @Expose
    public Boolean over18;
    @SerializedName("domain")
    @Expose
    public String domain;
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;
    @SerializedName("preview")
    @Expose
    public Preview preview;
    @SerializedName("thumbnail")
    @Expose
    public String thumbnail;
    @SerializedName("subreddit_id")
    @Expose
    public String subredditId;
    @SerializedName("edited")
    @Expose
    public Boolean edited;
    @SerializedName("link_flair_css_class")
    @Expose
    public String linkFlairCssClass;
    @SerializedName("author_flair_css_class")
    @Expose
    public Object authorFlairCssClass;
    @SerializedName("downs")
    @Expose
    public Integer downs;
    @SerializedName("brand_safe")
    @Expose
    public Boolean brandSafe;
    @SerializedName("archived")
    @Expose
    public Boolean archived;
    @SerializedName("removal_reason")
    @Expose
    public Object removalReason;
    @SerializedName("post_hint")
    @Expose
    private String postHint;
    @SerializedName("is_self")
    @Expose
    public Boolean isSelf;
    @SerializedName("hide_score")
    @Expose
    public Boolean hideScore;
    @SerializedName("spoiler")
    @Expose
    public Boolean spoiler;
    @SerializedName("permalink")
    @Expose
    public String permalink;
    @SerializedName("num_reports")
    @Expose
    public Object numReports;
    @SerializedName("locked")
    @Expose
    public Boolean locked;
    @SerializedName("stickied")
    @Expose
    public Boolean stickied;
    @SerializedName("created")
    @Expose
    public Float created;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("author_flair_text")
    @Expose
    public Object authorFlairText;
    @SerializedName("quarantine")
    @Expose
    public Boolean quarantine;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("created_utc")
    @Expose
    public Float createdUtc;
    @SerializedName("distinguished")
    @Expose
    public Object distinguished;
    @SerializedName("media")
    @Expose
    public Object media;
    @SerializedName("num_comments")
    @Expose
    public Integer numComments;
    @SerializedName("visited")
    @Expose
    public Boolean visited;
    @SerializedName("subreddit_type")
    @Expose
    public String subredditType;
    @SerializedName("ups")
    @Expose
    public Integer ups;

    public String getUrl() {
        return url;
    }

    public String getPostHint() {
        return postHint;
    }
}
