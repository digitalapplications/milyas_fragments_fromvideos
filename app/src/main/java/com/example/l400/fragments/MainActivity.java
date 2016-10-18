package com.example.l400.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Flowerlistfragments.callBacks{

    private boolean isTwoPane = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.detailContainer)!=null){
            isTwoPane = true;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.setting){
//            ScreenUtility utility = new ScreenUtility(MainActivity.this);
//            String  opu = "height : " +utility.getDpheight() + "\n width : " +utility.getDpwidth();
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setMessage(opu);
//            builder.setTitle("dimension of screen");
//            builder.create();
//            builder.show();
            Intent i = new Intent();
            i.setClass(MainActivity.this,MyprefsActivity.class);
            startActivityForResult(i,1002);
        }
        return true;
    }

    @Override
    public void onItemSelected(Flower flower) {
        Bundle b = flower.tobundle();
        if(isTwoPane){
            Flowerdetailfragments fra = new Flowerdetailfragments();
            fra.setArguments(b);
            getFragmentManager().beginTransaction().replace(R.id.detailContainer,fra).commit();
        }
        else {
        Intent intent = new Intent(MainActivity.this,FlowerDetailActivity.class);
        intent.putExtra("FLOWER_BUNDLE" , b);
        startActivityForResult(intent,0);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1002){
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            boolean prefs = preferences.getBoolean("pref1",false);
           // Toast.makeText(MainActivity.this, "my prefences" + prefs, Toast.LENGTH_SHORT).show();
            MydialogFragment fr = new MydialogFragment();
//            Bundle b = new Bundle();
//            b.putString("message" ,"preferences" + prefs );
        //    fr.setArguments(b);
            fr.show(getFragmentManager(),"my dialog  ");
        }
    }
}
