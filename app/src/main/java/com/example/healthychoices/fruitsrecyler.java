package com.example.healthychoices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class fruitsrecyler extends AppCompatActivity {

    ArrayList fruitNames = new ArrayList<>(Arrays.asList("Apples","Banana","Orange","Strawberry","Pears","Plums"));
    ArrayList fruitDescription = new ArrayList<>(Arrays.asList("A sweet apple","A sweet banana","A succulent orange","Sweet strawberry","Watery pears","juicy plums"));
    ArrayList fruitImages = new ArrayList<>(Arrays.asList(R.drawable.apple, R.drawable.banana,R.drawable.orange,R.drawable.strawberries,R.drawable.pears,R.drawable.plum   ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsrecyler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(fruitsrecyler.this, fruitNames,fruitDescription,fruitImages);
        recyclerView.setAdapter(customAdapter);

    }
}