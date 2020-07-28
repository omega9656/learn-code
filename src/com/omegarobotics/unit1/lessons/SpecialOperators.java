package com.omegarobotics.unit1.lessons;

/*
Topics:
- Augmented assignment operators
- Post/pre increment/decrement operators
 */

public class SpecialOperators {

    public static void main(String[] args) {
        // augmented assignment operators
        int a = 1;

        a += 1; // equivalent to a = a + 1;
        a -= 2; // equivalent to a = a - 2;
        a *= 3; // equivalent to a = a * 3;
        a /= 4; // equivalent to a = a / 4;
        a %= 5; // equivalent to a = a % 5;

        // post/pre increment/decrement operators
        int i = 1;
        int j;

        j = ++i; // j is 2, i is 2
        System.out.println("j: " + j + ", i: " + i);

        i = 1; // reset
        j = i++; // j is 1, i is 2
        System.out.println("j: " + j + ", i: " + i);

        i = 1; // reset
        j = --i; // j is 0, i is 0
        System.out.println("j: " + j + ", i: " + i);

        i = 1; // reset
        j = i--; // j is 1, i is 0
        System.out.println("j: " + j + ", i: " + i);
    }
}
