package com.project.perry2.puper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Settings");

        Button editAccount = (Button)findViewById(R.id.buttonEdit);
        Button home = (Button)findViewById(R.id.buttonHome);
        Button work = (Button)findViewById(R.id.buttonWork);
        Button signOut = (Button)findViewById(R.id.buttonSignOut);
    }

}
