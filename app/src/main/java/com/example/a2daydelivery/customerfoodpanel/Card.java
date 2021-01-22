package com.example.a2daydelivery.customerfoodpanel;

public class Card extends Cardview{
    String name, price, contact;
    double Tatal;

    public Card( String name, String price, String contact) {
        this.name = name;
        this.price = price;
        this.contact = contact;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public double getTatal() {
        return Tatal;
    }

    public void setTatal(double tatal) {
        Tatal = tatal;
    }
}