package com.example.android.reptileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReptileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptile);
    }
    public void reptileChoice(View view) {

        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivityForResult(intent, 0);

    }
}
