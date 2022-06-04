package com.example.project10;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<Users> {
    public UserAdapter(Activity context , ArrayList<Users> objects) { super(context , 0 , objects); }

    @NonNull
    @Override
    public View getView(int position , @Nullable View view , @NonNull ViewGroup parent) {
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Users curr = getItem(position);
        TextView id = (TextView) view.findViewById(R.id.id);
        TextView userId = (TextView) view.findViewById(R.id.user_id);
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView body = (TextView) view.findViewById(R.id.body);

        id.setText(Integer.toString(curr.getId()));
        userId.setText(Integer.toString(curr.getUserId()));
        title.setText(curr.getTitle());
        body.setText(curr.getBody());

        return view;
    }
}