package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityEnigma extends AppCompatActivity {
    private Button enigmatema, enigmacaract, enigmarel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enigma);
        enigmatema = (Button) findViewById(R.id.enigmatema);
        enigmatema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnigmaTema();
            }
        });
        enigmacaract = (Button) findViewById(R.id.enigmacaract);
        enigmacaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnigmaCaract();
            }
        });
        enigmarel = (Button) findViewById(R.id.enigmarel);
        enigmarel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnigmaRel();
            }
        });

    }

    public void openEnigmaTema() {
        Intent temaenigma = new Intent(this, enigmaTema.class);
        startActivity(temaenigma);
    }

    public void openEnigmaCaract() {
        Intent caractenigma = new Intent(this, enigmaCaract.class);
        startActivity(caractenigma);
    }

    public void openEnigmaRel() {
        Intent relenigma = new Intent(this, enigmaRel.class);
        startActivity(relenigma);
    }
}
