package com.example.rahulprajapati.fadingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void rotation(View view) {
        ImageView image5 = (ImageView) findViewById(R.id.changeimage5);
        image5.animate().rotation(3600).setDuration(2000);
    }

    public void scale(View view) {
        ImageView image6 = (ImageView) findViewById(R.id.changeimage6);
        image6.animate().scaleX(9f).scaleY(9f).setDuration(2000);
    }


    public void next(View view) {
        Intent i = new Intent(this,Main4Activity.class);
        startActivity(i);
    }
}
