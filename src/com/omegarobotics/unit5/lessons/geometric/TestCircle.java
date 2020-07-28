package com.omegarobotics.unit5.lessons.geometric;

/*
Topics:
- Using constructors/creating objects (new keyword)
- Calling methods on an object (dot notation)
- Driver programs
- static
- Packages (accessing classes in the same package, importing)
- toString method (overriding vs. overloading)
 */

public class TestCircle {

  public static void main(String[] args) {
    // default constructor
    Circle myCircle = new Circle();
    System.out.println("myCircle radius: " + myCircle.getRadius());
    // using toString method
    System.out.println(myCircle); // demo without the toString method

    // 1-arg constructor
    Circle myOtherCircle = new Circle(5.43);
    System.out.println(myOtherCircle);
    myOtherCircle.setRadius(3);
    System.out.println(myOtherCircle);
    double area = myOtherCircle.getArea();
    System.out.println(area);
  }
}
