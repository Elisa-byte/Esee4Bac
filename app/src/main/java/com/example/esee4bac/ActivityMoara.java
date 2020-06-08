package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMoara extends AppCompatActivity {
    private Button moaratema, moaracaract, moararel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moara);

        moaratema = (Button) findViewById(R.id.moaratema);
        moaratema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoaraTema();
            }
        });
        moaracaract = (Button) findViewById(R.id.moaracaract);
        moaracaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoaraCaract();
            }
        });
        moararel = (Button) findViewById(R.id.moararel);
        moararel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoaraRel();
            }
        });
    }
    public void openMoaraTema() {
        Intent temamoara = new Intent(this, moaraTema.class);
        startActivity(temamoara);
    }

    public void openMoaraCaract() {
        Intent caractmoara = new Intent(this, moaraCaract.class);
        startActivity(caractmoara);
    }

    public void openMoaraRel() {
        Intent relmoara = new Intent(this, moaraRel.class);
        startActivity(relmoara);
    }

}
