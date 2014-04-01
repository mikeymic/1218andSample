package com.example.fragmentpaine2;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Paine2Activity extends Activity implements MyListFragment.OnListItemClickListener{

	private boolean isTwoPane;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paine2);
		
		//内容を表示するfragmentLayoutがあるかどうかで、2painかを判断
		
		View v = findViewById(R.id.content_container);
		isTwoPane = (v != null);
	
	}

	@Override
	public void onListItemClick(int position, String value) {

		if (isTwoPane) {
			//フラグメントをFrameLayoutに追加する
			ContentFragment contentFragment = ContentFragment.getInstance(value);
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.content_container, contentFragment, "content");
			ft.commit();
			
		} else {
			//intent
			Intent intent = new Intent(Paine2Activity.this, ContentActivity.class);
			intent.putExtra("index", position);
			intent.putExtra("text", value);
			startActivity(intent);
		}
	}

	

}
