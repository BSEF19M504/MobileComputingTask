package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class NewQuizAnswerActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<QuizUnit> alphabets;
    MyAdapter adapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_quiz_answer);

        alphabets = new ArrayList<QuizUnit>(26);

        for(int i=0; i<26; i++){
            //alphabets.add(Character.toString((char)(i+65)));
        }

        adapter = new MyAdapter(this,0,alphabets,true);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        button = findViewById(R.id.btn);
        button.setOnClickListener(this);

    }

    public void onClick(View view) {

    }
}