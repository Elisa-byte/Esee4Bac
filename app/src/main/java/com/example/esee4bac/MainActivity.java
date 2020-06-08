package com.example.esee4bac;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button epic,test;

    @Override//A mapping from String keys to various Parcelable value - for saving data when we are changing the orientation to our layout (backup)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epic = (Button) findViewById(R.id.epic);
        epic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEpic();
            }
        });
        //liric
        //dramatic
        test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ openTest(); }
        });
    }
    public void openEpic() {
        Intent epicopen = new Intent(this, com.example.esee4bac.ActivityEpic.class);
        startActivity(epicopen);
    }
    public void openTest(){
        Intent testopen = new Intent(this, StartingScreenActivity.class);
        startActivity(testopen);
    }
}
