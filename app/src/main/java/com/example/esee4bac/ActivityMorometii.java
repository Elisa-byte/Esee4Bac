package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMorometii extends AppCompatActivity {
    private Button morometiitema, morometiicaract, morometiirel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morometii);

        morometiitema = (Button) findViewById(R.id.morometiitema);
        morometiitema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMorometiiTema();
            }
        });
        morometiicaract = (Button) findViewById(R.id.morometiicaract);
        morometiicaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMorometiiCaract();
            }
        });
        morometiirel = (Button) findViewById(R.id.morometiirel);
        morometiirel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMorometiiRel();
            }
        });

    }

    public void openMorometiiTema() {
        Intent temamorometii = new Intent(this, morometiiTema.class);
        startActivity(temamorometii);
    }

    public void openMorometiiCaract() {
        Intent caractmorometii = new Intent(this, morometiiCaract.class);
        startActivity(caractmorometii);
    }

    public void openMorometiiRel() {
        Intent relmorometii = new Intent(this, morometiiRel.class);
        startActivity(relmorometii);
    }
}
