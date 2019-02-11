package com.example.yourname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.edittext1);
        bt1=(Button) findViewById(R.id.button1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String ms = ed1.getText().toString();

                    if (ms==null){
                        Toast.makeText(getApplicationContext(),"Invaled Input",Toast.LENGTH_LONG).show();
                    }else {
                        Intent ne = new Intent(MainActivity.this,Main2Activity.class);
                        ne.putExtra("NAME",ms);
                        startActivity(ne);
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invaled Input",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
