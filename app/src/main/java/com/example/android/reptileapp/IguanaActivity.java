package com.example.android.reptileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IguanaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguana);
    }

    public void iguanaWiki(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Iguana"));
        startActivity(browserIntent);

    }
    public void kDragonPage(View view) {

        Intent intent = new Intent(this, KDragonActivity.class);
        startActivityForResult(intent, 6);
    }
    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult(intent, 8);

    }
}
