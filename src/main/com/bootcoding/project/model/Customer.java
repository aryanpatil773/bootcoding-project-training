package com.bootcoding.project.model;

public class Customer {
    private int id;
    private String name;
    private String delivaryAddress;
    private String EmailId;
    private long phoneNumber;
    private String city;

    // getter and setter methods
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

    public String getDelivaryAddress() {
        return delivaryAddress;
    }

    public void setDelivaryAddress(String delivaryAddress) {
        this.delivaryAddress = delivaryAddress;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
