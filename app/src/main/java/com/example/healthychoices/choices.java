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



        radiofruits.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if ((null == rb) || (checkedId <= -1)) {
                    return;
                }




                Toast.makeText(choices.this, rb.getText(), Toast.LENGTH_SHORT).show();


            }
        });

    }
    public void onSubmit(View v) {
        RadioButton rb = (RadioButton) radiofruits.findViewById(radiofruits.getCheckedRadioButtonId());
        String text = (String) rb.getText().toString();
        final Intent intent;
        System.out.println(text);
        if(rb.getText().equals("Fruits")){

            intent =  new Intent(this,fruitsrecyler.class);

        }else {

            intent =  new Intent(this, choices.class);

        }

        startActivity(intent);
    }


}