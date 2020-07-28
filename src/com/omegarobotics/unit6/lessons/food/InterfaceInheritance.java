package com.omegarobotics.unit6.lessons.food;

/*
 * Topics:
 * - Interface inheritance
 */

public class InterfaceInheritance {

  public static void main(String[] args) {
    Chicken toodles = new Chicken();

    // you can treat interfaces like superclasses
    if (toodles instanceof Edible) {
      System.out.println(1);
    }

    if (toodles instanceof Fridgeable) {
      System.out.println(2);
    }
  }
}
