package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        RectF rectF = new RectF(250,250, 650, 650);
        Paint paint = new Paint();

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 0, -60, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 3, 10, true, paint);
        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rectF, 13, 10, true, paint);
        paint.setColor(Color.WHITE);
        canvas.drawArc(rectF, 26, 60, true, paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rectF, 89, 91, true, paint);

        rectF = new RectF(240, 240, 640, 640);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, -180, 120, true, paint);

        // 类似的，划线添加中文，这里只加一处作为示范
        paint.setColor(Color.WHITE);
        canvas.drawLines(new float[]{(float) (450 + 100 * Math.sqrt(3)), 350, 800, 350}, paint);
        paint.setTextSize(30);
        canvas.drawText("XXXXXX", 800, 350, paint);
    }
}
