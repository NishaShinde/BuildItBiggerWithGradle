package com.example.displayjokes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class JokeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //getSupportActionBar().setTitle("Jokes");

    }

}