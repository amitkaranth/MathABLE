package com.amit.finaltarp;

import static com.amit.finaltarp.nos.count;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class dragAndDrop extends AppCompatActivity{
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,target;

    //Button homeb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drag_and_drop);
        txt1=(TextView) findViewById(R.id.txt1);
        txt2=(TextView) findViewById(R.id.txt2);
        txt3=(TextView) findViewById(R.id.txt3);
        txt4=(TextView) findViewById(R.id.txt4);
        txt5=(TextView) findViewById(R.id.txt5);
        txt6=(TextView) findViewById(R.id.txt6);
        txt7=(TextView) findViewById(R.id.txt7);
        txt8=(TextView) findViewById(R.id.txt8);
        txt9=(TextView) findViewById(R.id.txt9);
        txt10=(TextView) findViewById(R.id.txt10);
        target=(TextView) findViewById(R.id.target);


        txt1.setOnLongClickListener(longClickListener);
        txt2.setOnLongClickListener(longClickListener);
        txt3.setOnLongClickListener(longClickListener);
        txt4.setOnLongClickListener(longClickListener);
        txt5.setOnLongClickListener(longClickListener);
        txt6.setOnLongClickListener(longClickListener);
        txt7.setOnLongClickListener(longClickListener);
        txt8.setOnLongClickListener(longClickListener);
        txt9.setOnLongClickListener(longClickListener);
        txt10.setOnLongClickListener(longClickListener);

        /*txt1.setOnClickListener(clickListener);
        txt2.setOnClickListener(clickListener);
        txt3.setOnClickListener(clickListener);
        txt4.setOnClickListener(clickListener);
        txt5.setOnClickListener(clickListener);
        txt6.setOnClickListener(clickListener);
        txt7.setOnClickListener(clickListener);
        txt8.setOnClickListener(clickListener);
        txt9.setOnClickListener(clickListener);
        txt10.setOnClickListener(clickListener);*/

        target.setOnDragListener(dragListener);
        /*b = (Button) findViewById(R.id.homeb);

        homeb.setOnClickListener(new View.OnClickListener() {
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
    View.OnLongClickListener longClickListener = new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v){
            ClipData data= ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myShadowBuilder,v,0);
            //target.setText("Drop Here!!");
            return true;
        }
    };

    /*View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            ClipData data= ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myShadowBuilder,v,0);
            //target.setText("Drop Here!!");
            //return true;
        }
    };*/

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();
            switch(dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:

                    break;
                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:

                    switch(count) {
                        case 0:
                            if (view.getId() == R.id.txt1) {
                            /*view.animate()
                                    .x(target.getX())
                                    .y(target.getY())
                                    .setDuration(700)
                                    .start();
                            target.setVisibility(View.INVISIBLE);
                            txt1.setTextColor(Color.parseColor("#00FF00"));*/

                                txt1.setVisibility(View.INVISIBLE);
                                target.setText("    1    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 1:
                            if (view.getId() == R.id.txt2) {
                                txt2.setVisibility(View.INVISIBLE);
                                target.setText("    2    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 2:
                            if (view.getId() == R.id.txt3) {
                                txt3.setVisibility(View.INVISIBLE);
                                target.setText("    3    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 3:
                            if (view.getId() == R.id.txt4) {
                                txt4.setVisibility(View.INVISIBLE);
                                target.setText("    4    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 4:
                            if (view.getId() == R.id.txt5) {
                                txt5.setVisibility(View.INVISIBLE);
                                target.setText("    5    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 5:
                            if (view.getId() == R.id.txt6) {
                                txt6.setVisibility(View.INVISIBLE);
                                target.setText("    6    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 6:
                            if (view.getId() == R.id.txt7) {
                                txt7.setVisibility(View.INVISIBLE);
                                target.setText("    7    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 7:
                            if (view.getId() == R.id.txt8) {
                                txt8.setVisibility(View.INVISIBLE);
                                target.setText("    8    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 8:
                            if (view.getId() == R.id.txt9) {
                                txt9.setVisibility(View.INVISIBLE);
                                target.setText("    9    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;

                        case 9:
                            if (view.getId() == R.id.txt10) {
                                txt10.setVisibility(View.INVISIBLE);
                                target.setText("    10    ");
                                target.setTextColor(Color.parseColor("#00FF00"));
                                count++;
                                MediaPlayer media = MediaPlayer.create(dragAndDrop.this, R.raw.right);
                                media.start();
                            } else {
                                target.setTextColor(Color.parseColor("#FF0000"));
                                MediaPlayer mymedia = MediaPlayer.create(dragAndDrop.this, R.raw.wrong);
                                mymedia.start();
                            }
                            break;
                    }

                    break;
            }
            return true;
        }
    };
}


