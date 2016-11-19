package com.example.rainiell.intentbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buclick(View view) {
        EditText txtuser = (EditText) findViewById(R.id.etusername);
        EditText txtpass = (EditText) findViewById(R.id.etpassword);
        Intent myintent = new Intent(this, Main2Activity.class);
        Bundle b= new Bundle();
        b.putString("username", txtuser.getText().toString());
        b.putString("password", txtpass.getText().toString());
        myintent.putExtras(b);
        startActivity(myintent);
    }
}

