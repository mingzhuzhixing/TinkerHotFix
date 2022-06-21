package com.v.tinkerhotfix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickWrong(View view) {
        int b = 12;
        int c = b / a;
        Log.i("MainActivity", "clickWrong: "+c);
        Log.i("MainActivity", "clickWrong: "+c);
        Log.i("MainActivity", "clickWrong: "+c);
        Log.i("MainActivity", "clickWrong: "+c);
        Log.i("MainActivity", "clickWrong: "+c);
        Log.i("MainActivity", "clickWrong: "+c);
    }

    public void fixWrong(View view) {
        a = 1;
    }
}