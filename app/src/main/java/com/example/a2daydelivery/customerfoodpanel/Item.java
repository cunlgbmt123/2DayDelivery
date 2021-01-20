package com.example.a2daydelivery.customerfoodpanel;

public class Item {
    private int id;
    private String name,price;
    private boolean isAddtocard;

    public Item(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAddtocard = isAddtocard;
    }

    public boolean isAddtocard() {
        return isAddtocard;
    }

    public void setAddtocard(boolean addtocard) {
        isAddtocard = addtocard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
