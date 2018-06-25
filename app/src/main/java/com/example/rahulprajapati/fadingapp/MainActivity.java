package com.example.rahulprajapati.fadingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Tap(View view) {
        ImageView image = (ImageView) findViewById(R.id.changeimage);
        ImageView image1 = (ImageView) findViewById(R.id.changeimage1);
        image.animate().alpha(0f).setDuration(2000);
        image1.animate().alpha(1f).setDuration(2000);


    }

    public void nextactivity(View view) {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }
}
