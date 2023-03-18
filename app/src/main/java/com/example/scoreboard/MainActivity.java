package com.example.scoreboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String Key = "COUNTER";
    private static final String Key2 = "COUNTER2";
    private Integer Russia = 0;
    private Integer SA = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Key, Russia);
        outState.putInt(Key2, SA);}

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Russia = savedInstanceState.getInt(Key);
        SA = savedInstanceState.getInt(Key2);
        TextView counterView = findViewById(R.id.RUs);
        TextView countView = findViewById(R.id.AR);
        counterView.setText(Russia.toString());
        countView.setText(SA.toString());}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Rus(View view) {
        Russia++;
        TextView counterView = findViewById(R.id.RUs);
        counterView.setText(Russia.toString());
    }
    public void Saud(View view) {
        SA++;
        TextView countView = findViewById(R.id.AR);
        countView.setText(SA.toString());
    }
    public void Delete(View view) {
        Russia = 0;
        SA = 0;
        TextView counterView = findViewById(R.id.RUs);
        TextView countView = findViewById(R.id.AR);
        counterView.setText(Russia.toString());
        countView.setText(SA.toString());}
}