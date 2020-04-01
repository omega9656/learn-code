package com.omegarobotics.unit1.practice;

/*
Topics:
- Scanner, user input (multiple times)
- Double division
 */

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        /*
        Prompt the user for 3 numbers (double).
        Calculate the average and print the result.
         */

        // get 3 numbers from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double n1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        double n2 = input.nextDouble();

        System.out.print("Enter number 3: ");
        double n3 = input.nextDouble();

        input.close();

        // compute the average
        double sum = n1 + n2 + n3;
        double average = sum / 3;

        // display the result
        System.out.println("The average is " + sum);
    }
}
