package com.bruce.allrecyerview.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bruce.allrecyerview.databean.BaseDataBean;
import com.bruce.allrecyerview.listener.MultiRecyclerViewListener;

import java.util.List;

/**
 * 支持多类型的RecyclerView
 * @param <T>
 */
public class MultiRecyclerViewAdapter<T extends BaseDataBean> extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context mContext;
    private List<T> mData;
    private MultiRecyclerViewListener listener;

    public MultiRecyclerViewAdapter(Context context, List<T> mData, MultiRecyclerViewListener listener) {
        this.mContext = context;
        this.mData = mData;
        this.listener = listener;
    }

    /**
     * 设置数据
     * @param mData
     */
    public void setData(List<T> mData){
        this.mData = mData;
    }

    /**
     * 设置Item类型
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        return listener.getItemViewType(position);
    }


    @Override
    public int getItemCount() {
        return mData != null ? mData.size() : 0;
    }

    /**
     * Item生成的地方
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return listener.onCreateViewHolder(parent, viewType);
    }

    /**
     * Item生成后，填充Item中的所有控件
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        listener.onBindViewHolder(holder, position);
    }

    /**
     * 支持 payloads，修改某Item的指定控件
     * @param holder
     * @param position
     * @param payloads
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        if(payloads != null && !payloads.isEmpty()){
            listener.onBindViewHolder(holder, position, payloads);
        }else{
            onBindViewHolder(holder, position);
        }
    }
}