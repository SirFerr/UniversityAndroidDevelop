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
        Context context = getApplicationContext();
        setContentView(R.layout.activity_main);
        Toast.makeText(context, "OnCreate", duration).show();
        super.onCreate(savedInstanceState);
    }
    @Override
    protected void onStart() {
        Context context = getApplicationContext();
        Toast.makeText(context, "OnStart", duration).show();
        super.onStart();
    }
    @Override
    protected void onStop() {
        Context context = getApplicationContext();
        Toast.makeText(context, "OnStop", duration).show();
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        Toast.makeText(context, "OnDestroy", duration).show();
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        Context context = getApplicationContext();
        Toast.makeText(context, "OnPause", duration).show();
        super.onPause();
    }
    @Override
    protected void onResume() {
        Context context = getApplicationContext();
        Log.e(TAG,"onResume");
        Toast.makeText(context, "OnResume", duration).show();
        super.onResume();
    }
}