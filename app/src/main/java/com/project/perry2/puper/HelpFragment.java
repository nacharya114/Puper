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

        accou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return helpView;
    }
}
