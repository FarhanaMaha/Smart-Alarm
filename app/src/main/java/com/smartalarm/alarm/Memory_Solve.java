package com.smartalarm.alarm;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class Memory_Solve extends AppCompatActivity {
    public RelativeLayout id_memory;
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory__solve);
        id_memory = (RelativeLayout) findViewById(R.id.id_memory);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String memorizationName = bundle.getString("MEMORIZATION");
            showMemorization(memorizationName);
        }
    }

    public void showMemorization(String memorizationName) {

        if (memorizationName.equals("memorization")) {
            AlertDialog.Builder alartDialog = new AlertDialog.Builder(Memory_Solve.this);
            alartDialog.setMessage("Memorization \n \n Remember 4 of 16 cards")
                    .setCancelable(true)
                    .setPositiveButton("Try", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            Intent intent = new Intent(Memory_Solve.this, Memorization.class);
                            startActivity(intent);

                        }
                    });
            AlertDialog alertDialog = alartDialog.create();
            alartDialog.show();

        }


    }

}
