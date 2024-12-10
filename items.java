package com.hassan.temu_clone_2;


public class items {
    private int imageResId; // Drawable resource ID
    private String name;    // Item name
    private String price;   // Item price

    public items(int imageResId, String name, String price) {
        this.imageResId = imageResId;
        this.name = name;
        this.price = price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

