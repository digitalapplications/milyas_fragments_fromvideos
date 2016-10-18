package com.example.l400.fragments;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bangash on 10/12/2016.
 */
public class FlowerData {
    List<Flower> flowers = new ArrayList<>();

    public FlowerData() {
        flowers.add(new Flower("Anemone", R.drawable.haight_ashbury, 17.95,"The Anemone genus is part of the Ranunculaceae (buttercup) family. There are a little over 120 species of anemones in a wide range of colors. \n" + "\n" + "Anemones are popular in gardens as individual species flower in the spring, summer, or fall, providing continual color."));
        flowers.add(new Flower("Amaryllis", R.drawable.california_snow,18.05, "The stunning amaryllis belladonna is known as Naked Lady in the US. The smooth-textured foliage grows in early summer then dies back.\n"));
        flowers.add(new Flower("Aster", R.drawable.image_10102,12.95, "The stunning amaryllis belladonna is known as Naked Lady in the US. The smooth-textured foliage grows in early summer then dies back" ));

    }

    public List<Flower> getFlowersData()
    {
        return flowers;
    }
}
