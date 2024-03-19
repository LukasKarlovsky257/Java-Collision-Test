package org.example.logic;

import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int width;
    private int height;

    public Ball(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isCollided (Rectangle otherObject) {
        Rectangle ballRectangle = new Rectangle(x, y, width, height);
        return ballRectangle.intersects(otherObject);
    }
    public Direction move(int steps, Direction direction) {
        switch (direction) {
            case UP -> {
                y += steps;
            }
            case DOWN -> {
                y -= steps;
            }
            case RIGHT -> {
                x += steps;
            }
            case LEFT -> {
                x -= steps;
            }
        }
        return direction;
    }

}
