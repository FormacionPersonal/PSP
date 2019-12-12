package com.rcb.gmq.psp.bank;

import com.rcb.gmq.psp.bank.domain.BankAccount;
import com.rcb.gmq.psp.bank.domain.Member;

import java.util.HashSet;
import java.util.Set;

public class BankAccountApplication {

    private final static int INITIAL_POSITION = 10000;

    public static void main(String ... args) {

        if (args.length < 1) {
            System.out.println("ERROR: se necesita el número de socios como argumento (valor entero)");
        } else {

            try {
                Integer numMembers = Integer.valueOf(args[0]);

                if (numMembers < 10 || numMembers > 20) {

                    System.out.println("ERROR: el número de socios debe estar entre 10 y 20");

                } else {

                    BankAccount bankAccount = new BankAccount(INITIAL_POSITION);

                    Set<Member> members = new HashSet();
                    for(int i = 0; i < numMembers; i++) {
                        members.add(new Member(i, bankAccount));
                    }
                    members.parallelStream()
                        .forEach(t -> doRun(t));
                    System.out.println("Balance is "+bankAccount.getBalance());
                }
                /*
                if (numMembers > 10 && numMembers < 20) {

                    BankAccount bankAccount = new BankAccount(INITIAL_POSITION);


                    Set<Member> members = new HashSet();
                    for(int i = 0; i < numMembers; i++) {
                        members.add(new Member(i, bankAccount));
                    }
                    members.parallelStream()
                        .forEach(t -> doRun(t));
                    System.out.println("Balance is "+bankAccount.getBalance());

                } else {
                    System.out.println("ERROR: el número de socios debe estar entre 10 y 20");
                }*/



            } catch (Exception e) {
                System.out.println("ERROR: el valor del número de socios debe ser entero");
            }
        }


    }

    private static void doRun(Member member) {
        System.out.println("Running "+member.getMemberId());
        member.run();
        System.out.println("Ending "+member.getMemberId());
    }
}
