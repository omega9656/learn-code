package com.omegarobotics.unit7.lessons.exceptions;

public class TestException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException will be thrown
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[5]);
    }
}