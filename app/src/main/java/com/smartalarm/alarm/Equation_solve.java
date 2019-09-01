package com.smartalarm.alarm;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.Random;

public class Equation_solve extends AppCompatActivity {
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    private Random r=new Random();

    private int result;
    private String equation;
    private   int S = r.nextInt(11)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_solve);
        View view=getLayoutInflater().inflate(R.layout.pass_screen,null);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String equationName = bundle.getString("EQUATION");
            showEquation(equationName);
        }
    }
    public   void showEquation (String equationName) {
        if (equationName.equals("equation")) {
            if (S == 1) {
                equation = HARD1();
            } else if (S == 2) {
                equation = addition();
            } else if (S == 3) {
                equation = adddiv();
            } else if (S == 4) {
                equation = submul();
            } else if (S == 5) {
                equation = Msubdiv();
            } else if (S == 6) {
                equation = submul();
            } else if (S == 7) {
                equation = mul();
            } else if (S == 8) {
                equation = adddiv();
            } else if (S == 9) {
                equation = substaction();
            }
            else if (S == 10) {
                equation = HARD2();
            }
            else if (S ==11) {
                equation = HARD3();
            }

            AlertDialog.Builder alartDialog = new AlertDialog.Builder(Equation_solve.this);
            alartDialog.setMessage("Equation \n \n" + equation)
                    .setCancelable(true)
                    .setPositiveButton("Try", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            AlertDialog.Builder alartDialog = new AlertDialog.Builder(Equation_solve.this);
                            View vw = LayoutInflater.from(Equation_solve.this).inflate(R.layout.activity_equation_alart_dialog, null);
                            final EditText input = (EditText) vw.findViewById(R.id.editText1);

                            alartDialog.setView(input);
                            alartDialog.setMessage("Answer \n " + equation + "=")
                                    .setView(vw)
                                    .setCancelable(true)
                                    .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                        int  result2 = Integer.parseInt(input.getText().toString());

                                            if (result==result2 ){
                                                    Intent intent = new Intent(Equation_solve.this, Pass_Activity.class);
                                                    startActivity(intent);
                                                }



                                            else  {
                                                Intent intent = new Intent(Equation_solve.this, Fail_Acitivity.class);
                                                startActivity(intent);
                                            }

                                        }
                                    });
                            AlertDialog alertDialog = alartDialog.create();
                            alartDialog.show();
                        }
                    });

            AlertDialog alertDialog = alartDialog.create();
            alartDialog.show();


        }
    }




    public String addition(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(10)+1;
        result=a+b+c-b;
        return a+" + "+b+" + "+c+"-"+b;



    }
    public String substaction(){
        Integer a=r.nextInt(20) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(10)+1;
        result=a-b+c;
        return a+" - "+b +"+"+c;
    }
    public String mul(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(10)+1;
        result=a*c+b;
        return a+"*"+c+"+"+b;
    }
    public  String submul(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(10)+1;
        result=(a-b)*c;
        return "("+a+"-"+b+")*"+c;
    }
    public String adddiv(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(5)+1;
        result=(a +b)+c;
        return "("+a+"+"+b+")+"+c;
    }
    public String Msubdiv(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(5)+1;
        result=(a -b)+c;
        return "("+a+"-"+b+")+"+c;
    }
    public String HARD1(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(5)+1;
        result=(a -b)+(b+a);
        return "("+a+"-"+b+")+("+b+"+"+a+")";
    }
    public String HARD2(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(5)+1;
        result=(a -c)+(b+a);
        return "("+a+"-"+c+")+("+b+"+"+a+")";
    }
    public String HARD3(){
        Integer a=r.nextInt(10) + 1;
        Integer b=r.nextInt(10) + 1;
        Integer c=r.nextInt(5)+1;
        result=(a -c+b)+(b+a);
        return "("+a+"-"+c+"+"+b+")+("+b+"+"+a+")";
    }
}
