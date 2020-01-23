package com.rcb.gmq.psp.sockets.bidirectional.server;

import com.rcb.gmq.psp.sockets.bidirectional.server.model.Server;

import java.io.IOException;

public class ServerApplication {

    private final static int PORT = 8000;

    public static void main(String[] args) throws IOException {
        Server server = new Server(PORT);
        server.start();
    }
}
