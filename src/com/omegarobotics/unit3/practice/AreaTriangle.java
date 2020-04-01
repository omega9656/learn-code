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
        Hint: Use Heron's formula.
         */

        // prompt user for 3 sides of a triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter s1 s2 s3: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        input.close();

        // calculate and print the area
        double s = (s1 + s2 + s3) / 2; // semiperimeter
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        System.out.println("The area of that triangle is " + area);
    }
}
