package com.example.fragmentpaine2;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class ContentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}
		
		if (savedInstanceState == null) {
			//内容を表示するためのContantFragmentを生成
			ContentFragment details = new ContentFragment();
			//intentで渡された文字列を引数として渡す
			details.setArguments(getIntent().getExtras());
			//ContantFragmentをレイアウトに追加
			getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
			
		}
	}

}
