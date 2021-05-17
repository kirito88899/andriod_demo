package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;

public class QqDemo extends AppCompatActivity {

    private TextView inphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq_demo);

        inphoto=findViewById(R.id.iphonoto);

//        Intent intent=getIntent();
//        inphoto.setText(intent.getStringExtra("usr_name"));

            Intent intent= getIntent();
//            User user= (User) intent.getSerializableExtra("user");
        Account user=intent.getParcelableExtra("account");
            inphoto.setText(user.getIphone());


        LinearLayout btn1=findViewById(R.id.login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new  Intent(QqDemo.this,ActivityImg.class);
                startActivity(intent);
            }
        });

    }

    public void fun(View view){

    }

}