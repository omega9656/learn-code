package com.omegarobotics.unit6.lessons.graph;

import java.util.Arrays;

/*
 * Topics:
 * - Comparable interface (touch on generics)
 */

public class TestPoint {
	public static void main(String[] args) {
		Point[] points = {
				new Point(3, 4),
				new Point(1, 0.5),
				new Point(3, 5),
				new Point(12, 54.3),
				new Point(3, 4),
				new Point(0, 0)
		};

		// print unsorted array
		for (Point p: points) {
			System.out.println(p);
		}
		System.out.println();

		// Arrays.sort sorts using compareTo
		// which is considered the "natural order"
		Arrays.sort(points);

		// print sorted array
		for (Point p: points) {
			System.out.println(p);
		}
	}
}
