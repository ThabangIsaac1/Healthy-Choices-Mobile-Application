package com.example.healthychoices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class choices extends AppCompatActivity {

    private RadioGroup radiofruits;
    private RadioButton radioFruit;
    private RadioButton radioVegetable;
    private RadioButton radioGrains;
    private RadioButton selection;
    private RadioButton test;
    ImageButton select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        select = (ImageButton) findViewById(R.id.optionBtn);
        radiofruits = (RadioGroup) findViewById(R.id.radioFruits);
        radioFruit = (RadioButton) findViewById(R.id.fruits);
        radioVegetable = (RadioButton) findViewById(R.id.vegetables);
        radioGrains = (RadioButton) findViewById(R.id.grains);



        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Selected();
            }
        });

    }
    public void Selected(){

        Intent intent = new Intent(this, fruitsrecyler.class);
        startActivity(intent);

    }

}