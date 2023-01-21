package com.bootcoding.project.model;

import java.awt.*;
import java.util.Date;

public class Order {
    private int id;
    private String CustomerName;
    private String RestaurantName;
    private MenuItem[] MenuItems;
    private double totalPrice;
    private Date orderDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public MenuItem[] getMenuItems() {
        return MenuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        MenuItems = menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}


