package com.example.a15056130.p07smsretriever;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        Fragment f1 = new FragmentNumber();
        ft.replace(R.id.numFrame, f1);


        Fragment f2 = new FragmentWord();
        ft.replace(R.id.wordFrame, f2);


        ft.commit();
    }
}
