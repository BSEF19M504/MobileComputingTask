package com.example.mobilecomputingtask;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewQuizAnswerActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<QuizUnit> alphabets;
    MyAdapter adapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_quiz_answer);

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

        alphabets = new ArrayList<QuizUnit>(3);

        char mode = getIntent().getCharExtra("char",'-');

        button = findViewById(R.id.btn);
        button.setOnClickListener(this);

        if(mode >= 'a' && mode <= 'z'){
            alphabets.add(new QuizUnit(img1[mode-97]));
            alphabets.add(new QuizUnit(img2[mode-97]));
            alphabets.add(new QuizUnit(img3[mode-97]));
            button.setVisibility(View.GONE);

        }

        adapter = new MyAdapter(this,0,alphabets,mode=='-');

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }

    public void onClick(View view) {

    }
}