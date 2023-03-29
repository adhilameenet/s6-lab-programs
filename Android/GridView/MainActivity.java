package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gd = (GridView) findViewById(R.id.gv);
        String f1[] = {"1","2","3","4","5","6","7","8","9"};
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,f1);
        gd.setAdapter(ad);
        gd.setOnItemClickListener(this::onItemClick);
    }
    public void onItemClick(AdapterView parent, View view, int position,long id) {
        String s = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}