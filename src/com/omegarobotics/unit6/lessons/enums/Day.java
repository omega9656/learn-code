package com.omegarobotics.unit6.lessons.enums;

/*
 * Topics:
 * - Enumerated types (enums)
 */

// enums are a subclass of Object
// and implement Comparable
// you can invoke equals, toString, compareTo
// equals - returns true if same ordinal
// compareTo - returns difference between the ordinal values
public enum Day { // always static, so static keyword is implicit
  SUNDAY, // enum values
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
}
// enums can be in their own file or with other classes
