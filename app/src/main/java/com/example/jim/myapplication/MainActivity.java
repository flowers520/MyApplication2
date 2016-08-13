package com.example.jim.myapplication;

import java.util.ArrayList;



import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

	ListView lv_view;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv_view = (ListView)findViewById(R.id.lv_view);

		phone p1 = new phone(R.drawable.wlf, "赵杰", "1511626201", "34491180");
		phone p2 = new phone(R.drawable.wx, "王旭", "1567530869", "296067140");
		phone p3 = new phone(R.drawable.ln, "蓝娜", "1327210136", "11560246");
		phone p4 = new phone(R.drawable.zzj, "赵志杰", "1567330777", "76399771");
		phone p5 = new phone(R.drawable.zy, "赵炎", "1810741707", "113759047");
		phone p6 = new phone(R.drawable.mjw, "毛基伟 ", "1867889601", "125188806");
		phone p7 = new phone(R.drawable.wlf, "王林锋", "1877359628", "80682010");
		phone p8 = new phone(R.drawable.cf, "陈飞", "1886733823", "29658292");
		phone p9 = new phone(R.drawable.ghp, "顾怀鹏", "132033592", "160224084");
		phone p10 = new phone(R.drawable.ghp, "顾雪阳", "1351411931", "107875490");
		phone p11 = new phone(R.drawable.sxj, "宋雪江", "1886316778", "84489593");
		phone p12 = new phone(R.drawable.gg, "高歌", "1867081790", "71982863");
		phone p13 = new phone(R.drawable.wjh, "王佳慧", "1511065399", "129605074");
		phone p14 = new phone(R.drawable.gxl, "葛学炼", "1886310280", "124779189");
		phone p15 = new phone(R.drawable.st, "舒婷", "1886731238", "64310226");
		phone p16 = new phone(R.drawable.chg, "成洪光", "1561384044", "8759671");
		phone p17 = new phone(R.drawable.jl, "蒋林", "1561636737", "236381465");
		phone p18 = new phone(R.drawable.dlg, "邓立根", "1827262802", "220909099");
		phone p19 = new phone(R.drawable.hqf, "贺奇丰", "1557313923", "98746070");
		phone p20 = new phone(R.drawable.ll, "刘陆", "1567411436", "7404984");
		phone p21 = new phone(R.drawable.lys, "龙玉书", "1567314121", "17393241");
		phone p22 = new phone(R.drawable.xyq, "许宇球", "1810334685", "44037999");
		phone p23 = new phone(R.drawable.zc, "邹超", "1867381787", "2905334");
		phone p24 = new phone(R.drawable.lfq, "梁发乾", "1567355654", "19105697");
		phone p25 = new phone(R.drawable.lxf, "尹晓峰", "1588686991", "91583217");
		phone p26 = new phone(R.drawable.wmf, "王明峰", "1868450613", "13368308");
		phone p27 = new phone(R.drawable.tzz, "汤泽众", "1886738692", "230662519");
		phone p28 = new phone(R.drawable.zc, "郑成 ", "1378633530", "47061142");
		phone p29 = new phone(R.drawable.xy, "向阳", "1577367153", "172063782");

		ArrayList<phone> arr = new ArrayList<phone>();

		arr.add(p1);arr.add(p2);arr.add(p3);arr.add(p4);arr.add(p5);arr.add(p6);arr.add(p7);
		arr.add(p8);arr.add(p9);arr.add(p10);arr.add(p11);arr.add(p12);arr.add(p13);arr.add(p14);
		arr.add(p15);arr.add(p16);arr.add(p17);arr.add(p18);arr.add(p19);arr.add(p20);arr.add(p21);
		arr.add(p22);arr.add(p23);arr.add(p24);arr.add(p25);arr.add(p26);arr.add(p27);arr.add(p28);
		arr.add(p29);

		phoneAdapter pa = new phoneAdapter();
		pa.al = arr;
		pa.ctx = this;

		lv_view.setAdapter(pa);


	}



}

