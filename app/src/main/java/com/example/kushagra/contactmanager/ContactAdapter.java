package com.example.kushagra.contactmanager;

/**
 * Created by Kushagra on 15/08/16.
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ContactAdapter extends BaseAdapter {

        public List<User> _data;
        private ArrayList<User> arraylist;
        Context _c;
        ViewHolder v;

        public ContactAdapter(List<User> selectUsers, Context context) {
            _data = selectUsers;
            _c = context;
            this.arraylist = new ArrayList<User>();
            this.arraylist.addAll(_data);
        }

        @Override
        public int getCount() {
            return _data.size();
        }

        @Override
        public Object getItem(int i) {
            return _data.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View view = convertView;
            if (view == null) {
                LayoutInflater li = (LayoutInflater) _c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = li.inflate(R.layout.contact, null);
                Log.e("Inside", "here--------------------------- In view1");
            } else {
                view = convertView;
                Log.e("Inside", "here--------------------------- In view2");
            }

            v = new ViewHolder();
            Log.v("kush",v.toString());
            v.name = (TextView) view.findViewById(R.id.name);
            v.phone = (TextView) view.findViewById(R.id.no);
            v.imageView = (ImageView) view.findViewById(R.id.pic);
            Log.v("kush",v.name.toString());

            final User data = (User) _data.get(i);
            v.name.setText(data.getName());
            v.phone.setText(data.getPhone());

            // Set image if exists
            try {

                if (data.getThumb() != null) {
                    v.imageView.setImageBitmap(data.getThumb());
                } else {
                    v.imageView.setImageResource(R.drawable.contact_image);
                }
            } catch (OutOfMemoryError e) {
                // Add default picture
                v.imageView.setImageDrawable(this._c.getDrawable(R.drawable.contact_image));
                e.printStackTrace();
            }

            Log.e("Image Thumb", "--------------" + data.getThumb());

            view.setTag(data);
            return view;
        }
    static class ViewHolder {
        ImageView imageView;
        TextView name, phone;
    }

    }


