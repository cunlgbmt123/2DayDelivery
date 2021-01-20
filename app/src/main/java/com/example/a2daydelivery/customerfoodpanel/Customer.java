package com.example.a2daydelivery.customerfoodpanel;

public class Customer {

    private String Area, City, ConfirmPassword, Emailid, Fname, House, Lname, Mobile, Password, Postcode, State;




    public Customer(String area, String city, String confirmPassword, String emailid, String fname, String house, String lname, String mobile, String password, String postcode, String state) {
        this.Area = area;
        this.City = city;
        this.ConfirmPassword = confirmPassword;
        this.Emailid = emailid;
        this.Fname = fname;
        this.House = house;
        this.Lname = lname;
        this.Mobile = mobile;
        this.Password = password;
        this.Postcode = postcode;
        this.State = state;
    }
    public Customer() {
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}