package com.omegarobotics.unit5.lessons.robot;

/*
 * Topics:
 * - Aggregation/Composition
 */

public class Robot {
    public Drivetrain dt;
    public Intake intake;
    public Lift lift;

    public Robot() {
        // initialize hardware
        dt = new Drivetrain();
        intake = new Intake();
        lift = new Lift();
    }
}
