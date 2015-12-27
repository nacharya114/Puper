package com.project.perry2.puper;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by AndrewWireman on 12/27/15.
 */
public class HistoryFragment extends Fragment {
    EditText hist;

    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View histView = inflater.inflate(R.layout.fragment_history, container, false);
        hist = (EditText)histView.findViewById(R.id.editTextHistory);
        //TODO Put Ride history in hist textbox
        return histView;
    }
}
