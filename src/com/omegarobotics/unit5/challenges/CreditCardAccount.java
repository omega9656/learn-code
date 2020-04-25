package com.omegarobotics.unit5.challenges;

/*
 * CreditCardAccount inherits from Account.
 *
 * Fields:
 * - apr: double, the annual percentage rate (APR) for interest, as a decimal
 * - creditLimit: double, the credit limit for the card
 *
 * Methods:
 * + CreditCardAccount(), constructor with default values
 * + CreditCardAccount(number: long, balance: double, apr: double, creditLimit: double),
 * 		constructor that creates a CreditCardAccount with given values
 * + getApr(): double
 * + setApr(): void
 * + getCreditLimit(): double
 * + setCreditLimit(): void
 * + withdraw(amount: double): void, overrides superclass method and lets you
 * 		withdraw more than you have in your balance, as long as it is not over
 * 		the credit limit
 * + calculatePayment(): double, returns monthly minimum payment based on current balance
 * + toString(): String, includes account number, balance, apr, creditLimit, monthly minimum payment
 */

import com.omegarobotics.unit5.practice.finance.Account;

public class CreditCardAccount extends Account {
}
