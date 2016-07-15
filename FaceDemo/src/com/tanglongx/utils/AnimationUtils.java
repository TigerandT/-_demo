package com.tanglongx.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class AnimationUtils {
	//private static AnimationUtils animation;
	private static AlphaAnimation aa;
	private static RotateAnimation ra;
    private static ScaleAnimation  sa;
    private static TranslateAnimation ta;
    private static AnimationSet annimationSet;
	//��ʾ����
 public static void startAlphaAnim(View view,int time){
   aa=new AlphaAnimation(0.0f,1.0f);
   aa.setDuration(time);
   view.startAnimation(aa);
}
 //��ת����
public static void startRotateAnim(View view,int time){
	
	//ra=new RotateAnimation(0, 360);
	
	                      //��ʼ�Ƕ�              ��ֹ�Ƕ�              �ο���x����   �ο���Y����
	//ra=new RotateAnimation(0, -360, 50, 50);
	//                        ��ʼ�Ƕ�           ��ֹ�Ƕ�           �ο�������
	ra=new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
	ra.setDuration(time);
	view.startAnimation(ra);
}
//����Ч��
public static void startScaleAnim(View view,int time){
	//                    X����ʼ
	// sa=new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f);
	//sa=new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, 50, 50);
	 sa=new ScaleAnimation(0.5f, 1.5f, 0.5f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
	 sa.setDuration(time);
	 sa.setInterpolator(new DecelerateInterpolator());
	 view.startAnimation(sa);
}
public static void startTransAnim(View view ,int time){
	//ta=new TranslateAnimation(0, 100, 0, 0);
	// fromXType        
	//fromXValue
	//toXType
	ta=new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 1, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 0);
	ta.setDuration(time);
	view.startAnimation(ta);
}
public static void startSetAnim(View view ,int time){
	// AnimationSet=new AnimationUtils();
	annimationSet=new AnimationSet(false);
	RotateAnimation ra = new RotateAnimation(
			0,
			720,
			Animation.RELATIVE_TO_SELF,
			0.5f, 
			Animation.RELATIVE_TO_SELF,
			0.5f);
	ra.setDuration(time);
	ScaleAnimation sa=new ScaleAnimation(
			 0.5f, 
			 1.5f,
			 0.5f,
			 1.5f,
			 Animation.RELATIVE_TO_SELF, 
			 0.5f,
			 Animation.RELATIVE_TO_SELF, 
			 0.5f);
	
	sa.setDuration(time);
	annimationSet.addAnimation(ra);
	annimationSet.addAnimation(sa);
	view.bringToFront();
	view.startAnimation(annimationSet);
}
}
