package com.omegarobotics.unit5.challenges;

/*
 * Create an array of Account objects and prints
 * the status of each account after depositing
 * and withdrawing a certain amount.
 */

import com.omegarobotics.unit5.practice.finance.Account;

public class TestAccounts {
    public static void main(String[] args) {
        // create array of Account objects
        Account[] accounts = new Account[6];

        accounts[0] = new Account("Kaz", 1066, 7500);
        accounts[1] = new SavingsAccount("Inej", 30507, 4500, 0.015);
        accounts[2] = new CreditCardAccount("Jesper", 51782737, 7000.00, 0.08, 1000.00);
        accounts[3] = new CreditCardAccount("Wylan", 629553328, 1500.00, 0.075, 5000);
        accounts[4] = new CreditCardAccount("Nina", 4977201043L, -5000.00, 0.07, 10000);
        accounts[5] = new Account("Matthias", 1234);

        final double DEPOSIT_AMOUNT = 2134.00;
        final double WITHDRAW_AMOUNT = 4782.00;

        // Prints the status of each account after
        // depositing and withdrawing amounts above
        for (Account acct: accounts) {
            System.out.println(acct.getName() + "'s balance: " + acct.getBalance());
            acct.deposit(DEPOSIT_AMOUNT);
            System.out.println(acct.getName() + "'s balance after deposit: " + acct.getBalance());
            acct.withdraw(WITHDRAW_AMOUNT);
            System.out.println(acct.getName() + "'s balance after withdrawal: " + acct.getBalance());
            System.out.println(acct + "\n");
        }
    }
}
