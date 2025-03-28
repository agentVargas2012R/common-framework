package com.wyn.models;

import java.io.Serializable;

/**
 * Configure githooks example.
 */
public class User implements Serializable {
    private long id;
    private String username;
    private String email;

    private String firstname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    @Override
    public String toString() {
        //override me more often.
        return this.username;
    }
}
