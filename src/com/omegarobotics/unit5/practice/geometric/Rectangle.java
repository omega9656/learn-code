package com.omegarobotics.unit5.practice.geometric;

/*
Create a class called Rectangle
with all appropriate fields and methods.
Bonus points if you create javadoc comments
for each method.

Use this with TestRectangle.java

Note: Only ask students to override equals after you've
gone over CompareObjects.java and TestGeometricObject.java
 */

public class Rectangle {
  private double length;
  private double width;

  /**
   * Constructs a default {@code Rectangle}
   */
  public Rectangle() {
    length = 0;
    width = 0;
  }

  /**
   * Constructs a {@code Rectangle} with given length and width
   * @param length  length of this {@code Rectangle}
   * @param width  width of this {@code Rectangle}
   */
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  /**
   * Returns the length of this {@code Rectangle}
   * @return the length of this {@code Rectangle}
   */
  public double getLength() {
    return length;
  }

  /**
   * Sets the length of this the length of
   * this {@code Rectangle} to given length
   * @param length  new length
   */
  public void setLength(double length) {
    if (length >= 0) {
      this.length = length;
    }
  }

  /**
   * Returns the width of this {@code Rectangle}
   * @return the width of this {@code Rectangle}
   */
  public double getWidth() {
    return width;
  }

  /**
   * Sets the width of this {@code Rectangle}
   * to the given width
   * @param width  new width
   */
  public void setWidth(double width) {
    if (width >= 0) {
      this.width = width;
    }
  }

  /**
   * Returns the area of this {@code Rectangle}
   * @return the area of this {@code Rectangle}
   */
  public double getArea() {
    return length * width;
  }

  /**
   * Returns the perimeter of this {@code Rectangle}
   * @return the perimeter of this {@code Rectangle}
   */
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
