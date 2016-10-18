package com.example.l400.fragments;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by l400 on 10/13/2016.
 */
public class FlowerDetailActivity  extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

        if(savedInstanceState == null){

            Flowerdetailfragments frag = new Flowerdetailfragments();
            Bundle b = getIntent().getBundleExtra("FLOWER_BUNDLE");
            frag.setArguments(b);

            getFragmentManager().beginTransaction().add(R.id.detailContainer,frag).commit();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.second_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
        }
        return true;
    }
}
