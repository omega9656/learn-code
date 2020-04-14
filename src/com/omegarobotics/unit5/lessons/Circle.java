package com.omegarobotics.unit5.lessons;

/*
Topics:
- Classes vs. Objects
- Field vs. behavior
- Constructors
- Visibility modifiers (public, private, default, protected)
- this
- Accessors and mutators (setters/getters)
 */

public class Circle {
    private double radius;

    /** Default constructor
     * Creates a circle of radius 0 */
    public Circle() {
        radius = 0;
    }

    /** Creates a circle with given radius */
    public Circle(double radius) {
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
