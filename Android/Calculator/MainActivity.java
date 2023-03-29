package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calculate(View v) {
        int result;
        EditText e1 = (EditText) findViewById(R.id.editTextNumberSigned6);
        EditText e2 = (EditText) findViewById(R.id.editTextNumberSigned7);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if(v.getId() == R.id.button3) {
            result = a + b;
        } else {
            result = a - b;
        }
        Toast.makeText(this, "Result : " + result, Toast.LENGTH_SHORT).show();
    }
}