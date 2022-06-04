package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NewLessonsActivity extends AppCompatActivity {

    ArrayList<String> alphabets;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lessons);

        alphabets = new ArrayList<String>(26);

        for(int i=0; i<26; i++){
            alphabets.add(Character.toString((char)(i+65)));
        }

        adapter = new ArrayAdapter<String>(this,R.layout.list_view,R.id.t1,alphabets);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                onClick(alphabets.get(i));
            }
        });
    }

    public void onClick(String view) {
        Intent intent = new Intent(this, OldQuizAnswerActivity.class);
        intent.putExtra("char",view.toLowerCase());
        startActivity(intent);
    }
}