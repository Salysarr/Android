package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3_1 extends Activity3 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity3_1);

        Log.e("DEVE0304", "Activity3_1:onCreate()");
    }

    public abstract int myView();

    public abstract void activityCreated();
    public void Go(View v) {
        Intent intent=new Intent(this,Activity3_2.class);
        startActivity(intent);


    }

}