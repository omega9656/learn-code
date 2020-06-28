package com.omegarobotics.unit6.practice.robot;

/*
 * Topics:
 * - Preview FTC SDK
 */

public class DcMotor {
	private double power;
	private double position;

	DcMotor() {
		power = 0;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void setPosition(double position) {
		this.position = position;
	}
}
