package com.bansal.abhishek.instagramm.Models;

public class Story_Model {
    int pics;
    String name;

    public Story_Model(int pics, String name) {
        this.pics = pics;
        this.name = name;
    }

    public int getPics() {
        return pics;
    }

    public void setPics(int pics) {
        this.pics = pics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
