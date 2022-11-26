package com.omegarobotics.unit6.challenges.robot;

/*
 * Topics:
 * - Enums
 * - State machines
 * - Preview FTC SDK
 */

/*
 * Partially rewrite the FoundationGripper class so that
 * there is only 1 field called gripper of type Servo.
 *
 * Create an enum called Position whose values are the names of each
 * position the foundation gripper can be in. It should have 1 field, SERVO_POSITION,
 * a constant double. Write a constructor for the enum so that each foundation gripper
 * position has its corresponding servo position value.
 *
 * Write a method called moveGripper which takes a Position and sets the position
 * of the foundation gripper's servo (gripper) to the Position's SERVO_POSITION value.
 *
 * Use with:
 * https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/FoundationGripper.java
 */

public class FoundationGripper {
    public Servo gripper;

    public enum Position {
        UP(0.5),
        DOWN(1.1),
        READY(0.9);

        public final double SERVO_POSITION;

        Position(double SERVO_POSITION) {
            this.SERVO_POSITION = SERVO_POSITION;
        }
    }

    public void moveGripper(Position pos) {
        gripper.setPosition(pos.SERVO_POSITION);
    }
}
