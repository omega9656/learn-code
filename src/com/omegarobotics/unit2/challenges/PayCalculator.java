package com.omegarobotics.unit2.challenges;

import java.util.Scanner;

public class PayCalculator {

    public static void main(String[] args) {
        double totalPay = 5.3698309683;
        System.out.printf("Your total pay is: $%.2f", totalPay);
        /*
        Write a program that prompts the user
        to enter the number of hours worked that week
        and the hourly pay rate.

        The program will compute the total pay
        for that week, paying time and a half
        for any hours over 40.

        It should format the total pay in
        standard money form - that is,
        2 decimal places of precision.

        Hint: Time and a half means that if you work
        over 40 hours, your total will be the number
        of hours you worked * pay rate, plus an overtime
        bonus. The overtime bonus is calculated by
        taking the number of hours overtime worked * half
        the normal pay rate. (Hence, time and a half.)
        */

        // Prompt user for hours worked that week and hourly pay rate
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of hours: ");
        int hours = input.nextInt();

        System.out.print("Enter pay rate per hour: $");
        double payRate = input.nextDouble();

        input.close();

        double total;

        // calculate the total pay
        if (hours <= 40) {
            total = hours * payRate;
        } else {
            // time and a half if the person worked overtime
            total = (hours * payRate) + (hours - 40) * payRate * 0.5;
        }

        // print the total pay
        System.out.printf("Your total pay is $%.2f.", total);
    }
}
