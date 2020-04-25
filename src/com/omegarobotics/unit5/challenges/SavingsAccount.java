package com.omegarobotics.unit5.challenges;

/*
 * SavingsAccount inherits from Account.
 *
 * Fields:
 * - apr: double, annual percentage rate (APR) for interest as a decimal
 *
 * Methods:
 * + SavingsAccount(), constructor with default values
 * + SavingsAccount(number: long, balance: double, apr: double),
 * 		constructor that creates a SavingsAccount object with given values
 * + getApr(): double
 * + setApr(): void
 * + calculateInterest(): double, returns annual interest earned
 * 		based on current balance and APR
 *      How is this calculated? It's balance * apr
 * + toString(): String, includes name, number, balance, APR, and annual interest earned
 *
 * Bonus points for Javadoc comments and @Override tag(s).
 */

import com.omegarobotics.unit5.practice.finance.Account;

public class SavingsAccount extends Account {
    private double apr; // annual percentage rate for interest as a decimal

    /** Constructs a default {@code SavingsAccount} */
    public SavingsAccount() {
        super(); // explicit call
        apr = 0.0;
    }

    /**
     * Constructs a {@code SavingsAccount} with a given name,
     * account number, and balance
     * @param name  name of account holder
     * @param number  account number
     * @param balance  amount of money in the account
     */
    public SavingsAccount(String name, long number, double balance) {
        super(name, number, balance);
        apr = 0.0;
    }

    /**
     * Constructs a {@code SavingsAccount} with a given name,
     * number, balance, and APR
     * @param name  name of account holder
     * @param number  account number
     * @param balance  amount of money in the account
     * @param apr  annual percentage rate (APR), as a decimal
     */
    public SavingsAccount(String name, long number, double balance, double apr) {
        super(name, number, balance);
        this.apr = apr;
    }

    /**
     * Returns the annual percentage rate (APR)
     * @return the annual percentage rate (APR)
     */
    public double getApr() {
        return apr;
    }

    /**
     * Sets the annual percentage rate (APR)
     * to a new APR, if the new APR is
     * greater than or equal to 0
     * @param apr  new APR
     */
    public void setApr(double apr) {
        // apr cannot be negative
        if (apr >= 0) {
            this.apr = apr;
        }
    }

    /**
     * Returns the annual interest earned
     * based on the current balance
     * @return the annual interest earned
     * based on the current balance
     */
    public double calculateInterest() {
        return super.getBalance() * apr;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Account #: %d, Balance: $%.2f\n" +
                        "Interest Rate: %.2f%%, Annual Interest: $%.2f",
                super.getName(), super.getNumber(), super.getBalance(),
                apr * 100, this.calculateInterest()
        );
    }
}
