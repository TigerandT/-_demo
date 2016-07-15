package com.tanglongx.fragment;

import java.util.ArrayList;
import java.util.List;

import com.tanglongx.adapter.MyAdapter;
import com.tanglongx.facedemo.R;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class MyFragment extends Fragment{
	private View view;
	
	private int index;
	private boolean sex;
	
	
	//===================gridview 初始化======================
	private GridView gridView;
	//数据源
	private List<Integer> dataList = new ArrayList<Integer>();
	
	private MyAdapter adapter;
	//===================gridview 初始化======================
	
	/**
	 * 创建fragment布局
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.layout_fragment, container, false);
		
		return view;
	}

	/**
	 * 和当前fragment关联的activity的oncreate方法调用完成以后，执行的方法
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Bundle bundle = this.getArguments();
		index = bundle.getInt("index");
		sex = bundle.getBoolean("sex");
		
		initGridView();
	}

	private void initGridView() {
		//1、获取控件
		gridView = (GridView) view.findViewById(R.id.gridview);
		
		//2、获取数据源
		getData();
		
		//3、创建适配器:将数据源和视图（控件）绑定到一起
		adapter = new MyAdapter(dataList, getActivity());
		
		//4、将适配器绑定到gridview中
		gridView.setAdapter(adapter);
	}


	private void getData() {
		
		switch(index) {
		case 0:
		
		
		dataList.add(R.drawable.pic_rs1_1);
		dataList.add(R.drawable.pic_rs1_2);
		dataList.add(R.drawable.pic_rs1_3);
		dataList.add(R.drawable.pic_rs1_4);
		dataList.add(R.drawable.pic_rs1_5);
		dataList.add(R.drawable.pic_rs1_6);
		dataList.add(R.drawable.pic_rs1_7);
		dataList.add(R.drawable.pic_rs1_8);
		dataList.add(R.drawable.pic_rs1_9);
		dataList.add(R.drawable.pic_rs1_10);
		dataList.add(R.drawable.pic_rs1_11);
		dataList.add(R.drawable.pic_rs1_12);
		dataList.add(R.drawable.pic_rs1_13);
		dataList.add(R.drawable.pic_rs1_14);
		dataList.add(R.drawable.pic_rs1_15);
		dataList.add(R.drawable.pic_rs1_16);
		dataList.add(R.drawable.pic_rs1_17);
		dataList.add(R.drawable.pic_rs1_18);
		dataList.add(R.drawable.pic_rs1_19);
		dataList.add(R.drawable.pic_rs1_20);
		dataList.add(R.drawable.pic_rs1_21);
		dataList.add(R.drawable.pic_rs1_22);
		dataList.add(R.drawable.pic_rs1_23);
		dataList.add(R.drawable.pic_rs1_24);
		dataList.add(R.drawable.pic_rs1_25);
		dataList.add(R.drawable.pic_rs1_26);
		dataList.add(R.drawable.pic_rs1_27);
		dataList.add(R.drawable.pic_rs1_28);
		dataList.add(R.drawable.pic_rs1_29);
		dataList.add(R.drawable.pic_rs1_30);
		dataList.add(R.drawable.pic_rs1_31);
		dataList.add(R.drawable.pic_rs1_32);
		dataList.add(R.drawable.pic_rs1_33);
		dataList.add(R.drawable.pic_rs1_34);
		dataList.add(R.drawable.pic_rs1_35);
		dataList.add(R.drawable.pic_rs1_36);
		dataList.add(R.drawable.pic_rs1_37);
		dataList.add(R.drawable.pic_rs1_38);
		dataList.add(R.drawable.pic_rs1_39);
		dataList.add(R.drawable.pic_rs1_40);
		break;
		case 1:
			dataList.add(R.drawable.pic_s2_20000);
			dataList.add(R.drawable.pic_s2_20001);
			dataList.add(R.drawable.pic_s2_20002);
			dataList.add(R.drawable.pic_s2_20003);
			dataList.add(R.drawable.pic_s2_20004);
			dataList.add(R.drawable.pic_s2_20005);
			dataList.add(R.drawable.pic_s2_20006);
			dataList.add(R.drawable.pic_s2_20007);
			dataList.add(R.drawable.pic_s2_20008);
			dataList.add(R.drawable.pic_s2_20009);
			dataList.add(R.drawable.pic_s2_20010);
			dataList.add(R.drawable.pic_s2_20011);
			dataList.add(R.drawable.pic_s2_20012);
			dataList.add(R.drawable.pic_s2_20013);
			dataList.add(R.drawable.pic_s2_20014);
			dataList.add(R.drawable.pic_s2_20015);
			dataList.add(R.drawable.pic_s2_20016);
			dataList.add(R.drawable.pic_s2_20017);
			dataList.add(R.drawable.pic_s2_20018);
			dataList.add(R.drawable.pic_s2_20019);
			break;
		case 2:
			dataList.add(R.drawable.pic_s3_1);
			dataList.add(R.drawable.pic_s3_2);
			dataList.add(R.drawable.pic_s3_3);
			dataList.add(R.drawable.pic_s3_4);
			dataList.add(R.drawable.pic_s3_5);
			dataList.add(R.drawable.pic_s3_6);
			dataList.add(R.drawable.pic_s3_7);
			dataList.add(R.drawable.pic_s3_8);
			dataList.add(R.drawable.pic_s3_9);
			dataList.add(R.drawable.pic_s3_10);
			dataList.add(R.drawable.pic_s3_11);
			dataList.add(R.drawable.pic_s3_12);
			dataList.add(R.drawable.pic_s3_13);
			dataList.add(R.drawable.pic_s3_14);
			dataList.add(R.drawable.pic_s3_15);
			dataList.add(R.drawable.pic_s3_16);
			dataList.add(R.drawable.pic_s3_17);
			dataList.add(R.drawable.pic_s3_18);
			dataList.add(R.drawable.pic_s3_19);
			dataList.add(R.drawable.pic_s3_20);
			dataList.add(R.drawable.pic_s3_21);
			dataList.add(R.drawable.pic_s3_22);
			dataList.add(R.drawable.pic_s3_23);
			dataList.add(R.drawable.pic_s3_24);
			dataList.add(R.drawable.pic_s3_25);
			dataList.add(R.drawable.pic_s3_26);
			dataList.add(R.drawable.pic_s3_27);
			dataList.add(R.drawable.pic_s3_28);
			dataList.add(R.drawable.pic_s3_29);
			dataList.add(R.drawable.pic_s3_30);
			dataList.add(R.drawable.pic_s3_31);
			dataList.add(R.drawable.pic_s3_20000);
			dataList.add(R.drawable.pic_s3_20001);
			dataList.add(R.drawable.pic_s3_20002);
			dataList.add(R.drawable.pic_s3_20003);
			dataList.add(R.drawable.pic_s3_20004);
			dataList.add(R.drawable.pic_s3_20005);
			dataList.add(R.drawable.pic_s3_20006);
			dataList.add(R.drawable.pic_s3_20007);
			dataList.add(R.drawable.pic_s3_20008);
			dataList.add(R.drawable.pic_s3_20009);
			dataList.add(R.drawable.pic_s3_20010);
			dataList.add(R.drawable.pic_s3_20011);
			dataList.add(R.drawable.pic_s3_20012);
			dataList.add(R.drawable.pic_s3_20013);
			dataList.add(R.drawable.pic_s3_20014);
			break;
		case 3:
			
			dataList.add(R.drawable.pic_s4_1);
			dataList.add(R.drawable.pic_s4_2);
			dataList.add(R.drawable.pic_s4_3);
			dataList.add(R.drawable.pic_s4_4);
			dataList.add(R.drawable.pic_s4_5);
			dataList.add(R.drawable.pic_s4_6);
			dataList.add(R.drawable.pic_s4_7);
			dataList.add(R.drawable.pic_s4_8);
			dataList.add(R.drawable.pic_s4_9);
			dataList.add(R.drawable.pic_s4_10);
			dataList.add(R.drawable.pic_s4_11);
			dataList.add(R.drawable.pic_s4_12);
			dataList.add(R.drawable.pic_s4_13);
			dataList.add(R.drawable.pic_s4_14);
			dataList.add(R.drawable.pic_s4_15);
			dataList.add(R.drawable.pic_s4_16);
			dataList.add(R.drawable.pic_s4_17);
			dataList.add(R.drawable.pic_s4_18);
			dataList.add(R.drawable.pic_s4_19);
			dataList.add(R.drawable.pic_s4_20);
			dataList.add(R.drawable.pic_s4_21);
			dataList.add(R.drawable.pic_s4_22);
			dataList.add(R.drawable.pic_s4_23);
			dataList.add(R.drawable.pic_s4_24);
			dataList.add(R.drawable.pic_s4_25);
			dataList.add(R.drawable.pic_s4_26);
			dataList.add(R.drawable.pic_s4_27);
			dataList.add(R.drawable.pic_s4_28);
			dataList.add(R.drawable.pic_s4_29);
			dataList.add(R.drawable.pic_s4_30);
			dataList.add(R.drawable.pic_s4_31);
			dataList.add(R.drawable.pic_s4_32);
			dataList.add(R.drawable.pic_s4_33);
			dataList.add(R.drawable.pic_s4_34);
			dataList.add(R.drawable.pic_s4_35);
			dataList.add(R.drawable.pic_s4_36);
			dataList.add(R.drawable.pic_s4_37);
			dataList.add(R.drawable.pic_s4_38);
			dataList.add(R.drawable.pic_s4_39);
			dataList.add(R.drawable.pic_s4_40);
			dataList.add(R.drawable.pic_s4_41);
			dataList.add(R.drawable.pic_s4_42);
			dataList.add(R.drawable.pic_s4_43);
			dataList.add(R.drawable.pic_s4_44);
			dataList.add(R.drawable.pic_s4_45);
			dataList.add(R.drawable.pic_s4_46);
			dataList.add(R.drawable.pic_s4_47);
			dataList.add(R.drawable.pic_s4_48);
			dataList.add(R.drawable.pic_s4_49);
			dataList.add(R.drawable.pic_s4_50);
			dataList.add(R.drawable.pic_s4_51);
			dataList.add(R.drawable.pic_s4_52);
			dataList.add(R.drawable.pic_s4_53);
			dataList.add(R.drawable.pic_s4_20000);
			dataList.add(R.drawable.pic_s4_20001);
			dataList.add(R.drawable.pic_s4_20002);
			dataList.add(R.drawable.pic_s4_20003);
			dataList.add(R.drawable.pic_s4_20004);
			dataList.add(R.drawable.pic_s4_20005);
			dataList.add(R.drawable.pic_s4_20006);
			dataList.add(R.drawable.pic_s4_20007);
			dataList.add(R.drawable.pic_s4_20008);
			dataList.add(R.drawable.pic_s4_20009);
			dataList.add(R.drawable.pic_s4_20010);
			dataList.add(R.drawable.pic_s4_20011);
			dataList.add(R.drawable.pic_s4_20012);
			dataList.add(R.drawable.pic_s4_20013);
			dataList.add(R.drawable.pic_s4_20014);
			break;
		case 4:
			dataList.add(R.drawable.pic_s5_1);
			dataList.add(R.drawable.pic_s5_2);
			dataList.add(R.drawable.pic_s5_3);
			dataList.add(R.drawable.pic_s5_4);
			dataList.add(R.drawable.pic_s5_5);
			dataList.add(R.drawable.pic_s5_6);
			dataList.add(R.drawable.pic_s5_7);
			dataList.add(R.drawable.pic_s5_8);
			dataList.add(R.drawable.pic_s5_9);
			dataList.add(R.drawable.pic_s5_10);
			dataList.add(R.drawable.pic_s5_11);
			dataList.add(R.drawable.pic_s5_12);
			dataList.add(R.drawable.pic_s5_13);
			dataList.add(R.drawable.pic_s5_14);
			dataList.add(R.drawable.pic_s5_15);
			dataList.add(R.drawable.pic_s5_16);
			dataList.add(R.drawable.pic_s5_17);
			dataList.add(R.drawable.pic_s5_18);
			dataList.add(R.drawable.pic_s5_19);
			dataList.add(R.drawable.pic_s5_20);
			dataList.add(R.drawable.pic_s5_21);
			dataList.add(R.drawable.pic_s5_22);
			dataList.add(R.drawable.pic_s5_23);
			dataList.add(R.drawable.pic_s5_24);
			dataList.add(R.drawable.pic_s5_25);
			dataList.add(R.drawable.pic_s5_26);
			dataList.add(R.drawable.pic_s5_27);
			dataList.add(R.drawable.pic_s5_28);
			dataList.add(R.drawable.pic_s5_29);
			dataList.add(R.drawable.pic_s5_30);
			dataList.add(R.drawable.pic_s5_31);
			dataList.add(R.drawable.pic_s5_32);
			dataList.add(R.drawable.pic_s5_33);
			dataList.add(R.drawable.pic_s5_34);
			dataList.add(R.drawable.pic_s5_35);
			dataList.add(R.drawable.pic_s5_36);
			dataList.add(R.drawable.pic_s5_37);
			dataList.add(R.drawable.pic_s5_38);
			dataList.add(R.drawable.pic_s5_39);
			dataList.add(R.drawable.pic_s5_40);
			dataList.add(R.drawable.pic_s5_41);
			dataList.add(R.drawable.pic_s5_42);
			dataList.add(R.drawable.pic_s5_43);
			dataList.add(R.drawable.pic_s5_44);
			dataList.add(R.drawable.pic_s5_45);
			dataList.add(R.drawable.pic_s5_46);
			dataList.add(R.drawable.pic_s5_47);
			dataList.add(R.drawable.pic_s5_48);
			dataList.add(R.drawable.pic_s5_49);
			dataList.add(R.drawable.pic_s5_50);
			dataList.add(R.drawable.pic_s5_51);
			dataList.add(R.drawable.pic_s5_52);
			dataList.add(R.drawable.pic_s5_53);
			dataList.add(R.drawable.pic_s5_54);
			dataList.add(R.drawable.pic_s5_55);
			dataList.add(R.drawable.pic_s5_56);
			dataList.add(R.drawable.pic_s5_57);
			dataList.add(R.drawable.pic_s5_58);
			dataList.add(R.drawable.pic_s5_59);
			dataList.add(R.drawable.pic_s5_60);
			dataList.add(R.drawable.pic_s5_61);
			dataList.add(R.drawable.pic_s5_62);
			dataList.add(R.drawable.pic_s5_63);
			dataList.add(R.drawable.pic_s5_64);
			dataList.add(R.drawable.pic_s5_65);
			dataList.add(R.drawable.pic_s5_66);
			dataList.add(R.drawable.pic_s5_67);
			dataList.add(R.drawable.pic_s5_68);
			dataList.add(R.drawable.pic_s5_69);
			dataList.add(R.drawable.pic_s5_70);
			dataList.add(R.drawable.pic_s5_71);
			dataList.add(R.drawable.pic_s5_72);
			dataList.add(R.drawable.pic_s5_73);
			dataList.add(R.drawable.pic_s5_74);
			dataList.add(R.drawable.pic_s5_75);
			dataList.add(R.drawable.pic_s5_76);
			dataList.add(R.drawable.pic_s5_77);
			dataList.add(R.drawable.pic_s5_78);
			dataList.add(R.drawable.pic_s5_79);
			dataList.add(R.drawable.pic_s5_80);
			dataList.add(R.drawable.pic_s5_81);
			dataList.add(R.drawable.pic_s5_82);
			dataList.add(R.drawable.pic_s5_83);
			dataList.add(R.drawable.pic_s5_84);
			dataList.add(R.drawable.pic_s5_85);
			dataList.add(R.drawable.pic_s5_86);
			dataList.add(R.drawable.pic_s5_87);
			dataList.add(R.drawable.pic_s5_88);
			dataList.add(R.drawable.pic_s5_89);
			dataList.add(R.drawable.pic_s5_90);
			dataList.add(R.drawable.pic_s5_91);
			dataList.add(R.drawable.pic_s5_92);
			dataList.add(R.drawable.pic_s5_93);
			dataList.add(R.drawable.pic_s5_94);
			dataList.add(R.drawable.pic_s5_95);
			dataList.add(R.drawable.pic_s5_96);
			dataList.add(R.drawable.pic_s5_97);
			dataList.add(R.drawable.pic_s5_98);
			dataList.add(R.drawable.pic_s5_99);
			dataList.add(R.drawable.pic_s5_100);
			dataList.add(R.drawable.pic_s5_101);
			dataList.add(R.drawable.pic_s5_102);
			dataList.add(R.drawable.pic_s5_20000);
			dataList.add(R.drawable.pic_s5_20001);
			dataList.add(R.drawable.pic_s5_20002);
			dataList.add(R.drawable.pic_s5_20003);
			dataList.add(R.drawable.pic_s5_20004);
			dataList.add(R.drawable.pic_s5_20005);
			dataList.add(R.drawable.pic_s5_20006);
			dataList.add(R.drawable.pic_s5_20007);
			dataList.add(R.drawable.pic_s5_20008);
			break;
		case 5:
			dataList.add(R.drawable.pic_s6_1);
			dataList.add(R.drawable.pic_s6_2);
			dataList.add(R.drawable.pic_s6_3);
			dataList.add(R.drawable.pic_s6_4);
			dataList.add(R.drawable.pic_s6_5);
			dataList.add(R.drawable.pic_s6_6);
			dataList.add(R.drawable.pic_s6_7);
			dataList.add(R.drawable.pic_s6_8);
			dataList.add(R.drawable.pic_s6_9);
			dataList.add(R.drawable.pic_s6_10);
			dataList.add(R.drawable.pic_s6_11);
			dataList.add(R.drawable.pic_s6_12);
			dataList.add(R.drawable.pic_s6_13);
			dataList.add(R.drawable.pic_s6_14);
			dataList.add(R.drawable.pic_s6_15);
			dataList.add(R.drawable.pic_s6_16);
			break;
		case 6:
			dataList.add(R.drawable.pic_s7_1);
			dataList.add(R.drawable.pic_s7_2);
			dataList.add(R.drawable.pic_s7_3);
			dataList.add(R.drawable.pic_s7_4);
			dataList.add(R.drawable.pic_s7_5);
			dataList.add(R.drawable.pic_s7_6);
			dataList.add(R.drawable.pic_s7_7);
			dataList.add(R.drawable.pic_s7_8);
			dataList.add(R.drawable.pic_s7_9);
			dataList.add(R.drawable.pic_s7_10);
			dataList.add(R.drawable.pic_s7_11);
			dataList.add(R.drawable.pic_s7_12);
			dataList.add(R.drawable.pic_s7_13);
			dataList.add(R.drawable.pic_s7_14);
			dataList.add(R.drawable.pic_s7_15);
			dataList.add(R.drawable.pic_s7_16);
			dataList.add(R.drawable.pic_s7_17);
			dataList.add(R.drawable.pic_s7_18);
			dataList.add(R.drawable.pic_s7_19);
			dataList.add(R.drawable.pic_s7_20);
			dataList.add(R.drawable.pic_s7_20000);
			dataList.add(R.drawable.pic_s7_20001);
			dataList.add(R.drawable.pic_s7_20002);
			dataList.add(R.drawable.pic_s7_20003);
			dataList.add(R.drawable.pic_s7_20004);
			dataList.add(R.drawable.pic_s7_20005);
			dataList.add(R.drawable.pic_s7_20006);
			dataList.add(R.drawable.pic_s7_20007);
			dataList.add(R.drawable.pic_s7_20008);
			break;
		case 7:
			dataList.add(R.drawable.pic_s8_1);
			dataList.add(R.drawable.pic_s8_2);
			dataList.add(R.drawable.pic_s8_3);
			dataList.add(R.drawable.pic_s8_4);
			dataList.add(R.drawable.pic_s8_5);
			dataList.add(R.drawable.pic_s8_6);
			dataList.add(R.drawable.pic_s8_7);
			dataList.add(R.drawable.pic_s8_8);
			dataList.add(R.drawable.pic_s8_9);
			dataList.add(R.drawable.pic_s8_10);
			dataList.add(R.drawable.pic_s8_11);
			dataList.add(R.drawable.pic_s8_12);
			dataList.add(R.drawable.pic_s8_13);
			dataList.add(R.drawable.pic_s8_14);
			dataList.add(R.drawable.pic_s8_15);
			dataList.add(R.drawable.pic_s8_16);
			dataList.add(R.drawable.pic_s8_17);
			dataList.add(R.drawable.pic_s8_18);
			dataList.add(R.drawable.pic_s8_19);
			dataList.add(R.drawable.pic_s8_20);
			dataList.add(R.drawable.pic_s8_21);
			dataList.add(R.drawable.pic_s8_22);
			dataList.add(R.drawable.pic_s8_23);
			dataList.add(R.drawable.pic_s8_24);
			dataList.add(R.drawable.pic_s8_25);
			dataList.add(R.drawable.pic_s8_26);
			dataList.add(R.drawable.pic_s8_27);
			dataList.add(R.drawable.pic_s8_28);
			dataList.add(R.drawable.pic_s8_29);
			dataList.add(R.drawable.pic_s8_30);
			dataList.add(R.drawable.pic_s8_31);
			dataList.add(R.drawable.pic_s8_32);
			dataList.add(R.drawable.pic_s8_33);
			dataList.add(R.drawable.pic_s8_34);
			dataList.add(R.drawable.pic_s8_35);
			dataList.add(R.drawable.pic_s8_36);
			dataList.add(R.drawable.pic_s8_37);
			dataList.add(R.drawable.pic_s8_38);
			dataList.add(R.drawable.pic_s8_39);
			dataList.add(R.drawable.pic_s8_40);
			dataList.add(R.drawable.pic_s8_20000);
			dataList.add(R.drawable.pic_s8_20001);
			dataList.add(R.drawable.pic_s8_20002);
			dataList.add(R.drawable.pic_s8_20003);
			dataList.add(R.drawable.pic_s8_20004);
			dataList.add(R.drawable.pic_s8_20005);
			dataList.add(R.drawable.pic_s8_20006);
			dataList.add(R.drawable.pic_s8_20007);
			dataList.add(R.drawable.pic_s8_20008);
			dataList.add(R.drawable.pic_s8_20000);
			dataList.add(R.drawable.pic_s8_20001);
			dataList.add(R.drawable.pic_s8_20002);
			dataList.add(R.drawable.pic_s8_20003);
			dataList.add(R.drawable.pic_s8_20004);
			dataList.add(R.drawable.pic_s8_20005);
			dataList.add(R.drawable.pic_s8_20006);
			dataList.add(R.drawable.pic_s8_20007);
			dataList.add(R.drawable.pic_s8_20008);
			dataList.add(R.drawable.pic_s8_20009);
			dataList.add(R.drawable.pic_s8_20011);
			dataList.add(R.drawable.pic_s8_20012);
			dataList.add(R.drawable.pic_s8_20013);
			dataList.add(R.drawable.pic_s8_20014);
			dataList.add(R.drawable.pic_s8_20015);
			dataList.add(R.drawable.pic_s8_20016);
			dataList.add(R.drawable.pic_s8_20017);
			dataList.add(R.drawable.pic_s8_20018);
			dataList.add(R.drawable.pic_s8_20020);
			dataList.add(R.drawable.pic_s8_20021);
			dataList.add(R.drawable.pic_s8_20022);
			dataList.add(R.drawable.pic_s8_20023);
			dataList.add(R.drawable.pic_s8_20024);
			dataList.add(R.drawable.pic_s8_20025);
			dataList.add(R.drawable.pic_s8_20026);
			dataList.add(R.drawable.pic_s8_20027);
			dataList.add(R.drawable.pic_s8_20028);
			dataList.add(R.drawable.pic_s8_20029);
			dataList.add(R.drawable.pic_s8_20031);
			dataList.add(R.drawable.pic_s8_20032);
			dataList.add(R.drawable.pic_s8_20033);
			dataList.add(R.drawable.pic_s8_20034);
			dataList.add(R.drawable.pic_s8_20035);
			dataList.add(R.drawable.pic_s8_20036);
			dataList.add(R.drawable.pic_s8_20037);
			dataList.add(R.drawable.pic_s8_20039);
			break;
		case 8:
			dataList.add(R.drawable.pic_s9_1);
			dataList.add(R.drawable.pic_s9_2);
			dataList.add(R.drawable.pic_s9_3);
			dataList.add(R.drawable.pic_s9_4);
			dataList.add(R.drawable.pic_s9_5);
			dataList.add(R.drawable.pic_s9_6);
			dataList.add(R.drawable.pic_s9_7);
			dataList.add(R.drawable.pic_s9_8);
			dataList.add(R.drawable.pic_s9_9);
			dataList.add(R.drawable.pic_s9_10);
			dataList.add(R.drawable.pic_s9_11);
			dataList.add(R.drawable.pic_s9_12);
			dataList.add(R.drawable.pic_s9_13);
			dataList.add(R.drawable.pic_s9_14);
			dataList.add(R.drawable.pic_s9_15);
			dataList.add(R.drawable.pic_s9_16);
			dataList.add(R.drawable.pic_s9_17);
			dataList.add(R.drawable.pic_s9_18);
			dataList.add(R.drawable.pic_s9_19);
			dataList.add(R.drawable.pic_s9_20);
			dataList.add(R.drawable.pic_s9_21);
			dataList.add(R.drawable.pic_s9_22);
			dataList.add(R.drawable.pic_s9_23);
			dataList.add(R.drawable.pic_s9_24);
			dataList.add(R.drawable.pic_s9_25);
			dataList.add(R.drawable.pic_s9_26);
			dataList.add(R.drawable.pic_s9_27);
			dataList.add(R.drawable.pic_s9_28);
			dataList.add(R.drawable.pic_s9_29);
			dataList.add(R.drawable.pic_s9_30);
			dataList.add(R.drawable.pic_s9_31);
			dataList.add(R.drawable.pic_s9_32);
			dataList.add(R.drawable.pic_s9_20000);
			dataList.add(R.drawable.pic_s9_20001);
			dataList.add(R.drawable.pic_s9_20002);
			dataList.add(R.drawable.pic_s9_20003);
			dataList.add(R.drawable.pic_s9_20004);
			dataList.add(R.drawable.pic_s9_20005);
			dataList.add(R.drawable.pic_s9_20006);
			dataList.add(R.drawable.pic_s9_20007);
			dataList.add(R.drawable.pic_s9_20008);
			dataList.add(R.drawable.pic_s9_20011);
			dataList.add(R.drawable.pic_s9_20012);
			dataList.add(R.drawable.pic_s9_20013);
			dataList.add(R.drawable.pic_s9_20014);
			dataList.add(R.drawable.pic_s9_20015);
			dataList.add(R.drawable.pic_s9_20016);
			dataList.add(R.drawable.pic_s9_20017);
			dataList.add(R.drawable.pic_s9_20018);
			dataList.add(R.drawable.pic_s9_20019);
			dataList.add(R.drawable.pic_s9_20011);
			dataList.add(R.drawable.pic_s9_20012);
			dataList.add(R.drawable.pic_s9_20013);
			dataList.add(R.drawable.pic_s9_20014);
			dataList.add(R.drawable.pic_s9_20015);
			dataList.add(R.drawable.pic_s9_20016);
			dataList.add(R.drawable.pic_s9_20017);
			dataList.add(R.drawable.pic_s9_20018);
			dataList.add(R.drawable.pic_s9_20020);
			dataList.add(R.drawable.pic_s9_20021);
			
			break;
		case 9:
			dataList.add(R.drawable.pic_s10_1);
			dataList.add(R.drawable.pic_s10_2);
			dataList.add(R.drawable.pic_s10_3);
			dataList.add(R.drawable.pic_s10_4);
			dataList.add(R.drawable.pic_s10_5);
			dataList.add(R.drawable.pic_s10_6);
			dataList.add(R.drawable.pic_s10_7);
			dataList.add(R.drawable.pic_s10_8);
			dataList.add(R.drawable.pic_s10_9);
			dataList.add(R.drawable.pic_s10_10);
			dataList.add(R.drawable.pic_s10_11);
			dataList.add(R.drawable.pic_s10_12);
			dataList.add(R.drawable.pic_s10_13);
			dataList.add(R.drawable.pic_s10_14);
			dataList.add(R.drawable.pic_s10_15);
			dataList.add(R.drawable.pic_s10_16);
			dataList.add(R.drawable.pic_s10_17);
			dataList.add(R.drawable.pic_s10_18);
			dataList.add(R.drawable.pic_s10_19);
			dataList.add(R.drawable.pic_s10_20);
			dataList.add(R.drawable.pic_s10_21);
			dataList.add(R.drawable.pic_s10_22);
			dataList.add(R.drawable.pic_s10_23);
			dataList.add(R.drawable.pic_s10_24);
			dataList.add(R.drawable.pic_s10_25);
			dataList.add(R.drawable.pic_s10_26);
			dataList.add(R.drawable.pic_s10_27);
			dataList.add(R.drawable.pic_s10_28);
			dataList.add(R.drawable.pic_s10_29);
			dataList.add(R.drawable.pic_s10_30);
			dataList.add(R.drawable.pic_s10_31);
			dataList.add(R.drawable.pic_s10_32);
			dataList.add(R.drawable.pic_s10_33);
			dataList.add(R.drawable.pic_s10_34);
			dataList.add(R.drawable.pic_s10_35);
			break;
		case 10:
			dataList.add(R.drawable.pic_s11_1);
			dataList.add(R.drawable.pic_s11_2);
			dataList.add(R.drawable.pic_s11_3);
			dataList.add(R.drawable.pic_s11_4);
			dataList.add(R.drawable.pic_s11_5);
			dataList.add(R.drawable.pic_s11_6);
			dataList.add(R.drawable.pic_s11_7);
			dataList.add(R.drawable.pic_s11_8);
			dataList.add(R.drawable.pic_s11_9);
			dataList.add(R.drawable.pic_s11_10);
			dataList.add(R.drawable.pic_s11_11);
			dataList.add(R.drawable.pic_s11_12);
			dataList.add(R.drawable.pic_s11_13);
			dataList.add(R.drawable.pic_s11_14);
			dataList.add(R.drawable.pic_s11_15);
			dataList.add(R.drawable.pic_s11_16);
			dataList.add(R.drawable.pic_s11_17);
			dataList.add(R.drawable.pic_s11_18);
			dataList.add(R.drawable.pic_s11_19);
			dataList.add(R.drawable.pic_s11_20);
			dataList.add(R.drawable.pic_s11_21);
			dataList.add(R.drawable.pic_s11_22);
			dataList.add(R.drawable.pic_s11_23);
			dataList.add(R.drawable.pic_s11_24);
			dataList.add(R.drawable.pic_s11_25);
			dataList.add(R.drawable.pic_s11_26);
			dataList.add(R.drawable.pic_s11_27);
			dataList.add(R.drawable.pic_s11_28);
			dataList.add(R.drawable.pic_s11_29);
			dataList.add(R.drawable.pic_s11_30);
			dataList.add(R.drawable.pic_s11_31);
			dataList.add(R.drawable.pic_s11_32);
			dataList.add(R.drawable.pic_s11_33);
			dataList.add(R.drawable.pic_s11_34);
			dataList.add(R.drawable.pic_s11_35);
			dataList.add(R.drawable.pic_s11_36);
			dataList.add(R.drawable.pic_s11_37);
			dataList.add(R.drawable.pic_s11_38);
			dataList.add(R.drawable.pic_s11_39);
			dataList.add(R.drawable.pic_s11_40);
			dataList.add(R.drawable.pic_s11_41);
			dataList.add(R.drawable.pic_s11_42);
			break;
		case 11:
			dataList.add(R.drawable.pic_s12_1);
			dataList.add(R.drawable.pic_s12_2);
			dataList.add(R.drawable.pic_s12_3);
			dataList.add(R.drawable.pic_s12_4);
			dataList.add(R.drawable.pic_s12_5);
			dataList.add(R.drawable.pic_s12_6);
			dataList.add(R.drawable.pic_s12_7);
			dataList.add(R.drawable.pic_s12_8);
			dataList.add(R.drawable.pic_s12_9);
			dataList.add(R.drawable.pic_s12_10);
			dataList.add(R.drawable.pic_s12_11);
			dataList.add(R.drawable.pic_s12_12);
			dataList.add(R.drawable.pic_s12_13);
			dataList.add(R.drawable.pic_s12_14);
			dataList.add(R.drawable.pic_s12_15);
			dataList.add(R.drawable.pic_s12_16);
			dataList.add(R.drawable.pic_s12_17);
			dataList.add(R.drawable.pic_s12_18);
			dataList.add(R.drawable.pic_s12_19);
			dataList.add(R.drawable.pic_s12_20);
			dataList.add(R.drawable.pic_s12_21);
			dataList.add(R.drawable.pic_s12_22);
			dataList.add(R.drawable.pic_s12_23);
			break;
		}
	}

	
	
}