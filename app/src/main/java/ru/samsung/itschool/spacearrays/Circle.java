package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Object implements Moveable, Drawable {

    float radius;
    Paint paint = new Paint();

    Circle(float x, float y, float radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
    }

    @Override
    public void move() {
        this.x += this.vx;
        this.y += this.vy;
    }

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(x, y, radius, paint);
    }
}