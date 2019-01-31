package com.example.user.idoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    ImageButton btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (ImageButton) findViewById(R.id.imb);
        img= (ImageView) findViewById(R.id.imgv);


    }

    public void go(View view) {
        Random rnd= new Random();
        num= rnd.nextInt(3)+1;
        switch(num){
            case 1:{
                img.setImageResource(R.drawable.hipo);
                btn.setImageResource(R.drawable.one);
                break;
            }
            case 2: {
                img.setImageResource(R.drawable.gani);
                btn.setImageResource(R.drawable.two);
                break;
            }
            case 3: {
                img.setImageResource(R.drawable.lion);
                btn.setImageResource(R.drawable.three);
                break;
            }


        }


    }
}


