package com.example.project10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView list = (ListView) findViewById(R.id.list);

        ArrayList<Users> user_list = QueryUtils.extractUsers();
        /*user_list.add(new Users(1, 1, "tut", "gjhgjghjhj"));
        user_list.add(new Users(15, 2, "tut", "gjhgjghjhj"));
        user_list.add(new Users(2, 3, "tut", "gjhgjghjhj"));
        user_list.add(new Users(22, 4, "tut", "gjhgjghjhj"));*/
        UserAdapter adapter = new UserAdapter(HomeActivity.this, user_list);
        list.setAdapter(adapter);
    }
}