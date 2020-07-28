package com.omegarobotics.unit6.lessons.food;

/*
 * Topics:
 * - Interfaces
 */

public interface Fridgeable {
  // interfaces only have abstract methods and constants
  double FRIDGE_TEMP = 40; // public static final is implicit
  void refrigerate();
}
