package com.omegarobotics.unit5.practice;

import com.omegarobotics.unit5.lessons.GeometricObject;

/*
Topics:
- Practice with inheritance
 */

/*
Create the constructors for the RectangleInherit class
based on the fact that it inherits GeometricObject
(other fields and methods are provided for you)
 */

public class RectangleInherit extends GeometricObject {
    private double length;
    private double width;

    /** Default constructor
     * Creates a 0x0 rectangle */
    public RectangleInherit() {
        super();
        length = 0;
        width = 0;
    }

    /** Creates a rectangle with given length and width */
    public RectangleInherit(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    /** Creates a rectangle with given length, width, center (x, y), color, and filled value */
    public RectangleInherit(double length, double width, double x, double y, String color, boolean filled) {
        super(x, y, color, filled);
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

    /** Overrides toString method */
    @Override
    public String toString() {
        return "Rectangle length: " + length + ", width: " + width;
    }
}
