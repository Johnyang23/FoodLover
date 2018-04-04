package com.example.johnyang.a1100941170;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class RestaurantActivity extends Activity {

    String cat;
    private Order order;
    private Spinner restaurantList;
    private FindRestaurant expert = new FindRestaurant();
    private ArrayList <CheckBox> checkBoxArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        checkBoxArrayList = new ArrayList<CheckBox>();
        order = (Order) getIntent().getExtras().get("order");

        //if cat matches the spinner that is selected, it will populate individual restaurant list in the strings.xml
        String[] strings = {" ", " "};
        cat = order.getCuisineType();
        if (cat.equals("American"))
            strings = getResources().getStringArray(R.array.americanRestaurant);

        else if (cat.equals("Italian"))
            strings = getResources().getStringArray(R.array.italianRestaurant);

        else if (cat.equals("Chinese"))
            strings = getResources().getStringArray(R.array.chineseRestaurant);

        else if (cat.equals("Indian"))
            strings = getResources().getStringArray(R.array.indianRestaurant);

        else if (cat.equals("Jamaican"))
            strings = getResources().getStringArray(R.array.jamaicanRestaurant);

        //connecting the spinner from the activity_restaurant.xml
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strings);
        restaurantList = (Spinner) findViewById(R.id.restaurant_list);
        restaurantList.setAdapter(adapter);
        restaurantList.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Spinner restaurantlist = (Spinner) findViewById(R.id.restaurant_list);
                String restaurantType = String.valueOf(restaurantlist.getSelectedItem());
                //if cat matches the spinner that is selected, it will populate individual restaurant list in the strings.xml a long with the restaurant menu items from the FindRestaurant class.
                List<String> cuisineList = null;
                if(cat.equals("American")) {
                    cuisineList = expert.getAmerican(restaurantType);
                }
                else if(cat.equals("Italian")){
                    cuisineList = expert.getItalian(restaurantType);
                }
                else if(cat.equals("Chinese")){
                    cuisineList = expert.getChinese(restaurantType);
                }
                else if(cat.equals("Indian")){
                    cuisineList = expert.getIndian(restaurantType);
                }
                else if(cat.equals("Jamaican")){
                    cuisineList = expert.getJamaican(restaurantType);
                }

                //the layout for the menu items
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.layout_food);
                linearLayout.removeAllViews();

                //for every menu item, there will be a check box
                for(String foodItem: cuisineList)
                {
                    CheckBox checkBox = new CheckBox(RestaurantActivity.this);
                    checkBox.setText(foodItem);
                    checkBoxArrayList.add(checkBox);//checkbox will store in checkBoxArrayList
                    linearLayout.addView(checkBox);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void buttonClick(View view) {
        //identifying each checkbox through the checkBoxArrayList
        CheckBox checkBox1 = checkBoxArrayList.get(0);
        CheckBox checkBox2 = checkBoxArrayList.get(1);
        CheckBox checkBox3 = checkBoxArrayList.get(2);

        //making the checkbox a string to display customer final order and storing it in the ArrayList<MenuItem> menuItems
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem(checkBox1.getText().toString()));
        menuItems.add(new MenuItem(checkBox2.getText().toString()));
        menuItems.add(new MenuItem(checkBox3.getText().toString()));

        order.setRestaurant(new Restaurant(restaurantList.getSelectedItem().toString(), menuItems));

        Intent intent = new Intent(RestaurantActivity.this, CustomerActivity.class);
        intent.putExtra("order", order);
        startActivity(intent);
    }
}
