package com.rcb.gmq.psp.sockets.simple.server.model;

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
            serverSocket = new ServerSocket(this.port);
            socket = serverSocket.accept();

            OutputStream outPutStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outPutStream);
            for(int i = 0; i< 10; i++)  {
                String message = "El número de mensajes enviados : "+(i-1)+"\n";
                dataOutputStream.writeUTF(message.trim());
                Thread.sleep(1000);
            }
            dataOutputStream.close();
            outPutStream.close();
        } catch (IOException e) {
            System.out.println("ERROR "+e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
