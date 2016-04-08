package com.example.android.reptileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int choiceRequest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reptileChoice(View view) {

        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivityForResult(intent, 0);

    }
}
