package com.omegarobotics.unit5.practice;

/*
Create a class called Point
that has 2 public fields x and y (doubles)

+ Create a default and 2-arg constructor
+ Create a getDistance(Point pt) method to calculate
  the distance between this Point and the given Point
+ Create a getDistance(double x, double y) method to calculate
  the distance between this Point and the given point
+ Override the toString method

Do not create getters/setters (since x and y are public)

Bonus points for javadoc comments on each method
(except toString) and on the class itself.
 */

/** Representation of a point (x, y) on
 * the Cartesian coordinate system. */
public class Point {
  public double x; // x coordinate
  public double y; // y coordinate

  /** Constructs a default <code>Point</code> object
   * with coordinates (0, 0)
   */
  public Point() {
    x = 0;
    y = 0;
  }

  /**
   * Constructs a <code>Point</code> object
   * with given coordinates
   * @param x  x coordinate
   * @param y  y coordinate
   */
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns the distance between this <code>Point</code>
   * and a given <code>Point</code>
   * @param pt  Point to calculate the distance from
   * @return the distance between this <code>Point</code>
   * and a given <code>Point</code>
   */
  public double getDistance(Point pt) {
    return getDistance(pt.x, pt.y);
  }

  /**
   * Returns the distance between this <code>Point</code>
   * and another point, given that point's x and y coordinates.
   * @param x  x coordinate of a point to calculate the distance from
   * @param y  y coordinate of a point to calculate the distance from
   * @return the distance between this <code>Point</code>
   * and a given point, using that point's x and y coordinates
   */
  public double getDistance(double x, double y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  @Override
  public String toString() {
    return String.format("(%f, %f)", x, y);
  }
}
