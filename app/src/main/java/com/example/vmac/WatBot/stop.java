package com.example.vmac.WatBot;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class stop extends AppCompatActivity {
    VideoView video2;
    MediaPlayer mMediaPlayer;
    int mcurrentvideoposition;
    private static int splash_time_out=4300;
    Button stopplzbtn;
    int count1=0;
    MediaPlayer ring1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
        video2=findViewById(R.id.videoViewstop);
        String path="android.resource://"+getPackageName()+"/"+R.raw.beach1;
        Uri u=Uri.parse(path);
        video2.setVideoURI(u);
        video2.start();

        video2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mMediaPlayer=mediaPlayer;
                mMediaPlayer.setLooping(true);
                //if(mcurrentvideoposition!=0){
                //  mMediaPlayer.seekTo(mcurrentvideoposition);
                //mMediaPlayer.start();
                //}
            }
        });

        stopplzbtn=findViewById(R.id.stopplzbtn);
        stopplzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count1 == 0){
                    stopplzbtn.isEnabled();
                    ring1= MediaPlayer.create(stop.this,R.raw.stop);
                    ring1.start();
                    count1++;
                }else if (count1 >= 1)
                    stopplzbtn.setClickable(false);

            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        ring1.release();
        mcurrentvideoposition=mMediaPlayer.getCurrentPosition();
        video2.pause();

    }
    @Override
    protected void onResume(){
        super.onResume();
        video2.start();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer=null;

    }
}
