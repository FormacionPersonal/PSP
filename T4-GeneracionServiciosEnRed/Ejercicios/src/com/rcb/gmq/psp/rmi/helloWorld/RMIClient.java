package com.rcb.gmq.psp.rmi.helloWorld;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {

    public static void main(String ... args) {

        try {
            Registry registry = LocateRegistry.getRegistry();
            RmiHelloWorld stub = (RmiHelloWorld) registry.lookup("Hello");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("RMIClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
