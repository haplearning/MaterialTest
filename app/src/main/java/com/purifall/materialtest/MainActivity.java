package com.purifall.materialtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.purifall.materialtest.adapters.DesignAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final ArrayList<String> DESIGN_LIST = new ArrayList<String>(){
        {
            add("Toolbar");
            add("DrawerLayout");

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView designRecycView = findViewById(R.id.designRecycView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        designRecycView.setLayoutManager(linearLayoutManager);
        DesignAdapter adapter = new DesignAdapter(this, DESIGN_LIST);
        designRecycView.setAdapter(adapter);
    }
}