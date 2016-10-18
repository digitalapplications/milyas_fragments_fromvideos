package com.example.l400.fragments;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by l400 on 10/13/2016.
 */
public class FlowerArrayAdapter extends ArrayAdapter<Flower> {
    private Context context;
    private List<Flower> objects;

    public FlowerArrayAdapter(Context context, int resource, List<Flower> objects) {
        super(context, resource,objects);
        this.context = context;
        this.objects = objects;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Flower flower = objects.get(position);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.flower_listitem,null);
        ImageView imageview = (ImageView)v.findViewById(R.id.ivflowerimage);
        imageview.setImageResource(flower.getImageResource());

        TextView text = (TextView)v.findViewById(R.id.tvflowername);
        text.setText(flower.getFlowerName());
        return v;


    }
}
