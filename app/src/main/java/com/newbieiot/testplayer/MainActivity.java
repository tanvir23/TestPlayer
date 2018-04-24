package com.newbieiot.testplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static boolean playState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create media player with file
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound_01);

        // get buttons
        Button play = findViewById(R.id.play);
        Button pause = findViewById(R.id.pause);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!MainActivity.playState){
                    mediaPlayer.start();
                    MainActivity.playState = true;
                }

            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.playState){
                    mediaPlayer.pause();
                    MainActivity.playState = false;
                }
            }
        });



    }
}
