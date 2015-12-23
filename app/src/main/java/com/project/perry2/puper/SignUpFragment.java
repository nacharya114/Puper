package com.project.perry2.puper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpFragment extends Fragment {
    EditText username;
    EditText password;
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sign_up, container, false);
        btn = (Button)v.findViewById(R.id.btnSignUp);
        username = (EditText)v.findViewById(R.id.edtUsername);
        password = (EditText)v.findViewById(R.id.edtPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Post username and password to server

                //Start MapTestActivity upon confirming username and password are correct
                Intent intent2 = new Intent(v.getContext(),MapTestActivity.class);
                startActivity(intent2);
            }
        });
        return v;
    }
}
