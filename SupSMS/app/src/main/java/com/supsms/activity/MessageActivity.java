package com.supsms.activity;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.supsms.R;
import com.supsms.model.MessageAdapter;

/**
 * Created by Adeline on 27/01/2015.
 */

public class MessageActivity extends Activity {

    ListView lvMsg;
    Cursor cursor;
    MessageAdapter msgAdapter;
    Context context;

    Button btn_Inbox, btn_Sent, btn_Backup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        context = this;
        lvMsg = (ListView) findViewById(R.id.lvMessage);

        btn_Backup = (Button) findViewById(R.id.btnBackup);
        btn_Backup.setVisibility(View.INVISIBLE);

        btn_Inbox = (Button) findViewById(R.id.btnInbox);
        btn_Inbox.setOnClickListener(btn_listener);

        btn_Sent = (Button) findViewById(R.id.btnSentBox);
        btn_Sent.setOnClickListener(btn_listener);

    }
        public View.OnClickListener btn_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (v == btn_Inbox) {
                    Log.i("SupSms", "Inbox");
                    Toast toast = Toast.makeText(getApplicationContext(), "SMS reçus", Toast.LENGTH_SHORT);
                    toast.show();

                    cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);

                    msgAdapter = new MessageAdapter(context, cursor); //création MessageAdapter

                    lvMsg.setAdapter(msgAdapter); // Adapter dans la listview

                    btn_Backup.setVisibility(View.VISIBLE);

                }

                if (v == btn_Sent) {
                    Log.i("SupSms", "Sent");
                    Toast toast = Toast.makeText(getApplicationContext(), "SMS envoyés", Toast.LENGTH_SHORT);
                    toast.show();

                    cursor = getContentResolver().query(Uri.parse("content://sms/sent"), null, null, null, null);

                    msgAdapter = new MessageAdapter(context, cursor); //création MessageAdapter

                    lvMsg.setAdapter(msgAdapter); // Adapter dans la listview

                    btn_Backup.setVisibility(View.VISIBLE);

                }

            }
        };
    }