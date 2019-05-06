package com.example.linga.india;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.myButton1);

        button1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent1 = new Intent(MainActivity.this, NewActivity.class);
                startActivity(myIntent1);
            }
        });

        button2 = (Button) findViewById(R.id.myButton2);

        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(MainActivity.this, StateActivity.class);
                startActivity(myIntent2);
            }
        });

        button3 = (Button) findViewById(R.id.myButton3);

        button3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent3 = new Intent(MainActivity.this, UnionActivity.class);
                startActivity(myIntent3);
            }
        });

        button4 = (Button) findViewById(R.id.myButton4);

        button4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent4 = new Intent(MainActivity.this, RiverActivity.class);
                startActivity(myIntent4);
            }
        });

        button5 = (Button) findViewById(R.id.myButton5);

        button5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent5 = new Intent(MainActivity.this, PortActivity.class);
                startActivity(myIntent5);
            }
        });

        button6 = (Button) findViewById(R.id.myButton6);

        button6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent6 = new Intent(MainActivity.this, TableActivity.class);
                startActivity(myIntent6);
            }
        });

        button6 = (Button) findViewById(R.id.myButton7);

        button6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent6 = new Intent(MainActivity.this, GraphActivity.class);
                startActivity(myIntent6);
            }
        });
    }
}
