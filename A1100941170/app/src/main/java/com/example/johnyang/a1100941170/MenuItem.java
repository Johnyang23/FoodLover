package com.example.johnyang.a1100941170;

import java.io.Serializable;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class MenuItem implements Serializable {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
