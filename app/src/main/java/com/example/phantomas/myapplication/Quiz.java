package com.example.phantomas.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by phantomas on 9/6/2016.
 */
public class Quiz extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        Random r2= new Random();
        final int i1 = r.nextInt(10-1) + 1;
       final  int i2 = r2.nextInt(10-1) + 1;
        final int calc = i1*i2;
        final TextView t1;
        final TextView t2;
        final TextView t3;
        t1= (TextView) findViewById(R.id.textView121);
        t2= (TextView) findViewById(R.id.textView123);
        t3= (TextView) findViewById(R.id.textView125);
        final Button generate;
        generate = (Button) findViewById(R.id.button4);
        final Button commit;
        commit= (Button) findViewById(R.id.button5);
        final EditText e;
        e= (EditText) findViewById(R.id.editText) ;
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(i1);
                t2.setText(i2);
                e.setText("?");
                generate.setVisibility(View.GONE);
                commit.setVisibility(View.VISIBLE);
                e.setVisibility(View.VISIBLE);
            }
        });
        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().equals(t3)){
                    t3.setVisibility(View.VISIBLE);
                    t3.setText("Bravo");

                }else{
                    t3.setVisibility(View.VISIBLE);
                    t3.setText("No Bravo");
                }
            }
        });


    }
}
