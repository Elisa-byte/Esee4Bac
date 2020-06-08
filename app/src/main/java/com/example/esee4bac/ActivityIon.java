package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIon extends AppCompatActivity {
    private Button iontema, ioncaract, ionrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ion);

        iontema = (Button) findViewById(R.id.iontema);
        iontema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIonTema();
            }
        });
        ioncaract = (Button) findViewById(R.id.ioncaract);
        ioncaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIonCaract();
            }
        });
        ionrel = (Button) findViewById(R.id.ionrel);
        ionrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIonRel();
            }
        });
    }
    public void openIonTema() {
        Intent temaion = new Intent(this, ionTema.class);
        startActivity(temaion);
    }

    public void openIonCaract() {
        Intent caraction = new Intent(this, ionCaract.class);
        startActivity(caraction);
    }

    public void openIonRel() {
        Intent relion = new Intent(this, ionRel.class);
        startActivity(relion);
    }
}
