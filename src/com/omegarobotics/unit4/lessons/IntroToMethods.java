package com.omegarobotics.unit4.lessons;

/*
Topics:
- Why we need methods (avoid repetition, modularity, readability)
- How to define a method (modifiers, return type, parameters)
- Parameters vs arguments
- Calling a method
- For and while loop review
- Javadoc comments
 */

public class IntroToMethods {
    public static void main(String[] args) {
        /*
        Print the sum of every integer from 1 to 10 (inclusive)
        Print the sum of every integer from 20 to 37 (inclusive)
        Print the sum of every integer from 35 to 49 (inclusive)
         */

        // solution using for loop
        System.out.println("Solution using for loop");

        int sum = 0;
        // sum of every integer from 1-10
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 20; i <= 37; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 35; i <= 49; i++) {
            sum += i;
        }
        System.out.println(sum);

        // solution using while loop
        System.out.println("Solution using while loop");

        sum = 0;
        int count = 1;
        while (count <= 10) {
            sum += count;
            count++;
        }
        System.out.println(sum);

        sum = 0;
        count = 20;
        while (count <= 37) {
            sum += count;
            count++;
        }
        System.out.println(sum);

        sum = 0;
        count = 35;
        while (count <= 49) {
            sum += count;
            count++;
        }
        System.out.println(sum);

        // solution using a method
        System.out.println("Solution using a method");

        printSum(1, 10);
        printSum(20, 37);
        printSum(35, 49);
    }

    /*
    How to Define a Method:
    modifier(s) returnType methodName(list of parameters separated by commas) {
        // code here
    }
   */

    /**
     * Prints the sum of every integer
     * between start and end, inclusive
     * @param start  first integer to add
     * @param end    last integer to add
     */
    public static void printSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}