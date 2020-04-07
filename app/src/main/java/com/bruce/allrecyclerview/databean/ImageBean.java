package com.bruce.allrecyclerview.databean;

import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.databean.BaseDataBean;

/**
 * 图片数据
 */
public class ImageBean extends BaseDataBean {

    private String url;

    public ImageBean(String url){
        this.url = url;
        this.setItemViewType(ItemType.TYPE_IMAGE);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
