package com.games.emcia.tappydefender2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Emcia on 2016-05-22.
 */
public class PlayerShip {

    private Bitmap bitmap;
    private int x, y;
    private int speed = 0;

    // Constructor
    public PlayerShip(Context context) {
        x = 50;
        y = 50;
        speed = 1;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ship);
    }

    public void update() {
        x++;
    }

    //Getters
    public Bitmap getBitmap() {
        return bitmap;
    }
    public int getSpeed() {
        return speed;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }


}
