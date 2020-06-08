package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityEliade extends AppCompatActivity {
    private Button eliadetema, eliadecaract, eliaderel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliade);

        eliadetema = (Button) findViewById(R.id.eliadetema);
        eliadetema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEliadeTema();
            }
        });
        eliadecaract = (Button) findViewById(R.id.eliadecaract);
        eliadecaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEliadeCaract();
            }
        });
        eliaderel = (Button) findViewById(R.id.eliaderel);
        eliaderel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEliadeRel();
            }
        });

    }

    public void openEliadeTema() {
        Intent temaeliade = new Intent(this, eliadeTema.class);
        startActivity(temaeliade);
    }

    public void openEliadeCaract() {
        Intent caracteliade = new Intent(this, eliadeCaract.class);
        startActivity(caracteliade);
    }

    public void openEliadeRel() {
        Intent releliade = new Intent(this, eliadeRel.class);
        startActivity(releliade);
    }
}
