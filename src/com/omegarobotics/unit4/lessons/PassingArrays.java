package com.omegarobotics.unit4.lessons;

/*
Topics:
- Passing arrays into methods (array's reference is passed!)
 */

/*
Create 2 methods, displayArray and squareArray.

displayArray prints each item in the array like so:
[ 1 2 3 4 5 ... n ]

squareArray takes an array of integers and
returns an array of integers where each
element in the resulting array is the
square of each corresponding element in the
passed array.

For example:
squareArray({1, 2, 3}) would return {1, 4, 9}.

Note: squareArray should NOT edit the contents
of the passed array. It should return a new array.

In the main method:
1. Prompt the user to enter items into an
   array of integers one by one.
2. Call the displayArray method to print the
   resulting array.
3. Call squareArray on that array and print
   the resulting array.
4. Call displayArray again to print
   the original array that the user created.
 */

import java.util.Arrays;
import java.util.Scanner;

public class PassingArrays {
    public static void main(String[] args) {
        // asks user for length of array
        Scanner input = new Scanner(System.in);
        System.out.print("How many items are in your array? ");
        int nItems = input.nextInt();

        // asks user for each item and adds it to the array
        int[] numbers = new int[nItems];
        for (int i = 0; i < nItems; i++) {
            System.out.print("Enter item #" + (i + 1) + ": "); // because we start at 0, but humans start at 1
            numbers[i] = input.nextInt();
        }

        input.close();

        // prints the array
        System.out.print("Numbers is: " );
        displayArray(numbers);

        // square the array
        int[] squared = squareArray(numbers);

        // print the result
        System.out.print("Squared array is: ");
        displayArray(squared);

        // print the original array
        System.out.print("Squared numbers array is: ");
        displayArray(numbers);
    }

    public static int[] squareArray(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] * data[i];
        }
        return result;
    }

    public static void displayArray(int[] data) {
//        System.out.print("[ ");
//        for (int item: data) {
//            System.out.print(item + " ");
//        }
//        System.out.println("]");
        System.out.println(Arrays.toString(data));
    }
}
