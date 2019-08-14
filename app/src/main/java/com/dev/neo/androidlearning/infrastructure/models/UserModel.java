package com.dev.neo.androidlearning.infrastructure.models;

public class UserModel {

    public int userId;
    public String fullName;
    public String address;

    public UserModel(int userId, String fullName, String address) {
        this.userId = userId;
        this.fullName = fullName;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }
}
