package com.tuantrandev.tuantran.ratingbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Mapping views
        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        tvResult = (TextView)findViewById(R.id.tvResult);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvResult.setText("You've rated "+ rating);
            }
        });
    }
}
