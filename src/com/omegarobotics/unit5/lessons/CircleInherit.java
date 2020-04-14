package com.omegarobotics.unit5.lessons;

/*
Topics:
- Inheritance
- extends
- Object class
- super
 */

public class CircleInherit extends GeometricObject {
    private double radius;

    /** Default constructor
     * Creates a circle of radius 0 */
    public CircleInherit() {
        super();
        radius = 0;
    }

    /** Creates a circle with given radius */
    public CircleInherit(double radius) {
        super();
        this.radius = radius;
    }

    /** Creates a circle with given radius, center (x, y), color, and filled value */
    public CircleInherit(double radius, double x, double y, String color, boolean filled) {
        super(x, y, color, filled);
        this.radius = radius;
    }

    /** Returns the circle's radius */
    public double getRadius() {
        return radius;
    }

    /** Sets the circles radius to given radius */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    /** Returns the area of the circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Returns the circumference of the circle */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // for use during TestCircle.java
    /** Overrides toString method */
    @Override
    public String toString() {
        return "Circle radius " + radius;
    }
}
