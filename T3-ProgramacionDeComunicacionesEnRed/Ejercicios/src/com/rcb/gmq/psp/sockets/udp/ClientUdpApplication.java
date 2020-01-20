package com.rcb.gmq.psp.sockets.udp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.Charset;

import static com.rcb.gmq.psp.sockets.udp.UdpConnectionProperties.PORT;

public class ClientUdpApplication {

    public static void main(String ... args) {

        DatagramSocket client = null;
        try {
            client = new DatagramSocket(PORT);
            DatagramPacket packet = new DatagramPacket( new byte[45],45);

            for(int i = 0; i < 10; i++) {

                client.receive(packet);
                System.out.println("Recibido ("+(i+1)+")"+new String(packet.getData()));
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            client.close();
        }

    }
}
