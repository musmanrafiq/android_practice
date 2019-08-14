package com.dev.neo.androidlearning.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dev.neo.androidlearning.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        //i.putExtra("myData", "This is value");

        Bundle b = new Bundle();
        b.putString("myData", "This is value");

        i.putExtras(b);
        startActivity(i);
    }
}
