package com.omegarobotics.unit5.practice;

/*
Create a driver class called TestPoint
to test the methods in the Point class.
 */

public class TestPoint {

    public static void main(String[] args) {
        // test constructors
        Point myPoint = new Point();
        Point myPoint2 = new Point(3.4, 150);

        // test toString method
        System.out.println("myPoint: " + myPoint);
        System.out.println("myPoint2: " + myPoint2);

        // test getDistance methods
        double d1 = myPoint.getDistance(myPoint2);
        double d2 = myPoint.getDistance(myPoint2.x, myPoint2.y);
        System.out.println("distance between 2 points is " + d1);
        System.out.println("d1 == d2: " + (d1 == d2));
    }
}
