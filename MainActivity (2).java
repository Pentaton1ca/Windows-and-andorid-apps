package com.example.cookieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView cookie;
    TextView wish;
    Button again;
    Button sex;
    String[] wishlistboyz = {"You will get a car!", "You will have a great sex!", "You will get yahundred tenge!"};
    String[] wishlistgirlz = {"You will find a handsome crash!", "Expect to have a car!", "Work hard!"};
    Random rand = new Random();
    int index;
    boolean sex1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cookie = findViewById(R.id.cookie);
        wish = findViewById(R.id.wish);
        again = findViewById(R.id.again);
        index = rand.nextInt(2);
        sex = findViewById(R.id.sex);
        sex.setOnClickListener(new View.OnClickListener() {
            private boolean state =  false;
            @Override
            public void onClick(View v) {
                if (state){
                    state = false;
                    sex.setText("Male");
                    sex1 = false;
                }
                else {
                    state = true;
                    sex.setText("Female");
                    sex1 = true;
                }

            }
        });
        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sex1) {
                    sex1 = false;
                    wish.setText(wishlistboyz[index]);
                    wish.setVisibility(View.VISIBLE);
                    cookie.setImageResource(R.drawable.broken);
                    again.setVisibility(View.VISIBLE);
                }
                else if (sex1) {
                    sex1 = true;
                    wish.setText(wishlistgirlz[index]);
                    wish.setVisibility(View.VISIBLE);
                    cookie.setImageResource(R.drawable.broken);
                    again.setVisibility(View.VISIBLE);
                }            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = rand.nextInt(2);
                wish.setVisibility(View.INVISIBLE);
                cookie.setImageResource(R.drawable.cookie);
                again.setVisibility(View.GONE);
            }
        });
    }
}
