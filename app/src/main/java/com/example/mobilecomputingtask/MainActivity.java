package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> alphabets;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabets = new ArrayList<String>(26);

        for(int i=0; i<26; i++){
            alphabets.add(Character.toString((char)(i+65)));
        }

        adapter = new ArrayAdapter<String>(this,R.layout.list_view,R.id.t1,alphabets);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);

        startActivity(intent);
    }
}