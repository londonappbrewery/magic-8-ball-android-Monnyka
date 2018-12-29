package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);
        final ImageView image_ball = (ImageView)findViewById(R.id.image_eight_ball);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int randnum = rand.nextInt(5);
                final int[] imageArray = {
                        R.drawable.magic_yes,
                        R.drawable.magic_no,
                        R.drawable.magic_sure,
                        R.drawable.magic_try_again,
                        R.drawable.magic_nah
                };
                image_ball.setImageResource(imageArray[randnum]);
            }
        });
    }
}
