package com.example.tosterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TosterName {
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void testfunction( ) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();


    }


}