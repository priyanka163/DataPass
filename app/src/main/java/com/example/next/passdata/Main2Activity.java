package com.example.next.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public TextView showName, showPhoneNumber, age, showIsMarried;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // initialize TextViews
        initializeViews();

        // get the Intent that started this Activity
        Intent in = getIntent();

        // get the Bundle that stores the data of this Activity
        Bundle b = in.getExtras();

        // getting data from bundle
        String nameString = b.getString("fullname");

        long phoneNumberLong = b.getLong("phoneNumber");
        String phoneNumberString = Long.toString(phoneNumberLong);

        double ageDouble = b.getDouble("age");
        String ageString = Double.toString(ageDouble);

        boolean isMarriedBoolean = b.getBoolean("married");

        // show data to layout
        showName.setText("Name : " + nameString);
        showPhoneNumber.setText("Phone number : " + phoneNumberString);
        age.setText("Age : " + ageString);
        showIsMarried.setText("Is married : " + isMarriedBoolean);
    }

    public void initializeViews() {
        showName = (TextView) findViewById(R.id.showName);
        showPhoneNumber = (TextView) findViewById(R.id.showPhoneNumber);
        age = (TextView) findViewById(R.id.showAge);
        showIsMarried = (TextView) findViewById(R.id.showIsMarried);
    }
}
