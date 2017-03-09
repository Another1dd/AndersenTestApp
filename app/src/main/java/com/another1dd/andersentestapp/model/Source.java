package com.another1dd.andersentestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Source {
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("width")
    @Expose
    public Integer width;
    @SerializedName("height")
    @Expose
    public Integer height;
}
