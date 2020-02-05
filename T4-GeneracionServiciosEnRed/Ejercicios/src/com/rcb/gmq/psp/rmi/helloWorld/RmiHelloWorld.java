package com.rcb.gmq.psp.rmi.helloWorld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiHelloWorld extends Remote {

    String sayHello() throws RemoteException;
}
