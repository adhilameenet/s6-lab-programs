package com.example.spinne;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp=(Spinner)findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String s=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
    
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}