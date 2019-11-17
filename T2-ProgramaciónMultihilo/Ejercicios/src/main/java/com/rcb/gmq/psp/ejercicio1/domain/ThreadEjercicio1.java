package com.rcb.gmq.psp.ejercicio1.domain;

public class ThreadEjercicio1 implements Runnable {

    private String id;

    public ThreadEjercicio1(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hola, soy " + id+" ("+Thread.currentThread().getName()+")");
        long millisSleep = 1000 + (long) Math.random() * (2000 - 1000);
        try {
            Thread.currentThread().sleep(millisSleep);
        } catch (InterruptedException e) {
            System.out.println("El hilo " + id + " no ha podido dormirse " + e);
        }
        System.out.println("Adiós, soy " + id+" ("+Thread.currentThread().getName()+")");
    }
}
