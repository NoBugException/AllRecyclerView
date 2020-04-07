package com.bruce.allrecyclerview.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bruce.allrecyclerview.R;

public class TextViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_time;
    public TextView tv_address;

    public TextViewHolder(View itemView) {
        super(itemView);
        tv_time = itemView.findViewById(R.id.tv_time);
        tv_address = itemView.findViewById(R.id.tv_address);
    }

}