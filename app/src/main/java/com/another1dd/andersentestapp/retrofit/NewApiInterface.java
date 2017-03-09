package com.another1dd.andersentestapp.retrofit;


import com.another1dd.andersentestapp.model.EarthPorn;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewApiInterface {
    @GET("/r/EarthPorn/new/.json")
    Call<EarthPorn> getEarthporn(@Query("limit") int limit);
}
