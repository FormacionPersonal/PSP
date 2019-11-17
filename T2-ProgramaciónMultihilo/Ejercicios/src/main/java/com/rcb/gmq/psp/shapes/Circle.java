package com.rcb.gmq.psp.shapes;

public class Circle implements Shapes {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2* Math.PI*radius;
    }
}
