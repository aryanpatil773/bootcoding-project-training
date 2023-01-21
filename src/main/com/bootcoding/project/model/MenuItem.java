package com.bootcoding.project.model;

public class MenuItem {
    private int id;
    private String name;
    private int qantity;
    private boolean isveg;
    private double Price;

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

    public int getQantity() {
        return qantity;
    }

    public void setQantity(int qantity) {
        this.qantity = qantity;
    }

    public boolean isIsveg() {
        return isveg;
    }

    public void setIsveg(boolean isveg) {
        this.isveg = isveg;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
