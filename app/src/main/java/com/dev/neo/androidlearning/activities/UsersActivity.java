package com.dev.neo.androidlearning.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.dev.neo.androidlearning.R;
import com.dev.neo.androidlearning.adapters.UserAdapter;
import com.dev.neo.androidlearning.infrastructure.models.UserModel;

import java.util.ArrayList;

public class UsersActivity extends AppCompatActivity {

    private ListView userList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        userList = findViewById(R.id.userList);

        ArrayList<UserModel> data = new ArrayList<>();
        data.add(new UserModel(1, "M.Salman Rafiq", "Islamabad"));
        data.add(new UserModel(2, "Hamza", "Islamabad"));

        UserAdapter userAdapter = new UserAdapter(this, data);

        userList.setAdapter(userAdapter);
        userAdapter.notifyDataSetChanged();

    }
}
