package com.rcb.gmq.psp.sockets.udp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.time.Instant;

import static com.rcb.gmq.psp.sockets.udp.UdpConnectionProperties.PORT;

public class ServerUdpApplication {

    public static void main(String... args) throws SocketException {

        DatagramSocket server = null;
        try {

            server = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");

            while(true) {
                String buffer = "La fecha actual es : "+ Instant.now().toString();
                DatagramPacket data = new DatagramPacket(buffer.getBytes(),buffer.length(), address, PORT);
                server.send(data);
                Thread.sleep(1000);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            server.close();
        }
    }
}
