package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket extends Object implements Moveable, Drawable{
    private Bitmap pic;

    Rocket(Bitmap pic){
        this.x = (float)(Math.random()*500);
        this.y = (float)(Math.random()*500);
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
        this.pic = pic;
    }
    public void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    private Paint paint = new Paint();
    private Matrix matrix = new Matrix();
    public void draw(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
}
