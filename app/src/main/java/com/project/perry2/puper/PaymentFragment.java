package com.project.perry2.puper;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.LayoutInflater;

/**
 * Created by AndrewWireman on 12/27/15.
 */
public class PaymentFragment extends Fragment {
    EditText name;
    EditText address;
    EditText country;
    EditText city;
    EditText state;
    EditText zip;
    Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_payment, container, false);
        name = (EditText)view.findViewById(R.id.editTextName);
        address = (EditText)view.findViewById(R.id.editTextAddress);
        country = (EditText)view.findViewById(R.id.editTextCountry);
        city = (EditText)view.findViewById(R.id.editTextCity);
        state = (EditText)view.findViewById(R.id.editTextState);
        zip = (EditText)view.findViewById(R.id.editTextZip);
        submit = (Button)view.findViewById(R.id.buttonSubmit);
        submit.setOnClickListener((v) -> {
                //TODO Submit Payment Details to Server
        });
        return view;
    }
}
