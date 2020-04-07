package com.bruce.allrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bruce.allrecyclerview.databean.ImageBean;
import com.bruce.allrecyclerview.databean.TextBean;
import com.bruce.allrecyclerview.holder.ImageViewHolder;
import com.bruce.allrecyclerview.holder.TextViewHolder;
import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.adapter.MultiRecyclerViewAdapter;
import com.bruce.allrecyerview.databean.BaseDataBean;
import com.bruce.allrecyerview.listener.MultiRecyclerViewListener;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MultiRecyclerViewAdapter adapter;
    private TextView head_time, head_address;
    private RelativeLayout rl_head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        head_time = findViewById(R.id.head_time);
        head_address = findViewById(R.id.head_address);
        rl_head = findViewById(R.id.rl_head);

        mRecyclerView = findViewById(R.id.recycler_view);

        final List<BaseDataBean> list = new ArrayList<>();
        list.add(new TextBean("2020年4月7日", "江苏盐城"));
        list.add(new ImageBean("http://www.17qq.com/img_qqtouxiang/75200019.jpeg", "2020年4月7日", "江苏盐城"));
        list.add(new ImageBean("http://www.xinhuanet.com//foto/2017-04/26/129575007_14931880312131n.jpg", "2020年4月7日", "江苏盐城"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg", "2020年4月7日", "江苏盐城"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg", "2020年4月7日", "江苏盐城"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg", "2020年4月7日", "江苏盐城"));
        list.add(new TextBean("2020年4月8日", "江苏南京"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2011/05/25/249fe9d0a44e4d1daf28ba20f96930f2.jpg", "2020年4月8日", "江苏南京"));
        list.add(new ImageBean("http://www.hb.chinanews.com/photo/2013/1105/U4P1T52D145F1033DT20131105102009.jpg", "2020年4月8日", "江苏南京"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg", "2020年4月8日", "江苏南京"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg", "2020年4月8日", "江苏南京"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg", "2020年4月8日", "江苏南京"));
        list.add(new TextBean("2020年4月9日", "江苏盐城"));
        list.add(new ImageBean("http://www.hb.chinanews.com/photo/2013/1105/U4P1T52D145F1033DT20131105102009.jpg", "2020年4月9日", "江苏盐城"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg", "2020年4月9日", "江苏盐城"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg", "2020年4月9日", "江苏盐城"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg", "2020年4月9日", "江苏盐城"));
        list.add(new TextBean("2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.nipic.com/2008-05-06/200856201542395_2.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://gz.people.com.cn/mediafile/201110/12/F201110121633301826600704.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://imgpic.gmw.cn/dt/2012-02/15/20120215143754_7556.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://img14.360buyimg.com/n1/jfs/t20803/318/567017352/327934/3f2fc045/5b11e4c4N9b82a9ae.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://news.cri.cn/gb/mmsource/images/2007/09/21/em070921050.jpg", "2020年4月10日", "江苏南京"));
        list.add(new ImageBean("http://pic.wenwen.soso.com/p/20110311/20110311153941-1798960341.jpg", "2020年4月10日", "江苏南京"));
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

        //mRecyclerView.addItemDecoration(new DividingLine(10, Color.RED));

        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                TextBean current = null;
                //获取RecyclerView顶部view
                View stickyView = recyclerView.getChildAt(0);
                //获取下级View
                View underView = recyclerView.findChildViewUnder(rl_head.getMeasuredWidth() / 2, rl_head.getMeasuredHeight() + 1);
                int textPosition = 0;
                Object object = stickyView.getTag(R.string.tag_recyclerbean);
                if(object instanceof TextBean){
                    current = (TextBean) object;
                    rl_head.setTranslationY(0);
                    if(stickyView.getTop() < 0){
                        rl_head.setVisibility(View.VISIBLE);
                        stickyView.setVisibility(View.INVISIBLE);
                        head_time.setText(current.getTime());
                        head_address.setText(current.getAddress());
                    }else if(stickyView.getTop() == 0){
                        rl_head.setVisibility(View.GONE);
                        stickyView.setVisibility(View.VISIBLE);
                    }else{
                        //永远不可能大于0
                    }
                }else{
                    if(underView != null && underView.getTag(R.string.tag_recyclerbean) instanceof TextBean){
                        if(underView.getTop() < rl_head.getBottom()){
                            rl_head.setTranslationY(underView.getTop() - rl_head.getBottom());
                        }
                        underView.setVisibility(View.VISIBLE);
                        rl_head.setVisibility(View.VISIBLE);
                    }

                    if(stickyView != null && stickyView.getTag(R.string.tag_recyclerbean) instanceof ImageBean){
                        ImageBean imageBean = (ImageBean) stickyView.getTag(R.string.tag_recyclerbean);
                        head_time.setText(imageBean.getTime());
                        head_address.setText(imageBean.getAddress());
                    }

                }
            }
        });

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

                myholder.itemView.setTag(R.string.tag_position, position);

                if(myholder instanceof TextViewHolder){
                    TextViewHolder holder = (TextViewHolder) myholder;
                    TextBean textBean = (TextBean) list.get(position);
                    holder.tv_time.setText(textBean.getTime() == null ? "" : textBean.getTime());
                    holder.tv_address.setText(textBean.getAddress() == null ? "" : textBean.getAddress());
                    holder.itemView.setTag(R.string.tag_recyclerbean, textBean);
                }else if(myholder instanceof ImageViewHolder){
                    ImageViewHolder holder = (ImageViewHolder) myholder;
                    ImageBean pictureBean = (ImageBean) list.get(position);
                    Glide.with(MainActivity.this).load(pictureBean.getUrl()).into(holder.picture);
                    holder.itemView.setTag(R.string.tag_recyclerbean, pictureBean);
                }
            }
        });
        mRecyclerView.setAdapter(adapter);

    }
}
