package com.example.fragmentsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {

	private EditText editText1;
	private Button okButton;
	private TextView textView1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		
//		View view = inflater.inflate(R.layout.fragment, container, false);
//		TextView tView = view.findViewById(R.id.text1);
//		return view;
		return inflater.inflate(R.layout.fragment1, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();
		
		editText1 = (EditText) getActivity().findViewById(R.id.edit_text_1);
		okButton = (Button) getActivity().findViewById(R.id.button_ok);
		textView1 = (TextView) getActivity().findViewById(R.id.text_2);
		
		okButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				textView1.setText(editText1.getText().toString());
				
			}
		});
		
		
		
	}
	


}
