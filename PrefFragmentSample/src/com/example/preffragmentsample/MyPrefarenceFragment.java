package com.example.preffragmentsample;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyPrefarenceFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref_child_fragment);
	}

}
