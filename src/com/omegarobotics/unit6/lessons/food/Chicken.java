package com.omegarobotics.unit6.lessons.food;

/*
 * Topics:
 * - Interfaces (classes can extend and implement)
 */

public class Chicken extends Bird implements Edible, Fridgeable {
	public void howToEat() {
		System.out.println("Fry it");
	}

	public void refrigerate() {
		System.out.println("Put Chicken in the fridge");
		System.out.println("Fridge temp: " + FRIDGE_TEMP);
	}
}
