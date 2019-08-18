package com.dev.neo.androidlearning.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dev.neo.androidlearning.R;

public class ButtonExerciseActivity extends AppCompatActivity {

    Button firstBtn, secondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        firstBtn = findViewById(R.id.firstBtn);
        secondBtn = findViewById(R.id.secondBtn);


        firstBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(ButtonExerciseActivity.this, "First button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        secondBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(ButtonExerciseActivity.this, "Second button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


   /* @Override
   // second way to bind controls clicks from same activity to a single event
    public void onClick(View v) {
        if(v.getId() == R.id.firstBtn) {
            Toast.makeText(this, "First button clicked", Toast.LENGTH_SHORT).show();
        } else if(v.getId() == R.id.secondBtn){
            Toast.makeText(this, "Second button clicked", Toast.LENGTH_SHORT).show();
        }
    }*/

    /*
    // its for binding from xml file
    public void firstBtnClick(View view) {
        Toast.makeText(this, "First button clicked", Toast.LENGTH_SHORT).show();
    }*/

}
