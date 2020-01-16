package com.rcb.gmq.psp.sockets.simple.client;

import com.rcb.gmq.psp.sockets.simple.client.model.Client;

import java.io.IOException;

public class ClientApplication {

    private final static int PORT = 8001;

    private final static String HOSTNAME = "localhost";

    public static void main(String[] args) throws IOException {
        Client client = new Client(HOSTNAME, PORT);
        client.start();
    }
}
