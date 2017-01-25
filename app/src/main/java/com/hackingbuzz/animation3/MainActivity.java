package com.hackingbuzz.animation3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ImageView angryBird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angryBird = (ImageView) findViewById(R.id.imageView);

        angryBird.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {       // setDuration set both time n slowness // increasing in pixels increase speed

     //   angryBird.animate().translationYBy(1000f).setDuration(3000); // move down by (1000) pixels in 3 sec

     //  angryBird.animate().translationXBy(3000f).setDuration(1000); //move off to right by 1000 pixels in 2 sec

      //  angryBird.animate().translationXBy(-1000f).setDuration(2000);  // negative sign ( - ) change it to opposite direction

      //  angryBird.animate().translationX(1000).setDuration(2000);  // same as tranlationXBy

       // angryBird.animate().rotationXBy(200).setDuration(2000); // setDuration to make is slow   ..value shud start from 100
        // the more pixels the more rounds n fast //  rotationXBy takes round in vertical direction  down to up -y to y


      //  angryBird.animate().rotation(1000).setDuration(2000); // goes -x to  y than -x  and 1 time clickable

      //  angryBird.animate().rotationX(1000).setDuration(2000); // same as rotationXBy but 1 time clickable

      //  angryBird.animate().rotationYBy(1000).setDuration(2000);   //  -x to x

      //   angryBird.animate().rotationYBy(-1000).setDuration(2000); // opposite

      // angryBird.animate().scaleYBy(0.3f).setDuration(2000);  // values in point n it stretches out the image


      //  angryBird.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);   // scale for shrinking and growing (X and Y together )



        // pixcels means space cowered on screen..it you give 100 it will move less
        angryBird.animate().translationXBy(-1000f).translationYBy(-1000f).rotation(3600).setDuration(2000);  // 3600 - 10 rounds , 1 complete round 360 degree

        // XBy - move to right , YBy - move down ...so together it will go in between both directions














    }
}
