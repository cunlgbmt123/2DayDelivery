package com.example.a2daydelivery.cheffoodpanel;

public class Chef {

    private String Ward, City, ConfirmPassword, Emailid, Fname, House, Lname, Mobile, Password, Postcode, District;

    public Chef(String ward, String city, String confirmPassword, String emailid, String fname, String house, String lname, String mobile, String password, String postcode, String district) {
        this.Ward = ward;
        City = city;
        ConfirmPassword = confirmPassword;
        Emailid = emailid;
        Fname = fname;
        House = house;
        Lname = lname;
        Mobile = mobile;
        Password = password;
        Postcode = postcode;
        District = district;
    }
    public Chef(){

    }
    public String getWard() {
        return Ward;
    }

    public String getCity() {
        return City;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailid() {
        return Emailid;
    }

    public String getFname() {
        return Fname;
    }

    public String getHouse() {
        return House;
    }

    public String getLname() {
        return Lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }

    public String getPostcode() {
        return Postcode;
    }

    public String getDistrict() {
        return District;
    }
}