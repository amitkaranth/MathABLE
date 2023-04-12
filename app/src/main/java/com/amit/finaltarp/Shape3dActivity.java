package com.amit.finaltarp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Shape3dActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape3d);

        String name1 = getIntent().getStringExtra("name1").toLowerCase();
        Toast.makeText(this, name1, Toast.LENGTH_SHORT).show();

        ImageView iv1 = findViewById(R.id.imageView3);
        int iid1 = getResources().getIdentifier(name1,"drawable",getPackageName());
        iv1.setImageResource(iid1);

        int mid1 = getResources().getIdentifier(name1,"raw",getPackageName());
        MediaPlayer mp1 = MediaPlayer.create(getApplicationContext(), mid1);
        mp1.start();
    }
}