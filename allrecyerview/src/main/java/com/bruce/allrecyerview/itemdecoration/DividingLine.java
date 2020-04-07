package com.bruce.allrecyerview.itemdecoration;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 分割线
 */
public class DividingLine extends RecyclerView.ItemDecoration {

    private int mDividerHeight = 0;//分割线的高度
    private int lineColor = Color.TRANSPARENT;//分割线颜色
    private Paint dividerPaint;

    public DividingLine(int mDividerHeight){
        this.mDividerHeight = mDividerHeight;
        initDividerPaint();
    }

    public DividingLine(int mDividerHeight, int color){
        this.mDividerHeight = mDividerHeight;
        this.lineColor = color;
        initDividerPaint();
    }

    /**
     * 初始化分割线画笔
     */
    private void initDividerPaint(){
        dividerPaint = new Paint();
        dividerPaint.setColor(lineColor);
        dividerPaint.setStyle(Paint.Style.FILL);
    }

    /**
     * 实现类似margin的效果
     * @param outRect
     * @param view
     * @param parent
     * @param state
     */
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(0, 0, 0, mDividerHeight);
    }

    @Override
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.onDraw(canvas, parent, state);
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View view = parent.getChildAt(i);
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            float left = view.getLeft();
            float right = view.getRight();
            float top = view.getBottom() + lp.bottomMargin;
            float bottom = view.getBottom() + mDividerHeight + lp.bottomMargin;
            canvas.drawRect(left, top, right, bottom, dividerPaint == null ? new Paint() : dividerPaint);
        }
    }
}
