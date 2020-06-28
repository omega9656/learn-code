package com.omegarobotics.unit6.practice.robot;

/*
 * Topics:
 * - Preview FTC SDK
 */

public class Servo {
	private double position;

	Servo() {
		position = 0;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}
}
