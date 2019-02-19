package com.example.kerish.databinding_recyclerview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.kerish.databinding_recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.recyclerID.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerID.setHasFixedSize(true);

        adapter = new RecyclerAdapter(this, prepareUser());
        activityMainBinding.recyclerID.setAdapter(adapter);
    }

    private List<UserPOJO> prepareUser(){
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> emails = Arrays.asList(getResources().getStringArray(R.array.emails));
        int[] imageId = {R.drawable.kakashi, R.drawable.itachi, R.drawable.gaara, R.drawable.itachi2, R.drawable.tobi,
                         R.drawable.pain, R.drawable.spidey, R.drawable.gogeta, R.drawable.beerus, R.drawable.sasuke};

        List<UserPOJO> Names = new ArrayList<>();

        int count = 0;

        for(String name : names){
            Names.add(new UserPOJO(name, emails.get(count), imageId[count]));
            count++;
        }
        return Names;
    }

}
