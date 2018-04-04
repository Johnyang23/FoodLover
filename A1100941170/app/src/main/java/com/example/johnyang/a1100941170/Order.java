package com.example.johnyang.a1100941170;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class Order implements Serializable {
    private String cuisineType;
    private Customer customer;
    private Restaurant restaurant;

    public Order() {}

    public void setCuisineType(String cuisine) {this.cuisineType = cuisine; }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
