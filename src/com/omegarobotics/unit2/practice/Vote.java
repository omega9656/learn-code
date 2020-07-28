package com.omegarobotics.unit2.practice;

/*
Topics:
- Practice with if/else
- Practice with boolean logic
 */

import java.util.Scanner;

public class Vote {

  public static void main(String[] args) {
    /*
        Prompt the user for their age.
        Depending on their age, print to the console
        whether or not they can vote.
         */

    // prompt user for age
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    input.close();

    // print voting eligibility based on age
    if (age >= 18) {
      System.out.println("You can vote!");
    } else {
      System.out.println("Sorry, you can't vote yet.");
    }
  }
}
