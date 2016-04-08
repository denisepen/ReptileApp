package com.example.android.reptileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KDragonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kdragon);
    }

    public void kdragonWiki(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Komodo_dragon"));
        startActivity(browserIntent);

    } public void congratsPage(View view) {

        Intent intent = new Intent(this, CongratsActivity.class);
        startActivityForResult(intent, 7);
    }
    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult(intent, 8);

    }
}
