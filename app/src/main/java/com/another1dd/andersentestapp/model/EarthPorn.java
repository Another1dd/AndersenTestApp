package com.another1dd.andersentestapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EarthPorn {

    @SerializedName("kind")
    @Expose
    public String kind;
    @SerializedName("data")
    @Expose
    public Data data;

    public Data getData() {
        return data;
    }
}
