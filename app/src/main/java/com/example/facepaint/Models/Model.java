package com.example.facepaint.Models;

public class Model {
    String Image;
    String name;

    public Model(String image, String name) {
        Image = image;
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
