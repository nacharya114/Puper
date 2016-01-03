package com.project.perry2.puper;

import android.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by AndrewWireman on 12/27/15.
 */
public class SettingsFragment extends Fragment {
    Button edit;
    Button home;
    Button work;
    Button signOut;

    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View settingsView = inflater.inflate(R.layout.fragment_settings, container, false);
        edit = (Button)settingsView.findViewById(R.id.buttonEdit);
        home = (Button)settingsView.findViewById(R.id.buttonHome);
        work = (Button)settingsView.findViewById(R.id.buttonWork);
        signOut = (Button)settingsView.findViewById(R.id.buttonSignOut);

//        edit.setOnClickListener((v) -> {
//            //TODO Allow editing of Account
//        });
//        home.setOnClickListener((v) -> {
//            //TODO Set Home Address
//        });
//        work.setOnClickListener((v) -> {
//            //TODO Set Work Address
//        });
//        signOut.setOnClickListener((v) -> {
//            //TODO Log Oiut User
//        });
        return settingsView;
    }
}
