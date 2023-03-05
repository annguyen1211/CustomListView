package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context;

    ArrayList<Monhoc> data;

    public MyAdapter(Context context, ArrayList<Monhoc> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.custom_items, viewGroup, false);  // co dinh giao dien con giong giao dien cha
        ImageView imgMH = view.findViewById(R.id.imgMH);
        TextView txtMH = view.findViewById(R.id.txtMH);
        TextView txtTC = view.findViewById(R.id.txtTC);

        imgMH.setImageResource(data.get(i).getIdAnh());
        txtMH.setText(data.get(i).getTenMH());
        txtTC.setText(String.valueOf(data.get(i).getSoTC()));
        return view;

    }
}
