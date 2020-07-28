package com.omegarobotics.unit6.practice.geometric;

/*
 * Create an abstract class called GeometricObject,
 * which is the same as GeometricObject in unit 5,
 * except it has 2 abstract methods:
 * getArea and getPerimeter, and also implements
 * Comparable such that GeometricObjects are compared
 * by their areas.
 */

public abstract class GeometricObject implements Comparable<GeometricObject> {
  private double x; // x coordinate of the center
  private double y; // y coordinate of the center
  private String color;
  private boolean filled;

  public GeometricObject() {
    x = 0;
    y = 0;
    color = "white";
    filled = false;
  }

  public GeometricObject(double x, double y, String color, boolean filled) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.filled = filled;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  @Override
  public int compareTo(GeometricObject g) {
    if (getArea() > g.getArea()) {
      return 1;
    } else if (getArea() == g.getArea()) {
      return 0;
    } else {
      return -1;
    }
  }
}
