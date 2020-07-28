package com.omegarobotics.unit3.lessons;

/*
Topics:
- Common methods from the java.lang.Math class
 */

public class UsingMath {

  public static void main(String[] args) {
    System.out.println(Math.PI); // approximation of pi
    System.out.println(Math.E); // approximation of e

    System.out.println(Math.max(1, 5)); // maximum of 2 numbers
    System.out.println(Math.min(1, 5)); // minimum of 2 numbers

    System.out.println(Math.pow(2, 5)); // exponents
    System.out.println(Math.exp(1)); // e ^ some number
    System.out.println(Math.log(Math.E)); // natural log (ln)
    System.out.println(Math.log10(100)); // log base 10

    System.out.println(Math.sqrt(25)); // square root

    System.out.println(Math.toRadians(60)); // convert from deg to rad
    System.out.println(Math.toDegrees(2 * Math.PI)); // convert from rad to deg

    System.out.println(Math.sin(Math.toRadians(60))); // sine (argument must be in radians!)
    System.out.println(Math.cos(Math.toRadians(60))); // cosine (radians!)
    System.out.println(Math.tan(Math.toRadians(60))); // tangent (radians!)

    System.out.println(Math.asin(Math.toRadians(60))); // arc/inverse sine (argument must be in radians!)
    System.out.println(Math.acos(Math.toRadians(60))); // arc/inverse cosine (radians!)
    System.out.println(Math.atan(Math.toRadians(60))); // arc/inverse tangent (radians!)

    System.out.println(Math.abs(-5)); // absolute value

    System.out.println(Math.floor(5.7)); // round down to nearest integer
    System.out.println(Math.ceil(3.3)); // round up to nearest integer
    System.out.println(Math.round(3.5)); // round normally to nearest unit
  }
}
