package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button firstButton;
    Button secondButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);

        textView = findViewById(R.id.textView);
    }

    public void changeFirst(View view) {
        textView.setText("First Button Click");
    }

    public void changeSecond(View view) {
        textView.setText("Second Button Click");
    }
}