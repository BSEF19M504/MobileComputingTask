package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView, imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String entry = intent.getStringExtra("char");
        char alphabet = entry==null?'-':entry.charAt(0);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

        switch (alphabet){
            case 'a':
                imageView.setImageResource(R.drawable.a1);
                imageView1.setImageResource(R.drawable.a2);
                imageView2.setImageResource(R.drawable.a3);
                break;
            case 'b':
                imageView.setImageResource(R.drawable.b1);
                imageView1.setImageResource(R.drawable.b2);
                imageView2.setImageResource(R.drawable.b3);
                break;
            case 'c':
                imageView.setImageResource(R.drawable.c1);
                imageView1.setImageResource(R.drawable.c2);
                imageView2.setImageResource(R.drawable.c3);
                break;
            case 'd':
                imageView.setImageResource(R.drawable.d1);
                imageView1.setImageResource(R.drawable.d2);
                imageView2.setImageResource(R.drawable.d3);
                break;
            case 'e':
                imageView.setImageResource(R.drawable.e1);
                imageView1.setImageResource(R.drawable.e2);
                imageView2.setImageResource(R.drawable.e3);
                break;
            case 'f':
                imageView.setImageResource(R.drawable.f1);
                imageView1.setImageResource(R.drawable.f2);
                imageView2.setImageResource(R.drawable.f3);
                break;
            case 'g':
                imageView.setImageResource(R.drawable.g1);
                imageView1.setImageResource(R.drawable.g2);
                imageView2.setImageResource(R.drawable.g3);
                break;
            case 'h':
                imageView.setImageResource(R.drawable.h1);
                imageView1.setImageResource(R.drawable.h2);
                imageView2.setImageResource(R.drawable.h3);
                break;
            case 'i':
                imageView.setImageResource(R.drawable.i1);
                imageView1.setImageResource(R.drawable.i2);
                imageView2.setImageResource(R.drawable.i3);
                break;
            case 'j':
                imageView.setImageResource(R.drawable.j1);
                imageView1.setImageResource(R.drawable.j2);
                imageView2.setImageResource(R.drawable.j3);
                break;
            case 'k':
                imageView.setImageResource(R.drawable.k1);
                imageView1.setImageResource(R.drawable.k2);
                imageView2.setImageResource(R.drawable.k3);
                break;
            case 'l':
                imageView.setImageResource(R.drawable.l1);
                imageView1.setImageResource(R.drawable.l2);
                imageView2.setImageResource(R.drawable.l3);
                break;
            case 'm':
                imageView.setImageResource(R.drawable.m1);
                imageView1.setImageResource(R.drawable.m2);
                imageView2.setImageResource(R.drawable.m3);
                break;
            case 'n':
                imageView.setImageResource(R.drawable.n1);
                imageView1.setImageResource(R.drawable.n2);
                imageView2.setImageResource(R.drawable.n3);
                break;
            case 'o':
                imageView.setImageResource(R.drawable.o1);
                imageView1.setImageResource(R.drawable.o2);
                imageView2.setImageResource(R.drawable.o3);
                break;
            case 'p':
                imageView.setImageResource(R.drawable.p1);
                imageView1.setImageResource(R.drawable.p2);
                imageView2.setImageResource(R.drawable.p3);
                break;
            case 'q':
                imageView.setImageResource(R.drawable.q1);
                imageView1.setImageResource(R.drawable.q2);
                imageView2.setImageResource(R.drawable.q3);
                break;
            case 'r':
                imageView.setImageResource(R.drawable.r1);
                imageView1.setImageResource(R.drawable.r2);
                imageView2.setImageResource(R.drawable.r3);
                break;
            case 's':
                imageView.setImageResource(R.drawable.s1);
                imageView1.setImageResource(R.drawable.s2);
                imageView2.setImageResource(R.drawable.s3);
                break;
            case 't':
                imageView.setImageResource(R.drawable.t1);
                imageView1.setImageResource(R.drawable.t2);
                imageView2.setImageResource(R.drawable.t3);
                break;
            case 'u':
                imageView.setImageResource(R.drawable.u1);
                imageView1.setImageResource(R.drawable.u2);
                imageView2.setImageResource(R.drawable.u3);
                break;
            case 'v':
                imageView.setImageResource(R.drawable.v1);
                imageView1.setImageResource(R.drawable.v2);
                imageView2.setImageResource(R.drawable.v3);
                break;
            case 'w':
                imageView.setImageResource(R.drawable.w1);
                imageView1.setImageResource(R.drawable.w2);
                imageView2.setImageResource(R.drawable.w3);
                break;
            case 'x':
                imageView.setImageResource(R.drawable.x1);
                imageView1.setImageResource(R.drawable.x2);
                imageView2.setImageResource(R.drawable.x3);
                break;
            case 'y':
                imageView.setImageResource(R.drawable.y1);
                imageView1.setImageResource(R.drawable.y2);
                imageView2.setImageResource(R.drawable.y3);
                break;
            case 'z':
                imageView.setImageResource(R.drawable.z1);
                imageView1.setImageResource(R.drawable.z2);
                imageView2.setImageResource(R.drawable.z3);
                break;
        }

    }
}