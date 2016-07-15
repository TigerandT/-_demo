
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
		//1����ȡ�ؼ�
		viewpager = (ViewPager) findViewById(R.id.vp);
		//��������Դ
		//2����ȡ����Դ
		
		//3������������
		//��ȡfragment�Ĺ�����
		FragmentManager manager = getSupportFragmentManager();
		adapter = new MyAdapter(manager);
		//4����������
		viewpager.setAdapter(adapter);
		
		viewpager.setOnPageChangeListener(new OnPageChangeListener() {
			
			/**
			 * ѡ��ĳ��page
			 */
			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				
			}
			
			/**
			 * ��viewpager���������д������¼�
			 * position ��ǰ��λ��
			 * positionOffset ��ǰ�����ı���
			 * positionOffsetPixels ��ǰ����������
			 */
			@Override
			public void onPageScrolled(int position, float positionOffset,
					int positionOffsetPixels) {
				//��ȡһ��tab�Ŀ��
				int width = radioButton.getWidth();
				//�����µ�scrollview������λ��
				int newPos = (int) (position * width + positionOffset * width);
				
				int center = (viewpager.getWidth() - width) / 2; 
				
				//����ˮƽ���������ƶ�
				hsv.scrollTo(newPos - center, 0);
				
				//�����α��ƶ�
				startMoveCursor(position, positionOffset);
				
				
			}
			
			/**
			 * ��viewpager״̬�ı��ʱ�򴥷��¼�
			 */
			@Override
			public void onPageScrollStateChanged(int state) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	private int from = 0;
	/**
	 * �����α��ƶ�
	 * @param position       ��ǰ�ƶ���λ��
	 * @param positionOffset ��ǰ�ƶ��İٷֱ�
	 */
	protected void startMoveCursor(int position, float positionOffset) {
		//��ȡ��ǰ��ѡ�е�radiobutton
		RadioButton rb = (RadioButton) group.getChildAt(position);
		//�����������ȵ����� 0�±� ����x����  1�±�y����
		int[] location = new int[2];
		//��ȡ��ǰradiobutton������
		rb.getLocationInWindow(location);
		
		//�����ƶ��������
		int to = (int) (location[0] + positionOffset * rb.getWidth());
		
		//��������
		TranslateAnimation ta = new TranslateAnimation(
				from, 
				to, 
				0, 
				0);
		ta.setDuration(100);
		//��������Ժ�ͣ���ڵ�ǰ������λ��
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
			//����һ��bundle�������ڴ�������
			Bundle bundle = new Bundle();
			bundle.putInt("index", position);
			bundle.putBoolean("sex", true);
			//���ò���
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