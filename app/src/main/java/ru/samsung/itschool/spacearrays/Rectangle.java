package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rectangle extends Object implements Moveable, Drawable {

    float width, height;
    Paint paint = new Paint();

    Rectangle(float x, float y, float width, float height){
        this.x = x;
        this.y = y;
        this.width = x + width;
        this.height = y + height;
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
    }
    @Override
    public void move() {
        this.x += this.vx;
        this.y += this.vy;
        this.width += this.vx;
        this.height += this.vy;
    }

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.CYAN);
        paint.setStrokeWidth(2);
        canvas.drawRect(x, y, width, height, paint);
    }
}