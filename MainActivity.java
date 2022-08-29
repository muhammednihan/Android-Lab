package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;
import  android.widget.Toast;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String MAIN_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text){
        Log.d(MAIN_ACTIVITY_TAG, text);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("Activity Created");
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onStart() {
        super.onStart();
        showLog("Activity started");
        Toast toast = Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("Activity restarted");
        Toast toast = Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onPause() {
        super.onPause();
        showLog("Activity paused");
        Toast toast = Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onResume() {
        super.onResume();
        showLog("Activity resumed");
        Toast toast = Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onStop() {
        super.onStop();
        showLog("Activity stopped");
        Toast toast = Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG);
        toast.show();
    }

    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity had destroyed");
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG);
        toast.show();
    }
}