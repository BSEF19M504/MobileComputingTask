package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OldIntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button lesson,quiz,repo,old;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_intro);

        lesson = findViewById(R.id.lesson);
        quiz = findViewById(R.id.quiz);
        repo = findViewById(R.id.repo);
        old = findViewById(R.id.old);

        lesson.setOnClickListener(this);
        quiz.setOnClickListener(this);
        repo.setOnClickListener(this);
        old.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.lesson:
                intent = new Intent(this, NewLessonsActivity.class);
                break;
            case R.id.quiz:
                intent = new Intent(this, OldQuizAnswerActivity.class);
                break;
            case R.id.repo:
                Uri webpage = Uri.parse("https://github.com/BSEF19M504/MobileComputingTask");
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                break;
            case R.id.old:
                intent = new Intent(this, OldLessonsActivity.class);
                break;
        }
        startActivity(intent);
    }
}