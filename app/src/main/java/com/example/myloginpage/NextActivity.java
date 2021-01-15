package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView ratingtextView;
    private Button gobutton, backbutton;
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        gobutton = findViewById(R.id.gobuttonid);
        backbutton = findViewById(R.id.backbuttonid);
        ratingBar = findViewById(R.id.ratingbarid);
        ratingtextView = findViewById(R.id.ratingtexteviewid);
        imageView1 = findViewById(R.id.imageview1id);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingtextView.setText("value: "+rating);
            }
        });

        //backbutton listener add
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(NextActivity.this,ChackboxActivity.class);
                    startActivity(intent);

            }
        });

        //gobutton listener add

        gobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(NextActivity.this,HomeActivity.class);
                    startActivity(intent);


            }
        });
    }
}
