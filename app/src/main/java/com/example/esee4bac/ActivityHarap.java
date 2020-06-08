package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHarap extends AppCompatActivity {
    private Button albtema, albcaract, albrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harap);
        albtema = (Button) findViewById(R.id.albtema);
        albtema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarapTema();
            }
        });
        albcaract = (Button) findViewById(R.id.albcaract);
        albcaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarapCaract();
            }
        });
        albrel = (Button) findViewById(R.id.albrel);
        albrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarapRel();
            }
        });

    }

    public void openHarapTema() {
        Intent temaalb = new Intent(this, harapTema.class);
        startActivity(temaalb);
    }

    public void openHarapCaract() {
        Intent caractalb = new Intent(this, harapCaract.class);
        startActivity(caractalb);
    }

    public void openHarapRel() {
        Intent relalb = new Intent(this, harapRel.class);
        startActivity(relalb);
    }

}
