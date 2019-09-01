package com.smartalarm.alarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Puzzle_type extends AppCompatActivity {
    private RelativeLayout eqtn,id_memory,id_shape ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_type);
        eqtn=(RelativeLayout) findViewById(R.id.eqtn);
        id_memory=(RelativeLayout) findViewById(R.id.id_memory);
        id_shape=(RelativeLayout) findViewById(R.id.id_shape);


        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    }

