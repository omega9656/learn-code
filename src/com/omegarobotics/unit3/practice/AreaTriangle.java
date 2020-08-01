package com.omegarobotics.unit3.practice;

/*
Topics:
- Practice using methods from the Math class
 */

import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {
        /*
        Prompt the user for 3 sides of a triangle.
        Given those sides, calculate and print the area.
        (Your program should also check to make
        sure that the side lengths given form a valid triangle.
        If they do not, print an error message
        instead of the triangle's area.)
        Hint: Use Heron's formula.
         */

        // prompt user for 3 sides of a triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter s1 s2 s3: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        input.close();

        // check if sides form a valid triangle
        boolean isValidTriangle = s1 + s2 > s3 || s1 + s3 > s2 || s2 + s3 > s1;

        if (isValidTriangle) {
            // calculate and print the area if sides are vaild
            double s = (s1 + s2 + s3) / 2; // semiperimeter
            double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
            System.out.println("The area of that triangle is " + area);
        } else {
            // otherwise, print error message
            System.out.println(
                "Error, those sides do not form a valid triangle."
            );
        }
    }
}
