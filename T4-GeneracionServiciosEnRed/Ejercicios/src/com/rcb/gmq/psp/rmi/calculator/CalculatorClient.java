package com.rcb.gmq.psp.rmi.calculator;

import com.rcb.gmq.psp.rmi.helloWorld.RmiHelloWorld;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {

    public static void main(String ... args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            RMICalculator stub = (RMICalculator) registry.lookup("Calculator");
            BigDecimal response = stub.sum(BigDecimal.ONE, BigDecimal.ONE);
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("RMIClient exception: " + e.toString());
            e.printStackTrace();
        }
    }

}
