package com.omegarobotics.unit3.lessons;

/*
Topics:
- break
- continue
 */

public class BreakVsContinue {

    public static void main(String[] args) {
        // Testing the continue keyword
        System.out.println("Testing continue");

        int sum = 0;
        int number = 0;

        // Print the current number from 1-10,
        // but skip 7 and 8.
        // Also keep a running sum of the numbers.
        while (number < 10) {
            number++;
            if (number == 7 || number == 8) {
                continue;
            }
            sum += number;
            System.out.printf("number: %d sum: %d.\n", number, sum);
        }

        System.out.println("The sum is " + sum);

        // Testing the break keyword
        System.out.println("\n\nTesting break");

        sum = 0;
        number = 0;

        // Print the current number from 1-6.
        // Also keep a running sum of the numbers.
        while (number < 10) {
            number++;
            if (number == 7) { // will never reach 8
                break;
            }
            sum += number; // 7 is never added to the sum
            System.out.printf("number: %d sum: %d.\n", number, sum);
        }

        System.out.println("The sum is " + sum);
    }
}
