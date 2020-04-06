package com.omegarobotics.unit3.challenges;

import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        /*
        Ask user for a positive integer n and
        display their input (the first number
        in the hailstone sequence).

        If n is even, divide n by 2.
        If n is odd, multiply n by 3 and add 1.
        Print the result (the current number
        in the hailstone sequence).

        Keep doing this until n converges on 1
        (it is the last item in the sequence, which you should also print)
        then print the number of items in the sequence
        and the average of all the numbers in the sequence.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting positive number n: ");
        int n = input.nextInt();
        input.close();

        // Check if n is positive
        if (n > 0) {
            System.out.println(n);
            int numItems = 1;
            int sum = n;

            // Hailstone sequence stops when n converges on 1
            while (n != 1) {
                // Check if n is even or odd,
                // perform calculations accordingly
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }

                numItems++;
                sum += n;
                System.out.println(n);
            }

            double average = (double) sum / numItems;

            System.out.println("Number of items: " + numItems);
            System.out.println("Average: " + average);
        } else {
            // If n is negative, print an error message
            System.out.println("Error, n must be positive.");
        }
    }
}
