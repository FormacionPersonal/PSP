package com.rcb.gmq.psp.ejercicio1;

import com.rcb.gmq.psp.ejercicio1.domain.ThreadEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1Application {

    private static final int MAX_HILOS = 5;

    public static void main(String ... args) {

        List<ThreadEjercicio1> threads = new ArrayList();

        for (int i = 0; i < MAX_HILOS; i++) {
            threads.add(new ThreadEjercicio1(String.valueOf(i)+"0"));
        }

        threads.parallelStream()
            .forEach(t -> {
                t.run();
            });
    }
}
