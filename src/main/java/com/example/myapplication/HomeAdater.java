package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HomeAdater extends RecyclerView.Adapter <HomeAdater.HomeViewHolder> {


    private List<HomeList> apps;

    public void setData(List<HomeList>apps){
        this.apps=apps;
        //刷新数据
        notifyDataSetChanged();
    }

    //获取布局文件并转换为View文件
    @NonNull
    @NotNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_view,parent,false);
        return new HomeViewHolder(view);
    }

    //开始绑定数据
    @Override
    public void onBindViewHolder(@NonNull @NotNull HomeViewHolder holder, int position) {
        HomeList app=apps.get(position);
        holder.county.setText(String.valueOf(app.getCt()));
        holder.timeone.setText(String.valueOf(app.getTto()));

    }

    //获取数据的总量
    @Override
    public int getItemCount() {
        return apps == null ? 0 : apps.size();
    }


    //获取视图标签属性
    static class HomeViewHolder extends RecyclerView.ViewHolder{
        private TextView county;
        private TextView timeone;

        public HomeViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            county=itemView.findViewById(R.id.county);
            timeone=itemView.findViewById(R.id.time_one);
        }
    }
}
