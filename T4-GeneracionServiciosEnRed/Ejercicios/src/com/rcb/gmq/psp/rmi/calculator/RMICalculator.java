package com.rcb.gmq.psp.rmi.calculator;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalculator extends Remote {

    BigDecimal sum(BigDecimal firtSummand, BigDecimal secondSummand) throws RemoteException;

    BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) throws RemoteException;

    BigDecimal multiply(BigDecimal mutiplicand, BigDecimal multiplier) throws RemoteException;

    BigDecimal divide(BigDecimal dividend, BigDecimal divisor) throws RemoteException;

}
