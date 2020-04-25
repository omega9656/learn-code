package com.omegarobotics.unit5.lessons.geometric;

public class GeometricObject {
    private double x; // x coordinate of the center
    private double y; // y coordinate of the center
    private String color;
    private boolean filled;

    /** Default constructor
     * Creates a geometric object
     * with a center at (0, 0)
     * and color white. */
    public GeometricObject() {
        x = 0;
        y = 0;
        color = "white";
        filled = false;
    }

    /** Creates a geometric object with center at (x, y) and given color */
    public GeometricObject(double x, double y, String color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    /** Returns the x coordinate of the center
     * of the geometric object */
    public double getX() {
        return x;
    }

    /** Sets the x coordinate of the center
     * of the geometric object */
    public void setX(double x) {
        this.x = x;
    }

    /** Returns the y coordinate of the center
     * of the geometric object */
    public double getY() {
        return y;
    }

    /** Sets the y coordinate of the center
     * of the geometric object */
    public void setY(double y) {
        this.y = y;
    }

    /** Returns the color of the geometric object */
    public String getColor() {
        return color;
    }

    /** Sets the color of the geometric object */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns whether the geometric object is filled */
    public boolean isFilled() {
        return filled;
    }

    /** Sets the whether or not the geometric object is filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
