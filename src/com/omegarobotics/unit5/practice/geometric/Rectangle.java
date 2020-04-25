package com.omegarobotics.unit5.practice.geometric;

/*
Create a class called Rectangle
with all appropriate fields and methods.
Bonus points if you create javadoc comments
for each method.

Use this with TestRectangle.java

Note: Only ask students to override equals after you've
gone over CompareObjects.java and TestGeometricObject.java
 */

public class Rectangle {
    private double length;
    private double width;

    /** Default constructor
     * Creates a 0x0 rectangle */
    public Rectangle() {
        length = 0;
        width = 0;
    }

    /** Creates a rectangle with given length and width */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** Returns the rectangle's length */
    public double getLength() {
        return length;
    }

    /** Sets the rectangle's length to given length */
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    /** Returns the rectangle's width */
    public double getWidth() {
        return width;
    }

    /** Sets the rectangle's width to given width */
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    /** Returns the rectangle's area */
    public double getArea() {
        return length * width;
    }

    /** Returns the rectangle's perimeter */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle length: " + length + ", width: " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            return ((Rectangle) obj).getArea() == this.getArea();
        }
        return false;
    }
}
