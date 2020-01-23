package com.rcb.gmq.psp.sockets.bidirectional.client;

import com.rcb.gmq.psp.sockets.bidirectional.client.model.Client;

import java.io.IOException;

public class ClientApplication {

    private final static int PORT = 8000;

    private final static String HOSTNAME = "localhost";

    public static void main(String[] args) throws IOException {
        Client client = new Client(HOSTNAME, PORT);
        client.start();
    }
}
