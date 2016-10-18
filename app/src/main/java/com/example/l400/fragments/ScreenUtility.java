package com.example.l400.fragments;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by l400 on 10/11/2016.
 */
public class ScreenUtility {
    Activity activity;
    float dpwidth;
    float dpheight;
    public ScreenUtility(Activity activity){
        this.activity = activity;
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        float density = activity.getResources().getDisplayMetrics().density;
        dpheight = metrics.heightPixels/density;
        dpwidth = metrics.widthPixels/density;

    }

    public float getDpwidth() {
        return dpwidth;
    }

    public float getDpheight() {
        return dpheight;
    }
}
