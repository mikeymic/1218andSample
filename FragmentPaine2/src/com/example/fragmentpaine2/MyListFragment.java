package com.example.fragmentpaine2;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListFragment extends ListFragment {

	// タップされた最後のポジション
	private int currentPosition = -1;
	// Itemがタッチされた時のリスナーを定義
	public interface OnListItemClickListener {
		public void onListItemClick(int position, String value);
	}
	
	private OnListItemClickListener onListItemClickListener = null;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		List<String> data = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			data.add("Sample" + i);
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
		setListAdapter(adapter);
		
		if (savedInstanceState != null) {
			//保存されているタッチ位置を取得
			currentPosition = savedInstanceState.getInt("currentPosition", -1);
		}
		if (currentPosition != -1) {
			showContent(currentPosition);
		}
	}
	
	
	
	//タッチ位置を保存
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("currentPosition", currentPosition);
	}




	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		//実装されていない時
		if (activity instanceof OnListItemClickListener == false) {
			throw new ClassCastException("ActivityにOnListItemClickListenerが実装されていません");
		}
		
		
		onListItemClickListener = (OnListItemClickListener) activity;//今回はActivityにOnListItemClickListenerがimplementされているのでキャスト可能
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		//Listがタップされたときに呼び出される
		super.onListItemClick(l, v, position, id);
		showContent(position);
		
		
	}

	private void showContent(int position) {
		//タッチされた位置を保存
		currentPosition = position;
		//タッチされたときにリスナーのメソッドを呼び出す
		if (onListItemClickListener != null) {
			String value = (String) getListAdapter().getItem(position);
			onListItemClickListener.onListItemClick(position, value);
		}
	}
	
	
	
}
