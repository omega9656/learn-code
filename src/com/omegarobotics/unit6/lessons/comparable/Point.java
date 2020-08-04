package com.omegarobotics.unit6.lessons.comparable;

public class Point implements Comparable<Point> {
    public double x;
    public double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point pt) {
        // compare on x coordinate first
        if (x > pt.x) {
            return 1;
        } else if (x == pt.x) {
            // if x coordinates are equal, compare y
            if (y > pt.y) {
                return 1;
            } else if (y == pt.y) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}