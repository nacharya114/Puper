package com.project.perry2.puper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Neil on 12/15/2015.
 * Custom Fragment with a google map for testing purposes.
 */
public class CustMapFragment extends Fragment {

    private GoogleMap map;

    public CustMapFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceData) {
        View v = inflater.inflate(R.layout.fragment_maps, container, false);

        map = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();
        if (map != null) {
            setUpMap();
        }

        return v;
    }

//    private void setUpMapIfNeeded() {
//        // Do a null check to confirm that we have not already instantiated the map.
//        if (map == null) {
//            // Try to obtain the map from the SupportMapFragment.
//            map = ((SupportMapFragment) getFragmentManager().findFragmentById(R.id.map))
//                    .getMap();
//            map.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
//            // Check if we were successful in obtaining the map.
//            if (map != null) {
//                setUpMap();
//            }
//        }
//    }

    private void setUpMap() {
        Marker cust = map.addMarker(new MarkerOptions()
                .position(new LatLng(0,20))
                .title("Marker"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cust.getPosition(), 15));
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

    }

}
