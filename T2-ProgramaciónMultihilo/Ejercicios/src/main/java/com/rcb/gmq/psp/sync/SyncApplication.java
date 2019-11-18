package com.rcb.gmq.psp.sync;

import com.rcb.gmq.psp.sync.domain.Counter;

import java.util.HashSet;
import java.util.Set;

public class SyncApplication {

    private final static int RUNS = 1000000;
    private final static Counter counter = new Counter();

    public static void main(String ... args) {
        Runnable increment = () -> { System.out.println("Increment "+counter.increment()); };
        Runnable decrement = () -> { System.out.println("Decrement "+counter.decrement()); };

        Set<Runnable> threads = new HashSet();
        threads.add(increment);
        threads.add(decrement);

        for(int i = 0; i < RUNS; i++) {
            threads.parallelStream()
                .forEach(t -> t.run());
        }

        System.out.println("Count final value is "+counter.value());

    }
}
