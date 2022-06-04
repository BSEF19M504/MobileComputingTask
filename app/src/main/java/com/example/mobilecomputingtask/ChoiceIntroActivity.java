package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceIntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button lesson,quiz;
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_intro);

        choice = getIntent().getStringExtra("choice");
        lesson = findViewById(R.id.lesson);
        quiz = findViewById(R.id.quiz);

        lesson.setOnClickListener(this);
        quiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.lesson:
                if(choice.equals("old"))
                    intent = new Intent(this, OldLessonsActivity.class);
                else
                    intent = new Intent(this, NewLessonsActivity.class);
                break;
            case R.id.quiz:
                if(choice.equals("old"))
                    intent = new Intent(this, OldQuizAnswerActivity.class);
                else
                    intent = new Intent(this, NewQuizAnswerActivity.class);
                break;
        }
        startActivity(intent);
    }
}