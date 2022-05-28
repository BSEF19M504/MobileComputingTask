package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button [] alphabets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabets = new Button[26];

        /*alphabets[0] = findViewById(R.id.button);
        alphabets[1] = findViewById(R.id.button2);
        alphabets[2] = findViewById(R.id.button3);
        alphabets[3] = findViewById(R.id.button4);
        alphabets[4] = findViewById(R.id.button5);
        alphabets[5] = findViewById(R.id.button6);
        alphabets[6] = findViewById(R.id.button7);
        alphabets[7] = findViewById(R.id.button8);
        alphabets[8] = findViewById(R.id.button9);
        alphabets[9] = findViewById(R.id.button10);
        alphabets[10] = findViewById(R.id.button11);
        alphabets[11] = findViewById(R.id.button12);
        alphabets[12] = findViewById(R.id.button13);
        alphabets[13] = findViewById(R.id.button14);
        alphabets[14] = findViewById(R.id.button15);
        alphabets[15] = findViewById(R.id.button16);
        alphabets[16] = findViewById(R.id.button17);
        alphabets[17] = findViewById(R.id.button18);
        alphabets[18] = findViewById(R.id.button19);
        alphabets[19] = findViewById(R.id.button20);
        alphabets[20] = findViewById(R.id.button21);
        alphabets[21] = findViewById(R.id.button22);
        alphabets[22] = findViewById(R.id.button23);
        alphabets[23] = findViewById(R.id.button24);
        alphabets[24] = findViewById(R.id.button25);
        alphabets[25] = findViewById(R.id.button26);*/

        for(int i=0; i<26; i++){
            alphabets[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);

        startActivity(intent);
    }
}