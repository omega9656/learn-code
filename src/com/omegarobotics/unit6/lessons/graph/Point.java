package com.omegarobotics.unit6.lessons.graph;

/*
 * Topics:
 * - Comparable interface (touch on generics)
 */

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

  public double getDistance(Point pt) {
    return getDistance(pt.x, pt.y);
  }

  public double getDistance(double x, double y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  @Override
  public int compareTo(Point pt) {
    if (x > pt.x) { // compare by x coordinate first
      return 1;
    } else if (x == pt.x) { // if x coordinates are equal, compare y
      if (y > pt.y) {
        return 1;
      } else if (y == pt.y) { // points only equal if both x and y are equal
        return 0;
      } else { // y < pt.y
        return -1;
      }
    } else { // x < pt.x
      return -1;
    }
  }

  @Override
  public String toString() {
    return String.format("(%f, %f)", x, y);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Point) {
      return ((Point) obj).x == x && ((Point) obj).y == y;
    }
    return false;
  }
}
