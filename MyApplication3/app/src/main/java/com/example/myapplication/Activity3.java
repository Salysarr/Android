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

public abstract class Activity3 extends AppCompatActivity {
     public static final String TAG = "Test";
     public static int nb=5;
     public int note;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity3);

            Log.e("DEVE0304", "Activity3:onCreate()");
        }
        public Activity3(int nb1; int note1){
        this.nb1=nb;
        this.note1=note;
        }
}
        public abstract int myView();
        public abstract void activityCreated();
