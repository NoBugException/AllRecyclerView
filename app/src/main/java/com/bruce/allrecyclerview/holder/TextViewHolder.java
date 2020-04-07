package com.bruce.allrecyclerview.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bruce.allrecyclerview.R;

public class TextViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_text;

    public TextViewHolder(View itemView) {
        super(itemView);
        tv_text = itemView.findViewById(R.id.tv_text);

    }

}