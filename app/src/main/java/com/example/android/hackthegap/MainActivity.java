package com.example.android.hackthegap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button helpButton = (Button) findViewById(R.id.help);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Go to a new page");
                Intent i = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(i);

            }
        });

        Button activitiesButton = (Button) findViewById(R.id.activities);
        activitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Go to a new page");
                Intent i = new Intent(MainActivity.this, RelaxActivity.class);
            }
        });

        Button smsbutton = (Button) findViewById(R.id.smsbutton);
        smsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Go to a new page");
                Intent i = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(i);

            }
        });
    }
}
