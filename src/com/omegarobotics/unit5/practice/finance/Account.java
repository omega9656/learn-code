package com.omegarobotics.unit5.practice.finance;

/*
Create a class called Account which has the following fields:
- number (long): the account number
- balance (double)
- name (String): name of the person who owns the account

Implement the following methods:
+ Account
+ Account(name, number)
+ Account(name, number, balance)
+ getters and setters for name, number, and balance.
  HOWEVER, do not make a setter for number, since
  you don't change your account number once the account is made.
+ deposit(amount): boolean (if deposit was successful, return true)
    You should not be able to deposit a negative amount.
+ withdraw(amount): boolean (if withdrawal was successful, return true)
    You should not be able to withdraw more than you have in the account.
+ transferTo(acct, amount): boolean (if transfer was successful, return true)
    You should not be able to transfer more than you have in the account.
    You should not be able to transfer a negative amount.
Override the toString method such that a print statement
    prints the name, number, and balance
Override the equals method such that 2 accounts that
    have the same account number are equal

Bonus points for Javadoc comments and @Override tag(s).
 */

public class Account {
  private long number; // account number
  private double balance;
  private String name; // account holder

  /** Constructs a default <code>Account</code> */
  public Account() {
    number = 0;
    balance = 0;
    name = "";
  }

  /**
   * Constructs an <code>Account</code>
   * with a given name and account number
   * @param name    name of account holder
   * @param number  account number
   */
  public Account(String name, long number) {
    this.name = name;
    this.number = number;
    balance = 0;
  }

  /**
   * Constructs an <code>Account</code> with the
   * given name, account number, and balance
   * @param name     name of account holder
   * @param number   account number
   * @param balance  amount of money in the account
   */
  public Account(String name, long number, double balance) {
    //        this.name = name;
    //        this.number = number;
    this(name, number); // equivalent to above
    this.balance = balance;
  }

  /**
   * Returns the account holder name
   * @return account holder name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the account holder name to a different name
   * @param name  new name of account holder
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the account number
   * @return the account number
   */
  public long getNumber() {
    return number;
  }

  /**
   * Returns the current balance
   * @return the current balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Sets the current balance to a new balance
   * @param balance  the new current balance
   */
  public void setBalance(double balance) {
    this.balance = balance;
  }

  /**
   * Adds a given amount of money to this <code>Account</code>.
   * Does not change the balance if the amount is less than
   * or equal to 0.
   * @param amount  amount of money to deposit into this <code>Account</code>
   * @return true if the deposit was successful
   */
  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  /**
   * Subtracts a given amount of money from this <code>Account</code>.
   * Does not change the balance if the amount is less than or equal to
   * zero or the amount is greater than the current balance.
   * @param amount  amount of money to withdraw from this <code>Account</code>
   * @return true if the withdrawal was successful
   */
  public boolean withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }

  /**
   * Transfers a given amount of money from this <code>Account</code>
   * to another <code>Account</code> (if possible)
   * @param acct    <code>Account</code> to transfer money to
   * @param amount  amount of money to transfer
   * @return true if the transfer was successful
   */
  public boolean transferTo(Account acct, double amount) {
    if (this.withdraw(amount)) {
      acct.deposit(amount);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format(
      "Account name: %s. Account #: %d. Balance: $%.2f",
      name,
      number,
      balance
    );
  }

  /**
   * Returns {@code true} if the given object
   * is an instance of {@code Account} and
   * the two accounts have the same account number
   * @param obj  object to compare to this {@code Account} for equality
   * @return {@code true} if the given object is an
   * instance of {@code Account} and the two accounts
   * have the same account number
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Account) {
      return ((Account) obj).getNumber() == number;
    }
    return false;
  }
}
