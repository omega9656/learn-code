package com.omegarobotics.unit1.practice;

/*
Topics:
- import
- Scanner (user input)
- variables
- constants (Math.PI)
- exponents (Math.pow())
- printing multiple stuff with +
 */

// we import libraries so we don't have to write everything from scratch
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        /*
        Prompt the user to enter the radius of a circle.
        Calculate the area of that circle and print the result.
         */

        // get radius from user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        // compute area
        double area = Math.PI * radius * radius;
        // equivalent to: double area = Math.PI * Math.pow(radius, 2);

        // print the result
        System.out.println("The area of the circle is " + area);
    }
}
