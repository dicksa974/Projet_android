package com.supsms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.supsms.R;

/**
 * Created by Adeline on 27/01/2015.
 */
public class LoginActivity extends Activity {

    EditText etUsername, etPswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPswd = (EditText) findViewById(R.id.etPswd);

        //récupération des champs LOGIN & PSWD
        final String strUsername = etUsername.getText().toString();
        final String strPswd = etPswd.getText().toString();

    Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View arg0) {
                Log.i("SupSms", "Bouton Login");
                Toast toast = Toast.makeText(getApplicationContext(),"Test",
                        Toast.LENGTH_SHORT);
                toast.show();

                //authentification user

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
