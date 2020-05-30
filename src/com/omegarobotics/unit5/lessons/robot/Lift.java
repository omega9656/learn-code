package com.omegarobotics.unit5.lessons.robot;

/*
 * Topics:
 * - Aggregation/Modularity
 */

public class Lift {
	public int level = 0;
	public final int MAX_LEVEL = 5;

	public Lift() {
		// initialize hardware
	}

	public void up() {
		if (level < MAX_LEVEL) {
			level++;
		}
	}

	public void down() {
		if (level > 0) {
			level--;
		}
	}
}
