package com.masub.sp20_bse_034;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int orientation = getResources().getConfiguration().orientation;

        if(orientation== Configuration.ORIENTATION_LANDSCAPE) {

            Fragment msg = new msgFrag();
            getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, msg).commit();

        }
    }
}