package com.salyert.swarathesh.player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button ActivityFirst,ActivitySecond,ActivityThird;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        ActivityFirst = (Button) findViewById(R.id.layou1);
        ActivitySecond = (Button) findViewById(R.id.layout2);
        ActivityThird = (Button) findViewById(R.id.layout3);
        //set OnClick
        ActivityFirst.setOnClickListener(this);
        ActivitySecond.setOnClickListener(this);
        ActivityThird.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.layou1:
                Intent intent = new Intent(MainActivity.this,PlayMusic.class);
                startActivity(intent);


                break;
            case R.id.layout2:
                Intent intent1 = new Intent(MainActivity.this,PlayMusicTwo.class);
                startActivity(intent1);

                break;
            case R.id.layout3:
                Intent intent2 = new Intent(MainActivity.this,PlayMusicThree.class);
                startActivity(intent2);
                break;




        }

    }


}
