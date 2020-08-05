package com.omegarobotics.unit7.lessons.exceptions;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.setRadius(-5);
    }
}