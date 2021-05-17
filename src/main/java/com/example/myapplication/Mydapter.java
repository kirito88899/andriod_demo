package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Mydapter extends RecyclerView.Adapter<Mydapter.MyViewHolder> {

    private List<AppEntity>apps;

    public void setData(List<AppEntity>apps){
        this.apps=apps;
        //刷新数据
        notifyDataSetChanged();
    }

    public Mydapter(FragmentActivity activity, List<AppEntity> appEntityList) {
        this.apps=appEntityList;

    }

    public Mydapter() {

    }

    //获取显示的布局
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //拿到item布局文件，把布局转化为View对象
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view,parent,false);
        return new MyViewHolder(view);
    }

    //绑定数据
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AppEntity app=apps.get(position);
        holder.Rank.setText(String.valueOf(app.getRank()));
        holder.AppName.setText((CharSequence) app.getAppName());
        int status = app.getStatus();
        if (status==0){
        holder.Status.setText("安装");
        }else{
            holder.Status.setText("更新");
        }
        holder.Size.setText(app.getSize());
        holder.Download.setText(app.getDownloadCount());
        holder.Image.setImageResource(app.getImage());
    }

    @Override
    public int getItemCount() {
        return apps == null ? 0 : apps.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Rank;
        TextView AppName;
        TextView Status;
        TextView Size;
        TextView Download;
        ImageView Image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Rank=itemView.findViewById(R.id.Rank);
            AppName=itemView.findViewById(R.id.appName);
            Status=itemView.findViewById(R.id.status);
            Size=itemView.findViewById(R.id.Size);
            Download=itemView.findViewById(R.id.Download);
            Image=itemView.findViewById(R.id.tv_image);
        }
    }

}
