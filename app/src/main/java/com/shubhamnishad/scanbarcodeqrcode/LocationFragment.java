package com.shubhamnishad.scanbarcodeqrcode;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Shubham on 30-06-2017.
 */
public class LocationFragment extends PreferenceFragment {

    private final static String TAG = "LocationFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }
}
