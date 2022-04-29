package com.bansal.abhishek.instagramm.Models;

public class Post_Model {
    int circularImg;
    int postImg;
    String userName;

    public Post_Model(int circularImg, int postImg, String userName) {
        this.circularImg = circularImg;
        this.postImg = postImg;
        this.userName = userName;
    }

    public int getCircularImg() {
        return circularImg;
    }

    public void setCircularImg(int circularImg) {
        this.circularImg = circularImg;
    }

    public int getPostImg() {
        return postImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
