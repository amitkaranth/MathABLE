package com.amit.finaltarp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class imageTextMatching extends AppCompatActivity {

    ImageView iv;
    Button b, b1, b5;
    EditText et;

    TextView tv;
    Integer[] imageArray = {1,2,3,4,5};
    List<Integer> random = new ArrayList<Integer>(5);
    int im1, im2, im3, im4, im5;
    int cardno;
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_text_matching);

        iv = (ImageView) findViewById(R.id.iv);
        b = (Button) findViewById(R.id.b);
        b1 = (Button) findViewById(R.id.b1);
        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);


        final MediaPlayer r = MediaPlayer.create(this, R.raw.right);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.wrong);

        final int min = 0;
        final int max = 4;

        frontOfCardResources();
        int i;
        for(i=0;i<5;i++){
            random.add(i);
        }

        int[] temp = new int[1];
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //final int random = new Random().nextInt((max - min) + 1) + min;
                Collections.shuffle(random);
                doStuff(b, random.get(0));
                temp[0] = random.get(0);
                et.setText("");
                tv.setText("");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = et.getText().toString();
                String a = ans.toLowerCase();

                String s = "",s1;
                s1 = ans.trim();
                String ans1 = ans.trim();

                //compare(a, temp);
                if(compare(a.trim(), temp) == true) {
                    r.start();
                    tv.setText("Correct!");
                }
                else if(ans1.equals(s1)) {
                    w.start();
                    tv.setText("Please enter your answer!");
                }
                else{
                    w.start();
                    tv.setText("Wrong!");
                }
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

    /*public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

    private boolean compare(String ans, int[] c){
        String s1 = "addition";
        String s2 = "subtraction";
        String s3 = "multiplication";
        String s4 = "division";
        String s5 = "percentage";

        String s11 = "add";
        String s22 = "subtract";
        String s33 = "multiply";
        String s44 = "divide";
        String s55 = "fraction";

        String s211 = "plus";
        String s221 = "minus";
        String s331 = "into";
        String s551 = "percent";

        boolean b = false;
        if(imageArray[c[0]]==1){
            if(ans.equals(s1) || ans.equals(s11) || ans.equals(s211)){
                points++;
                b = true;
            }
        }
        else if(imageArray[c[0]]==2){
            if(ans.equals(s2) || ans.equals(s22) || ans.equals(s221)){
                points++;
                b = true;
            }
        }
        else if(imageArray[c[0]]==3){
            if(ans.equals(s3) || ans.equals(s33) || ans.equals(s331)){
                points++;
                b = true;
            }
        }
        else if(imageArray[c[0]]==4){
            if(ans.equals(s4) || ans.equals(s44)){
                points++;
                b = true;
            }
        }
        else if(imageArray[c[0]]==5){
            if(ans.equals(s5) || ans.equals(s55) || ans.equals(s551)){
                points++;
                b = true;
            }
        }
        else{
            b = false;
        }

        //.setText("Points: "+points);
        return b;
    }
    private void doStuff(Button b, int c){
        if(imageArray[c]==1){
            iv.setImageResource(im1);
        }
        else if(imageArray[c]==2){
            iv.setImageResource(im2);
        }
        else if(imageArray[c]==3){
            iv.setImageResource(im3);
        }
        else if(imageArray[c]==4){
            iv.setImageResource(im4);
        }
        else if(imageArray[c]==5){
            iv.setImageResource(im5);
        }


    }
    private void frontOfCardResources(){
        im1 = R.drawable.add;
        im2 = R.drawable.sub;
        im3 = R.drawable.mul;
        im4 = R.drawable.div;
        im5 = R.drawable.percentage;
    }
}

