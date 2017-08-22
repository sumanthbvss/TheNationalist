package com.sumanth.thenationalist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suman on 3/27/2017.
 */

final class GridAdapter extends BaseAdapter {
    private  String[] mItems ;
    //private final LayoutInflater mInflater;
    Context mContext;

    public GridAdapter(Context context, String[] itemList) {
        //mInflater = LayoutInflater.from(context);
        mContext = context;
        mItems = itemList;

    }



    @Override
    public int getCount() {
        return mItems.length;
    }

    @Override
    public String getItem(int i) {
        return mItems[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(mContext);

            // get layout from grid)item.xml
            gridView = inflater.inflate(R.layout.grid_item, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.text);
            //textView.setText(mobileValues[position]);

            textView.setText(mItems[position]);



            // set image based on selected text
            ImageView imageView = (ImageView) gridView.findViewById(R.id.picture);

            imageView.setImageResource(R.drawable.ic_menu_camera);
//            String mobile = mobileValues[position];
//
//            if (mobile.equals("Windows")) {
//                imageView.setImageResource(R.drawable.windows_logo);
//            } else if (mobile.equals("iOS")) {
//                imageView.setImageResource(R.drawable.ios_logo);
//            } else if (mobile.equals("Blackberry")) {
//                imageView.setImageResource(R.drawable.blackberry_logo);
//            } else {
//                imageView.setImageResource(R.drawable.android_logo);
//            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    public static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
