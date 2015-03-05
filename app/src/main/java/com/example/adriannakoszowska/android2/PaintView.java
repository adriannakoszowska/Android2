package com.example.adriannakoszowska.android2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;

public class PaintView extends SurfaceView implements SurfaceHolder.Callback {

    ArrayList<RectF> punkty;

    public PaintView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public PaintView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub
    }

    public void surfaceCreated(SurfaceHolder arg0) {
        // TODO Auto-generated method stub
    }

    public void surfaceDestroyed(SurfaceHolder arg0) {
        // TODO Auto-generated method stub
    }
    public boolean onTouchEvent(MotionEvent event) {
        RectF oval = new RectF(event.getX()-50, event.getY()-50, event.getX() + 50, event.getY() + 50);
        punkty.add(oval);
        invalidate();

        return true;
    }

    protected void onDraw(Canvas canvas) {
    }

}