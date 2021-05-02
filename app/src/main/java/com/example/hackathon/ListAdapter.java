package com.example.hackathon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<TheList> list ;
    Context context;

    public ListAdapter(ArrayList<TheList> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();

    }

    @Override
    public Object getItem(int position) {
        return list.get(position);

    }


    @Override
    public long getItemId(int position) {
        return 0;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listcell,parent,false);

        TextView element = rowView.findViewById(R.id.TextView);
     //   TextView rmz = rowView.findViewById(R.id.textView3);
     //   ImageView img = rowView.findViewById(R.id.imageView);


        element.setText(list.get(position).getElement());
    //    rmz.setText(list.get(position).getRmz());
     //img.setImageResource(list.get(position).getImageRefrence());

        return rowView;

    }
}