package com.example.mobilecomputingtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    boolean quiz;
    boolean [] isChecked1;
    boolean [] isChecked2;
    boolean [] isChecked3;
    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<QuizUnit> objects, boolean q) {
        super(context, resource, objects);
        quiz = q;
        isChecked1 = new boolean[3];
        isChecked2 = new boolean[3];
        isChecked3 = new boolean[3];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        QuizUnit usd = (QuizUnit) getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.quiz_view,null,true);

        ImageView img1 = convertView.findViewById(R.id.imageTemp);
        RadioGroup rgr = convertView.findViewById(R.id.radioGroup);
        RadioButton r1 = convertView.findViewById(R.id.radioButton);
        RadioButton r2 = convertView.findViewById(R.id.radioButton2);
        RadioButton r3 = convertView.findViewById(R.id.radioButton3);

        img1.setImageResource(usd.imageId);
        if(!quiz){
            rgr.setVisibility(View.GONE);
        }
        else{
            r1.setChecked(isChecked1[position]);
            r2.setChecked(isChecked2[position]);
            r3.setChecked(isChecked3[position]);
            r1.setText(Character.toString(usd.op1).toUpperCase());
            r2.setText(Character.toString(usd.op2).toUpperCase());
            r3.setText(Character.toString(usd.op3).toUpperCase());
            r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    isChecked1[position] = b;
                }
            });
            r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    isChecked2[position] = b;
                }
            });
            r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    isChecked3[position] = b;
                }
            });
        }

        return convertView;
    }
}
