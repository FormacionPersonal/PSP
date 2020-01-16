package com.rcb.gmq.psp.sockets.simple.server;

import com.rcb.gmq.psp.sockets.simple.server.model.Server;


public class ServerApplication {

    private final static int PORT = 8001;

    public static void main(String[] args) {
        Server server = new Server(PORT);
        server.start();
    }
}
