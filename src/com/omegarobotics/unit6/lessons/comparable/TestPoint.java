package com.omegarobotics.unit6.lessons.comparable;

public class TestPoint {

    public static void main(String[] args) {
        Point[] points = {
            new Point(5, 5),
            new Point(4, 5),
            new Point(5, 5),
            new Point(6, 5),
            new Point(5, 6),
        };

        for (int i = 1; i < points.length; i++) {
            int comparisonResult = points[0].compareTo(points[i]);
            if (comparisonResult > 0) {
                System.out.println("Greater than");
            } else if (comparisonResult == 0) {
                System.out.println("Equal to");
            } else {
                System.out.println("Less than");
            }
        }
    }
}
