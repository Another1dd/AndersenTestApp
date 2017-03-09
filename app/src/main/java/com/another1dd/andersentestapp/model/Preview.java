package com.another1dd.andersentestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


class Preview {
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("enabled")
    @Expose
    public Boolean enabled;

    public List<Image> getImages() {
        return images;
    }
}
