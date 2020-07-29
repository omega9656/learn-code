package com.omegarobotics.unit6.practice.geometric;

/*
 * Rewrite the Circle class (unit 5)
 * so that it extends the abstract class
 * GeometricObject.
 */

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    public double getDiameter() {
        return radius * 2;
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
