package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBaltag extends AppCompatActivity {
    private Button baltagtema, baltagcaract, baltagrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baltag);

        baltagtema = (Button) findViewById(R.id.baltagtema);
        baltagtema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaltagTema();
            }
        });
        baltagcaract = (Button) findViewById(R.id.baltagcaract);
        baltagcaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaltagCaract();
            }
        });
        baltagrel = (Button) findViewById(R.id.baltagrel);
        baltagrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaltagRel();
            }
        });

    }

    public void openBaltagTema() {
        Intent temabaltag = new Intent(this, baltagTema.class);
        startActivity(temabaltag);
    }

    public void openBaltagCaract() {
        Intent caractbaltag = new Intent(this, baltagCaract.class);
        startActivity(caractbaltag);
    }

    public void openBaltagRel() {
        Intent relbaltag = new Intent(this, baltagRel.class);
        startActivity(relbaltag);
    }
}
