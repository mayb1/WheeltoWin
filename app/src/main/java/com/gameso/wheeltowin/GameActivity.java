package com.gameso.wheeltowin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    ImageView imageWheel;
    int random = ((int) (Math.random() * 360));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageView imageExitGame = findViewById(R.id.imageExitGame);
        ImageView imageSpin = findViewById(R.id.imageSpin);
        imageWheel = findViewById(R.id.imageWheel);

        imageExitGame.setOnClickListener(onClickExitGame);
        imageSpin.setOnClickListener(view -> {
            imageWheel.animate().rotationBy(random).start();
            Toast.makeText(getApplicationContext(), "Look at your Prize!", Toast.LENGTH_SHORT).show();
        });
    }
    View.OnClickListener onClickExitGame = view -> finishAffinity();
}