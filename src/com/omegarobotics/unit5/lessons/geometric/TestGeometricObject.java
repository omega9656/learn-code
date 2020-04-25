package com.omegarobotics.unit5.lessons.geometric;

import com.omegarobotics.unit5.practice.geometric.RectangleInherit;

/*
Topics:
- instanceof
- calling superclass methods
 */

public class TestGeometricObject {
    public static void main(String[] args) {
        // create RectangleInherit and CircleInherit objects
        RectangleInherit myRectangle = new RectangleInherit(53.35, 925, 0, -5, "red", true);
        CircleInherit myCircle = new CircleInherit(3.14, 35.6, -36863, "orange", false);

        // print them
        System.out.println(myRectangle);
        System.out.println(myCircle);

        // you can use superclass and this class's methods
        System.out.println(myRectangle.getX());
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getX());

        // instanceof
        if (myRectangle instanceof GeometricObject) {
            System.out.println("myRectangle is a GeometricObject");
        }

        if (myRectangle instanceof RectangleInherit) {
            System.out.println("myRectangle is a RectangleInherit object");
        }

        if (myCircle instanceof GeometricObject) {
            System.out.println("myCircle is a GeometricObject");
        }

        if (myCircle instanceof CircleInherit) {
            System.out.println("myCircle is a CircleInherit object");
        }
    }
}
