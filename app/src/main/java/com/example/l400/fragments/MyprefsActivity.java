package com.example.l400.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by l400 on 10/15/2016.
 */
public class MyprefsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        MyprefsFragment fragment = new MyprefsFragment();
        getFragmentManager().beginTransaction().replace(android.R.id.content,fragment).commit();

    }
}
