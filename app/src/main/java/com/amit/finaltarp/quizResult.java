package com.amit.finaltarp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class quizResult extends AppCompatActivity {

    TextView textResult;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_result);

        textResult=findViewById(R.id.textResult);
        textResult.setText("You score is "+ getIntent().getIntExtra("RA",0)+ " /10 ");
    }
}