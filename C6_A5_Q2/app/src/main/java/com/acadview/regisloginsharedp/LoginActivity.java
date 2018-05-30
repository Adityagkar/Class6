package com.acadview.regisloginsharedp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        email = findViewById(R.id.textView6);
        password= findViewById(R.id.textView7);

        //Retrieve username and password using shared preferences :
        SharedPreferences settings = getSharedPreferences("mylogindata", Context.MODE_PRIVATE);
        String emailid_r = settings.getString("username", "");
        String password_r = settings.getString("password",null);

        email.setText(emailid_r);
        password.setText(password_r);
    }
}
