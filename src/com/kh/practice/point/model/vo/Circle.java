package com.kh.practice.point.model.vo;

public class Circle extends Point {

    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        // this.setX(x); this.setY(y); -> this is also possible
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius : " + radius;
    }
}
