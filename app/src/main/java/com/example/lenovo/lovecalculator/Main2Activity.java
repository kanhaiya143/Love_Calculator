package com.example.lenovo.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;



public class Main2Activity extends AppCompatActivity
{
    EditText a;
    EditText b;
    TextView car;

    int p = 0;
    boolean t= false;
    String loda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        car = (TextView) findViewById(R.id.car);

        loda = getIntent().getExtras().getString("pari");
        car.setText(loda+"%");

    }







}


