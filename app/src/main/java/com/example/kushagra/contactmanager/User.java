package com.example.kushagra.contactmanager;

/**
 * Created by Kushagra on 15/08/16.
 */
import android.graphics.Bitmap;

public class User {
    String name;

    public Bitmap getThumb() {
        return thumb;
    }

    public void setThumb(Bitmap thumb) {
        this.thumb = thumb;
    }

    Bitmap thumb;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

