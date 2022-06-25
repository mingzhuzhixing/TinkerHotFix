package com.v.tinkerhotfix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int a = 0;
    private final boolean isType = BuildConfig.IS_BASE_APK == 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_text);
        textView.setText(isType ? "我是base包" : "我是patch包");

        findViewById(R.id.btn_click_wrong).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b = 12;
                int c = b / a;
                Log.i("MainActivity", "c:" + c);
            }
        });

        findViewById(R.id.btn_click_fix).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 1;
            }
        });
    }
}