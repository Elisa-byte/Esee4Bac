package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAlexandru extends AppCompatActivity {
    private Button alextema, alexcaract, alexrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexandru);

        alextema = (Button) findViewById(R.id.alextema);
        alextema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlexTema();
            }
        });
        alexcaract = (Button) findViewById(R.id.alexcaract);
        alexcaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlexCaract();
            }
        });
        alexrel = (Button) findViewById(R.id.alexrel);
        alexrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlexRel();
            }
        });
    }
    public void openAlexTema() {
        Intent temaalex = new Intent(this, alexTema.class);
        startActivity(temaalex);
    }

    public void openAlexCaract() {
        Intent caractalex = new Intent(this, alexCaract.class);
        startActivity(caractalex);
    }

    public void openAlexRel() {
        Intent relalex = new Intent(this, alexRel.class);
        startActivity(relalex);
    }
}
