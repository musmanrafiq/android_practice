package com.dev.neo.androidlearning.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.dev.neo.androidlearning.R;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        Toast.makeText(this, "Its just a toast", Toast.LENGTH_SHORT).show();
    }
}
