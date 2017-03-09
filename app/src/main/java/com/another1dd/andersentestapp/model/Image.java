package com.another1dd.andersentestapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class Image {
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("resolutions")
    @Expose
    public List<Resolution> resolutions = null;
    @SerializedName("variants")
    @Expose
    public Variants variants;
    @SerializedName("id")
    @Expose
    public String id;

    public Source getSource() {
        return source;
    }
}
