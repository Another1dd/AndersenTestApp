package com.another1dd.andersentestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("data")
    @Expose
    public ChildData data;

    public ChildData getData() {
        return data;
    }
}