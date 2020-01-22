package com.rcb.gmq.psp.sockets.bidirectional.client.model;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.time.Instant;

public class Client {

    private int port;

    private String hostname;

    public Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void start() throws IOException {

        Socket client = new Socket(hostname, port);
        try {

            BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(
                client.getOutputStream(), true);

            System.out.println(in.readLine());

            out.print("¡El cliente te da las gracias!");
            out.close();

        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
            client.close();
        }
    }
}
