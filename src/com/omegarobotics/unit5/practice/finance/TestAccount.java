package com.omegarobotics.unit5.practice.finance;

/*
Create a driver class called TestAccount
which tests the methods in the Account class.
 */

public class TestAccount {

    public static void main(String[] args) {
        // test constructors
        Account savings = new Account();
        Account college = new Account("Kaz Brekker", 123456789);
        Account pirateShipFund = new Account(
            "Inej Ghafa",
            10101010101L,
            550_340.34
        );

        // test toString
        System.out.println(savings);
        System.out.println(college);
        System.out.println(pirateShipFund);

        // test transferTo
        System.out.println(
            "Transfer successful: " +
            college.transferTo(pirateShipFund, 5325.13)
        );
        System.out.println("College balance: " + college.getBalance());
        System.out.println(
            "Pirate ship fund balance: " + pirateShipFund.getBalance()
        );

        System.out.println(
            "Transfer successful: " + pirateShipFund.transferTo(college, 13_523)
        );
        System.out.println("college balance: " + college.getBalance());
        System.out.println(
            "pirate ship fund balance: " + pirateShipFund.getBalance()
        );

        // test deposit
        savings.deposit(124.52);
        System.out.println(
            "savings balance after deposit: " + savings.getBalance()
        );

        // test withdraw
        college.withdraw(553);
        System.out.println(
            "college balance after withdrawal: " + college.getBalance()
        );

        // test remaining getters
        System.out.println(
            "pirate ship fund name: " + pirateShipFund.getName()
        );
        System.out.println(
            "pirate ship fund number: " + pirateShipFund.getNumber()
        );

        // test setters
        savings.setName("Skye");
        System.out.println("savings name: " + savings.getName());
        savings.setBalance(1);
        System.out.println("savings balance: " + savings.getBalance());
    }
}
