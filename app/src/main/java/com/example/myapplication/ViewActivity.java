package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    TextView name;
    TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_activivity);

        name = (TextView) findViewById(R.id.nameView);
        age = (TextView) findViewById(R.id.ageView);
        Intent intent = getIntent();


        String getName = intent.getStringExtra("name");
        String getAge = intent.getStringExtra("age");

        age.setText(getAge);
        name.setText(getName);


    }
}