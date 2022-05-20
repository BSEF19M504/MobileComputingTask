package com.example.mobilecomputingtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

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
        }
        else if (alphabet == '-'){
            Random rand = new Random();
            int q1 = rand.nextInt(26);
            int q2 = rand.nextInt(26);
            int q3 = rand.nextInt(26);
        }
        /*switch (alphabet){
            case 'a':
                imageView.setImageResource(img1[0]);
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
        }*/

    }
}