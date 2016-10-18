package com.example.l400.fragments;

import android.os.Bundle;

/**
 * Created by l400 on 10/13/2016.
 */
public class Flower
{
    public static final String FLOWER_NAME = "flowerName";
    public static final String IMAGE_RESOURCE = "imageResource";
    public static final String PRIZE = "prize";
    public static final String INSTRUCTIONS ="instruction";

    private String flowerName;
    private int imageResource;
    private String instructions;
    private double prize;

    public Flower(String id , int imageResource,double prize , String instructions){
        this.flowerName = id;
        this.imageResource = imageResource;
        this.prize = prize;
        this.instructions = instructions;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
    public Flower (Bundle  b){
        if(b != null){
            this.flowerName = b.getString(FLOWER_NAME);
            this.imageResource = b.getInt(IMAGE_RESOURCE);
            this.prize = b.getDouble(PRIZE);
            this.instructions = b.getString(INSTRUCTIONS);
        }
    }
    public Bundle tobundle(){
        Bundle b = new Bundle();
        b.putString(FLOWER_NAME ,this.flowerName );
        b.putInt(IMAGE_RESOURCE ,this.imageResource );
        b.putDouble(PRIZE , this.prize);
        b.putString(INSTRUCTIONS , this.instructions);
        return b;
    }

}
