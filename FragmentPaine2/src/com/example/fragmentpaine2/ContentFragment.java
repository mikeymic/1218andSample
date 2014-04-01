package com.example.fragmentpaine2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContentFragment extends Fragment {

	// 渡された引数をセットしたcontentFragmentを返す
	protected static ContentFragment getInstance(String value) {
		ContentFragment fragment = new ContentFragment();
		Bundle args = new Bundle();
		args.putString("text", value);
		fragment.setArguments(args);
		return fragment;
		}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		return super.onCreateView(inflater, container, savedInstanceState);
		if (container == null) {
			return null;
		}
		
		//レイアウトをインフレートし、TextViewに引数として渡された文字列をセット
		View v = inflater.inflate(R.layout.content, container, false);
		Bundle args = getArguments();
		String value = args.getString("text");
		TextView tv = (TextView) v.findViewById(R.id.text);
		tv.setText(value);
		
		return v;	
	}
	
	
}
