package com.salyert.swarathesh.player;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by swarathesh on 7/1/2016.
 */
public class PlayMusic extends Activity implements View.OnClickListener{
    private Button button,button2,button3;
    private MediaPlayer player;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.button2);
        player = new MediaPlayer();
        player = MediaPlayer.create(getApplicationContext(),R.raw.music);
        button = (Button) findViewById(R.id.button);
        button3 = (Button)findViewById(R.id.button3);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button2:
                if(player != null)

                {
                    counter+=1;
                    player.start();
                    button2.setBackground(getDrawable(R.drawable.play));
                    if(counter==2)
                    {
                        button2.setBackground(getDrawable(R.drawable.pause));
                        player.pause();
                        counter = 0;
                    }

                }
                break;
            case R.id.button:
                if (player != null ) {
                    player.stop();
                    player.release();
                    Intent intent = new Intent(PlayMusic.this,PlayMusicTwo.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "prev pressed", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.button3:
                if (player != null ) {
                    player.stop();
                    player.release();
                    Intent intent = new Intent(PlayMusic.this,PlayMusicThree.class);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "NEXT pressed", Toast.LENGTH_LONG).show();


                }
                break;




        }

    }
}
