package com.example.guest.mymessages.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 5/4/16.
 */
@Parcel
public class User {
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
