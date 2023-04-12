package com.amit.finaltarp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class greaterNumber extends AppCompatActivity {

    Button b1, b2, b3, b4, b7;
    TextView tv1, tv2;
    int num1, num2;

    List<Integer> num = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greater_number);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        final MediaPlayer r = MediaPlayer.create(this, R.raw.right);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.wrong);

        int i;
        for(i=0;i<1000;i++) {
            num.add(i);
        }

        final int min = 0;
        final int max = 1000;

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                /*int a=0;
                int b=0;
                random(a, b);*/
                final int a = new Random().nextInt((max - min) + 1) + min;
                final int b = new Random().nextInt((max - min) + 1) + min;
                b1.setText(a+"");
                b2.setText(b+"");
                tv2.setText("");
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                compare();

                if(tv2.getText().equals("Correct!")){
                    r.start();
                }
                else{
                    w.start();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                compare2();
                if(tv2.getText().equals("Correct!")){
                    r.start();
                }
                else{
                    w.start();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                reset();
            }
        });

       /*7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }

        });*/

    }

    /*public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/
    private void reset(){
        b1.setText("Number 1");
        b2.setText("Number 2");
        tv2.setText("");
    }

    private void compare() {
        int n1, n2;


        if(b1.getText().equals("Number 1")) {
            tv2.setText("Please click the RANDOM button to proceed!");
        }
        else {
            n1 = Integer.parseInt((String) b1.getText());
            n2 = Integer.parseInt((String) b2.getText());
            if (n1 > n2) {
                tv2.setText("Correct!");
            } else if (n2 > n1) {
                tv2.setText("Wrong!");
            } else {
                tv2.setText("Error! Click on random again!");
            }
        }

    }

    private void compare2() {
        int n1, n2;


        if(b2.getText().equals("Number 2")) {
            tv2.setText("Please click the RANDOM button to proceed!");
        }
        else {
            n1 = Integer.parseInt((String) b1.getText());
            n2 = Integer.parseInt((String) b2.getText());
            if (n1 < n2) {
                tv2.setText("Correct!");
            } else if (n2 < n1) {
                tv2.setText("Wrong!");
            } else {
                tv2.setText("Error! Click on random again!");
            }
        }

    }
}