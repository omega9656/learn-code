package com.omegarobotics.unit5.lessons;

/*
Topics:
- Explain why classes are needed/are a useful construct
 */

public class WhyClasses {
    public static void main(String[] args) {
        // with classes
        Triangle myTriangle = new Triangle(5, 10);
        double area1 = myTriangle.getArea();

        // without classes
        double base = 15;
        double height = 15;
        double area2 = getArea(base, height);
    }

    public static double getArea(double base, double height) {
        return 0.5 * base * height;
    }
}

class Triangle {
    double base;
    double height;

    public Triangle() {
        base = 1;
        height = 1;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
