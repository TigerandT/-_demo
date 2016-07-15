
package com.tanglongx.facedemo;


import com.tanglongx.fragment.MyFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {
   private RadioGroup group;
   private ViewPager viewpager;
   private MyAdapter adapter;
   private TextView textView;
   private HorizontalScrollView hsv;
   private RadioButton radioButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initTab();
		initViewPager();
		initCursor();
		initHsv();
		}
	private void initViewPager() {
		//1、获取控件
		viewpager = (ViewPager) findViewById(R.id.vp);
		//创建数据源
		//2、获取数据源
		
		//3、创建适配器
		//获取fragment的管理类
		FragmentManager manager = getSupportFragmentManager();
		adapter = new MyAdapter(manager);
		//4、设置配齐
		viewpager.setAdapter(adapter);
		
		viewpager.setOnPageChangeListener(new OnPageChangeListener() {
			
			/**
			 * 选中某个page
			 */
			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				
			}
			
			/**
			 * 当viewpager华东过程中触发的事件
			 * position 当前的位置
			 * positionOffset 当前滑动的比例
			 * positionOffsetPixels 当前滑动的像素
			 */
			@Override
			public void onPageScrolled(int position, float positionOffset,
					int positionOffsetPixels) {
				//获取一个tab的宽度
				int width = radioButton.getWidth();
				//计算新的scrollview华东的位置
				int newPos = (int) (position * width + positionOffset * width);
				
				int center = (viewpager.getWidth() - width) / 2; 
				
				//控制水平滑动条的移动
				hsv.scrollTo(newPos - center, 0);
				
				//控制游标移动
				startMoveCursor(position, positionOffset);
				
				
			}
			
			/**
			 * 当viewpager状态改变的时候触发事件
			 */
			@Override
			public void onPageScrollStateChanged(int state) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	private int from = 0;
	/**
	 * 控制游标移动
	 * @param position       当前移动的位置
	 * @param positionOffset 当前移动的百分比
	 */
	protected void startMoveCursor(int position, float positionOffset) {
		//获取当前被选中的radiobutton
		RadioButton rb = (RadioButton) group.getChildAt(position);
		//定义两个长度的数组 0下标 代表x坐标  1下标y坐标
		int[] location = new int[2];
		//获取当前radiobutton的坐标
		rb.getLocationInWindow(location);
		
		//计算移动后的坐标
		int to = (int) (location[0] + positionOffset * rb.getWidth());
		
		//创建动画
		TranslateAnimation ta = new TranslateAnimation(
				from, 
				to, 
				0, 
				0);
		ta.setDuration(100);
		//动画完成以后停留在当前结束的位置
		ta.setFillAfter(true);
		
		textView.startAnimation(ta);
		from = to;
		
		
	}
	private class MyAdapter extends FragmentPagerAdapter{

		public MyAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			MyFragment  fragment=new  MyFragment();
			//创建一个bundle对象，用于传递数据
			Bundle bundle = new Bundle();
			bundle.putInt("index", position);
			bundle.putBoolean("sex", true);
			//设置参数
			fragment.setArguments(bundle);
			
			return fragment;
		}

		@Override
		public int getCount() {
		  return 12;
		}
      
		
		
	}
	private void initHsv() {
		hsv=(HorizontalScrollView) findViewById(R.id.hsv);
	}
	private void initCursor() {
		textView=(TextView) findViewById(R.id.line);
	}
	private void initTab() {
		radioButton = (RadioButton) findViewById(R.id.rb1);
		group = (RadioGroup) findViewById(R.id.rg);
		group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				
				switch(checkedId) {
				case R.id.rb0:
					viewpager.setCurrentItem(0);
					break;
				case R.id.rb1:
					viewpager.setCurrentItem(1);
					break;
				case R.id.rb2:
					viewpager.setCurrentItem(2);
					break;
				case R.id.rb3:
					viewpager.setCurrentItem(3);
					break;
				case R.id.rb4:
					viewpager.setCurrentItem(4);
					break;
				case R.id.rb5:
					viewpager.setCurrentItem(5);
					break;
				case R.id.rb6:
					viewpager.setCurrentItem(6);
					break;
				case R.id.rb7:
					viewpager.setCurrentItem(7);
					break;
				case R.id.rb8:
					viewpager.setCurrentItem(8);
					break;
				case R.id.rb9:
					viewpager.setCurrentItem(9);
					break;
				case R.id.rb10:
					viewpager.setCurrentItem(10);
					break;
				case R.id.rb11:
					viewpager.setCurrentItem(11);
					break;
				}
				
			}
		});
	}
}