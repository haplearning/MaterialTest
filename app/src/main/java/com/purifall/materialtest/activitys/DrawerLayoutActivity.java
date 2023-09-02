package com.purifall.materialtest.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.purifall.materialtest.R;

public class DrawerLayoutActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);
        Toolbar toolbar = findViewById(R.id.drawer_toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toobar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId == R.id.backup){
            Toast.makeText(this, "You clicked Backup", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.delete) {
            Toast.makeText(this, "You clicked Delete", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.settings){
            Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
        } else if (itemId == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }
}