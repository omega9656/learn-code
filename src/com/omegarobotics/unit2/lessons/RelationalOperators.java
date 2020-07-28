package com.omegarobotics.unit2.lessons;

/*
Topics:
- Relational operators
 */

public class RelationalOperators {

  public static void main(String[] args) {
    // equal to
    // common mistake: using assignment operator =
    System.out.println(5 == 5); // true

    // not equal to
    System.out.println(5 != 6); // true
    System.out.println(5 != 5); // false

    // greater than
    System.out.println(20 > 5); // true

    // less than
    System.out.println(100 < 50.5); // false

    // greater than or equal to
    System.out.println(100 >= 100); // true

    // less than or equal to
    System.out.println(50 <= 49); // false
  }
}
