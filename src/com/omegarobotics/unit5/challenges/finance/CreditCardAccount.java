package com.omegarobotics.unit5.challenges.finance;

/*
 * Create a class called CreditCardAccount which inherits from Account.
 *
 * Fields:
 * - apr: double, the annual percentage rate (APR) for interest, as a decimal
 * - creditLimit: double, the credit limit for the card
 *
 * Wait, what's APR?
 * It's an interest rate used to calculate the monthly minimum payment. (See that method below.)
 *
 * Wait, what's a credit limit?
 * Credit cards allow you to withdraw money even if you'd go into
 * debt as a result of the withdrawal. The credit limit allows you
 * to do this up to an extent - you can withdraw any amount less
 * than or equal to balance + creditLimit
 *
 * Methods:
 * + CreditCardAccount()
 * + CreditCardAccount(name: String, number: long, balance: double)
 * + CreditCardAccount(name: String, number: long, balance: double, apr: double, creditLimit: double)
 * + getApr(): double
 * + setApr(): void
 * + getCreditLimit(): double
 * + setCreditLimit(): void
 * + withdraw(amount: double): boolean
 *      Overrides superclass method and lets you withdraw more than
 *      you have in your balance, as long as it is not over
 * 		the credit limit. Returns true if the withdrawal was successful.
 * + calculatePayment(): double, returns monthly minimum payment based on current balance
 *      How is this calculated?
 *      If your balance is positive, you don't have to pay anything.
 *      Otherwise, your monthly payment is whichever is less: $20, or (apr/12) * (-balance)
 * + toString(): String
 *      Overrides superclass method
 *      Includes name, number, balance, apr, creditLimit, and monthly minimum payment
 *
 * Bonus points for Javadoc comments and @Override tag(s).
 */

import com.omegarobotics.unit5.practice.finance.Account;

public class CreditCardAccount extends Account {
    private double apr; // annual percentage rate for interest as a decimal
    private double creditLimit; // credit limit for the card

    /** Constructs a default {@code CreditCardAccount} */
    public CreditCardAccount() {
        super(); // explicit call
        apr = 0.0;
        creditLimit = 0.0;
    }

    /**
     * Constructs a {@code CreditCardAccount} with given name,
     * account number, and balance. The APR and credit limit
     * are set to default values.
     * @param name  name of account holder
     * @param number  account number
     * @param balance  amount of money in the account
     */
    public CreditCardAccount(String name, long number, double balance) {
        super(name, number, balance);
        apr = 0.0;
        creditLimit = 0.0;
    }

    /**
     * Constructs a {@code CreditCardAccount} with given name,
     * account number, balance, APR, and credit limit
     * @param name  name of account holder
     * @param number  account number
     * @param balance  amount of money in the account
     * @param apr  annual percentage rate for interest, as a decimal
     * @param creditLimit  the credit limit for the card
     */
    public CreditCardAccount(String name, long number, double balance, double apr, double creditLimit) {
        super(name, number, balance);
        this.apr = apr;
        this.creditLimit = creditLimit;
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
     * to a new APR if the new APR is greater than
     * or equal to 0
     * @param apr  the new APR, as a decimal
     */
    public void setApr(double apr) {
        // apr cannot be negative
        if (apr >= 0) {
            this.apr = apr;
        }
    }

    /**
     * Returns the credit limit
     * @return the credit limit
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the credit limit to a new credit
     * limit, if the new credit limit is greater
     * than or equal to 0
     * @param creditLimit  the new credit limit
     */
    public void setCreditLimit(double creditLimit) {
        // credit limit cannot be negative
        if (creditLimit >= 0) {
            this.creditLimit = creditLimit;
        }
    }

    /**
     * Subtracts the given amount from the account
     * if the withdrawal does not exceed the value
     * of {@code balance + creditLimit}
     * @param amount  amount of money to withdraw from this <code>Account</code>
     * @return {@code true} if the withdrawal is successful
     */
    @Override
    public boolean withdraw(double amount) {
        // if a withdrawal pushes you over the credit limit,
        // leave the balance untouched
        if (amount <= super.getBalance() + creditLimit) {
            super.setBalance(super.getBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     * Returns the minimum monthly payment based on
     * the {@code balance} and {@code apr}
     * @return the minimum monthly payment based on
     * the {@code balance} and {@code apr}
     */
    public double calculatePayment() {
        // if balance is positive, minimum amount you have to pay
        // on your card per month is 0
        if (super.getBalance() > 0) {
            return 0;
        } else {
            // else, your monthly payment is whichever is less:
            // $20 or (apr/12) * (-balance)
            return Math.min(20, (apr / 12) * -super.getBalance());
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s\nInterest Rate: %.2f%%, Credit Limit: $%.2f, Monthly Payment: $%.2f",
                super.toString(), apr * 100, creditLimit, this.calculatePayment()
        );
    }
}
