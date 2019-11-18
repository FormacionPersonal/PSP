package com.rcb.gmq.psp.sync.domain;

public class IncrementThread implements Runnable {

    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Increment "+counter.increment());
    }
}
