package com.omegarobotics.unit7.lessons.exceptions;

import java.util.Scanner;

/*
 * Topics:
 * - Exception handling with try, catch, finally
 * - Exception classes and methods (printStackTrace)
 * - Exceptions vs Errors
 */

public class Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        try {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (ArithmeticException ex) {
            System.out.println("Error, division by zero");
            // ex.printStackTrace(); // displays default error message
        } finally {
            System.out.println("Thanks for using the program");
        }
    }
}
