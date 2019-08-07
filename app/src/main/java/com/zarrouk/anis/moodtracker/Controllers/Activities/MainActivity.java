package com.zarrouk.anis.moodtracker.Controllers.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zarrouk.anis.moodtracker.Controllers.Fragments.MainFragment;
import com.zarrouk.anis.moodtracker.R;

public class MainActivity extends AppCompatActivity {
    MainFragment mMainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.configureAndShowMainFragment();
    }

    private void configureAndShowMainFragment() {
        this.mMainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.activity_main_frame);
        if(mMainFragment == null){
            mMainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction()
                                       .add(R.id.activity_main_frame,  mMainFragment)
                                       .commit();
        }
    }
}
