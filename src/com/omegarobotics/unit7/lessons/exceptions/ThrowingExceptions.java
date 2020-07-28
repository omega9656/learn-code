package com.omegarobotics.unit7.lessons.exceptions;

/*
 * Topics:
 * - Throwing exceptions
 * - Checked vs unchecked exceptions
 */

public class ThrowingExceptions {

  public static void main(String[] args) {
    try {
      Circle c1 = new Circle(5);
      Circle c2 = new Circle(-5);
      Circle c3 = new Circle(0);
    } catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    // only 1 Circle created because once an exception is caught,
    // the rest of the try block is not executed
    System.out.println(
      "Number of objects created: " + Circle.getNumberOfCircles()
    );
  }
}

class Circle {
  /** Radius of the circle */
  private double radius;

  /** Number of circles created */
  private static int numberOfCircles = 0;

  /** Construct a Circle with radius 1 */
  public Circle() {
    this(1.0);
  }

  /**
   * Construct a circle with a specified radius
   * @param radius  radius of this Circle
   */
  public Circle(double radius) {
    setRadius(radius);
    numberOfCircles++;
  }

  /**
   * Returns the radius
   * @return the radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets a new radius
   * @param radius  new radius
   * @throws IllegalArgumentException if the new radius is negative
   */
  public void setRadius(double radius) throws IllegalArgumentException { // declare exception with throws keyword*
    // *technically don't need to in this case b/c
    // IllegalArgumentException is a RuntimeException, which is unchecked
    if (radius >= 0) {
      this.radius = radius;
    } else {
      throw new IllegalArgumentException("Radius cannot be negative"); // throw exception (with message)
      // alternate: construct new exception and then throw it
      //			IllegalArgumentException ex = new IllegalArgumentException("This is an error message");
      //			throw ex;
    }
  }

  /**
   * Returns the number of circles
   * @return the number of circles
   */
  public static int getNumberOfCircles() {
    return numberOfCircles;
  }

  /**
   * Returns the area of this circle
   * @return the area of this circle
   */
  public double findArea() {
    return radius * radius * Math.PI;
  }
}
