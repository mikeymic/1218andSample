package com.example.preffragmentsample;

import java.util.List;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PrefFragmentActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public void onBuildHeaders(List<Header> target) {
		// TODO 自動生成されたメソッド・スタブ
		super.onBuildHeaders(target);
		loadHeadersFromResource(R.xml.pref_fragment, target);//xmlからヘッダーを生成
	}
	
	@Override
	protected boolean isValidFragment(String fragmentName) {
		if (MyPrefarenceFragment.class.getName().equals(fragmentName)) {
			return true;//渡されたものが自分が定義しているfragmentを継承したクラスならtrueを返す
		}
		else if (MyPrefarenceFragment2.class.getName().equals(fragmentName)) {
			return true;//渡されたものが自分が定義しているfragmentを継承したクラスならtrueを返す
		}
		return false;
		// TODO 自動生成されたメソッド・スタブ
//		return super.isValidFragment(fragmentName);
	}


}
