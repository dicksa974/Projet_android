package com.supsms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.supsms.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSMS = (Button) findViewById(R.id.btnSMS);
        btnSMS.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0) {
                Log.i("SupSms", "Bouton SMS");
                Toast toast = Toast.makeText(getApplicationContext(),"Test",
                        Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        Button btnContact = (Button) findViewById(R.id.btnContact);
        btnContact.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0) {
                Log.i("SupSms", "Bouton Contact");
                Toast toast = Toast.makeText(getApplicationContext(),"Test",
                        Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
