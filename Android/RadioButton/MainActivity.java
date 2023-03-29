package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this::onCheckedChanged);
    }
    public  void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.radioButton) {
            Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
        }
    }
}