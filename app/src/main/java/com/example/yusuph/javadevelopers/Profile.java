package com.example.yusuph.javadevelopers;

/**
 * Created by Yusuph on 16/09/2017.
 */

public class Profile {

    //profiles variables
    private String username;
    private String img;
    private String url;

    //create a constructor
    public Profile(String username, String img, String url){

        this.username = username;
        this.img = img;
        this.url = url;
    }
  //create a getters method so that it can be use to fetch informations
    public String getUsername(){
        return username;
    }
    public String getImage(){
        return img;
    }
    public String getUrl(){
        return url;
    }
}
