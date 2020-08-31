package com.example.roulette;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    //varibles
    Animation topAnim, botttomAnim;
    ImageView image;
    TextView logo , slogan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
       //animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botttomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogan= findViewById(R.id.textView2);

        image.setAnimation(topAnim);
        logo.setAnimation(botttomAnim);
        slogan.setAnimation(botttomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Weelg.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
