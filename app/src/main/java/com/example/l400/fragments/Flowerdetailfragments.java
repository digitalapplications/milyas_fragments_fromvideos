package com.example.l400.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by l400 on 10/13/2016.
 */
public class Flowerdetailfragments extends Fragment {

    Flower flower;
    public Flowerdetailfragments(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getArguments();
        if(b != null && b.containsKey(Flower.FLOWER_NAME)){
            flower = new Flower(b);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View  view = inflater.inflate(R.layout.flower_detail_fragment,container,false);
        if(flower!=null){
            TextView tvname = (TextView)view.findViewById(R.id.tvFlowerName);
            tvname.setText(flower.getFlowerName());

            TextView tvins = (TextView)view.findViewById(R.id.tvInstruction);
            tvins.setText(flower.getInstructions());

            TextView tvprize = (TextView)view.findViewById(R.id.tvPrize);
//            tvprize.setText((int) flower.getPrize());
      //      tvprize.setText((int) flower.getPrize());

            ImageView tvimage = (ImageView)view.findViewById(R.id.ivFlowerImage);
            tvimage.setImageResource(flower.getImageResource());

        }
        return view;
    }
}
