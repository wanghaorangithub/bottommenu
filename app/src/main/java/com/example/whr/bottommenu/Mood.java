package com.example.whr.bottommenu;

/**
 * Created by whr on 2017/12/2.
 */

public class Mood {
    private String name;
    private int imageId;

    public Mood(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
