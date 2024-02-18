package com.example.fragment.Data;

import java.util.HashMap;
import java.util.Map;

public class MyData {


    private static class UserInfo {
        String password;
        String phoneNumber;

        private final MyData myData = new MyData();

        public boolean registerUser(String username, String password, String phoneNumber) {
            return myData.addUser(username, password, phoneNumber);
        }

        public boolean validateUser(String username, String password) {
            // Assuming a method to check user credentials is added to MyData
            return myData.checkUserCredentials(username, password);
        }

        UserInfo(String password, String phoneNumber) {
            this.password = password;
            this.phoneNumber = phoneNumber;
        }
    }

    private final Map<String, UserInfo> users = new HashMap<>();

    public MyData() {
        // Add a mock user for testing purposes
        addUser("Orel", "1234", "123456789");
    }

    public boolean addUser(String username, String password, String phoneNumber) {
        if (users.containsKey(username)) {
            return false;
        } else {
            users.put(username, new UserInfo(password, phoneNumber));
            return true;
        }
    }

    public boolean checkUserCredentials(String username, String password) {
        UserInfo user = users.get(username);
        return user != null && user.password.equals(password);
    }
}