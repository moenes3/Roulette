package com.example.roulette;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Weelg extends AppCompatActivity {
    Button button ;
    TextView textView;
    ImageView weel;
    ImageView menu;
    private  Button button2;

    Random r;
    int degree = 0 , degree_old = 0 ;
    private static final float FACTOR = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weelg);



        button = (Button) findViewById(R.id.button);
        final MediaPlayer a = MediaPlayer.create(this, R.raw.spins);
        textView = (TextView) findViewById(R.id.textView);
        weel = (ImageView) findViewById(R.id.weel);
        button2 = (Button) findViewById(R.id.button);

        r = new Random();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.start();
            }
       });
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View View) {
                        degree_old = degree % 360;
                        degree = r.nextInt(3600) + 720;
                        RotateAnimation rotate = new RotateAnimation(degree_old,degree,
                                RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                        rotate.setDuration(3600);
                        rotate.setFillAfter(true);
                        rotate.setInterpolator(new DecelerateInterpolator());
                        rotate.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {
                                textView.setText("");





                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {

                                textView.setText(currentNumber(360-(degree % 360)));

                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }


                        });
                        weel.startAnimation(rotate);

                    }
                });
    }
    private String currentNumber(int degrees){
        String text = "";
        if(degrees >= (FACTOR * 1) && degrees < (FACTOR * 3)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 3) && degrees < (FACTOR * 5)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 5) && degrees < (FACTOR * 7)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 7) && degrees < (FACTOR * 9)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 9) && degrees < (FACTOR * 11)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 11) && degrees < (FACTOR * 13)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 13) && degrees < (FACTOR * 15)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 15) && degrees < (FACTOR * 17)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 17) && degrees < (FACTOR * 19)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 19) && degrees < (FACTOR * 21)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 21) && degrees < (FACTOR * 23)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 23) && degrees < (FACTOR * 25)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 25) && degrees < (FACTOR * 27)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 27) && degrees < (FACTOR * 29)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 29) && degrees < (FACTOR * 31)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 31) && degrees < (FACTOR * 33)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 33) && degrees < (FACTOR * 35)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 35) && degrees < (FACTOR * 37)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 37) && degrees < (FACTOR * 39)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 39) && degrees < (FACTOR * 41)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 41) && degrees < (FACTOR * 43)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 43) && degrees < (FACTOR * 45)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 45) && degrees < (FACTOR * 47)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 47) && degrees < (FACTOR * 49)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 49) && degrees < (FACTOR * 51)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 51) && degrees < (FACTOR * 53)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 53) && degrees < (FACTOR * 55)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 55) && degrees < (FACTOR * 57)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 57) && degrees < (FACTOR * 59)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 59) && degrees < (FACTOR * 61)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 61) && degrees < (FACTOR * 63)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 63) && degrees < (FACTOR * 65)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 65) && degrees < (FACTOR * 67)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 67) && degrees < (FACTOR * 69)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 69) && degrees < (FACTOR * 71)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if(degrees >= (FACTOR * 71) && degrees < (FACTOR * 73)){
            text="MERCI POUR VOTRE PARTICIPATION";
        }
        if ((degrees >= (FACTOR * 73)&& degrees < 360)||(degrees >= 0 && degrees < (FACTOR * 1))){
            text = "FELICITATION ticket de 1dt ";
        }




        return text;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

   public void  ImageView_msg (View view){
       Toast.makeText(getApplicationContext(),"image clicked",Toast.LENGTH_LONG).show();

       Intent intent = new Intent(weelg.this,setting.class);
       startActivity(intent);
       finish();
   }
}

