package com.example.a2daydelivery.customerfoodpanel;

public class Customer{
    private String City,FirstName,LastName,Password,ConfirmPassword,EmailId,MobileNo,District,Ward,LocalAddress;

   public Customer(String city, String firstName, String lastName, String password, String confirmPassword, String emailId, String mobileNo, String district, String ward, String localAddress){
       this.City = city;
       FirstName = firstName;
       LastName = lastName;
       Password = password;
       ConfirmPassword = confirmPassword;
       EmailId = emailId;
       MobileNo = mobileNo;
       District = district;
       Ward = ward;
       LocalAddress = localAddress;
   }
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }

    public String getLocalAddress() {
        return LocalAddress;
    }

    public void setLocalAddress(String localAddress) {
        LocalAddress = localAddress;
    }
}

