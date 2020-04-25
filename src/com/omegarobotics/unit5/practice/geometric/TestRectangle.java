package com.omegarobotics.unit5.practice.geometric;

/*
Create a driver class called TestRectangle
to test the Rectangle class.
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("rect1: " + rect1);
        Rectangle rect2 = new Rectangle(5.5, 35.25);
        System.out.println("rect2: " + rect2);
        System.out.println("area rect2: " + rect2.getArea());
        System.out.println("rect2 equals rect1: " + rect2.equals(rect1));
        System.out.println("length rect2: " + rect2.getLength());
        System.out.println("width rect2: " + rect2.getWidth());
        System.out.println("perimeter rect2: " + rect2.getPerimeter());
        rect2.setLength(0);
        rect2.setWidth(0);
        System.out.println("set length and width rect2: " + rect2);
        System.out.println("rect2 equals rect1: " + rect2.equals(rect1));
    }
}