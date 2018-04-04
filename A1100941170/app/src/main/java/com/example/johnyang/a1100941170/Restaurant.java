package com.example.johnyang.a1100941170;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class Restaurant implements Serializable {

    private String name;
    private ArrayList<MenuItem> menuItemArrayList;

    public String getName() {
        return name;
    }

    public ArrayList<MenuItem> getMenuItemArrayList() {
        return menuItemArrayList;
    }

    public Restaurant(String name, ArrayList<MenuItem> menuItems) {
        this.name = name;
        this.menuItemArrayList = menuItems;
    }






}
