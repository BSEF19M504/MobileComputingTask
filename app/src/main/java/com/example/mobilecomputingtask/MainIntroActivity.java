package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainIntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button oldApp,newApp,repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intro);

        oldApp = findViewById(R.id.old_layout);
        newApp = findViewById(R.id.new_layout);
        repo = findViewById(R.id.repo);

        oldApp.setOnClickListener(this);
        newApp.setOnClickListener(this);
        repo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ChoiceIntroActivity.class);
        switch (view.getId()){
            case R.id.old_layout:
                intent.putExtra("choice","old");
                break;
            case R.id.new_layout:
                intent.putExtra("choice","new");
                break;
            case R.id.repo:
                Uri webpage = Uri.parse("https://github.com/BSEF19M504/MobileComputingTask");
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                break;
        }
        startActivity(intent);
    }
}