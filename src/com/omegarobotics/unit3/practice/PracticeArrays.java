package com.omegarobotics.unit3.practice;

/*
Topics:
- Practice initializing an array in 2 ways
- Practice with for loops
- Practice assigning/retrieving elements to/from an array
 */

import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {
        /*
        Part 1:
        Initialize an array of Strings which contain words in your favorite quote.
        Use a for loop to print the entire quote in one line.
        Bonus points if you can also code a solution using a for each loop!

        Part 2:
        As the user to enter the length of an array.
        Initialize an array of integers of the given length.
        Use a for loop to assign even numbers to the array.
        EXAMPLE OUTPUT:
        Enter the length of the array: 6
        0
        2
        4
        6
        8
        10

        Use another for loop to print the result.
         */

        // PART 1

        // initialize array of Strings
        String[] words = {"The",  "man", "dies", "in", "all", "who", "keep", "silent", "in", "the", "face", "of", "tyranny"};

        // for loop solution
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        System.out.println();

        // for each loop solution
        for (String word: words) {
            System.out.print(word + " ");
        }

        System.out.println();

        // PART 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        int evenNumber = 0;
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = evenNumber;
            evenNumber += 2;
        }

        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
