package com.bennygenish.moduleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bennygenish.debug.AppLog;
import com.bennygenish.net.Dropbox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppLog.d(Dropbox.class.getSimpleName());

    }
}
