package com.example.listgridapp;

import android.widget.ImageView;

public class User {
    private int userImgId;
    private String name;

    public User(int userImgId, String name){
        this.userImgId = userImgId;
        this.name = name;
    }
    public User(){
    }
    public int getUserImg(){
        return userImgId;
    }
    public String getName(){
        return name;
    }
}
