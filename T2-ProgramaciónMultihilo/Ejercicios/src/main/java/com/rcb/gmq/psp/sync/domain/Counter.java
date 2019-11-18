package com.rcb.gmq.psp.sync.domain;

public class Counter {

    private static int counter = 0;

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return counter--;
    }

    public int value() {
        return counter;
    }
}
