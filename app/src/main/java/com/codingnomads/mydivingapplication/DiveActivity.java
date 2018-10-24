package com.codingnomads.mydivingapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiveActivity extends AppCompatActivity {
    private RecyclerView diveListView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive);
        diveListView = findViewById(R.id.dive_recyclerview);

        mLayoutManager = new LinearLayoutManager(this);
        diveListView.setLayoutManager(mLayoutManager);


        final List<Dive> allDives = new ArrayList<>();
        mAdapter = new MyAdapter(allDives);

        final DiveService diveService = new DiveService(new DiveRepository(createRestTemplate()));
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                allDives.clear();
                allDives.addAll(diveService.getAllDives());
                mAdapter.notifyDataSetChanged();
            }
        });
        thread.start();


        diveListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @NonNull
    private RestTemplate createRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        return restTemplate;
    }
}
