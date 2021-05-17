package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class TestActivity extends AppCompatActivity {

    private EditText user_name;
    private EditText pwd;
    private Activity mActivity;
    // 将从此URL加载网络图片。
    private String img_url = "http://avatar.csdn.net/9/7/A/1_zhangphil.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        int sizeOfText = (int) this.getResources().getDimension(R.dimen.Text_size);

        user_name=findViewById(R.id.username);
        pwd=findViewById(R.id.pwd);
        Button btn=findViewById(R.id.tv_loing);
        Button rts=findViewById(R.id.restion);

        rts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestActivity.this,RegisterMainActivity3.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TestActivity.this,ListBottomMainActivity.class);


                if ((user_name  == null || user_name.length() == 0) || (pwd  == null || pwd.length() == 0) ){
                    //Toast 提示窗口
                    Toast.makeText(TestActivity.this,"用户名和密码不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }

                String usr_name=user_name.getText().toString();
                String pwd_one=pwd.getText().toString();
//                User user=new User();
//                user.setUser_name(usr_name);
//                user.setPwd(pwd_one);
//                intent.putExtra("user",user);
                Account account=new Account();
                account.setIphone(usr_name);
                account.setPwd(pwd_one);
                intent.putExtra("account",account);
                startActivity(intent);

            }
        });



    }
}