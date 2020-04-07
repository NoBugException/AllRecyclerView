package com.bruce.allrecyclerview.databean;

import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.databean.BaseDataBean;

/**
 * 图片数据
 */
public class ImageBean extends BaseDataBean {

    private String url;
    //时间
    private String time;
    //地址
    private String address;

    public ImageBean(String url, String time, String address){
        this.url = url;
        this.time = time;
        this.address = address;
        this.setItemViewType(ItemType.TYPE_IMAGE);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
