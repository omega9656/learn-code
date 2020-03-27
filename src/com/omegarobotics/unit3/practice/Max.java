package com.omegarobotics.unit3.practice;

/*
Topics:
- Methods practice
- if/else
 */

public class Max {
    public static void main(String[] args) {
        /*
        Create a method called max() which has 2 parameters,
        which are numbers (doubles). Return the maximum of those 2 numbers.
        Call the method in the main method and print the result of calling it.
         */

        System.out.println(max(3, 5.7));
        System.out.println(max(3, 3));
        System.out.println(max(-252.2, 9035.26));
    }

    /**
     * @param n1  first number
     * @param n2  second number
     * @return the maximum of the 2 numbers
     */
    public static double max(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
