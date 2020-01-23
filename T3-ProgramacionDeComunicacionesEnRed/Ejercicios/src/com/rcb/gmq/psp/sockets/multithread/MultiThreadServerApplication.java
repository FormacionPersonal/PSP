package com.rcb.gmq.psp.sockets.multithread;

import com.rcb.gmq.psp.sockets.multithread.model.Server;

import java.io.IOException;

import static com.rcb.gmq.psp.sockets.multithread.ComunicationConfig.PORT;

public class MultiThreadServerApplication {

    public static void main(String[] args) throws IOException {
        Server server = new Server(PORT);
        server.start();
    }
}
