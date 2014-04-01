package com.example.prefarencesample;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class PrefSamleActivity extends Activity {

	private static final String PREF_NAME = "MyPrefData";
	private static final String KEY_STRING = "DATA_STRING";
	private static final String KEY_INT = "DATA_INT";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pref_samle);
		findViewById(R.id.button_save).setOnClickListener(saveButtonClick);
		findViewById(R.id.button_load).setOnClickListener(loadButtonClick);
		
	}
	
	private OnClickListener saveButtonClick = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			Log.v("TEST", "click save button");
			
			EditText edit = (EditText)findViewById(R.id.edit_save_string);
			String valueString = edit.getText().toString();
			
			edit = (EditText)findViewById(R.id.edit_save_int);
			 int valueInt = Integer.parseInt(edit.getText().toString());
			 
			 SharedPreferences prefarence = getSharedPreferences(PREF_NAME, Activity.MODE_PRIVATE);
			 SharedPreferences.Editor editor = prefarence.edit();
			 editor.putString(KEY_STRING, valueString);
			 editor.putInt(KEY_INT, valueInt);
			 editor.commit();
			 
			 //デフォルトのプリファレンスを使うとき
			 SharedPreferences DefPref = PreferenceManager.getDefaultSharedPreferences(PrefSamleActivity.this);
			 editor = DefPref.edit();
			 editor.putString(KEY_STRING, valueString);
			 editor.putInt(KEY_INT, valueInt);
			 editor.commit();
			 
		}
	};
	
	private OnClickListener loadButtonClick = new OnClickListener() { 
		
		@Override
		public void onClick(View v) {
		SharedPreferences prefarence = getSharedPreferences(PREF_NAME, Activity.MODE_PRIVATE);
		
		String valueString = prefarence.getString(KEY_STRING, "NO DATA");
		TextView text = (TextView)findViewById(R.id.textString);
		text.setText(valueString);
		
		int valueInt = prefarence.getInt(KEY_INT, 0);
		text = (TextView)findViewById(R.id.textInt);
		text.setText(String.valueOf(valueInt));
		}
	};
	
}
