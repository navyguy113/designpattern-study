package com.designpattern.prototype;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle( int x, int y, int radius ) {
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX( int x ) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY( int y ) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius( int radius ) {
        this.radius = radius;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x += 1;
        circle.y += 1;

        return circle;
    }

}
