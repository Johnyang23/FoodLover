package com.example.johnyang.a1100941170;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

/*
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class OrderActivity extends Activity {

    private Customer customer;
    private Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        order = (Order) getIntent().getExtras().get("order");

        order.getCuisineType(); //To get cuisine object
        order.getRestaurant().getName(); // To get the Restaurant object
        order.getRestaurant().getMenuItemArrayList().get(0);//To get the food item that the user is selected

        //for every restaurant spinner that is selected, it will populate the food item for each restaurant
        String menu = "";
        for(MenuItem food: order.getRestaurant().getMenuItemArrayList()){
            menu = menu + food.getName() + ", ";
        }

        customer = order.getCustomer();

        //Displaying the final order that the user made
        TextView name = (TextView) findViewById(R.id.textView6);
        name.setText("Name: " + customer.getName());

        TextView address = (TextView) findViewById(R.id.textView13);
        address.setText("Address: " + customer.getAddress());

        TextView postalcode = (TextView) findViewById(R.id.textView14);
        postalcode.setText("Postal Code: " + customer.getPostalcode());

        TextView city = (TextView) findViewById(R.id.textView15);
        city.setText("City: " + customer.getCity());

        TextView country = (TextView) findViewById(R.id.textView16);
        country.setText("Country: " + customer.getCountry());

        TextView creditcard = (TextView) findViewById(R.id.textView17);
        creditcard.setText("Credit card: " + customer.getCreditcard());

        TextView favoritefood = (TextView) findViewById(R.id.textView18);
        favoritefood.setText("Favorite food: " + customer.getFavoritefood());

        TextView favoritechef = (TextView) findViewById(R.id.textView19);
        favoritechef.setText("Favorite chef: " + customer.getFavoritechef());

        TextView cusineList = (TextView)findViewById(R.id.textView21);
        cusineList.setText("Cusine you picked: " + order.getCuisineType());

        TextView restaurantList = (TextView)findViewById(R.id.textView22);
        restaurantList.setText("Restaurant you picked: " + order.getRestaurant().getName());

        TextView foodList = (TextView)findViewById(R.id.textView23);
        foodList.setText("Menu you picked: " + menu);

    }


}
