package com.example.android.reptileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TurtleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);
    }


    public void snakePage(View view) {

        Intent intent = new Intent(this, SnakeActivity.class);
        startActivityForResult(intent, 2);
    }

    public void turtleWiki(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Turtle"));
        startActivity(browserIntent);

    }
    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult(intent, 8);

    }
}
