package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    Button lesson,quiz,repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        lesson = findViewById(R.id.lesson);
        quiz = findViewById(R.id.quiz);
        repo = findViewById(R.id.repo);

        lesson.setOnClickListener(this);
        quiz.setOnClickListener(this);
        repo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.lesson:
                intent = new Intent(this,MainActivity.class);
                break;
            case R.id.quiz:
                intent = new Intent(this,MainActivity2.class);
                break;
            case R.id.repo:
                Uri webpage = Uri.parse("https://github.com/BSEF19M504/MobileComputingTask");
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                break;
        }
        startActivity(intent);
    }
}