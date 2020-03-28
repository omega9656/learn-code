package com.omegarobotics.unit3.practice;

/*
Topics:
- Practice using methods from the Math class
 */

import java.util.Scanner;

public class ComputeDistance {
    public static void main(String[] args) {
        /*
        Prompt user to enter 2 (x, y) coordinates.
        Given those 2 points, calculate and print
        the distance between them.
         */

        // prompt user to enter coordinates
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // calculate and print the distance between the points
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("The distance between those 2 points is " + distance);
    }
}
