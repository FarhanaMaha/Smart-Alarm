package com.smartalarm.alarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Memorization extends AppCompatActivity {
    private Random r = new Random();
    ImageView im_1, im_2, im_3, im_4, im_5, im_6, im_7, im_8, im_9, im_10, im_11, im_12, im_13, im_14, im_15, im_16;
    private int current_image;
    private int fst = r.nextInt(16) + 1;
    private int second = r.nextInt(16) + 1;
    private int third = r.nextInt(16) + 1;
    private int four = r.nextInt(16) + 1;
    private    int[] whiteIm={R.drawable.first_a};

    private int[] images = {5, R.drawable.red_a, R.drawable.blue_a, R.drawable.green_a, R.drawable.oarnge_a, R.drawable.yellow_a};
    private ArrayList<Integer> list;
    private boolean a=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorization);
        list=new ArrayList<Integer>();
        list.add(20);

        im_1 = (ImageView) findViewById(R.id.im_11);
        im_2 = (ImageView) findViewById(R.id.im_12);
        im_3 = (ImageView) findViewById(R.id.im_13);
        im_4 = (ImageView) findViewById(R.id.im_14);
        im_5 = (ImageView) findViewById(R.id.im_21);
        im_6 = (ImageView) findViewById(R.id.im_22);
        im_7 = (ImageView) findViewById(R.id.im_23);
        im_8 = (ImageView) findViewById(R.id.im_24);
        im_9 = (ImageView) findViewById(R.id.im_31);
        im_10 = (ImageView) findViewById(R.id.im_32);
        im_11 = (ImageView) findViewById(R.id.im_33);
        im_12 = (ImageView) findViewById(R.id.im_34);
        im_13 = (ImageView) findViewById(R.id.im_41);
        im_14 = (ImageView) findViewById(R.id.im_42);
        im_15 = (ImageView) findViewById(R.id.im_43);
        im_16 = (ImageView) findViewById(R.id.im_44);


        current_image = r.nextInt(5) + 1;
        if (fst == 1) {
            im_1.setImageResource(images[current_image]);
        } else if (fst == 2) {
            im_2.setImageResource(images[current_image]);
        } else if (fst == 3) {
            im_3.setImageResource(images[current_image]);
        } else if (fst == 4) {
            im_4.setImageResource(images[current_image]);
        } else if (fst == 5) {
            im_5.setImageResource(images[current_image]);
        } else if (fst == 6) {
            im_6.setImageResource(images[current_image]);
        } else if (fst == 7) {
            im_7.setImageResource(images[current_image]);
        } else if (fst == 8) {
            im_8.setImageResource(images[current_image]);
        } else if (fst == 9) {
            im_9.setImageResource(images[current_image]);
        } else if (fst == 10) {
            im_10.setImageResource(images[current_image]);
        } else if (fst == 11) {
            im_11.setImageResource(images[current_image]);
        } else if (fst == 12) {
            im_12.setImageResource(images[current_image]);
        } else if (fst == 9) {
            im_9.setImageResource(images[current_image]);
        } else if (fst == 13) {
            im_13.setImageResource(images[current_image]);
        } else if (fst == 14) {
            im_14.setImageResource(images[current_image]);
        } else if (fst == 15) {
            im_15.setImageResource(images[current_image]);
        } else if (fst == 16) {
            im_16.setImageResource(images[current_image]);
        }

        if (second == 1) {
            im_1.setImageResource(images[current_image]);
        } else if (second == 2) {
            im_2.setImageResource(images[current_image]);
        } else if (second == 3) {
            im_3.setImageResource(images[current_image]);
        } else if (second == 4) {
            im_4.setImageResource(images[current_image]);
        } else if (second == 5) {
            im_5.setImageResource(images[current_image]);
        } else if (second == 6) {
            im_6.setImageResource(images[current_image]);
        } else if (second == 7) {
            im_7.setImageResource(images[current_image]);
        } else if (second == 8) {
            im_8.setImageResource(images[current_image]);
        } else if (second == 9) {
            im_9.setImageResource(images[current_image]);
        } else if (second == 10) {
            im_10.setImageResource(images[current_image]);
        } else if (second == 11) {
            im_11.setImageResource(images[current_image]);
        } else if (second == 12) {
            im_12.setImageResource(images[current_image]);
        } else if (second == 13) {
            im_13.setImageResource(images[current_image]);
        } else if (second == 14) {
            im_14.setImageResource(images[current_image]);
        } else if (second == 15) {
            im_15.setImageResource(images[current_image]);
        } else if (second == 16) {
            im_16.setImageResource(images[current_image]);
        }
        if (third == 1) {
            im_1.setImageResource(images[current_image]);
        } else if (third == 2) {
            im_2.setImageResource(images[current_image]);
        } else if (third == 3) {
            im_3.setImageResource(images[current_image]);
        } else if (third == 4) {
            im_4.setImageResource(images[current_image]);
        } else if (third == 5) {
            im_5.setImageResource(images[current_image]);
        } else if (third == 6) {
            im_6.setImageResource(images[current_image]);
        } else if (third == 7) {
            im_7.setImageResource(images[current_image]);
        } else if (third == 8) {
            im_8.setImageResource(images[current_image]);
        } else if (third == 9) {
            im_9.setImageResource(images[current_image]);
        } else if (third == 10) {
            im_10.setImageResource(images[current_image]);
        } else if (third == 11) {
            im_11.setImageResource(images[current_image]);
        } else if (third == 12) {
            im_12.setImageResource(images[current_image]);
        } else if (third == 13) {
            im_13.setImageResource(images[current_image]);
        } else if (third == 14) {
            im_14.setImageResource(images[current_image]);
        } else if (third == 15) {
            im_15.setImageResource(images[current_image]);
        } else if (third == 16) {
            im_16.setImageResource(images[current_image]);
        }
        if (four == 1) {
            im_1.setImageResource(images[current_image]);
        } else if (four == 2) {
            im_2.setImageResource(images[current_image]);
        } else if (four == 3) {
            im_3.setImageResource(images[current_image]);
        } else if (four == 4) {
            im_4.setImageResource(images[current_image]);
        } else if (four == 5) {
            im_5.setImageResource(images[current_image]);
        } else if (four == 6) {
            im_6.setImageResource(images[current_image]);
        } else if (four == 7) {
            im_7.setImageResource(images[current_image]);
        } else if (fst == 8) {
            im_8.setImageResource(images[current_image]);
        } else if (four == 9) {
            im_9.setImageResource(images[current_image]);
        } else if (four == 10) {
            im_10.setImageResource(images[current_image]);
        } else if (four == 11) {
            im_11.setImageResource(images[current_image]);
        } else if (four == 12) {
            im_12.setImageResource(images[current_image]);
        } else if (four == 13) {
            im_13.setImageResource(images[current_image]);
        } else if (four == 14) {
            im_14.setImageResource(images[current_image]);
        } else if (four == 15) {
            im_15.setImageResource(images[current_image]);
        } else if (four == 16) {
            im_16.setImageResource(images[current_image]);
        }







        final Thread thread=new Thread(){
            public void run(){
                while (!isInterrupted()){
                    try
                    {

                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                im_1 = (ImageView) findViewById(R.id.im_11);
                                im_2 = (ImageView) findViewById(R.id.im_12);
                                im_3 = (ImageView) findViewById(R.id.im_13);
                                im_4 = (ImageView) findViewById(R.id.im_14);
                                im_5 = (ImageView) findViewById(R.id.im_21);
                                im_6 = (ImageView) findViewById(R.id.im_22);
                                im_7 = (ImageView) findViewById(R.id.im_23);
                                im_8 = (ImageView) findViewById(R.id.im_24);
                                im_9 = (ImageView) findViewById(R.id.im_31);
                                im_10 = (ImageView) findViewById(R.id.im_32);
                                im_11 = (ImageView) findViewById(R.id.im_33);
                                im_12 = (ImageView) findViewById(R.id.im_34);
                                im_13 = (ImageView) findViewById(R.id.im_41);
                                im_15 = (ImageView) findViewById(R.id.im_42);
                                im_15 = (ImageView) findViewById(R.id.im_43);
                                im_16 = (ImageView) findViewById(R.id.im_44);


                                if (fst == 1) {
                                    im_1.setImageResource(whiteIm[0]);
                                } else if (fst == 2) {
                                    im_2.setImageResource(whiteIm[0]);
                                } else if (fst == 3) {
                                    im_3.setImageResource(whiteIm[0]);
                                } else if (fst == 4) {
                                    im_4.setImageResource(whiteIm[0]);
                                } else if (fst == 5) {
                                    im_5.setImageResource(whiteIm[0]);
                                } else if (fst == 6) {
                                    im_6.setImageResource(whiteIm[0]);
                                } else if (fst == 7) {
                                    im_7.setImageResource(whiteIm[0]);
                                } else if (fst == 8) {
                                    im_8.setImageResource(whiteIm[0]);
                                } else if (fst == 9) {
                                    im_9.setImageResource(whiteIm[0]);
                                } else if (fst == 10) {
                                    im_10.setImageResource(whiteIm[0]);
                                } else if (fst == 11) {
                                    im_11.setImageResource(whiteIm[0]);
                                } else if (fst == 12) {
                                    im_12.setImageResource(whiteIm[0]);
                                } else if (fst == 9) {
                                    im_9.setImageResource(whiteIm[0]);
                                } else if (fst == 13) {
                                    im_13.setImageResource(whiteIm[0]);
                                } else if (fst == 14) {
                                    im_14.setImageResource(whiteIm[0]);
                                } else if (fst == 15) {
                                    im_15.setImageResource(whiteIm[0]);
                                } else if (fst == 16) {
                                    im_16.setImageResource(whiteIm[0]);
                                }

                                if (second == 1) {
                                    im_1.setImageResource(whiteIm[0]);
                                } else if (second == 2) {
                                    im_2.setImageResource(whiteIm[0]);
                                } else if (second == 3) {
                                    im_3.setImageResource(whiteIm[0]);
                                } else if (second == 4) {
                                    im_4.setImageResource(whiteIm[0]);
                                } else if (second == 5) {
                                    im_5.setImageResource(whiteIm[0]);
                                } else if (second == 6) {
                                    im_6.setImageResource(whiteIm[0]);
                                } else if (second == 7) {
                                    im_7.setImageResource(whiteIm[0]);
                                } else if (second == 8) {
                                    im_8.setImageResource(whiteIm[0]);
                                } else if (second == 9) {
                                    im_9.setImageResource(whiteIm[0]);
                                } else if (second == 10) {
                                    im_10.setImageResource(whiteIm[0]);
                                } else if (second == 11) {
                                    im_11.setImageResource(whiteIm[0]);
                                } else if (second == 12) {
                                    im_12.setImageResource(whiteIm[0]);
                                } else if (second == 13) {
                                    im_13.setImageResource(whiteIm[0]);
                                } else if (second == 14) {
                                    im_14.setImageResource(whiteIm[0]);
                                } else if (second == 15) {
                                    im_15.setImageResource(whiteIm[0]);
                                } else if (second == 16) {
                                    im_16.setImageResource(whiteIm[0]);
                                }
                                if (third == 1) {
                                    im_1.setImageResource(whiteIm[0]);
                                } else if (third == 2) {
                                    im_2.setImageResource(whiteIm[0]);
                                } else if (third == 3) {
                                    im_3.setImageResource(whiteIm[0]);
                                } else if (third == 4) {
                                    im_4.setImageResource(whiteIm[0]);
                                } else if (third == 5) {
                                    im_5.setImageResource(whiteIm[0]);
                                } else if (third == 6) {
                                    im_6.setImageResource(whiteIm[0]);
                                } else if (third == 7) {
                                    im_7.setImageResource(whiteIm[0]);
                                } else if (third == 8) {
                                    im_8.setImageResource(whiteIm[0]);
                                } else if (third == 9) {
                                    im_9.setImageResource(whiteIm[0]);
                                } else if (third == 10) {
                                    im_10.setImageResource(whiteIm[0]);
                                } else if (third == 11) {
                                    im_11.setImageResource(whiteIm[0]);
                                } else if (third == 12) {
                                    im_12.setImageResource(whiteIm[0]);
                                } else if (third == 13) {
                                    im_13.setImageResource(whiteIm[0]);
                                } else if (third == 14) {
                                    im_14.setImageResource(whiteIm[0]);
                                } else if (third == 15) {
                                    im_15.setImageResource(whiteIm[0]);
                                } else if (third == 16) {
                                    im_16.setImageResource(whiteIm[0]);
                                }
                                if (four == 1) {
                                    im_1.setImageResource(whiteIm[0]);
                                } else if (four == 2) {
                                    im_2.setImageResource(whiteIm[0]);
                                } else if (four == 3) {
                                    im_3.setImageResource(whiteIm[0]);
                                } else if (four == 4) {
                                    im_4.setImageResource(whiteIm[0]);
                                } else if (four == 5) {
                                    im_5.setImageResource(whiteIm[0]);
                                } else if (four == 6) {
                                    im_6.setImageResource(whiteIm[0]);
                                } else if (four == 7) {
                                    im_7.setImageResource(whiteIm[0]);
                                } else if (fst == 8) {
                                    im_8.setImageResource(whiteIm[0]);
                                } else if (four == 9) {
                                    im_9.setImageResource(whiteIm[0]);
                                } else if (four == 10) {
                                    im_10.setImageResource(whiteIm[0]);
                                } else if (four == 11) {
                                    im_11.setImageResource(whiteIm[0]);
                                } else if (four == 12) {
                                    im_12.setImageResource(whiteIm[0]);
                                } else if (four == 13) {
                                    im_13.setImageResource(whiteIm[0]);
                                } else if (four == 14) {
                                    im_14.setImageResource(whiteIm[0]);
                                } else if (four == 15) {
                                    im_15.setImageResource(whiteIm[0]);
                                } else if (four == 16) {
                                    im_16.setImageResource(whiteIm[0]);
                                }


                            }
                        });
                    }
                    catch (InterruptedException e){

                    }
                }
            }
        };

        thread.start();



        im_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (fst == 1) {

                    im_1.setImageResource(images[current_image]);
                    list.add(1);

                } else if (second == 1) {

                    im_1.setImageResource(images[current_image]);
                    list.add(1);
                } else if (third == 1) {

                    im_1.setImageResource(images[current_image]);
                    list.add(1);
                } else if (four == 1) {

                    im_1.setImageResource(images[current_image]);
                    list.add(1);
                }

            }
        });
        im_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 2) {

                    im_2.setImageResource(images[current_image]);
                    list.add(2);

                } else if (second == 2) {

                    im_2.setImageResource(images[current_image]);
                    list.add(2);
                } else if (third == 2) {

                    im_2.setImageResource(images[current_image]);
                    list.add(2);
                } else if (four == 2) {

                    im_2.setImageResource(images[current_image]);
                    list.add(2);
                }

            }
        });

        im_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 3) {

                    im_3.setImageResource(images[current_image]);
                    list.add(3);

                } else if (second == 3) {

                    im_3.setImageResource(images[current_image]);
                    list.add(3);
                } else if (third == 3) {

                    im_3.setImageResource(images[current_image]);
                    list.add(3);
                } else if (four == 3) {

                    im_3.setImageResource(images[current_image]);
                    list.add(3);
                }


            }
        });
        im_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 4) {

                    im_4.setImageResource(images[current_image]);
                    list.add(4);

                } else if (second == 4) {

                    im_4.setImageResource(images[current_image]);
                    list.add(4);
                } else if (third == 4) {

                    im_4.setImageResource(images[current_image]);
                    list.add(4);
                } else if (four == 4) {

                    im_4.setImageResource(images[current_image]);
                    list.add(4);
                }
            }
        });
        im_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 5) {

                    im_5.setImageResource(images[current_image]);
                    list.add(5);

                } else if (second == 5) {

                    im_5.setImageResource(images[current_image]);
                    list.add(5);
                } else if (third == 5) {

                    im_5.setImageResource(images[current_image]);
                    list.add(5);
                } else if (four == 5) {

                    im_5.setImageResource(images[current_image]);
                    list.add(5);
                }
            }
        });
        im_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 6) {

                    im_6.setImageResource(images[current_image]);
                    list.add(6);

                } else if (second == 6) {

                    im_6.setImageResource(images[current_image]);
                    list.add(6);
                } else if (third == 6) {

                    im_6.setImageResource(images[current_image]);
                    list.add(6);
                } else if (four == 6) {

                    im_6.setImageResource(images[current_image]);
                    list.add(6);
                }
            }
        });
        im_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 7) {

                    im_7.setImageResource(images[current_image]);
                    list.add(7);

                } else if (second == 7) {

                    im_7.setImageResource(images[current_image]);
                    list.add(7);
                } else if (third == 7) {

                    im_7.setImageResource(images[current_image]);
                    list.add(7);
                } else if (four == 7) {

                    im_7.setImageResource(images[current_image]);
                    list.add(7);
                }


            }
        });
        im_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 8) {

                    im_8.setImageResource(images[current_image]);
                    list.add(8);

                } else if (second == 8) {

                    im_8.setImageResource(images[current_image]);
                    list.add(8);

                } else if (third == 8) {

                    im_8.setImageResource(images[current_image]);
                    list.add(8);

                } else if (four == 8) {

                    im_8.setImageResource(images[current_image]);
                    list.add(8);
                }


            }
        });
        im_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 9) {

                    im_9.setImageResource(images[current_image]);
                    list.add(9);

                } else if (second == 9) {

                    im_9.setImageResource(images[current_image]);
                    list.add(9);
                } else if (third == 9) {

                    im_9.setImageResource(images[current_image]);
                    list.add(9);
                } else if (four == 9) {

                    im_9.setImageResource(images[current_image]);
                    list.add(9);
                }


            }
        });

        im_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 10) {

                    im_10.setImageResource(images[current_image]);
                    list.add(10);

                } else if (second == 10) {

                    im_10.setImageResource(images[current_image]);
                    list.add(10);
                } else if (third == 10) {

                    im_10.setImageResource(images[current_image]);
                    list.add(10);
                } else if (four == 10) {

                    im_10.setImageResource(images[current_image]);
                    list.add(10);
                }


            }
        });

        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 11) {

                    im_11.setImageResource(images[current_image]);
                    list.add(11);

                } else if (second == 11) {

                    im_11.setImageResource(images[current_image]);
                    list.add(11);
                } else if (third == 11) {

                    im_11.setImageResource(images[current_image]);
                    list.add(11);
                } else if (four == 11) {

                    im_11.setImageResource(images[current_image]);
                    list.add(11);
                }


            }
        });

        im_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 12) {

                    im_11.setImageResource(images[current_image]);
                    list.add(12);

                } else if (second == 12) {

                    im_12.setImageResource(images[current_image]);
                    list.add(12);
                } else if (third == 12) {

                    im_12.setImageResource(images[current_image]);
                    list.add(12);
                } else if (four == 12) {

                    im_12.setImageResource(images[current_image]);
                    list.add(12);
                }


            }
        });

        im_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 13) {

                    im_13.setImageResource(images[current_image]);
                    list.add(13);

                } else if (second == 13) {

                    im_13.setImageResource(images[current_image]);
                    list.add(13);
                } else if (third == 13) {

                    im_13.setImageResource(images[current_image]);
                    list.add(13);
                } else if (four == 13) {

                    im_13.setImageResource(images[current_image]);
                    list.add(13);
                }

            }
        });

        im_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 14) {

                    im_14.setImageResource(images[current_image]);
                    list.add(14);

                } else if (second == 14) {

                    im_14.setImageResource(images[current_image]);
                    list.add(14);
                } else if (third == 14) {

                    im_14.setImageResource(images[current_image]);
                    list.add(14);
                } else if (four == 14) {

                    im_14.setImageResource(images[current_image]);
                    list.add(14);
                }
            }
        });

        im_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fst == 15) {

                    im_15.setImageResource(images[current_image]);
                    list.add(15);

                } else if (second == 15) {

                    im_15.setImageResource(images[current_image]);
                    list.add(15);
                } else if (third == 15) {

                    im_15.setImageResource(images[current_image]);
                    list.add(15);
                } else if (four == 15) {

                    im_15.setImageResource(images[current_image]);
                    list.add(15);
                }

            }
        });

        im_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (fst == 16) {

                    im_16.setImageResource(images[current_image]);
                    list.add(16);
                } else if (second == 16) {

                    im_16.setImageResource(images[current_image]);
                    list.add(16);
                } else if (third == 16) {

                    im_16.setImageResource(images[current_image]);
                    list.add(16);
                } else if (four == 16) {
                    im_16.setImageResource(images[current_image]);
                    list.add(16);
                }

            }
        });


        final Thread thread2 = new Thread() {
            public void run() {

                try {

                    Thread.sleep(3000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {


                            if(list.contains(fst) && list.contains(second) && list.contains(third) && list.contains(four)) {
                                Intent intent = new Intent(Memorization.this, Pass_Activity.class);
                                // intent.putExtra("PASS","pass");
                                startActivity(intent);
                                Toast toast1 = Toast.makeText(Memorization.this, "ok", Toast.LENGTH_SHORT);
                                toast1.show();

                            } else {
                                Intent intent = new Intent(Memorization.this, Memory_Failed.class);
                                // intent.putExtra("PASS","pass");
                                startActivity(intent);

                                Toast toast2 = Toast.makeText(Memorization.this, "error", Toast.LENGTH_SHORT);
                                toast2.show();
                            }

                        }
                    });
                } catch (InterruptedException e) {

                }

            }
        };

        thread2.start();



    }

}

