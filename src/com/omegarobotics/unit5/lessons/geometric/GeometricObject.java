package com.omegarobotics.unit5.lessons.geometric;

public class GeometricObject {
  private double x; // x coordinate of the center
  private double y; // y coordinate of the center
  private String color;
  private boolean filled;

  /** Constructs a default {@code GeometricObject} */
  public GeometricObject() {
    x = 0;
    y = 0;
    color = "white";
    filled = false;
  }

  /**
   * Constructs a {@code GeometricObject} with center at (x, y) and given color
   * @param x  x coordinate of center of this {@code GeometricObject}
   * @param y  y coordinate of center of this {@code GeometricObject}
   * @param color  color of this {@code GeometricObject}
   * @param filled  whether this {@code GeometricObject} is filled with the given color
   */
  public GeometricObject(double x, double y, String color, boolean filled) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.filled = filled;
  }

  /**
   * Returns the x coordinate of the center
   * of this {@code GeometricObject}
   * @return the x coordinate of the center
   * of this {@code GeometricObject}
   */
  public double getX() {
    return x;
  }

  /**
   * Sets the x coordinate of the center
   * of this {@code GeometricObject}
   * @param x  new x coordinate
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * Returns the y coordinate of the center
   * of this {@code GeometricObject}
   * @return the y coordinate of the center
   * of this {@code GeometricObject}
   */
  public double getY() {
    return y;
  }

  /**
   * Sets the y coordinate of the center
   * of this {@code GeometricObject}
   * @param y  new y coordinate
   */
  public void setY(double y) {
    this.y = y;
  }

  /**
   * Returns the color of this {@code GeometricObject}
   * @return the color of this {@code GeometricObject}
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the color of the geometric object
   * @param color  new color
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Returns whether the geometric object is filled
   * @return {@code true} if this {@code GeometricObject} is filled
   */
  public boolean isFilled() {
    return filled;
  }

  /**
   * Sets the whether or not the geometric object is filled
   * @param filled  new status of filled
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
}
