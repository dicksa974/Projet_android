package com.supsms.model;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.supsms.R;

/**
 * Created by Adeline on 27/01/2015.
 */
public class MessageAdapter extends BaseAdapter {

    private Context mContext;
    Cursor cursor;

    public MessageAdapter(Context context,Cursor cur) {
        super();
        mContext=context;
        cursor=cur;
    }

    public int getCount(){
        // return the number of records in cursor
        return cursor.getCount();
    }

    // getView method is called for each item of ListView
    public View getView(int position,  View view, ViewGroup parent)
    {
        // inflate the layout for each item of listView
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.message_row, null);

        // move the cursor to required position
        cursor.moveToPosition(position);

        // fetch the sender number and sms body from cursor
        String strNum = cursor.getString(cursor.getColumnIndex("address"));
        String strSMS = cursor.getString(cursor.getColumnIndex("body"));

        // get the reference of textViews
        TextView tvNum = (TextView)view.findViewById(R.id.tvNum);
        TextView tvSMS = (TextView)view.findViewById(R.id.tvSms);

        // Set the Sender number and smsBody to respective TextViews
        tvNum.setText(strNum);
        tvSMS.setText(strSMS);

        return view;
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
}