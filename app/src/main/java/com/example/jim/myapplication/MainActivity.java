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

		phone p1 = new phone(R.drawable.wlf, "赵杰", "15116262013", "344911805");
		phone p2 = new phone(R.drawable.wx, "王旭", "15675308690", "2960607140");
		phone p3 = new phone(R.drawable.ln, "蓝娜", "13272101360", "1156031246");
		phone p4 = new phone(R.drawable.zzj, "赵志杰", "15673307787", "763949771");
		phone p5 = new phone(R.drawable.zy, "赵炎", "18107417407", "1137539047");
		phone p6 = new phone(R.drawable.mjw, "毛基伟 ", "18670889601", "1256188806");
		phone p7 = new phone(R.drawable.wlf, "王林锋", "18773359628", "806882010");
		phone p8 = new phone(R.drawable.cf, "陈飞", "18867336823", "296584292");
		phone p9 = new phone(R.drawable.ghp, "顾怀鹏", "1320333592", "1602254084");
		phone p10 = new phone(R.drawable.ghp, "顾雪阳", "13517411931", "1071875490");
		phone p11 = new phone(R.drawable.sxj, "宋雪江", "18867316778", "841489593");
		phone p12 = new phone(R.drawable.gg, "高歌", "18670891790", "719828863");
		phone p13 = new phone(R.drawable.wjh, "王佳慧", "15116065399", "1296605074");
		phone p14 = new phone(R.drawable.gxl, "葛学炼", "18867310280", "1240779189");
		phone p15 = new phone(R.drawable.st, "舒婷", "18867312238", "643102126");
		phone p16 = new phone(R.drawable.chg, "成洪光", "15616384044", "87599671");
		phone p17 = new phone(R.drawable.jl, "蒋林", "15616366737", "2363814265");
		phone p18 = new phone(R.drawable.dlg, "邓立根", "18273262802", "2209709099");
		phone p19 = new phone(R.drawable.hqf, "贺奇丰", "15573313923", "987426070");
		phone p20 = new phone(R.drawable.ll, "刘陆", "15674116436", "740491884");
		phone p21 = new phone(R.drawable.lys, "龙玉书", "15673314121", "173793241");
		phone p22 = new phone(R.drawable.xyq, "许宇球", "18107334685", "447037999");
		phone p23 = new phone(R.drawable.zc, "邹超", "18673819787", "29053834");
		phone p24 = new phone(R.drawable.lfq, "梁发乾", "15673355654", "191055697");
		phone p25 = new phone(R.drawable.lxf, "尹晓峰", "15886386991", "915833217");
		phone p26 = new phone(R.drawable.wmf, "王明峰", "18684540613", "1336468308");
		phone p27 = new phone(R.drawable.tzz, "汤泽众", "18867318692", "2306862519");
		phone p28 = new phone(R.drawable.zc, "郑成 ", "13786303530", "470612142");
		phone p29 = new phone(R.drawable.xy, "向阳", "15773671153", "1720673782");

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

