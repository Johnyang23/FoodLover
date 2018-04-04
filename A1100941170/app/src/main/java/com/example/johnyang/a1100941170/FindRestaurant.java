package com.example.johnyang.a1100941170;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class FindRestaurant {
    //creating a string restaurant list and storing the menu items on the list
    List<String> getAmerican(String restaurant_list) {
        List<String> Americanrestaurant = new ArrayList<>();
        if (restaurant_list.equals("Caesar Palace")) {
            Americanrestaurant.add("Gordon Ramsey Hamburger");
            Americanrestaurant.add("5 Piece Chicken Tenders");
            Americanrestaurant.add("10 oz Sirloin Steak");
        }else if (restaurant_list.equals("Boston Pizza")) {
            Americanrestaurant.add("Starting Plate Platter");
            Americanrestaurant.add("Chicken Parmesan");
            Americanrestaurant.add("Chicken Fries");
        }else if (restaurant_list.equals("Kelseys")) {
            Americanrestaurant.add("Dorito Wings");
            Americanrestaurant.add("Classic Gourmet Burger");
            Americanrestaurant.add("10 oz Fillet Mignon");
        }
        return Americanrestaurant;
    }

    List<String> getItalian(String restaurant_list) {
        List<String> Italianrestaurant = new ArrayList<>();
        if (restaurant_list.equals("Frankie Tomato")) {
            Italianrestaurant.add("Italian Meatballs");
            Italianrestaurant.add("Red Wine Mussels");
            Italianrestaurant.add("Frankie Tomatoe Pasta");
        } else if (restaurant_list.equals("Pizza Nova")) {
            Italianrestaurant.add("Pepperoni Pizza");
            Italianrestaurant.add("Meat Lover Pizza");
            Italianrestaurant.add("Panzerotti");
        }else if (restaurant_list.equals("Vivoli")) {
            Italianrestaurant.add("Vivoli Ravioli");
            Italianrestaurant.add("Garlic Bread With Triple Cheese");
            Italianrestaurant.add("Caesar Salad");
        }
        return Italianrestaurant;
    }

    List<String> getChinese(String restaurant_list) {
        List<String> Chineserestaurant = new ArrayList<>();
        if (restaurant_list.equals("Pho 88")) {
            Chineserestaurant.add("Pho Special");
            Chineserestaurant.add("Spring Rolls");
            Chineserestaurant.add("Pot Stickers");
        } else if (restaurant_list.equals("Sunshine Cuisine")) {
            Chineserestaurant.add("Curry Chicken with Rice");
            Chineserestaurant.add("Russian Tomato Soup");
            Chineserestaurant.add("Chicken Fried Rice");
        }else if (restaurant_list.equals("New Choice")) {
            Chineserestaurant.add("Lo Mien");
            Chineserestaurant.add("Sweet and Sour Pork");
            Chineserestaurant.add("Black Pepper Short Ribs");
        }
        return Chineserestaurant;
    }

    List<String> getIndian(String restaurant_list) {
        List<String> Indianrestaurant = new ArrayList<>();
        if (restaurant_list.equals("Paramount")) {
            Indianrestaurant.add("Biryani");
            Indianrestaurant.add("Kothu Roti");
            Indianrestaurant.add("Dosa");
        } else if (restaurant_list.equals("Tasty Shawarma")) {
            Indianrestaurant.add("Shawarma");
            Indianrestaurant.add("Butter Chicken");
            Indianrestaurant.add("Potato Wedges");
        }else if (restaurant_list.equals("Indian Sweets")) {
            Indianrestaurant.add("Chutney");
            Indianrestaurant.add("Mutton Rolls");
            Indianrestaurant.add("Indian Spiced Lamb Chops");
        }
        return Indianrestaurant;
    }

    List<String> getJamaican(String restaurant_list) {
        List<String> Jamaicanrestaurant = new ArrayList<>();
        if (restaurant_list.equals("Negrail")) {
            Jamaicanrestaurant.add("Hot Dog");
            Jamaicanrestaurant.add("Ox Tail");
            Jamaicanrestaurant.add("Jerk Pork");
        } else if (restaurant_list.equals("Patties")) {
            Jamaicanrestaurant.add("Beef Pattie");
            Jamaicanrestaurant.add("Beef Pattie with Coco Bread");
            Jamaicanrestaurant.add("Chicken Pattie");
        }else if (restaurant_list.equals("Jerk Jamaican")) {
            Jamaicanrestaurant.add("Jerk Chicken");
            Jamaicanrestaurant.add("Nigerian Chicken");
            Jamaicanrestaurant.add("Corn on a Cob");
        }
        return Jamaicanrestaurant;
    }





}
