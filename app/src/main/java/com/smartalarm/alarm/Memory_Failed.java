package com.smartalarm.alarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Memory_Failed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory__failed);
        final Thread thread=new Thread(){
            public void run(){

                try
                {

                    Thread.sleep(1500);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {


                            Intent intent=new Intent(Memory_Failed.this,Memorization.class);
                            intent.putExtra("MEMORIZATION","memorization");
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
