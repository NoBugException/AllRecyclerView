package com.bruce.allrecyclerview.holder;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bruce.allrecyclerview.R;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView picture;

    public ImageViewHolder(View itemView) {
        super(itemView);
        picture = itemView.findViewById(R.id.picture);

    }
}
