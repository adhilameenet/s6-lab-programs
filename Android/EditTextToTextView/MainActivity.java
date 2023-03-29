package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void copy(View v) {
        EditText ed = (EditText) findViewById(R.id.editTextTextPersonName);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(ed.getText().toString());
    }
}