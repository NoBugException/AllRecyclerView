package com.bruce.allrecyerview.listener;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public interface MultiRecyclerViewListener<T> {

    int getItemViewType(int position);

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position);

    void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List<Object> payloads);

}
