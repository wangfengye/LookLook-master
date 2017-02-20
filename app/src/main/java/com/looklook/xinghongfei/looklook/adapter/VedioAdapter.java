package com.looklook.xinghongfei.looklook.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.looklook.xinghongfei.looklook.Activity.VedioActivity;
import com.looklook.xinghongfei.looklook.R;
import com.looklook.xinghongfei.looklook.bean.meizi.Meizi;

import java.util.ArrayList;

/**
 * Created by fengye on 2016/9/12.
 */
public class VedioAdapter extends RecyclerView.Adapter<VedioAdapter.VedioHolder>{
    private Context mContext;
    private ArrayList<Meizi> mDatas;
    public VedioAdapter(Context context) {
        this.mContext=context;
        this.mDatas=new ArrayList<>();
    }

    @Override
    public VedioHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VedioHolder(LayoutInflater.from(mContext).inflate(R.layout.vedio_item,parent,false));
    }

    @Override
    public void onBindViewHolder(VedioHolder holder, final int position) {
        holder.mTextView.setText(mDatas.get(position).desc);
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mContext, VedioActivity.class);
                intent.putExtra("url",mDatas.get(position).getUrl());
                mContext.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class VedioHolder extends RecyclerView.ViewHolder{
    TextView mTextView;
        public VedioHolder(View itemView) {

            super(itemView);
            mTextView= (TextView) itemView.findViewById(R.id.vedio_text);
        }
    }
    public void addItems(ArrayList<Meizi> list) {
        mDatas.addAll(list);
        notifyDataSetChanged();
    }
}
