package com.another1dd.andersentestapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class EarthPornFragment extends Fragment {
    ArrayList<String> imagesUrls;

    public EarthPornFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        imagesUrls = bundle.getStringArrayList("images");
        ListView listView = new ListView(getContext());
        listView.setAdapter(new ImageListAdapter(getContext(),imagesUrls));

        return listView;
    }

    private class ImageListAdapter extends ArrayAdapter {
        private Context context;
        private LayoutInflater inflater;

        private List<String> imageUrls;

        ImageListAdapter(Context context, List<String> imageUrls) {
            super(context, R.layout.listview_card, imageUrls);

            this.context = context;
            this.imageUrls = imageUrls;

            inflater = LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent) {
            if (null == convertView) {
                convertView = inflater.inflate(R.layout.listview_card, parent, false);
            }
            position = position * 3;
            Picasso
                    .with(context)
                    .load(imageUrls.get(position))
                    .fit()
                    .into((ImageView) convertView.findViewById(R.id.first_img));
            Picasso
                    .with(context)
                    .load(imageUrls.get(position + 1))
                    .fit()
                    .into((ImageView) convertView.findViewById(R.id.second_img));
            Picasso
                    .with(context)
                    .load(imageUrls.get(position + 2))
                    .fit()
                    .into((ImageView) convertView.findViewById(R.id.third_img));

            return convertView;
        }

        @Override
        public int getCount() {
            return imageUrls.size()/3;
        }
    }

}
