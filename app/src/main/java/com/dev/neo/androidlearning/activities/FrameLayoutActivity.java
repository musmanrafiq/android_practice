package com.dev.neo.androidlearning.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.dev.neo.androidlearning.R;

public class FrameLayoutActivity extends AppCompatActivity implements View.OnClickListener
{

    private ImageView i1,i2,i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        i1 = findViewById(R.id.image1);
        i2 = findViewById(R.id.image2);
        i3 = findViewById(R.id.image3);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.image1){
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
            i3.setVisibility(View.GONE);
        }
        else if(v.getId() == R.id.image2){
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.image3){
            i1.setVisibility(View.VISIBLE);
            i2.setVisibility(View.GONE);
            i3.setVisibility(View.GONE);
        }
    }
}

