package com.omegarobotics.unit4.lessons;

/*
Topics:
- Overloading methods
 */

public class OverloadingMethods {
    public static void main(String[] args) {
        /*
        Create another method called max which returns the max of 3 numbers (double).
        Call it in the main method and print the result of the call.
        Hint: Use the 2-argument max() method.
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

    /**
     * @param n1  first number
     * @param n2  second number
     * @param n3  third number
     * @return the maximum of the 3 numbers
     */
    public static double max(double n1, double n2, double n3) {
        return max(max(n1, n2), n3);
    }
}
