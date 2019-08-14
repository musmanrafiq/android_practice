package com.dev.neo.androidlearning;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<UserModel> {

    private Activity context;
    private ArrayList<UserModel> list;

    public UserAdapter(Activity context, ArrayList<UserModel> data){
        super(context, R.layout.user_list_item, data);

        this.context = context;
        this.list = data;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        UserModel itemData = list.get(position);

        if (convertView == null) {
            LayoutInflater i = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = (View) i.inflate(R.layout.user_list_item, parent, false);
        }


        TextView userFullName = convertView.findViewById(R.id.fullname);
        userFullName.setText(itemData.getFullName());


        return convertView;
    }
}
