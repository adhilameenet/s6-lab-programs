package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View v) {
        String s = "";
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        if(c1.isChecked()) {
            s += "X ";
        }
        if(c2.isChecked()) {
            s += "XII ";
        }
        if(c3.isChecked()) {
            s += "UG ";
        }
        if(c4.isChecked()) {
            s += "PG ";
        }
        Toast.makeText(this, "Your Qualification is " + s, Toast.LENGTH_SHORT).show();
    }
}