package com.omegarobotics.unit2.practice;

/*
Topic:
- Practice switch
 */

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        /*
        Prompt the user for a number from 1 to 12
        Using a switch, print the month that corresponds with that number.
        If the number is not from 1 to 12, give an error message.
         */

        // prompt user for a number from 1 to 12
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 12: ");
        int month = input.nextInt();
        input.close();

        // print the month that corresponds with that number
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
