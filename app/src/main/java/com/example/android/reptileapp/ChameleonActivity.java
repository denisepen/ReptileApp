package com.example.android.reptileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChameleonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chameleon);
    }

    public void chameleonWiki(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Chameleon"));
        startActivity(browserIntent);

    }

    public void iguanaPage(View view) {

        Intent intent = new Intent(this, IguanaActivity.class);
        startActivityForResult(intent, 5);
    }

    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult(intent, 8);

    }}
