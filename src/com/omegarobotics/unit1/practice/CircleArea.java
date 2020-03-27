package com.omegarobotics.unit1.practice;

import java.util.Scanner; // import libraries so we don't have to write everything from scratch

public class CircleArea {
    public static void main(String[] args) {
        // get radius from user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();

        // compute area
        double area = Math.PI * radius * radius;
        // double area = Math.PI * Math.pow(radius, 2);

        // print the result
        System.out.println("The area of the circle is " + area);
    }
}
