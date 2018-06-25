package com.example.rahulprajapati.fadingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void translateXBy(View view) {
        ImageView image7 = (ImageView) findViewById(R.id.changeimage7);
        image7.animate().translationXBy(1000f).rotationYBy(1000f).setDuration(2000);
    }

    public void translateYBy(View view) {
        ImageView image8 = (ImageView) findViewById(R.id.changeimage8);
        image8.animate().translationXBy(1000f).rotationYBy(1000f).rotation(3600).setDuration(2000);
    }
}
