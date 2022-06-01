package com.example.mobilecomputingtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<UserData> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UserData usd = (UserData) getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent);

        TextView textView = convertView.findViewById(R.id.t1);

        textView.setText(usd.name);
        return convertView;
    }
}
