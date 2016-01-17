package com.project.perry2.puper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Help");

        Button account = (Button)findViewById(R.id.buttonAccount);
        Button payment = (Button)findViewById(R.id.buttonPayment);
        Button instructions = (Button)findViewById(R.id.buttonInstru);
        Button locate = (Button)findViewById(R.id.buttonLocate);
        Button issue = (Button)findViewById(R.id.buttonIssue);


    }

}
