package com.example.dell_12.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= (TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String username=bundle.getString("username");
        textView.setText("Welcome!\n"+username);

    }
}