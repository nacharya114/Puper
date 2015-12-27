package com.project.perry2.puper;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by AndrewWireman on 12/27/15.
 */
public class HelpFragment extends Fragment {
    Button accou;
    Button pay;
    Button howTo;
    Button locate;
    Button report;

    public View onClickView(LayoutInflater inflater, ViewGroup container) {
        View helpView = inflater.inflate(R.layout.fragment_help, container, false);
        accou = (Button)helpView.findViewById(R.id.buttonAccount);
        pay = (Button) helpView.findViewById(R.id.buttonPayment);
        howTo = (Button) helpView.findViewById(R.id.buttonInstru);
        locate = (Button) helpView.findViewById(R.id.buttonLocate);
        report = (Button) helpView.findViewById(R.id.buttonIssue);

        accou.setOnClickListener((v) -> {
            //TODO Open User Account Info
        });
        pay.setOnClickListener((v) -> {
            //TODO Open User Payment Info
        });
        howTo.setOnClickListener((v) -> {
            //TODO Open App Instructions
        });
        locate.setOnClickListener((v) -> {
            //TODO Report Current Address of Package
        });
        report.setOnClickListener((v) -> {
            //TODO Allow User to report an Issue
        });
        return helpView;
    }
}
