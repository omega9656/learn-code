package com.omegarobotics.unit6.lessons.food;

/*
 * Topics:
 * - Interfaces (classes can extend and implement)
 */

// can implement multiple interfaces
public class Basil extends Plant implements Edible, Fridgeable {

    // once you are at a concrete class, you must implement all
    // abstract methods necessary
    public void howToEat() {
        System.out.println("Add to a salad");
    }

    public void refrigerate() {
        System.out.println("Put Basil in the fridge");
        System.out.println("Fridge temp: " + FRIDGE_TEMP);
    }
}
