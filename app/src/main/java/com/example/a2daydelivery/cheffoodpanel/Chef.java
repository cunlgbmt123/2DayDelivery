package com.example.a2daydelivery.cheffoodpanel;

public class Chef {
    private String Ward, District, ConfirmPassword, Emailid, Fname, House, Lname, Mobile, Password, Postcode, City;

    public Chef(String ward, String district, String confirmPassword, String emailid, String fname, String house, String lname, String mobile, String password, String postcode, String city) {
        this.Ward = ward;
        District = district;
        ConfirmPassword = confirmPassword;
        Emailid = emailid;
        Fname = fname;
        House = house;
        Lname = lname;
        Mobile = mobile;
        Password = password;
        Postcode = postcode;
        City = city;
    }
    public Chef(){

    }

    public String getWard() {
        return Ward;
    }

    public String getDistrict() {
        return District;
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

    public String getCity() {
        return City;
    }
}
