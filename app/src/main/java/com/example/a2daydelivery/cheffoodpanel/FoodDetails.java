package com.example.a2daydelivery.cheffoodpanel;

public class FoodDetails {
    public String Dishes,Amount,Price,Description,ImageURL,RandomUID,Chefid;

    public FoodDetails(String dishes, String amount, String price, String description, String imageURL, String randomUID, String chefid) {
        this.Dishes = dishes;
        Amount = amount;
        Price = price;
        Description = description;
        ImageURL = imageURL;
        RandomUID = randomUID;
        Chefid = chefid;
    }

    public String getDishes() {
        return Dishes;
    }

    public void setDishes(String dishes) {
        Dishes = dishes;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getRandomUID() {
        return RandomUID;
    }

    public void setRandomUID(String randomUID) {
        RandomUID = randomUID;
    }

    public String getChefid() {
        return Chefid;
    }

    public void setChefid(String chefid) {
        Chefid = chefid;
    }
}
