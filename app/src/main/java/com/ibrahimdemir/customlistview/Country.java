package com.ibrahimdemir.customlistview;

import java.io.Serializable;

public class Country implements Serializable {

    private final String name;
    private final int pictureId;

    public Country(String name, int pictureId) {
        this.name = name;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public int getPictureId() {
        return pictureId;
    }
}
