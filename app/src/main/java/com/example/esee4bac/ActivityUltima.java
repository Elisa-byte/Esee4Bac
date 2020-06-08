package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityUltima extends AppCompatActivity {
    private Button ultimatema, ultimacaract, ultimarel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultima);
        ultimatema = (Button) findViewById(R.id.ultimatema);
        ultimatema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUltimaTema();
            }
        });
        ultimacaract = (Button) findViewById(R.id.ultimacaract);
        ultimacaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUltimaCaract();
            }
        });
        ultimarel = (Button) findViewById(R.id.ultimarel);
        ultimarel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUltimaRel();
            }
        });

    }

    public void openUltimaTema() {
        Intent temaultima = new Intent(this, ultimaTema.class);
        startActivity(temaultima);
    }

    public void openUltimaCaract() {
        Intent caractultima = new Intent(this, ultimaCaract.class);
        startActivity(caractultima);
    }

    public void openUltimaRel() {
        Intent relultima = new Intent(this, ultimaRel.class);
        startActivity(relultima);
    }
}
