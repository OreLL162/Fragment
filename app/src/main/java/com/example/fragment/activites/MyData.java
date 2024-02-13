package com.example.fragment.activites;
import android.content.ClipData;

import java.lang.reflect.Array;
import java.util.HashMap ;
import java.util.ArrayList;
import java.util.List;

public class MyData {

    static public HashMap<String, String> userDetails = new HashMap<String, String>() {{
        put("Orel","1234");
        put("Nir","12345");
        put("Effi","123456");
        put("Dor","1111");
        put("Adi","2222");
    }};

    HashMap<String, HashMap<String, Integer>> userProduct = new HashMap<String, HashMap<String, Integer>>() {{
        put("orel", new HashMap<String, Integer>() {{
            put("laptop", 2);
            put("smartphone", 3);
            put("headphones", 1);
            put("charger", 2);
            put("power bank", 2);
        }});
        put("nir", new HashMap<String, Integer>() {{
            put("bread", 3);
            put("milk", 2);
            put("eggs", 4);
            put("cheese", 2);
            put("fruit", 3);
        }});
        put("effi", new HashMap<String, Integer>() {{
            put("football", 5);
            put("basketball", 4);
            put("running shoes", 3);
            put("water bottle", 4);
            put("fitness tracker", 2);
        }});
        put("Adi", new HashMap<String, Integer>() {{
            put("paintbrush", 6);
            put("canvas", 4);
            put("easel", 3);
            put("acrylic paint", 5);
            put("palette", 5);
        }});
        put("Dor", new HashMap<String, Integer>() {{
            put("guitar", 2);
            put("amplifier", 3);
            put("picks", 4);
            put("guitar case", 2);
            put("music stand", 3);
        }});

    }};



    static Integer[] id_ = {1,2,3,4,5};



}
