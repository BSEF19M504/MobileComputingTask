package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewIntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button lesson,quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intro);

        lesson = findViewById(R.id.new_lesson);
        quiz = findViewById(R.id.new_quiz);

        lesson.setOnClickListener(this);
        quiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.new_lesson:
                intent = new Intent(this, NewLessonsActivity.class);
                break;
            case R.id.new_quiz:
                intent = new Intent(this, NewQuizAnswerActivity.class);
                break;
        }
        startActivity(intent);
    }
}