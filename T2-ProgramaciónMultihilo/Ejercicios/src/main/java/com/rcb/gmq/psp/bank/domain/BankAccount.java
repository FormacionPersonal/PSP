package com.rcb.gmq.psp.bank.domain;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized int add(int quantity) {
        balance += quantity;
        System.out.println("Adding "+quantity+" to balance :: "+balance);
        return balance;
    }

    public synchronized int remove(int quantity) {
        balance -= quantity;
        System.out.println("Removing "+quantity+" from balance :: "+balance);
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
