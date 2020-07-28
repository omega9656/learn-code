package com.omegarobotics.unit6.practice.geometric;

/*
 * Rewrite the Rectangle class (unit 5)
 * so that it extends the abstract class
 * GeometricObject.
 */

public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
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
