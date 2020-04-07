package com.bruce.allrecyclerview.databean;

import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.databean.BaseDataBean;

/**
 * 文本数据
 */
public class TextBean extends BaseDataBean {

    //时间
    private String time;
    //地址
    private String address;

    public TextBean(String time, String address){
        this.time = time;
        this.address = address;
        this.setItemViewType(ItemType.TYPE_TEXT);
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
