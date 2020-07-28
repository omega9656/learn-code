package com.omegarobotics.unit4.challenges;

/*
Write a method that computes the sum of the
digits in a positive integer. The method header is:

public static int sumDigits(long n)

The main method will repeatedly ask for a
number, call sumDigits with that number,
and print the result, until the user enters -1.
 */

import java.util.Scanner;

public class DigitSum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    long number;

    do {
      // prompt for a number
      System.out.print("Enter a positive integer, or -1 to quit: ");
      number = input.nextLong();

      if (number >= 0) {
        // sum the digits in the number
        int total = sumDigits(number);

        // print total, properly labeled
        System.out.println(
          "Total of the sum of the digits in the number: " + total
        );
      }
    } while (number != -1);

    input.close();
  }

  /**
   * Sum digits
   * @param number  number to sum the digits of
   * @return the sum of each digit in the number
   */
  public static int sumDigits(long number) {
    int sum = 0;

    while (number != 0) {
      // get the rightmost digit
      int remainder = (int) (number % 10); // always safe to cast because mod 10 will always be an int from 0-9

      // add the rightmost digit to the sum
      sum += remainder;

      // get rid of the rightmost digit for the next calculation
      number /= 10;
    }

    return sum;
  }
}
