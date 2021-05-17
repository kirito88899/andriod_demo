package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Amydater extends RecyclerView.Adapter<Amydater.MyViewHolder> {


    private List<Appbean>apps;
    private Context mcontext;


    public void setData(List<Appbean>apps){
        this.apps=apps;

        //更新数据
        notifyDataSetChanged();

    }

    //获取布局文件并转换为View文件
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_demo,parent,false);
        return new MyViewHolder(view);
    }

    //开始绑定数据
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Appbean app=apps.get(position);
        holder.textView.setText(app.getAppName());
        Drawable drawable= ContextCompat.getDrawable(null,R.drawable.left);
        holder.textView.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);

    }

    //获取数据的总量
    @Override
    public int getItemCount() {
        return apps == null ? 0 : apps.size();
    }


    //视图属性获得
    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView5);
        }
    }

}
