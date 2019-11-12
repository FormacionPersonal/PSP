package com.rcb.gmq.psp.shapes;

public class Triangle implements Shapes {

    private static final int NUM_SIDES = 3;

    private int base;

    private int high;

    public Triangle(int base, int high) {
        this.base = base;
        this.high = high;
    }


    public double calculateArea() {
        return (base*high)/2;
    }

    public double calculatePerimeter() {
        return NUM_SIDES*base;
    }
}
