package com.example.fragment.activites;

import java.util.HashMap;

public class MyData {

    static public HashMap<String, User> userDetails = new HashMap<>();
    static {
        userDetails.put("Orel", new User("1111", "1234"));
        userDetails.put("Nir", new User("2222", "12345"));
        userDetails.put("Effi", new User("3333", "123456"));
        userDetails.put("Dor", new User("4444", "1111"));
        userDetails.put("Adi", new User("5555", "2222"));
    }

    static HashMap<String, HashMap<String, Integer>> userProduct = new HashMap<>();
    static {
        userProduct.put("orel", new HashMap<String, Integer>() {{
            put("laptop", 2);
            put("smartphone", 3);
            put("headphones", 1);
            put("charger", 2);
            put("power bank", 2);
        }});
        userProduct.put("nir", new HashMap<String, Integer>() {{
            put("bread", 3);
            put("milk", 2);
            put("eggs", 4);
            put("cheese", 2);
            put("fruit", 3);
        }});
        userProduct.put("effi", new HashMap<String, Integer>() {{
            put("football", 5);
            put("basketball", 4);
            put("running shoes", 3);
            put("water bottle", 4);
            put("fitness tracker", 2);
        }});
        userProduct.put("Adi", new HashMap<String, Integer>() {{
            put("paintbrush", 6);
            put("canvas", 4);
            put("easel", 3);
            put("acrylic paint", 5);
            put("palette", 5);
        }});
        userProduct.put("Dor", new HashMap<String, Integer>() {{
            put("guitar", 2);
            put("amplifier", 3);
            put("picks", 4);
            put("guitar case", 2);
            put("music stand", 3);
        }});
    }

    static Integer[] id_ = {1,2,3,4,5};
}