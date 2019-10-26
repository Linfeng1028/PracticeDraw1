package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100, 600, 960, 600, paint);

        paint.setColor(Color.GREEN);

        canvas.drawLine(120, 600, 220, 600, paint);
        canvas.drawRect(240, 580, 340, 600, paint);
        canvas.drawRect(360, 580, 460, 600, paint);
        canvas.drawRect(480, 480, 580, 600, paint);
        canvas.drawRect(600, 380, 700, 600, paint);
        canvas.drawRect(720, 280, 820, 600, paint);
        canvas.drawRect(840, 400, 940, 600, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(25);
        canvas.drawText("Froyo", 130, 630, paint);
        canvas.drawText("GB", 250, 630, paint);
        canvas.drawText("IC S", 370, 630, paint);
        canvas.drawText("JB", 490, 630, paint);
        canvas.drawText("KitKat", 610, 630, paint);
        canvas.drawText("L", 730, 630, paint);
        canvas.drawText("M", 850, 630, paint);

    }
}
