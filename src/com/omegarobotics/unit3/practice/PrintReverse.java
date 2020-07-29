package com.omegarobotics.unit3.practice;

public class PrintReverse {

    public static void main(String[] args) {
        /*
        Given an array of numbers (below), print the items in reverse order.
         */
        int[] numbers = { 1, 2, 3, 4, 5 };

        // for loop solution
        System.out.println("For loop solution");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // while loop solution
        System.out.println("While loop solution");
        int index = numbers.length - 1;
        while (index >= 0) {
            System.out.println(numbers[index]);
            index--;
        }
    }
}
