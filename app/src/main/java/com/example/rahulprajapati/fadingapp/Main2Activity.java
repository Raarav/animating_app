package com.example.rahulprajapati.fadingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView image4 = (ImageView) findViewById(R.id.changeimage4);
        image4.animate().translationY(-1000f).setDuration(2000);
    }

    public void translateX(View view) {
        ImageView image2 = (ImageView) findViewById(R.id.changeimage2);
        image2.animate().translationX(-1000f).setDuration(2000);
        ImageView image4 = (ImageView) findViewById(R.id.changeimage4);
        image4.animate().translationY(1000f).setDuration(2000);

    }

    public void translateY(View view) {
        ImageView image3 = (ImageView) findViewById(R.id.changeimage3);
        image3.animate().translationX(1000f).setDuration(2000);

    }


    public void nextactivity(View view) {
        Intent i = new Intent(this,Main3Activity.class);
        startActivity(i);

    }
}
