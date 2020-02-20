package com.rcb.gmq.psp.rmi.calculator;

import com.rcb.gmq.psp.rmi.helloWorld.RMIServer;
import com.rcb.gmq.psp.rmi.helloWorld.RmiHelloWorld;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer implements RMICalculator{

    public static void main(String args[]) {

        try {
            System.out.println("CalculatorServer starting");
            CalculatorServer calculatorServer = new CalculatorServer();
            RMICalculator stub = (RMICalculator) UnicastRemoteObject.exportObject(calculatorServer, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Calculator", stub);

            System.out.println("RMICalculatorServer ready");
        } catch (Exception e) {
            System.err.println("RMICalculatorServer exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public BigDecimal sum(BigDecimal firtSummand, BigDecimal secondSummand) {
        return firtSummand.add(secondSummand);
    }

    @Override
    public BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) {
        return null;
    }

    @Override
    public BigDecimal multiply(BigDecimal mutiplicand, BigDecimal multiplier) {
        return null;
    }

    @Override
    public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
        return null;
    }
}
