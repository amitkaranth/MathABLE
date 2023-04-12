package com.amit.finaltarp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class memoryGame extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView textView1, textView2;
    ImageButton ib1, ib2, ib3, ib4;
    ImageButton ib5, ib6, ib7, ib8;
    //Button b5;
    Button b5;
    Integer[] cardsarray = {101,102,103,104,201,202,203,204};

    int im101, im102, im103, im104;
    int im201, im202, im203, im204;
    int firstcard, secondcard;
    int clickedFirst, clickedSecond;
    int cardno = 1;

    Boolean[] clicked = new Boolean[8];

    //int turn = 1;
    int playerpt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.memory_game);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);
        ib5 = (ImageButton) findViewById(R.id.ib5);
        ib6 = (ImageButton) findViewById(R.id.ib6);
        ib7 = (ImageButton) findViewById(R.id.ib7);
        ib8 = (ImageButton) findViewById(R.id.ib8);

        Log.d(TAG, "onCreateSwitch: Starting");
        Button b5;
        //b5 = (Button) findViewById(R.id.b5);

        ib1.setTag("0");
        ib2.setTag("1");
        ib3.setTag("2");
        ib4.setTag("3");
        ib5.setTag("4");
        ib6.setTag("5");
        ib7.setTag("6");
        ib8.setTag("7");

        frontOfCardResources();
        Collections.shuffle(Arrays.asList(cardsarray));


        ib1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib1, theCard);
                clicked[0] = true;
            }
        });

        ib2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib2, theCard);
                clicked[1] = true;
            }
        });

        ib3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib3, theCard);
                clicked[2] = true;
            }
        });

        ib4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib4, theCard);
                clicked[3] = true;
            }
        });

        ib5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib5, theCard);
                clicked[4] = true;
            }
        });

        ib6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib6, theCard);
                clicked[5] = true;
            }
        });

        ib7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib7, theCard);
                clicked[6] = true;
            }
        });

        ib8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(ib8, theCard);
                clicked[7] = true;
            }
        });

        /*b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }

        });*/

    }

   /* public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

    private void doStuff(ImageButton iv, int card) {
        if(cardsarray[card]==101){
            iv.setImageResource(im101);
        }
        else if(cardsarray[card]==102){
            iv.setImageResource(im102);
        }
        else if(cardsarray[card]==103){
            iv.setImageResource(im103);
        }
        else if(cardsarray[card]==104){
            iv.setImageResource(im104);
        }
        else if(cardsarray[card]==201){
            iv.setImageResource(im201);
        }
        else if(cardsarray[card]==202){
            iv.setImageResource(im202);
        }
        else if(cardsarray[card]==203){
            iv.setImageResource(im203);
        }
        else if(cardsarray[card]==204){
            iv.setImageResource(im204);
        }


        if(cardno==1){
            firstcard=cardsarray[card];
            if(firstcard>200){
                firstcard = firstcard-100;
            }
            cardno = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }
        else if(cardno==2){
            secondcard=cardsarray[card];
            if(secondcard>200){
                secondcard = secondcard-100;
            }
            cardno = 1;
            clickedSecond = card;

            ib1.setEnabled(false);
            ib2.setEnabled(false);
            ib3.setEnabled(false);
            ib4.setEnabled(false);
            ib5.setEnabled(false);
            ib6.setEnabled(false);
            ib7.setEnabled(false);
            ib8.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    @SuppressLint("SetTextI18n")
    private void calculate() {
        if(firstcard == secondcard){
            if(clickedFirst == 0) {
                ib1.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 1) {
                ib2.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 2) {
                ib3.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 3) {
                ib4.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 4) {
                ib5.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 5) {
                ib6.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 6) {
                ib7.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 7) {
                ib8.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0) {
                ib1.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 1) {
                ib2.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 2) {
                ib3.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 3) {
                ib4.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 4) {
                ib5.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 5) {
                ib6.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 6) {
                ib7.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 7) {
                ib8.setVisibility(View.INVISIBLE);
            }

            playerpt++;
        }


        else{
            ib1.setImageResource(R.drawable.qmark);
            ib2.setImageResource(R.drawable.qmark);
            ib3.setImageResource(R.drawable.qmark);
            ib4.setImageResource(R.drawable.qmark);
            ib5.setImageResource(R.drawable.qmark);
            ib6.setImageResource(R.drawable.qmark);
            ib7.setImageResource(R.drawable.qmark);
            ib8.setImageResource(R.drawable.qmark);

        }
        textView2.setText("Points: "+playerpt);

        ib1.setEnabled(true);
        ib2.setEnabled(true);
        ib3.setEnabled(true);
        ib4.setEnabled(true);
        ib5.setEnabled(true);
        ib6.setEnabled(true);
        ib7.setEnabled(true);
        ib8.setEnabled(true);

        //checkEnd();

    }

    /*private void checkEnd(){
        if(playerpt==4) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(amit_2.this);
            alertDialogBuilder.setMessage("Game Over! \n Points: "+playerpt)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent  = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }

                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }*/



    private void frontOfCardResources() {
        im101 = R.drawable.add;
        im102 = R.drawable.sub;
        im103 = R.drawable.mul;
        im104 = R.drawable.div;
        im201 = R.drawable.addition;
        im202 = R.drawable.subtraction;
        im203 = R.drawable.multiplication;
        im204 = R.drawable.division;



    }

}
