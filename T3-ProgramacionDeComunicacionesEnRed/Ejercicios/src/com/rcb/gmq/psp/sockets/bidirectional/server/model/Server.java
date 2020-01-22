package com.rcb.gmq.psp.sockets.bidirectional.server.model;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;

public class Server {

    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() {

        ServerSocket serverSocket = null;
        Socket socket = null;
        try {

            serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Server date :: "+Instant.now().toString());

            String line = "";

            while( (line = in.readLine()) != null){
                System.out.println("(R)"+line);

            }
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        } finally {
            try {
                socket.close();
                serverSocket.close();
            } catch(Exception e) {
                e.printStackTrace();
            }

        }
    }
}
