package com.omegarobotics.unit3.challenges;

import java.util.Scanner;

public class FindFactor {

  public static void main(String[] args) {
    /*
        Ask user for a number greater than 2.
        Find and print the smallest factor of
        that number that is not 1.

        Bonus points if you can do it in 3 ways:
        1. Without using a boolean variable or break statement
        2. Using a break statement
        3. Using a boolean variable
         */

    // Compound (without using a boolean or break statement)
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number greater than 2: ");
    int n = input.nextInt();

    int factor = 2;

    while (factor <= n && (n % factor != 0)) {
      factor++;
    }

    System.out.printf("The smallest factor of %d is %d.\n", n, factor);

    input.close();
    // Using a break statement
    //        while (factor <= n) {
    //            if (n % factor == 0) {
    //                break;
    //            } else {
    //                factor++;
    //            }
    //        }

    // Using a boolean
    //        boolean found = false;
    //        while (factor <= n && !found) {
    //            if (n % factor == 0) {
    //                found = true;
    //            } else {
    //                factor++;
    //            }
    //        }
  }
}
