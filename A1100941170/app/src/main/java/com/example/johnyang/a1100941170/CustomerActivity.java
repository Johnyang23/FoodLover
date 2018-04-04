package com.example.johnyang.a1100941170;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class CustomerActivity extends Activity {

    private EditText name, address, postalcode, city, country, creditcard, favoritefood, favoritechef;
    private Order order;
    private Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_customer);

        order = (Order) getIntent().getExtras().get("order");
        //connecting the editText from the activity_order.xml
        name = (EditText) findViewById(R.id.editText);
        address = (EditText) findViewById(R.id.editText2);
        postalcode = (EditText) findViewById(R.id.editText3);
        city = (EditText) findViewById(R.id.editText5);
        country = (EditText) findViewById(R.id.editText6);
        creditcard = (EditText) findViewById(R.id.editText7);
        favoritefood = (EditText) findViewById(R.id.editText8);
        favoritechef = (EditText) findViewById(R.id.editText9);
    }

    public void buttonClick(View view) {
        boolean flag = true;
        //check if each editText has value, if not a toast message will appear.
        if(name.getText().toString().isEmpty()) {
            String msg = "Name is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag= false;
        }
        if(address.getText().toString().isEmpty()) {
            String msg = "Address is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(postalcode.getText().toString().isEmpty()) {
            String msg = "Postal code is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(city.getText().toString().isEmpty()) {
            String msg = "City is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(country.getText().toString().isEmpty()) {
            String msg = "Country is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(creditcard.getText().toString().isEmpty()) {
            String msg = "Credit card is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(favoritefood.getText().toString().isEmpty()) {
            String msg = "Favourite food is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }
        if(favoritechef.getText().toString().isEmpty()) {
            String msg = "Favourite chef is empty!";
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
            flag = false;
        }

        if(flag == true)
        {
            //combining all the customer info to a object
            customer = new Customer(name.getText().toString(), address.getText().toString(), postalcode.getText().toString(), city.getText().toString(), country.getText().toString(), creditcard.getText().toString(), favoritefood.getText().toString(), favoritechef.getText().toString());
            order.setCustomer(customer);//customer object is stored in order
            Intent intent = new Intent(CustomerActivity.this, OrderActivity.class);
            intent.putExtra("order", order);
            startActivity(intent);
        }
    }
}
