package com.rcb.gmq.psp.sockets.multithread.model;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.Callable;

public class Client implements Callable<String> {

    private int port;

    private String hostname;

    public Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    @Override
    public String call() throws RuntimeException {

        Socket client = new Socket();
        SocketAddress address = new InetSocketAddress(hostname, port);
        String received = "";
        try {
            client.connect(address);

            InputStream is = client.getInputStream();

            BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));

            received = in.readLine();
            System.out.println("El cliente "+Thread.currentThread().getId()+
                " recibe el siguiente mensaje: "+received);
            in.close();
            is.close();

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                new RuntimeException("Imposible cerrar el cliente");
            }
        }
        return received;
    }
}
