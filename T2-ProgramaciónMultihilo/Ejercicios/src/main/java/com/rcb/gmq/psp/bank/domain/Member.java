package com.rcb.gmq.psp.bank.domain;

public class Member implements Runnable {

    private BankAccount bankAccount;

    private int memberId;

    public Member(int memberId, BankAccount bankAccount) {
        this.memberId = memberId;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        increment(100);
        increment(200);
        decrement(300);
    }

    private void decrement(int quantity) {
        bankAccount.remove(quantity);
    }

    private void increment(int quantiy) {
        bankAccount.add(quantiy);
    }

    public int getMemberId() {
        return this.memberId;
    }
}
