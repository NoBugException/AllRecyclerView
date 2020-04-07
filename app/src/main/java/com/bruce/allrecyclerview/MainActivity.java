package com.bruce.allrecyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bruce.allrecyclerview.databean.ImageBean;
import com.bruce.allrecyclerview.databean.TextBean;
import com.bruce.allrecyclerview.holder.ImageViewHolder;
import com.bruce.allrecyclerview.holder.TextViewHolder;
import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.adapter.MultiRecyclerViewAdapter;
import com.bruce.allrecyerview.databean.BaseDataBean;
import com.bruce.allrecyerview.itemdecoration.DividingLine;
import com.bruce.allrecyerview.listener.MultiRecyclerViewListener;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MultiRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);

        final List<BaseDataBean> list = new ArrayList<>();
        list.add(new TextBean("2020年4月7日"));
        list.add(new ImageBean("http://www.17qq.com/img_qqtouxiang/75200019.jpeg"));
        list.add(new ImageBean("http://www.xinhuanet.com//foto/2017-04/26/129575007_14931880312131n.jpg"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg"));
        list.add(new TextBean("2020年4月8日"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2011/05/25/249fe9d0a44e4d1daf28ba20f96930f2.jpg"));
        list.add(new ImageBean("http://www.hb.chinanews.com/photo/2013/1105/U4P1T52D145F1033DT20131105102009.jpg"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg"));
        list.add(new TextBean("2020年4月9日"));
        list.add(new ImageBean("http://www.hb.chinanews.com/photo/2013/1105/U4P1T52D145F1033DT20131105102009.jpg"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg"));
        list.add(new TextBean("2020年4月10日"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg"));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 4);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                BaseDataBean dataBean = list.get(position);
                if(dataBean.getItemViewType() == ItemType.TYPE_TEXT){
                    return 4;
                }else{
                    return 1;
                }

            }
        });
        mRecyclerView.setLayoutManager(gridLayoutManager);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.addItemDecoration(new DividingLine(10, Color.RED));

        adapter = new MultiRecyclerViewAdapter(MainActivity.this, list, new MultiRecyclerViewListener<BaseDataBean>() {
            @Override
            public int getItemViewType(int position) {
                int itemViewType = 0;
                if(list != null && list.size() > 0){
                    itemViewType = list.get(position).getItemViewType();
                }
                return itemViewType;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View itemView = null;
                RecyclerView.ViewHolder holder = null;
                switch (viewType){
                    case ItemType.TYPE_TEXT:
                        itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.text_layout, parent, false);
                        holder = new TextViewHolder(itemView);
                        break;
                    case ItemType.TYPE_IMAGE:
                        itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.image_layout, parent, false);
                        holder = new ImageViewHolder(itemView);
                        break;

                }
                return holder;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder myholder, int position, @NonNull List<Object> payloads) {

            }

            @Override
            public void onBindViewHolder(final RecyclerView.ViewHolder myholder, final int position) {

                if(myholder instanceof TextViewHolder){
                    TextViewHolder holder = (TextViewHolder) myholder;
                    TextBean textBean = (TextBean) list.get(position);
                    holder.tv_text.setText(textBean.getText() == null ? "" : textBean.getText());
                }else if(myholder instanceof ImageViewHolder){
                    ImageViewHolder holder = (ImageViewHolder) myholder;
                    ImageBean pictureBean = (ImageBean) list.get(position);
                    Glide.with(MainActivity.this).load(pictureBean.getUrl()).into(holder.picture);

                }
            }
        });
        mRecyclerView.setAdapter(adapter);

    }
}
