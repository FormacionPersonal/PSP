package com.rcb.gmq.psp.sockets.simple.client.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {

    private int port;

    private String hostname;

    public Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void start() throws IOException {

        Socket client = new Socket();
        SocketAddress address = new InetSocketAddress(hostname, port);

        try {

            client.connect(address);
            InputStream is = client.getInputStream();

            //Flujos que manejan caracteres
            InputStreamReader isr = new InputStreamReader(is);
            int c;

            while ((c = isr.read()) != -1) {
                if (c != 0) {
                    System.out.print((char) c);
                }
            }

            isr.close();
            is.close();

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
            client.close();
        }
    }
}
