package com.example.adriannakoszowska.android2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;

public class PaintView extends SurfaceView implements SurfaceHolder.Callback {

    ArrayList<ObiektDoNarysowania> punkty;
    Paint paint = new Paint();
    private int color;
    private int rozmiar;

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        punkty = new ArrayList<ObiektDoNarysowania>();
        paint = new Paint();
        color = Color.RED;
    }

    @Override
    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub
    }

    @Override
    public void surfaceCreated(SurfaceHolder arg0) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        RectF oval = new RectF(event.getX() - 30, event.getY() - 30, event.getX() + 30, event.getY() + 30);
        punkty.add(new ObiektDoNarysowania(color, oval));
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        for (ObiektDoNarysowania punkt : punkty) {
            paint.setColor(punkt.kolor);
            canvas.drawOval(punkt.figura, paint);
        }

    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setRozmiar(int progress) {
        rozmiar = progress;

    }

    public int getRozmiar() {
        return rozmiar;
    }

}