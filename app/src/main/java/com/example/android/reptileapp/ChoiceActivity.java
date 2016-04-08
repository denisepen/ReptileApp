package com.example.android.reptileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {
  int chooseTurtle = 1;
    int  chooseSnake = 2;
    int chooseAlligator = 3;
    int chooseChameleon = 4;
    int chooseIguana = 5;
    int chooseKomodoDragon = 6;
    int chooseCongrats = 7;
    int chooseHome = 8;
    int chooseReptile = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void turtlePage(View view) {

        Intent intent = new Intent(this, TurtleActivity.class);
        startActivityForResult(intent, 1);
    }
    public void snakePage(View view) {

        Intent intent = new Intent(this, SnakeActivity.class);
        startActivityForResult(intent, 2);
    }
    public void alliPage(View view) {

        Intent intent = new Intent(this, AlligatorActivity.class);
        startActivityForResult(intent, 3);
    }
    public void chameleonPage(View view) {

        Intent intent = new Intent(this, ChameleonActivity.class);
        startActivityForResult(intent, 4);
    }
    public void iguanaPage(View view) {

        Intent intent = new Intent(this, IguanaActivity.class);
        startActivityForResult(intent, 5);
    }
    public void kDragonPage(View view) {

        Intent intent = new Intent(this, KDragonActivity.class);
        startActivityForResult(intent, 6);
    }

    public void goHome(View view) {
        Intent intent = new Intent (this, ChoiceActivity.class);
        startActivityForResult (intent, 8);

    }
    public void reptilePage(View view) {
        Intent intent = new Intent (this, ReptileActivity.class);
        startActivityForResult (intent, 9);

    }
}