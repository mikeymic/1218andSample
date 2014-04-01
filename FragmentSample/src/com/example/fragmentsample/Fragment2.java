package com.example.fragmentsample;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		
//		View view = inflater.inflate(R.layout.fragment, container, false);
//		TextView tView = view.findViewById(R.id.text1);
//		return view;
		return inflater.inflate(R.layout.fragment2, container, false);
	}


}
