package com.another1dd.andersentestapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.another1dd.andersentestapp.model.Child;
import com.another1dd.andersentestapp.model.ChildData;
import com.another1dd.andersentestapp.model.Data;
import com.another1dd.andersentestapp.model.EarthPorn;
import com.another1dd.andersentestapp.retrofit.NewApiInterface;
import com.another1dd.andersentestapp.retrofit.TopApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String BASE_URL = "https://www.reddit.com";
    Retrofit client;
    public ArrayList<String> imagesUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit client = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    void topButtonClick() {
        TopApiInterface service = client.create(TopApiInterface.class);
        Call<EarthPorn> call = service.getEarthporn(100);


        call.enqueue(new Callback<EarthPorn>() {

            @Override
            public void onResponse(Call<EarthPorn> call, Response<EarthPorn> response) {

                EarthPorn earthPorn = response.body();
                Data data = earthPorn.getData();
                List<Child> childList = data.getChildren();
                for (Child child : childList) {
                    ChildData childData = child.getData();
                    if (childData.getPostHint().equals("image")) {
                        imagesUrls.add(childData.getUrl());
                    }
                }

                Bundle bundle = new Bundle();
                bundle.putStringArrayList("images", imagesUrls);

            }

            @Override
            public void onFailure(Call<EarthPorn> call, Throwable t) {

            }
        });

    }

    void newButtonClick() {
        NewApiInterface service = client.create(NewApiInterface.class);
        Call<EarthPorn> call = service.getEarthporn(100);


        call.enqueue(new Callback<EarthPorn>() {

            @Override
            public void onResponse(Call<EarthPorn> call, Response<EarthPorn> response) {

                EarthPorn earthPorn = response.body();
                Data data = earthPorn.getData();
                List<Child> childList = data.getChildren();
                for (Child child : childList) {
                    ChildData childData = child.getData();
                    if (childData.getPostHint().equals("image")) {
                        imagesUrls.add(childData.getUrl());
                    }
                }

                Bundle bundle = new Bundle();
                bundle.putStringArrayList("images", imagesUrls);

            }

            @Override
            public void onFailure(Call<EarthPorn> call, Throwable t) {

            }
        });
    }
}
