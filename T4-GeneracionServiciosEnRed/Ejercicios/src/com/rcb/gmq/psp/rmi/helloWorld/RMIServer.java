package com.rcb.gmq.psp.rmi.helloWorld;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer implements RmiHelloWorld {

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {

            RMIServer rmiServer = new RMIServer();
            RmiHelloWorld rmiHelloWorld = (RmiHelloWorld) UnicastRemoteObject.exportObject(rmiServer, 0);

            // Bind the remote object's rm in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", rmiHelloWorld);

            System.out.println("RMIServer ready");
        } catch (Exception e) {
            System.err.println("RMIServer exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
