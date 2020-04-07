package com.bruce.allrecyclerview.databean;

import com.bruce.allrecyclerview.type.ItemType;
import com.bruce.allrecyerview.databean.BaseDataBean;

/**
 * 文本数据
 */
public class TextBean extends BaseDataBean {

    private String text;

    public TextBean(String text){
        this.text = text;
        this.setItemViewType(ItemType.TYPE_TEXT);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
