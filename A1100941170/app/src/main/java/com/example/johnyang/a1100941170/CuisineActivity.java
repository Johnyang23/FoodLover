package com.example.johnyang.a1100941170;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class CuisineActivity extends Activity {

    private Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);

        order = new Order();
    }

    public void buttonClick(View view){
        Intent intent = new Intent(CuisineActivity.this, RestaurantActivity.class);
        //connecting the radioButton from the activity_cuisine.xml
        //if a button is checked, it will store in the order object
        RadioButton americanButton = (RadioButton)findViewById(R.id.button_american);
        if(americanButton.isChecked())
            order.setCuisineType("American");

        RadioButton italianButton = (RadioButton)findViewById(R.id.button_italian);
        if(italianButton.isChecked())
            order.setCuisineType("Italian");

        RadioButton chineseButton = (RadioButton)findViewById(R.id.button_chinese);
        if(chineseButton.isChecked())
            order.setCuisineType("Chinese");

        RadioButton indianButton = (RadioButton)findViewById(R.id.button_indian);
        if(indianButton.isChecked())
            order.setCuisineType("Indian");

        RadioButton jamacainButton = (RadioButton)findViewById(R.id.button_jamaican);
        if(jamacainButton.isChecked())
            order.setCuisineType("Jamaican");

        intent.putExtra("order", order);

        startActivity(intent);
    }
}
