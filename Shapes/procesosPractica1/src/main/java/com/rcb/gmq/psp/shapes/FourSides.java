package com.rcb.gmq.psp.shapes;

public class FourSides implements Shapes {

    private int base;

    private int high;

    public FourSides(int base, int high) {
        this.base = base;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return base*high;
    }

    @Override
    public double calculatePerimeter() {
        return 2*base + 2*high;
    }
}
