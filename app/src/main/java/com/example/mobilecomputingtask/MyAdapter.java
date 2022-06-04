package com.example.mobilecomputingtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    boolean quiz;
    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<QuizUnit> objects, boolean q) {
        super(context, resource, objects);
        quiz = q;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        QuizUnit usd = (QuizUnit) getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.quiz_view,parent);

        ImageView img1 = convertView.findViewById(R.id.imageTemp);
        RadioGroup rgr = convertView.findViewById(R.id.radioGroup);
        RadioButton r1 = convertView.findViewById(R.id.radioButton);
        RadioButton r2 = convertView.findViewById(R.id.radioButton2);
        RadioButton r3 = convertView.findViewById(R.id.radioButton3);

        img1.setImageResource(usd.imageId);
        r1.setText(Character.toString(usd.op1));
        r2.setText(Character.toString(usd.op2));
        r3.setText(Character.toString(usd.op3));
        if(!quiz){
            rgr.setVisibility(View.GONE);
        }


        return convertView;
    }
}
