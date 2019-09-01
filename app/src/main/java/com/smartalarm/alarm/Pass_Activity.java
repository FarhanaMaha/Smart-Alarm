package com.smartalarm.alarm;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Pass_Activity extends AppCompatActivity {
    //RelativeLayout relativeLayout;
    // Dialog dialog;
    //  View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pass_activity);

        final Thread thread=new Thread(){
            public void run(){
                    try
                    {

                        Thread.sleep(1500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                Intent intent = new Intent(Pass_Activity.this, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);

                                System.exit(5);

                            }
                        });
                    }
                    catch (InterruptedException e){

                    }
                }


        };

        thread.start();


    }
}
