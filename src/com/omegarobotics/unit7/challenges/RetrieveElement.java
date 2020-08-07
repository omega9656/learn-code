package com.omegarobotics.unit7.challenges;

/*
 * Write a program called RetrieveElement that meets
 * the following requirements:
 * - Creates an array with 100 randomly chosen integers
 *   (use Math.random() * 100 and cast to int)
 * - Continuously prompts the user to enter the index of
 *   the array, then displays the corresponding
 *   element value. If the specified index is out of
 *   bounds, display the message "Out of Bounds".
 * - The program should end when the user enters "quit"
 *   (case insensitive)
 * - If the user enters anything other than an index and
 *   "quit", display the message "Invalid index"
 *
 * Adapted from Exercise 12.3 from
 * Introduction to Java Programming (Comprehensive),
 * 10th ed. by Y. Daniel Liang
 */

import java.util.Scanner;

public class RetrieveElement {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        boolean quit = false; // whether the user wants to quit
        do {
            try {
                // ask user to enter an index
                System.out.print("Enter an index: ");
                String index = input.next();

                // user wants to quit
                if (index.equalsIgnoreCase(("quit"))) {
                    quit = true;
                } else {
                    // otherwise, print the element at that index
                    System.out.println(numbers[Integer.parseInt(index)]);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds");
            } catch (NumberFormatException ex) {
                System.out.println("Invalid index");
            }
        } while (!quit);

        input.close();
    }
}
