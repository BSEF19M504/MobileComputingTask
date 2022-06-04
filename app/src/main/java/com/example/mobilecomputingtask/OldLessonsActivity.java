package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OldLessonsActivity extends AppCompatActivity implements View.OnClickListener{

    Button []alphabets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_lessons);

        alphabets = new Button[26];

        alphabets[0] = findViewById(R.id.button);
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
        alphabets[25] = findViewById(R.id.button26);

        for(int i=0; i<26; i++){
            alphabets[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, OldQuizAnswerActivity.class);
        switch (view.getId()){
            case R.id.button:
                intent.putExtra("char","a");
                break;
            case R.id.button2:
                intent.putExtra("char","b");
                break;
            case R.id.button3:
                intent.putExtra("char","c");
                break;
            case R.id.button4:
                intent.putExtra("char","d");
                break;
            case R.id.button5:
                intent.putExtra("char","e");
                break;
            case R.id.button6:
                intent.putExtra("char","f");
                break;
            case R.id.button7:
                intent.putExtra("char","g");
                break;
            case R.id.button8:
                intent.putExtra("char","h");
                break;
            case R.id.button9:
                intent.putExtra("char","i");
                break;
            case R.id.button10:
                intent.putExtra("char","j");
                break;
            case R.id.button11:
                intent.putExtra("char","k");
                break;
            case R.id.button12:
                intent.putExtra("char","l");
                break;
            case R.id.button13:
                intent.putExtra("char","m");
                break;
            case R.id.button14:
                intent.putExtra("char","n");
                break;
            case R.id.button15:
                intent.putExtra("char","o");
                break;
            case R.id.button16:
                intent.putExtra("char","p");
                break;
            case R.id.button17:
                intent.putExtra("char","q");
                break;
            case R.id.button18:
                intent.putExtra("char","r");
                break;
            case R.id.button19:
                intent.putExtra("char","s");
                break;
            case R.id.button20:
                intent.putExtra("char","t");
                break;
            case R.id.button21:
                intent.putExtra("char","u");
                break;
            case R.id.button22:
                intent.putExtra("char","v");
                break;
            case R.id.button23:
                intent.putExtra("char","w");
                break;
            case R.id.button24:
                intent.putExtra("char","x");
                break;
            case R.id.button25:
                intent.putExtra("char","y");
                break;
            case R.id.button26:
                intent.putExtra("char","z");
                break;
        }
        startActivity(intent);
    }
}