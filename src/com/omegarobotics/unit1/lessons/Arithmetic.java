package com.omegarobotics.unit1.lessons;

/*
Topics:
- Arithmetic operators (including modulus)
- Division (integer vs double)
 */

public class Arithmetic {

  public static void main(String[] args) {
    int a = 2;
    int b = 5;
    double c = 7;
    int d = 10;

    System.out.println(a + b); // 7
    System.out.println(a - b); // -3
    System.out.println(a + b - c); // 0.0

    System.out.println(a * b); // 10

    System.out.println(c / a); // double division: 3.5
    System.out.println(b / a); // integer division: 2

    System.out.println(d % a); // modulus/remainder: 0
    System.out.println(d % c); // modulus/remainder: 3.0
  }
}
