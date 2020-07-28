package com.omegarobotics.unit3.lessons;

/*
Topics:
- Demonstrate that you can have multiple
  control variables and after-iteration
  activities in a for loop
 */

public class MultipleActionForLoop {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (i = 1, j = 1; i < 7; i++, j += 2) {
            System.out.printf("i: %d, j: %d, i + j: %d\n", i, j, i + j);
        }
    }
}
