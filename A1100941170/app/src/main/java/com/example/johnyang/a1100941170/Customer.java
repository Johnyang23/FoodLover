package com.example.johnyang.a1100941170;

import java.io.Serializable;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class Customer implements Serializable {
    private String name;
    private String address;
    private String postalcode;
    private String city;
    private String country;
    private String creditcard;
    private String favoritefood;
    private String favoritechef;

    public Customer(){

    }

    public Customer (String name, String address, String postalcode, String city, String country, String creditcard, String favoritefood, String favoritechef ){
        this.name = name;
        this.address = address;
        this.postalcode = postalcode;
        this.city = city;
        this.country = country;
        this.creditcard = creditcard;
        this.favoritefood = favoritefood;
        this.favoritechef = favoritechef;
    }

    public String getName () {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getCity () { return city; }

    public String getCountry() {
        return country;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public String getFavoritefood() {return favoritefood; }

    public String getFavoritechef() {
        return favoritechef;
    }

    public String toString() {
        return this.name;
    }
}
