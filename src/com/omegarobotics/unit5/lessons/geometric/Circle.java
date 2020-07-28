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
    private double radius = 0;

    /** Constructs a default {@code Circle} */
    public Circle() {
        // default
    }

    /**
     * Constructs a {@code Circle} with the given radius
     * @param radius  radius of this {@code Circle}
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of this {@code Circle}
     * @return the area of this {@code Circle}
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the perimeter (circumference) of this {@code Circle}
     * @return the perimeter (circumference) of this {@code Circle}
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns the radius
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius to a given radius
     * if that radius is greater than
     * or equal to 0.
     * @param radius  new radius
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    /**
     * Returns the diameter
     * @return the diameter
     */
    public double getDiameter() {
        return 2 * radius;
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
