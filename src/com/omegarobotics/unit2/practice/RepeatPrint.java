package com.omegarobotics.unit2.practice;

/*
Topics:
- Review for and while loops
 */

public class RepeatPrint {
    public static void main(String[] args) {
        /*
        Print a message of your choice to the console 5 times.
        Bonus points if you can solve this problem in 2 ways:
        one solution with a for loop, and the other with a while loop.
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Live long and prosper");
        }

        int count = 0;
        while (count < 5) {
            System.out.println("Hail Hydra");
            count++;
        }
    }
}
