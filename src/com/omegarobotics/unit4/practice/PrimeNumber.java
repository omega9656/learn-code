package com.omegarobotics.unit4.practice;

/*
Topic:
- Program design (testing all cases, logic)
- Methods practice
- For/while loops practice
 */

public class PrimeNumber {
    /*
    Create a method called isPrime that returns
    true if the number (integer) given as an argument is prime
    and false otherwise.
    Call it in the main method and print the result of that call.
     */
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
        System.out.println(isPrime(0));
        System.out.println(isPrime(-4));
    }

    /**
     * @param number  number to check if it's prime or not
     * @return whether the number is prime or not
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

        /*
        // While loop solution
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
         */
    }
}
