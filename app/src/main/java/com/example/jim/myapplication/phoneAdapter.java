package com.example.jim.myapplication;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class phoneAdapter extends BaseAdapter {
    ArrayList<phone> al;
    Context ctx;

    public int getCount() {
        return al.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = View.inflate(ctx, R.layout.phone, null);

        ImageView photo = (ImageView)convertView.findViewById(R.id.iv_image);
        TextView name = (TextView)convertView.findViewById(R.id.tv_name);
        TextView num = (TextView)convertView.findViewById(R.id.tv_num);
        TextView qq = (TextView)convertView.findViewById(R.id.tv_qq);
        Button dx = (Button)convertView.findViewById(R.id.button_Dx);
        Button dh = (Button)convertView.findViewById(R.id.button_Dh);
        
        final phone p = al.get(position);

        photo.setImageResource(p.photo);
        name.setText(p.name);
        num.setText(p.num);
        qq.setText(p.qq);
        
        if (position%2==1){
            convertView.setBackgroundColor(Color.argb(255, 80, 80, 80));
        }

        //短信
        dx.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //创建电话号码
                String tel = p.num;
                //发短信
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("smsto://"+tel));
                ctx.startActivity(intent);

            }
        });
        //电话
        dh.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //创建电话号码
                String tel = p.num;
                //打电话
                Intent intent = new Intent("android.intent.action.CALL");
                intent.setData(Uri.parse("tel:"+tel));
                ctx.startActivity(intent);

            }
        });

        return convertView;
    }


}
