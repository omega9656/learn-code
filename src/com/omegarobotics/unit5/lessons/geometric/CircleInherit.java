package com.omegarobotics.unit5.lessons.geometric;

/*
Topics:
- Inheritance
- extends
- Object class
- super
 */

public class CircleInherit extends GeometricObject {
  private double radius;

  /** Constructs a default {@code CircleInherit} object */
  public CircleInherit() {
    super();
    radius = 0;
  }

  /**
   * Constructs a {@code CircleInherit} object with given radius
   * @param radius  radius of this {@code CircleInherit} object
   */
  public CircleInherit(double radius) {
    super();
    this.radius = radius;
  }

  /**
   * Constructs a {@code CircleInherit} object with given radius, center (x, y), color, and filled value
   * @param radius  radius of this {@code CircleInherit} object
   * @param x  x coordinate of the center of this {@code CircleInherit} object
   * @param y  y coordinate of the center of this {@code CircleInherit} object
   * @param color  color of this {@code CircleInherit} object
   * @param filled  whether this {@code CircleInherit} object is filled with the given color
   */
  public CircleInherit(
    double radius,
    double x,
    double y,
    String color,
    boolean filled
  ) {
    super(x, y, color, filled);
    this.radius = radius;
  }

  /**
   * Returns the radius of this {@code CircleInherit} object
   * @return the radius of this {@code CircleInherit} object
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets this {@code CircleInherit} object's radius to given radius
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
    return radius * 2;
  }

  /**
   * Returns the area of this {@code CircleInherit} object
   * @return the area of this {@code CircleInherit} object
   */
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   * Returns the perimeter of this {@code CircleInherit} object
   * @return the perimeter of this {@code CircleInherit} object
   */
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  // for use during TestCircle.java
  @Override
  public String toString() {
    return "Circle radius " + radius;
  }
}
