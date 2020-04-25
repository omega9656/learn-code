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
        Account pirateShipFund = new Account("Inej Ghafa", 10101010101L, 550_340.34);

        System.out.println(savings);
        System.out.println(college);
        System.out.println(pirateShipFund);

        System.out.println("Transfer successful: " + college.transferTo(pirateShipFund, 5325.13));
        System.out.println("College balance: " + college.getBalance());
        System.out.println("Pirate ship fund balance: " + pirateShipFund.getBalance());


    }
}
