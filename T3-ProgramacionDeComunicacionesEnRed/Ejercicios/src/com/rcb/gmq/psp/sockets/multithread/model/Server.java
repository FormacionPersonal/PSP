package com.rcb.gmq.psp.sockets.multithread.model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.rcb.gmq.psp.sockets.multithread.ComunicationConfig.MAX_CLIENTS;

public class Server {

    private static int counter = 0;

    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            ExecutorService executorService = Executors.newFixedThreadPool(MAX_CLIENTS);
            while (true) {
                Socket socket = serverSocket.accept();
                executorService.submit(new ServerThread(socket));
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }

    }
}
