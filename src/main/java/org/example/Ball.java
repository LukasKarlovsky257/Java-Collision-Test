package org.example.logic;

import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isCollided (Rectangle otherObject) {
        Rectangle ballRectangle = new Rectangle(x, y, width, height);
        return ballRectangle.intersects(otherObject);
    }
    public void move(int steps, Direction direction) {
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
    }

}