package com.example.pract_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int duration = Toast.LENGTH_SHORT;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "OnCreate", duration).show();
        Log.d(TAG,"onCreate");
    }
    @Override
    protected void onDestroy() {
        Toast.makeText(this, "OnDestroy", duration).show();
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", duration).show();
        Log.d(TAG,"onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", duration).show();
        Log.d(TAG,"onStop");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", duration).show();
        Log.d(TAG,"onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", duration).show();
        Log.d(TAG,"onResume");
    }
}