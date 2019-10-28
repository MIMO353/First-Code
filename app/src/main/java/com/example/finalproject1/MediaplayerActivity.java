package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaplayerActivity extends AppCompatActivity {


    //تعریف شی ها
    Button btn_stop,btn_play,btn_pause;

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);

        //اتصال اشیا یه لایه xml
        btn_play = findViewById(R.id.btn_play);
        btn_stop = findViewById(R.id.btn_stop);
        btn_pause = findViewById(R.id.btn_pause);

        //تعریف شی مدیا پلیر
        player = MediaPlayer.create(getApplicationContext(),R.raw.rage_khaab);

        //تعریف کلید شروع
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //تعریف شی مدیا پلیر
                player = MediaPlayer.create(getApplicationContext(),R.raw.rage_khaab);
                //کلید شروع موسیقی
                player.start();

            }
        });

        //تعریف کلید توقف
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //کلید توقف موسیقی
                player.stop();

            }
        });

        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //کلید توقف موسیقی
                player.pause();

            }
        });
    }
}
