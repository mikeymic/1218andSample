package com.example.fragmentsample;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class FragmentSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_sample);
		
/*--------------------<< <Flagmentを動的に配置する> >> ---------------------*/
//		FragmentManager fManager = getFragmentManager();
//		FragmentTransaction fTransaction = fManager.beginTransaction();
//		
//		WindowManager wManager = getWindowManager();
//		Display display = wManager.getDefaultDisplay();
//		if (display.getHeight() < display.getWidth()) {
//			Fragment1 fragment1 = new Fragment1();
//			fTransaction.replace(android.R.id.content, fragment1);
//			
//		}
//		else  {
//			Fragment2 fragment2 = new Fragment2();
//			fTransaction.replace(android.R.id.content, fragment2);
//		}
//		fTransaction.commit();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flagment_sample, menu);
		return true;
	}

}
