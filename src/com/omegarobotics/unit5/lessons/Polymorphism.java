package com.omegarobotics.unit5.lessons;

import com.omegarobotics.unit5.lessons.geometric.CircleInherit;
import com.omegarobotics.unit5.lessons.geometric.GeometricObject;
import com.omegarobotics.unit5.practice.geometric.RectangleInherit;

/*
Topics:
- Polymorphism - a variable of a supertype can refer to a subtype object
- instanceof operator, casting
 */

public class Polymorphism {

    public static void main(String[] args) {
        GeometricObject[] shapes = new GeometricObject[3];

        shapes[0] = new GeometricObject();
        shapes[1] = new CircleInherit(5.0, 6.0, 2.0, "red", true);
        shapes[2] = new RectangleInherit(3.0, 4.0, 10.0, 9.0, "blue", true);

        // can't have a subtype refer to supertype
        // Circle c1 = new GeometricObject();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(
                "Location of shape " +
                i +
                " is (" +
                shapes[i].getX() +
                ", " +
                shapes[i].getY() +
                ")"
            );
            System.out.println(i + ": " + shapes[i].toString());

            /*
             * The order of these tests matters!
             * A Circle object is an instance of the Circle class,
             * but it is *also* an instance of the GeometricObject class.
             *
             * If you want to test instanceof, test for subclass membership first,
             * then superclass membership
             */
            if (shapes[i] instanceof CircleInherit) {
                System.out.printf(
                    "Diameter: %.4f\n",
                    ((CircleInherit) shapes[i]).getDiameter()
                );
            } else if (shapes[i] instanceof RectangleInherit) {
                System.out.printf(
                    "Perimeter: %.4f\n",
                    ((RectangleInherit) shapes[i]).getPerimeter()
                );
            } else {
                System.out.println("This is a only a GeometricObject");
            }
        }

        // below doesn't work b/c java only knows that shapes are GeometricObjects at compile time,
        // but not necessarily Circles or Rectangles:
        // double circleCircumference = shapes[1].getDiameter();
        // double RectanglePerimeter = shapes[2].getPerimeter();

        // above solved --> cast
        double circleCircumference = ((CircleInherit) shapes[1]).getPerimeter();
        double RectanglePerimeter =
            ((RectangleInherit) shapes[2]).getPerimeter();
        System.out.println("Circle circumference " + circleCircumference);
        System.out.println("Rectangle perimeter " + RectanglePerimeter);
        // below is fine at compile, but when you run it, it will throw a ClassCastException
        // because child can be cast to parents, but not other way around:
        // double objectPerim = ((Rectangle) shapes[0]).getPerimeter();
    }
}
