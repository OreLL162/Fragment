package com.example.fragment.activites;

public class User {
    private String password;
    private String phoneNumber;

    // Constructor
    public User(String password, String phoneNumber) {
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}