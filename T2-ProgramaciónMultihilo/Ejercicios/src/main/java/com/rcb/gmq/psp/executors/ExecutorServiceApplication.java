package com.rcb.gmq.psp.executors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceApplication {

    public static void main(String ... args) {

        if ( args.length < 1 ) {

            System.out.println("ERROR: debe indicar un argumento (valor entero)");
        } else {

            int number = Integer.valueOf(args[0]);

            Runnable squareRoot = () -> { System.out.println(Thread.currentThread().getName()+" Raíz cuadrada es "+Math.sqrt(number));};
            Runnable squarePow = () -> { System.out.println(Thread.currentThread().getName()+" Cuadrado es "+Math.pow(number,2));};
            Runnable cube = () -> { System.out.println(Thread.currentThread().getName()+" Cubo es "+Math.pow(number,3));};
            Runnable factorial = () -> { System.out.println(Thread.currentThread().getName()+" Factorial es "+factorial(number));};

            ExecutorService executorService = Executors.newFixedThreadPool(4);
            executorService.submit(squarePow);
            executorService.submit(cube);
            executorService.submit(factorial);
            executorService.submit(squareRoot);

            executorService.shutdown();
        }
    }

    private static int factorial(int i) {
        if (i < 2) {
            return 1;
        }
        return i*factorial(i-1);
    }
}
