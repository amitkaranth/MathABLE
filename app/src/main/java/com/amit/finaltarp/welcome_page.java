package com.amit.finaltarp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/*import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;*/

public class welcome_page extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b8;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);


        b5 = (Button) findViewById(R.id.b5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAakash_1();
            }

        });
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmit_1();
            }

        });

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmit_2();
            }

        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmit_3();
            }

        });

        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAjeetha_1();
            }

        });

        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAjeetha_2();
            }

        });


    }

    public void openAmit_1(){
        Intent intent = new Intent(this, imageTextMatching.class);
        startActivity(intent);
    }

    public void openAmit_2(){
        Intent intent = new Intent(this, memoryGame.class);
        startActivity(intent);
    }

    public void openAmit_3(){
        Intent intent = new Intent(this, greaterNumber.class);
        startActivity(intent);
    }

    public void  openAakash_1() {
        Intent intent = new Intent(this, dragAndDrop.class);
        startActivity(intent);
    }


    public void openAjeetha_1() {
        Intent intent = new Intent(this, shapes.class);
        startActivity(intent);

    }

    public void openAjeetha_2() {
        Intent intent = new Intent(this, basicMathQuiz.class);
        startActivity(intent);
    }


}