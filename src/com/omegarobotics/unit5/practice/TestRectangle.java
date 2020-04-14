package com.omegarobotics.unit5.practice;

/*
Topics:
- Practice creating classes
- Practice creating driver classes
 */

/*
Create a class called TestRectangle to test
the Rectangle class you will code.

Create a class called Rectangle (in a separate file)
with all appropriate fields and methods.
Bonus points if you create javadoc comments
for each method.

Use this with Rectangle.java
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(5.5, 35.25);
        System.out.println(rect2);
        System.out.println("area rect2: " + rect2.getArea());
    }
}