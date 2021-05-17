package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterMainActivity3 extends AppCompatActivity {

    private EditText user_name;
    private EditText password;
    private EditText passwordone;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_main3);

        Button button=findViewById(R.id.button);
        ImageView return1=findViewById(R.id.returnbutton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterMainActivity3.this,TestActivity.class);

                user_name=findViewById(R.id.username);
                password=findViewById(R.id.password);
                passwordone=findViewById(R.id.passwordone);
                email=findViewById(R.id.email);

                if ((user_name  == null || user_name.length() == 0) || (password  == null || password.length() == 0)  ){
                    //Toast 提示窗口
                    Toast.makeText(RegisterMainActivity3.this,"用户名和密码不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.equals(passwordone)){
                    //Toast 提示窗口
                    Toast.makeText(RegisterMainActivity3.this,"两次不一样",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (email  == null || email.length() == 0){
                    //Toast 提示窗口
                    Toast.makeText(RegisterMainActivity3.this,"邮箱不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(RegisterMainActivity3.this,"账户注册成功",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        return1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               finish();
            }
        });


    }
}