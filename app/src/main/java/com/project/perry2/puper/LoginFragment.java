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

public class LoginFragment extends Fragment {
    EditText username;
    EditText password;
    Button btnLogin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        username = (EditText)v.findViewById(R.id.txtfldUsersname);
        password = (EditText)v.findViewById(R.id.txtfldPassword);
        btnLogin = (Button)v.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Post username and password to server

                //Start MapTestActivity upon confirming username and password are correct
                Intent intent = new Intent(v.getContext(),MapTestActivity.class);
                startActivity(intent);
            }
        });
        return v;

    }
}
