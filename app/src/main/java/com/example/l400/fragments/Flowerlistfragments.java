package com.example.l400.fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by l400 on 10/13/2016.
 */
public class Flowerlistfragments extends ListFragment {
       List<Flower> flowerS = new FlowerData().getFlowersData();
    private callBacks activity;
    public Flowerlistfragments(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity() ,R.layout.flower_listitem,flowerS);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.flower_list_fragment,container,false);
        return v;

    }
    public interface callBacks{
        public void onItemSelected(Flower flower);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Flower flower = flowerS.get(position);
        activity.onItemSelected(flower);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (callBacks) activity;
    }
}
