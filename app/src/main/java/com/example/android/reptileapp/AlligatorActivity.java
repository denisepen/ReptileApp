package com.example.android.reptileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlligatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alligator);
    }
    public void alligatorWiki(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Alligator"));
        startActivity(browserIntent);

    }
    public void chameleonPage(View view) {

        Intent intent = new Intent(this, ChameleonActivity.class);
        startActivityForResult(intent, 4);
    }
    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult(intent, 8);

    }
}
