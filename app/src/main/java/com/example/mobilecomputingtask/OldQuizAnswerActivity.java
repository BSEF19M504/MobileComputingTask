package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class OldQuizAnswerActivity extends AppCompatActivity {

    ImageView imageView, imageView1, imageView2;
    RadioGroup r1,r2,r3;
    RadioButton [] ques1;
    RadioButton [] ques2;
    RadioButton [] ques3;
    Button submit;
    TextView solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_quiz_answer);
        Intent intent = getIntent();
        String entry = intent.getStringExtra("char");
        char alphabet = entry==null?'-':entry.charAt(0);

        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        r1 = findViewById(R.id.q1);
        r2 = findViewById(R.id.q2);
        r3 = findViewById(R.id.q3);

        ques1 = new RadioButton[3];
        ques2 = new RadioButton[3];
        ques3 = new RadioButton[3];

        ques1[0] = findViewById(R.id.q1op1);
        ques1[1] = findViewById(R.id.q1op2);
        ques1[2] = findViewById(R.id.q1op3);

        ques2[0] = findViewById(R.id.q2op1);
        ques2[1] = findViewById(R.id.q2op2);
        ques2[2] = findViewById(R.id.q2op3);

        ques3[0] = findViewById(R.id.q3op1);
        ques3[1] = findViewById(R.id.q3op2);
        ques3[2] = findViewById(R.id.q3op3);

        submit = findViewById(R.id.submit);

        solution = findViewById(R.id.solution);

        int [] img1 = new int[26];
        int [] img2 = new int[26];
        int [] img3 = new int[26];

        img1[0] = R.drawable.a1;
        img2[0] = R.drawable.a2;
        img3[0] = R.drawable.a3;

        img1[1] = R.drawable.b1;
        img2[1] = R.drawable.b2;
        img3[1] = R.drawable.b3;

        img1[2] = R.drawable.c1;
        img2[2] = R.drawable.c2;
        img3[2] = R.drawable.c3;

        img1[3] = R.drawable.d1;
        img2[3] = R.drawable.d2;
        img3[3] = R.drawable.d3;

        img1[4] = R.drawable.e1;
        img2[4] = R.drawable.e2;
        img3[4] = R.drawable.e3;

        img1[5] = R.drawable.f1;
        img2[5] = R.drawable.f2;
        img3[5] = R.drawable.f3;

        img1[6] = R.drawable.g1;
        img2[6] = R.drawable.g2;
        img3[6] = R.drawable.g3;

        img1[7] = R.drawable.h1;
        img2[7] = R.drawable.h2;
        img3[7] = R.drawable.h3;

        img1[8] = R.drawable.i1;
        img2[8] = R.drawable.i2;
        img3[8] = R.drawable.i3;

        img1[9] = R.drawable.j1;
        img2[9] = R.drawable.j2;
        img3[9] = R.drawable.j3;

        img1[10] = R.drawable.k1;
        img2[10] = R.drawable.k2;
        img3[10] = R.drawable.k3;

        img1[11] = R.drawable.l1;
        img2[11] = R.drawable.l2;
        img3[11] = R.drawable.l3;

        img1[12] = R.drawable.m1;
        img2[12] = R.drawable.m2;
        img3[12] = R.drawable.m3;

        img1[13] = R.drawable.n1;
        img2[13] = R.drawable.n2;
        img3[13] = R.drawable.n3;

        img1[14] = R.drawable.o1;
        img2[14] = R.drawable.o2;
        img3[14] = R.drawable.o3;

        img1[15] = R.drawable.p1;
        img2[15] = R.drawable.p2;
        img3[15] = R.drawable.p3;

        img1[16] = R.drawable.q1;
        img2[16] = R.drawable.q2;
        img3[16] = R.drawable.q3;

        img1[17] = R.drawable.r1;
        img2[17] = R.drawable.r2;
        img3[17] = R.drawable.r3;

        img1[18] = R.drawable.s1;
        img2[18] = R.drawable.s2;
        img3[18] = R.drawable.s3;

        img1[19] = R.drawable.t1;
        img2[19] = R.drawable.t2;
        img3[19] = R.drawable.t3;

        img1[20] = R.drawable.u1;
        img2[20] = R.drawable.u2;
        img3[20] = R.drawable.u3;

        img1[21] = R.drawable.v1;
        img2[21] = R.drawable.v2;
        img3[21] = R.drawable.v3;

        img1[22] = R.drawable.w1;
        img2[22] = R.drawable.w2;
        img3[22] = R.drawable.w3;

        img1[23] = R.drawable.x1;
        img2[23] = R.drawable.x2;
        img3[23] = R.drawable.x3;

        img1[24] = R.drawable.y1;
        img2[24] = R.drawable.y2;
        img3[24] = R.drawable.y3;

        img1[25] = R.drawable.z1;
        img2[25] = R.drawable.z2;
        img3[25] = R.drawable.z3;

        if(alphabet >= 'a' && alphabet <= 'z'){
            imageView.setImageResource(img1[alphabet-97]);
            imageView1.setImageResource(img2[alphabet-97]);
            imageView2.setImageResource(img3[alphabet-97]);
            r1.setVisibility(View.GONE);
            r2.setVisibility(View.GONE);
            r3.setVisibility(View.GONE);
            submit.setVisibility(View.GONE);

        }
        else if (alphabet == '-'){
            Random rand = new Random();
            for(int i = 0; i<3; i++){
                int ind1 = rand.nextInt(26) +97;
                int ind2 = rand.nextInt(26) +97;
                int ind3 = rand.nextInt(26) +97;

                if (ind1 == ind2 || ind1 == ind3 || ind2 == ind3) {
                    i--;
                    continue;
                }
                String one = Character.toString((char)ind1);
                String two = Character.toString((char)ind2);
                String three = Character.toString((char)ind3);

                ques1[i].setText(one.toUpperCase());
                ques2[i].setText(two.toUpperCase());
                ques3[i].setText(three.toUpperCase());
            }
            int q1 = rand.nextInt(3);
            int q2 = rand.nextInt(3);
            int q3 = rand.nextInt(3);

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (submit.getText().toString().equals("Back")) {
                        finish();
                    }
                    else {
                        if (r1.getCheckedRadioButtonId() == -1 || r2.getCheckedRadioButtonId() == -1 || r3.getCheckedRadioButtonId() == -1){
                            Toast.makeText(OldQuizAnswerActivity.this, "Please Select All Options", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        submit.setText("Back");

                        RadioButton a1 = findViewById(r1.getCheckedRadioButtonId());
                        RadioButton a2 = findViewById(r2.getCheckedRadioButtonId());
                        RadioButton a3 = findViewById(r3.getCheckedRadioButtonId());

                        char op1 = a1.getText().toString().toLowerCase().charAt(0);
                        char op2 = a2.getText().toString().toLowerCase().charAt(0);
                        char op3 = a3.getText().toString().toLowerCase().charAt(0);

                        String answer = "";
                        char ans1 = ques1[q1].getText().toString().toLowerCase().charAt(0);
                        char ans2 = ques2[q2].getText().toString().toLowerCase().charAt(0);
                        char ans3 = ques3[q3].getText().toString().toLowerCase().charAt(0);

                        if (op1 == ans1)
                            answer += "Q1. You chose the correct answer '" + (char)(op1-32) + "'\n";
                        else
                            answer += "Q1. You chose the wrong answer '" + (char)(op1-32) + "', the correct answer is '" + (char)(ans1-32) + "'\n";
                        if (op2 == ans2)
                            answer += "Q2. You chose the correct answer '" + (char)(op2-32) + "'\n";
                        else
                            answer += "Q2. You chose the wrong answer '" + (char)(op2-32) + "', the correct answer is '" + (char)(ans2-32) + "'\n";
                        if (op3 == ans3)
                            answer += "Q3. You chose the correct answer '" + (char)(op3-32) + "'\n";
                        else
                            answer += "Q3. You chose the wrong answer '" + (char)(op3-32) + "', the correct answer is '" + (char)(ans3-32) + "'\n";
                        solution.setText(answer);
                    }
                }
            });
            imageView.setImageResource(img1[ques1[q1].getText().toString().toLowerCase().charAt(0) - 97]);
            imageView1.setImageResource(img2[ques2[q2].getText().toString().toLowerCase().charAt(0) - 97]);
            imageView2.setImageResource(img3[ques3[q3].getText().toString().toLowerCase().charAt(0) - 97]);
        }

    }
}