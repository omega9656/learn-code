package com.omegarobotics.unit3.lessons;

/*
Topics:
- Pass by value
 */

public class TestPassByValue {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        System.out.println("before calling method, i is " + i);
        System.out.println("before calling method, j is " + j);

        System.out.println("result of calling increment on i: " + increment(i));
        System.out.println("result of calling increment on j: " + increment(j));

        System.out.println("after method, i is " + i);
        System.out.println("after method, j is " + j);
    }

    /**
     * @param number
     * @return number + 1
     */
    public static int increment(int number) {
        System.out.println("inside method, number is " + number);
        return ++number;
    }
}
