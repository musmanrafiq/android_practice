package com.dev.neo.androidlearning.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.dev.neo.androidlearning.R;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner employTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        // initialization
        employTypeSpinner = findViewById(R.id.employType);

        ArrayList<String> values = new ArrayList<String>();
        values.add("Manager");
        values.add("Accountant");
        values.add("Guard");

        ArrayAdapter<String> spinerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, values);
        employTypeSpinner.setAdapter(spinerAdapter);

        employTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), itemValue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
