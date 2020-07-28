package com.omegarobotics.unit6.lessons.enums;

/*
 * Topics:
 * - Using enum fields and methods
 */

public class TestTrafficLight {

  public static void main(String[] args) {
    TrafficLight light = TrafficLight.GREEN;
    System.out.println(light.getDescription());
  }
}
