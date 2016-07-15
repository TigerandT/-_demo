package com.tanglongx.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdapter extends BaseAdapter{
    private List<Integer>  dateList;
    private Context context;
    public MyAdapter( List<Integer>  dateList,Context context){
    	this.dateList=dateList; 
    	this.context=context;
    }
	@Override
	public int getCount() {
		return dateList.size();
	}

	@Override
	public Object getItem(int position) {
		return dateList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View contextView, ViewGroup parent) {
		int getId=dateList.get(position);
		ImageView view=new ImageView(context);
		view.setImageResource(getId);
		view.setBackgroundColor(Color.WHITE);
		return view ;
	}

}
