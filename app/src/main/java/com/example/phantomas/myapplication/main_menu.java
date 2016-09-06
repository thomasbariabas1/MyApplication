package com.example.phantomas.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by phantomas on 9/4/2016.
 */
public class main_menu extends AppCompatActivity {
    Button multit;
    Button quiz;
    Button more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        multit = (Button) findViewById(R.id.button);
        quiz =(Button) findViewById(R.id.button2);
        more = (Button) findViewById(R.id.button3);
        final Intent i = new Intent(this,MainActivity.class);
        multit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);
            }
        });

    }
}
