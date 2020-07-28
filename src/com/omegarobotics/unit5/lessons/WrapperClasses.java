package com.omegarobotics.unit5.lessons;

/*
Topics:
- Wrapper classes (Integer, Double, Character, etc.)
- Boxing/unboxing
- Auto-boxing/auto-unboxing
- Mutable vs immutable
- Why wrapper classes?
 */

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {
        // auto-boxing (int to Integer)
        Integer intObject = 2;
        // equivalent to:
        // Integer intObject = new Integer(2);

        // auto-unboxing (Integer to int)
        int x = intObject;

        // mutable vs immutable
        // the following code just changes what s references,
        // it doesn't actually change the original string
        String s = "Java";
        s = "HTML";

        // why do we need wrapper classes?
        // ex: array lists only store objects, not primitives
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);
    }
}
