package com.example.videoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;


public class  MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
         videoView=findViewById(R.id.video);
//        String path="android.resource://"+getPackageName()+"/raw/nasir";
        String v="https://wscubetechapps.com/android-course/android_11.mp4";
//        videoView.setVideoPath(path);

//        Uri video= Uri.parse(path);
        Uri online= Uri.parse(v);
//        videoView.setVideoURI(video);
        videoView.setVideoURI(online);
        videoView.start();
        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);




    }
}