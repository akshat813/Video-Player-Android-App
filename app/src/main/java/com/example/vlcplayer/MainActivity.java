package com.example.vlcplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaController=new MediaController(MainActivity.this);
        videoView=findViewById(R.id.video_view);
        String sdcard_path= Environment.getExternalStorageDirectory().getAbsolutePath();
        String song_path=sdcard_path+"/"+"video.mp4";
        videoView.setMediaController(mediaController);
        videoView.setVideoPath(song_path);
        videoView.start();
    }
}
