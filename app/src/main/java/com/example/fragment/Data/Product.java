package com.example.fragment.Data;

import com.example.fragment.R;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer image;
    private String name;

    static Integer[] images = {
            R.drawable.airpods,R.drawable.airpodsmax,R.drawable.airtag,R.drawable.ipad,
            R.drawable.iphone,R.drawable.macbook,R.drawable.pc,R.drawable.pencil,R.drawable.ps5,
            R.drawable.samsung,R.drawable.watch , R.drawable.xbox , R.drawable.zfold
    };

    static String[] names = {
            "AirPods", "AirPods Max", "Air Tag", "Ipad", "Iphone", "MacBook", "PC", "Apple Pencil",
            "PS5", "Samsung S24", "Apple Watch", "XBOX", "Samsung Zfold"
    };

    // Static list of groceries
    private static List<Product> ProductList = new ArrayList<>();

    // Static initializer block to populate the grocery list
    static {
        for (int i = 0; i < images.length; i++) {
            ProductList.add(new Product(images[i], names[i]));
        }
    }

    // Constructor
    public Product(Integer image, String name) {
        this.image = image;
        this.name = name;
    }

    // Getter methods
    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    // Method to get the static list of groceries
    public static List<Product> getProductList() {
        return ProductList;
    }

}
