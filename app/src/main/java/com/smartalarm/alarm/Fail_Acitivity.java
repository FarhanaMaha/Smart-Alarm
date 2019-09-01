package com.smartalarm.alarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fail_Acitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fail_activity);

        final Thread thread=new Thread(){
            public void run(){

                    try
                    {

                        Thread.sleep(1500);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {


                                Intent intent=new Intent(Fail_Acitivity.this,Equation_solve.class);
                                intent.putExtra("EQUATION","equation");
                                startActivity(intent);

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

