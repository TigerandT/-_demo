package com.tanglongx.facedemo;

import com.tanglongx.utils.AnimationUtils;
import com.tanglongx.utils.SoundUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.ImageView;

public class WelcomeActivity extends Activity {
	private ImageView icon;
	private SoundUtils soundUtils=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome); 
        initImageButton();
        initAnimation();
        soundUtils = SoundUtils.getInstance(WelcomeActivity.this);
        soundUtils.playIconSound();
        SimpleThread st=new SimpleThread();
        st.start();  
     
        
    }
    private void initImageButton(){
    	icon= (ImageView) findViewById(R.id.imageView1);
    	
    }
    private void initAnimation(){
    	 AnimationUtils.startSetAnim(icon, 10000);
    	 
    }
    public class SimpleThread extends Thread{

		@Override
		public void run() {
			try {
				
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
			finally
			{
				//Intent intent =new Intent();
				//intent.setClass(WelcomeActivity.this, MainActivity.class);
				Intent intent =new Intent(WelcomeActivity.this, SelectActivity.class);
				startActivity(intent);
			}
			finish();
		}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

