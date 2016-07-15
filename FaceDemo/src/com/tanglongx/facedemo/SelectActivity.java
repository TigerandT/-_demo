package com.tanglongx.facedemo;


import com.tanglongx.utils.AnimationUtils;
import com.tanglongx.utils.SoundUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SelectActivity extends Activity {
	//private AudioManager audioMa;
	//private int volume=0;
	private ImageButton soundbtn;
	private ImageButton btn;
	private ImageButton btn1;
	private boolean isSoundopen=true;
	private SoundUtils soundUtils=null;
	private ImageButton gift;
	private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_select);
        soundUtils = SoundUtils.getInstance(SelectActivity.this);
        initImageView();
        initAnimation();
    } 
   /* private class Myonclicklistener implements View.OnTouchListener{

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			// TODO Auto-generated method stub
			return false;
		}

    	
    }*/
    private void initAnimation(){
      AnimationUtils.startRotateAnim(btn,3000);
      AnimationUtils.startRotateAnim(btn1, 3000);
      AnimationUtils.startSetAnim(gift,3000);
      AnimationUtils.startSetAnim(logo, 3000);
    }
    
	private void initImageView() {
		// TODO Auto-generated method stub
		soundbtn=(ImageButton) findViewById(R.id.sound);
		//ImageButton 
		btn=(ImageButton) findViewById(R.id.man);
        //ImageButton 
		btn1=(ImageButton) findViewById(R.id.woman);
		gift=(ImageButton) findViewById(R.id.gift);
		logo=(ImageView) findViewById(R.id.logo);
        btn.setOnTouchListener(new View.OnTouchListener(){
    		@Override
    		public boolean onTouch(View v, MotionEvent event) {
    			// TODO Auto-generated method stub
    			 if(event.getAction()==MotionEvent.ACTION_DOWN){
    				//重新设置按下时的背景图片
    				((ImageButton) v).setImageDrawable(getResources().getDrawable(R.drawable.bt_man_down));
    				soundUtils.playBoySound();
    			}else if(event.getAction()==MotionEvent.ACTION_UP){
    				//再修改为抬起时的正常图片
    				((ImageButton) v).setImageDrawable(getResources().getDrawable(R.drawable.bt_man_up));
    				Intent intent = new Intent(SelectActivity.this, MainActivity.class);
    				startActivity(intent);
    			}
    				
				return false;
    		}
        	
        });
       
        btn1.setOnTouchListener(new View.OnTouchListener(){
    		@Override
    		public boolean onTouch(View v, MotionEvent event) {
    			// TODO Auto-generated method stub
    			if(event.getAction()==MotionEvent.ACTION_DOWN){
    				//重新设置按下时的背景图片
    				((ImageButton) v).setImageDrawable(getResources().getDrawable(R.drawable.bt_woman_down));
    				soundUtils.playGirlSound();
    			}else if(event.getAction()==MotionEvent.ACTION_UP){
    				//再修改为抬起时的正常图片
    				((ImageButton) v).setImageDrawable(getResources().getDrawable(R.drawable.bt_woman_up));
    				Intent intent = new Intent(SelectActivity.this, MainActivity.class);
    				startActivity(intent);
    			}
    				
				return false;
    		}
        	
        });
        soundbtn.setOnClickListener(new View.OnClickListener() {
            
			@Override
			public void onClick(View v) {
				AnimationUtils.startRotateAnim(soundbtn, 3000);
				isSoundopen = !isSoundopen;
				if(isSoundopen) {
					soundbtn.setBackgroundResource(R.drawable.bt_homepage_sound_on);
					
				} else {
					//audioMa.setRingerMode(AudioManager.RINGER_MODE_SILENT);
					//volume=audioMa.getStreamVolume(AudioManager.STREAM_RING);
					soundbtn.setBackgroundResource(R.drawable.bt_homepage_sound_off);
					//soundbreak.breakoff();//声音的释放
					
				}
			}
		});
      /*  btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				soundUtils.playGirlSound();
				Intent intent = new Intent(SelectActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
		
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(SelectActivity.this, MainActivity.class);
				startActivity(intent);
				
			}
		});*/
		
    }
	
  }
