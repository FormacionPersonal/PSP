package com.rcb.gmq.psp.sockets.multithread.model;

import java.io.*;
import java.net.Socket;
import java.time.Instant;

public class ServerThread implements Runnable {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    private static int counter = 0;

    @Override
    public void run() {

        try {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String cadena = "Fecha actual "+Instant.now().toString() +
                "( mensaje num. " + (counter++) + " :: " + Thread.currentThread().getName() + ")";
            out.println(cadena);

            Thread.sleep(3000);
            out.close();

        } catch (IOException | InterruptedException e) {
            new RuntimeException("No es posible escribir la fecha");
        }

    }
}
