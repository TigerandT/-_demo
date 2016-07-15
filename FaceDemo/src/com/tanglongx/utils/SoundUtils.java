package com.tanglongx.utils;


import com.tanglongx.facedemo.R;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class SoundUtils {
		private static SoundUtils instance;
		private SoundPool soundpool;
		private int boyResId, girlResId, succeedResId,icon;
		private SoundUtils(Context context){
			soundpool =new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
			boyResId=soundpool.load(context, R.raw.boy, 1);
			girlResId=soundpool.load(context, R.raw.girl, 1);
			succeedResId=soundpool.load(context, R.raw.save_succeed, 1);
			icon=soundpool.load(context, R.raw.pikaqiu, 1);
		}
		public static synchronized SoundUtils getInstance(Context context) {
			
			if(instance == null) {
				instance = new SoundUtils(context);
			}
			return instance;
		}
		public void playBoySound() {
			
			soundpool.play(boyResId, 1.0f, 1.0f, 5, 0, 1.0f);
		}
		
		
		public void playGirlSound() {
			
			soundpool.play(girlResId, 1.0f, 1.0f, 5, 0, 1.0f);
		}
       public void playIconSound() {
			
			soundpool.play(icon, 1.0f, 1.0f, 5, 0, 1.0f);
		}
		
		
		public void playSucceedSound() {
			
			soundpool.play(succeedResId, 1.0f, 1.0f, 5, 0, 1.0f);
		}
		
	
		public void release() {
			
			soundpool.release();
			soundpool = null;
			instance = null;
		}
	
}
