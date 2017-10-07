package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BmiResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        Intent Bmi = getIntent();


        String bmiText = Bmi.getStringExtra("q");
        String bmaiText2 = Bmi.getStringExtra("p");

        TextView x = (TextView) findViewById(R.id.textView);
        TextView y = (TextView) findViewById(R.id.textView2);
        x.setText(bmiText);
        y.setText(bmaiText2);

    }
}
