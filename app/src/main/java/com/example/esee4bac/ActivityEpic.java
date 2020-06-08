package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.esee4bac.ActivityHarap;
import com.example.esee4bac.R;

public class ActivityEpic extends AppCompatActivity {
    private Button alb,moara,alex,ion,baltag,ultima,enigma,eliade,morometii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epic);

        alb = (Button) findViewById(R.id.alb);
        alb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarap();
            }
        });

        moara = (Button) findViewById(R.id.moara);
        moara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoara();
            }
        });

        alex = (Button) findViewById(R.id.alex);
        alex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlex();
            }
        });

        ion = (Button) findViewById(R.id.ion);
        ion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIon();
            }
        });

        baltag = (Button) findViewById(R.id.baltag);
        baltag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaltag();
            }
        });

        ultima = (Button) findViewById(R.id.ultima);
        ultima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUltima();
            }
        });

        eliade = (Button) findViewById(R.id.eliade);
        eliade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEliade();
            }
        });

        enigma = (Button) findViewById(R.id.enigma);
        enigma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnigma();
            }
        });

        morometii = (Button) findViewById(R.id.morometii);
        morometii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMorometii();
            }
        });
     }

    public void openHarap(){
        Intent harapopen = new Intent(this, ActivityHarap.class);
        startActivity(harapopen);
    }
    public void openMoara() {
        Intent moaraopen = new Intent(this, ActivityMoara.class);
        startActivity(moaraopen);
    }
    public void openAlex(){
        Intent alexopen = new Intent(this, ActivityAlexandru.class);
        startActivity(alexopen);
    }
    public void openIon(){
        Intent ionopen = new Intent(this, ActivityIon.class);
        startActivity(ionopen);
    }
    public void openBaltag(){
        Intent baltagopen = new Intent(this, ActivityBaltag.class);
        startActivity(baltagopen);
    }
    public void openUltima(){
        Intent ultimaopen = new Intent(this, ActivityUltima.class);
        startActivity(ultimaopen);
    }

    public void openEliade(){
        Intent eliadeopen = new Intent(this, ActivityEliade.class);
        startActivity(eliadeopen);
    }
    public void openEnigma(){
        Intent enigmaopen = new Intent(this, ActivityEnigma.class);
        startActivity(enigmaopen);
    }
    public void openMorometii(){
        Intent morometiiopen = new Intent(this, ActivityMorometii.class);
        startActivity(morometiiopen);
    }
}
