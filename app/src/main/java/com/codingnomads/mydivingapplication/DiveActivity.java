package com.codingnomads.mydivingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Arrays;

public class DiveActivity extends AppCompatActivity {
    private RecyclerView diveListView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myList = {"one" , "two" , "three"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive);
        diveListView = findViewById(R.id.dive_recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        diveListView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(myList);
        diveListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
