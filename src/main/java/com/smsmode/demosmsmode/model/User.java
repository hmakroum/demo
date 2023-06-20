package com.smsmode.demosmsmode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity(name = "USER")
public class User implements Serializable {

    @Id
    @Column(name = "ID")
    private String ID;

    @Column(name = "USERNAME")
    private String userName;

    public User() {
    }

    public User(String ID, String userName) {
        this.ID = ID;
        this.userName = userName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
