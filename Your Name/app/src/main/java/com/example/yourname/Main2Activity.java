package com.example.yourname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView te;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        te=(TextView) findViewById(R.id.textview1);
        Intent in = getIntent();

        String ms1 = in.getStringExtra("NAME");
        te.setText(ms1);
    }
}
