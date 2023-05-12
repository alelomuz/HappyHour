package com.example.happyhour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun(View v){
        v.setEnabled(false);
        Log.d("success","Button Disabled");
        Button button = (Button) v;
        button.setText("Disabled");
    }
}