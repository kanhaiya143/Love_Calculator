package com.example.lenovo.lovecalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.Random;


public class MainActivity extends Activity {
    EditText a;
    EditText b;
    String m;

    Button dick;
    int p = 0;
    boolean t = false;
    String k, l, c, d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.girl);
        b = (EditText) findViewById(R.id.boy);
        dick = (Button) findViewById(R.id.button);
        //car = (TextView) findViewById(R.id.car);

    }

    public void showResult(View v)
    {

        String c[] = {"kriti", "sanon", "kriti sanon", "Kriti Sanon", "ks"};
        String d[] = {"Kanhaiya Lal", "kanhaiya lal", "kanhaiya", "Kanhaiya"};

        String k = a.getText().toString();
        String l = b.getText().toString();


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if ((k.equals(c[i])) && (l.equals(d[j]))) {

                    //p++;
                    t = true;
                    break;
                }
            }
        }
        if (t == true) {
            m="100";
           // car.setText("100%");
            t = false;
        } else
            {
            //for (int i = 0; i < 1; i++)
                m=x(85, 100);
               // car.setText(x(85, 100) + "%");
        }


        Intent i= new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("pari",m);
        startActivity(i);
    }

    private String x(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        String n= String.valueOf(r.nextInt((max - min) + 1) + min);
        return n;
    }


}




