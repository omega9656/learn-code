package com.omegarobotics.unit6.practice.geometric;

/*
 * Write a class called TestGeometricObject
 * which tests the getArea, getPerimeter, and
 * compareTo methods of Circle and Rectangle.
 *
 * To do this, create an array of Circle and
 * Rectangle objects. For each GeometricObject
 * in the array, print its area and perimeter.
 *
 * To test the compareTo method, use Arrays.sort
 * on the array and print the sorted array.
 */

import java.util.Arrays;

public class TestGeometricObject {
	public static void main(String[] args) {
		// store geometric objects in an array
		GeometricObject[] shapes = {
				new Circle(5),
				new Rectangle(3, 4),
				new Circle(10),
				new Rectangle(20, 12.3),
				new Circle(0.05),
				new Rectangle(4.5, 10.9)
		};

		// print area and perimeter of each geometric object
		for (GeometricObject s: shapes) {
			System.out.println("Area: " + s.getArea());
			System.out.println("Perimeter: " + s.getPerimeter());
			System.out.println(); // whitespace for readability
		}

		// test compareTo by sorting the array
		Arrays.sort(shapes);

		// print sorted array
		for (GeometricObject s: shapes) {
			System.out.println(s);
		}
	}
}
