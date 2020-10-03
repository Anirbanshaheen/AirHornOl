package com.example.airhornol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.cunoraz.gifview.library.GifView;

public class MainActivity extends AppCompatActivity {

    Button btOne;
    Button btTwo;
    Button btThree;
    Button btFour;
    GifView gifViewAmbulence;
    GifView gifViewAirhorn;
    GifView gifViewRoadalarm;
    GifView gifViewFirealarm;
    MediaPlayer mp;

    //int x = 0;
    @SuppressLint({"ClickableViewAccessibility", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bt = findViewById(R.id.mainButton);
        btOne = findViewById(R.id.oneButton);
        btTwo = findViewById(R.id.twoButton);
        btThree = findViewById(R.id.threeButton);
        btFour = findViewById(R.id.fourButton);
        gifViewAmbulence = findViewById(R.id.gifView);
        gifViewAirhorn = findViewById(R.id.gifViewAirhorn);
        gifViewRoadalarm = findViewById(R.id.gifViewRoadAlarm);
        gifViewFirealarm = findViewById(R.id.gifViewFireAlarm);
        /*bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x++;
                if(x == 1){
                    mp = MediaPlayer.create(MainActivity.this, R.raw.buzzer);
                    mp.start();
                }
                else if(x == 2){
                    mp = MediaPlayer.create(MainActivity.this, R.raw.crickets);
                    mp.start();
                }
                else if(x == 3){
                    mp = MediaPlayer.create(MainActivity.this, R.raw.dogWhistle);
                    mp.start();
                }
                else if(x == 4){
                    mp = MediaPlayer.create(MainActivity.this, R.raw.firetruck);
                    mp.start();
                    x = 0;
                }
            }
        });*/
        gifViewAmbulence.setVisibility(View.INVISIBLE);
        btOne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int event = motionEvent.getAction();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:

                        btTwo.setEnabled(false);
                        btThree.setEnabled(false);
                        btFour.setEnabled(false);

                        mp = MediaPlayer.create(MainActivity.this, R.raw.ambulance);
                        mp.start();
                        mp.setLooping(true);
                        gifViewAmbulence.play();
                        gifViewAmbulence.setVisibility(View.VISIBLE);

                        return true;

                    case MotionEvent.ACTION_UP:

                        btTwo.setEnabled(true);
                        btThree.setEnabled(true);
                        btFour.setEnabled(true);

                        mp.stop();
                        mp.release();
                        gifViewAmbulence.setVisibility(View.INVISIBLE);


                        break;
                }
                return false;
            }
        });

        gifViewFirealarm.setVisibility(View.INVISIBLE);
        btTwo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int event = motionEvent.getAction();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:

                        btOne.setEnabled(false);
                        btThree.setEnabled(false);
                        btFour.setEnabled(false);

                        mp = MediaPlayer.create(MainActivity.this, R.raw.firealarm);
                        mp.start();
                        mp.setLooping(true);
                        gifViewFirealarm.play();
                        gifViewFirealarm.setVisibility(View.VISIBLE);

                        return true;

                    case MotionEvent.ACTION_UP:

                        btOne.setEnabled(true);
                        btThree.setEnabled(true);
                        btFour.setEnabled(true);

                        mp.stop();
                        mp.release();
                        gifViewFirealarm.setVisibility(View.INVISIBLE);


                        break;
                }
                return false;
            }
        });

        gifViewAirhorn.setVisibility(View.INVISIBLE);
        btThree.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int event = motionEvent.getAction();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:

                        btOne.setEnabled(false);
                        btTwo.setEnabled(false);
                        btFour.setEnabled(false);

                        mp = MediaPlayer.create(MainActivity.this, R.raw.airhorn);
                        mp.start();
                        mp.setLooping(true);
                        gifViewAirhorn.play();
                        gifViewAirhorn.setVisibility(View.VISIBLE);

                        return true;

                    case MotionEvent.ACTION_UP:

                        btOne.setEnabled(true);
                        btTwo.setEnabled(true);
                        btFour.setEnabled(true);

                        mp.stop();
                        mp.release();
                        gifViewAirhorn.setVisibility(View.INVISIBLE);


                        break;
                }
                return false;
            }
        });
        gifViewRoadalarm.setVisibility(View.INVISIBLE);
        btFour.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int event = motionEvent.getAction();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:

                        btOne.setEnabled(false);
                        btTwo.setEnabled(false);
                        btThree.setEnabled(false);

                        mp = MediaPlayer.create(MainActivity.this, R.raw.hornsound);
                        mp.start();
                        mp.setLooping(true);
                        gifViewRoadalarm.play();
                        gifViewRoadalarm.setVisibility(View.VISIBLE);

                        return true;

                    case MotionEvent.ACTION_UP:

                        btOne.setEnabled(true);
                        btTwo.setEnabled(true);
                        btThree.setEnabled(true);

                        mp.stop();
                        mp.release();
                        gifViewRoadalarm.setVisibility(View.INVISIBLE);


                        break;
                }
                return false;
            }
        });
    }
}
