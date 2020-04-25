package com.omegarobotics.unit5.lessons.geometric;

/*
Topics:
- Classes vs. Objects
- Field vs. behavior
- Constructors
- Visibility modifiers (public, private, default, protected)
- this
- Accessors and mutators (setters/getters)
- overriding (toString, equals)
Note: Only talk about overriding equals after you've
gone over CompareObjects.java and TestGeometricObject.java
 */

public class Circle {
    private double radius = 1;

    public Circle() {
        // default
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle radius " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return ((Circle) obj).getArea() == this.getArea();
        }
        return false;
    }
}












//public class Circle {
//    private double radius;
//
//    /** Default constructor
//     * Creates a circle of radius 0 */
//    public Circle() {
//        radius = 0;
//    }
//
//    /** Creates a circle with given radius */
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    /** Returns the circle's radius */
//    public double getRadius() {
//        return radius;
//    }
//
//    /** Sets the circles radius to given radius */
//    public void setRadius(double radius) {
//        if (radius >= 0) {
//            this.radius = radius;
//        }
//    }
//
//    /** Returns the area of the circle */
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    /** Returns the circumference of the circle */
//    public double getCircumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    // for use during TestCircle.java
//    /** Overrides toString method */
//    @Override
//    public String toString() {
//        return "Circle radius " + radius;
//    }
//}
