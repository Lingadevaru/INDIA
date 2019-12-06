package com.example.linga.india;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {

    MediaPlayer mp;
    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

    final Button button_anthem = (Button)this.findViewById(R.id.play_anthem);
        //mp = MediaPlayer.create(NewActivity.this,R.raw.janaganamusic);
        button_anthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false)
                {
                    mp=MediaPlayer.create(NewActivity.this, R.raw.jan);
                    mp.start();
                    button_anthem.setText("STOP");
                    flag=true;
                }
                else if(mp.isPlaying()&&flag==true)
                {
                    mp.pause();
                    button_anthem.setText("PLAY");
                    flag=false;
                }
            }
        });

       final Button button_song = this.findViewById(R.id.play_song);

        button_song.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(flag==false){
                    mp = MediaPlayer.create(NewActivity.this, R.raw.vande);
                    mp.start();
                    button_song.setText("STOP");
                    flag=true;
                }else if(mp.isPlaying()&&flag==true){
                    mp.pause();
                    button_song.setText("PLAY");
                    flag=false;
                }
            }

        });
    }

}
