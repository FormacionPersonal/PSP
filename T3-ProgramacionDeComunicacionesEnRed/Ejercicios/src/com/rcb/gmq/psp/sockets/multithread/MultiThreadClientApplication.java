package com.rcb.gmq.psp.sockets.multithread;

import com.rcb.gmq.psp.sockets.multithread.model.Client;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.rcb.gmq.psp.sockets.multithread.ComunicationConfig.*;

public class MultiThreadClientApplication {


    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Set clients = new HashSet();
        for (int i = 0; i < 10; i++) {
            clients.add(new Client(HOSTNAME, PORT));
        }
        executorService.invokeAll(clients);
    }
}
