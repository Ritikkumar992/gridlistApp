package com.example.listgridapp;
import android.widget.ImageView;

// User Class
public class User {
    private int userImgId; // imgId
    private String name; // name

    // constructor
    public User(int userImgId, String name){
        this.userImgId = userImgId;
        this.name = name;
    }
    // getter and setter.
    public User(){
    }
    public int getUserImg(){
        return userImgId;
    }
    public String getName(){
        return name;
    }
}
