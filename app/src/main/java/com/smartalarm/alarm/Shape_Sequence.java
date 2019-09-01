package com.smartalarm.alarm;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.Random;

public class Shape_Sequence extends AppCompatActivity {
    private RelativeLayout id_shape;
    private ListView listView = null;
    public ImageView img_1,img_2,img_3,img_4,img_5,img_6;
    private Random r=new Random();
    private   int S = r.nextInt(5)+1;
    private   int Shapes = r.nextInt(6)+1;
  //  private int[] images = { R.drawable.shape_e, R.drawable.shape_b, R.drawable.shape_c, R.drawable.shap_a};
    private int fst = r.nextInt(6) + 1;
    private int second = r.nextInt(6) + 1;
    private int third = r.nextInt(6) + 1;
    private int four = r.nextInt(6) + 1;
    private int five = r.nextInt(6) + 1;
    private int six = r.nextInt(6) + 1;
    private int[] image = {6, R.drawable.shape_e, R.drawable.shape_b, R.drawable.shape_c, R.drawable.shap_a,R.drawable.rhombus,R.drawable.square};
    private ImageView shape_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape__sequence);
        id_shape=(RelativeLayout) findViewById(R.id.id_shape);
        img_1=(ImageView) findViewById(R.id.img_1);
        img_2=(ImageView) findViewById(R.id.img_2);
        img_3=(ImageView) findViewById(R.id.img_3);
        img_4=(ImageView) findViewById(R.id.img_4);
        img_5=(ImageView) findViewById(R.id.img_5);
        img_6=(ImageView) findViewById(R.id.img_6);
        shape_img=(ImageView) findViewById(R.id.shape_img);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String shapeSequence = bundle.getString("SHAPE");
            showShapeSequence(shapeSequence);
        }
    }

    public void showShapeSequence(String shapeSequence) {

        if (shapeSequence.equals("shape")) {

            AlertDialog.Builder alartDialog=new AlertDialog.Builder(Shape_Sequence.this);
            View viewm= LayoutInflater.from(Shape_Sequence.this).inflate(R.layout.activity_shape_first,null);

            alartDialog.setMessage("Shape Sequence \n ")
                    .setView(viewm)
                    .setCancelable(true)
                    .setPositiveButton("Try", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            final Thread thread=new Thread(){
                                public void run(){
                                    while (!isInterrupted()){
                                        try
                                        {

                                            Thread.sleep(200);
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    int pickedImage=0,lastPickedImage=0;
//                                                    while(pickedImage<image.length){
//                                                        pickedImage=r.nextInt(image.length);
//                                                        pickedImage++;
                                                    pickedImage=r.nextInt(image.length);
                                                    shape_img.setImageResource(image[pickedImage]);
// }
                                                   do {
                                                       shape_img.setImageResource(image[pickedImage]);
                                                    pickedImage++;
                                               }
                                                  while(pickedImage<=4);
//                                                    lastPickedImage=pickedImage;

                                                     //   shape_img.setImageResource(image[pickedImage]);

                                                }
                                            });
                                        }
                                        catch (InterruptedException e){

                                        }
                                    }
                                }
                            };

                            thread.start();
                        }
                    });
            AlertDialog alertDialog=alartDialog.create();
            alartDialog.show();

        }


    }

    public void shapewDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Shape_Sequence.this);
        builder.setCancelable(true);
        builder.setPositiveButton("OK", null);
        builder.setView(listView);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
