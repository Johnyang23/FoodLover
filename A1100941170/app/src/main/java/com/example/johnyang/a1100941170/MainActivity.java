package com.example.johnyang.a1100941170;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Assignment #1
 * Name: John Yang
 * Student ID:100941170
 * Professor: Ilir Dema
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        Intent intent = new Intent(MainActivity.this, CuisineActivity.class);
        startActivity(intent);
    }
}
