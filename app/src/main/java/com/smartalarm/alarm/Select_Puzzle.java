package com.smartalarm.alarm;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Select_Puzzle extends AppCompatActivity {
    private RelativeLayout eqtn,id_memory,id_shape ;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__puzzle);
        eqtn=(RelativeLayout) findViewById(R.id.eqtn);
        id_memory=(RelativeLayout) findViewById(R.id.id_memory);
        id_shape=(RelativeLayout) findViewById(R.id.id_shape);

        sharedPref=getSharedPreferences("share preferance",MODE_PRIVATE);;
        editor=sharedPref.edit();
        editor.apply();

        eqtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("types","equation");

                editor.apply();


                String type=sharedPref.getString("types","");

                Toast.makeText(getApplicationContext(),  " Clicked EQUATION ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Select_Puzzle.this, MainActivity.class);
                startActivity(intent);
            }
        });
        id_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("types","memorization");
                editor.apply();

                String type=sharedPref.getString("types","");

                Toast.makeText(getApplicationContext(),  " Clicked Memory ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Select_Puzzle.this, MainActivity.class);
                startActivity(intent);

            }
        });
        id_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("types","shape");
                editor.apply();
                String type=sharedPref.getString("types","");
                Toast.makeText(getApplicationContext(),  " Clicked Shape", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Select_Puzzle.this, Shape_Sequence.class);
                intent.putExtra("SHAPE","shape");
                startActivity(intent);
            }
        });

    }
}
