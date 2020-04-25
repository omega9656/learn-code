package com.omegarobotics.unit5.practice.geometric;

import com.omegarobotics.unit5.lessons.geometric.GeometricObject;

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

    /** Constructs a default {@code RectangleInherit} object */
    public RectangleInherit() {
        super(); // explicit call
        length = 0;
        width = 0;
    }

    /**
     * Constructs a {@code RectangleInherit} object
     * with given length and width
     * @param length  length of this {@code RectangleInherit} object
     * @param width  width of this {@code RectangleInherit} object
     */
    public RectangleInherit(double length, double width) {
        super(); // explicit call
        this.length = length;
        this.width = width;
    }

    /**
     * Constructs a {@code RectangleInherit} object with given length, width, center (x, y), color, and filled value
     * @param length  length of this {@code RectangleInherit} object
     * @param width  width of this {@code RectangleInherit} object
     * @param x  x coordinate of the center of this {@code RectangleInherit} object
     * @param y  y coordinate of the center of this {@code RectangleInherit} object
     * @param color  color of this {@code RectangleInherit} object
     * @param filled  whether this {@code RectangleInherit} object is filled with the given color
     */
    public RectangleInherit(double length, double width, double x, double y, String color, boolean filled) {
        super(x, y, color, filled);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of this {@code RectangleInherit} object
     * @return the length of this {@code RectangleInherit} object
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of this {@code RectangleInherit} object
     * to the given length if that length is greater than or equal to 0.
     * @param length  new length
     */
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    /**
     * Returns the width of this {@code RectangleInherit} object
     * @return the width of this {@code RectangleInherit} object
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this {@code RectangleInherit} object
     * to the given width if that width is greater than or
     * equal to 0.
     * @param width  new width
     */
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    /**
     * Returns the area of this {@code RectangleInherit} object
     * @return the area of this {@code RectangleInherit} object
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Returns the perimeter of this {@code RectangleInherit} object
     * @return the perimeter of this {@code RectangleInherit} object
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle length: " + length + ", width: " + width;
    }
}
