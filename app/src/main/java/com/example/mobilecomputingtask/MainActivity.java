package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button firstButton;
    Button secondButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFirst();
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeSecond();
            }
        });

        editText = findViewById(R.id.editTextTextPersonName3);
        textView = findViewById(R.id.textView);
    }

    private void changeFirst() {
        textView.setText(editText.getText().toString());
    }

    private void changeSecond() {
        textView.setText("");
        editText.setText("");
    }
}