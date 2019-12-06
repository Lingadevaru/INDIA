package com.example.linga.india;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.about);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent1 = new Intent(SecondActivity.this, NewActivity.class);
                startActivity(myIntent1);
            }
        });

        button2 = (Button) findViewById(R.id.states);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent2 = new Intent(SecondActivity.this, StateActivity.class);
                startActivity(myIntent2);
            }
        });

        button3 = (Button) findViewById(R.id.union);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent3 = new Intent(SecondActivity.this, UnionActivity.class);
                startActivity(myIntent3);
            }
        });

        button4 = (Button) findViewById(R.id.rivers);

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent4 = new Intent(SecondActivity.this, RiverActivity.class);
                startActivity(myIntent4);
            }
        });

        button5 = (Button) findViewById(R.id.ports);

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent5 = new Intent(SecondActivity.this, PortActivity.class);
                startActivity(myIntent5);
            }
        });

        Button button6 = findViewById(R.id.awards);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myiIntent = new Intent(SecondActivity.this, AwardsActivity.class);
                startActivity(myiIntent);
            }
        });
//
//        Button button7 = findViewById(R.id.rate);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent myiIntent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(myiIntent);
//            }
//        });
    }
}
