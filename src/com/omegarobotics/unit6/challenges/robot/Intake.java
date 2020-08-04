package com.omegarobotics.unit6.challenges.robot;

/*
 * Topics:
 * - Enums
 * - State machines
 * - Preview FTC SDK
 */

/*
 * Partially rewrite the Intake class so that
 * there are 2 fields left and right, both of type DcMotor.
 *
 * Create an enum called Direction whose values are the names of each
 * direction the intake can be going in. It should have 2 fields, LEFT_POWER
 * and RIGHT_POWER, both constant doubles. Write a constructor for the enum
 * so that each direction has its corresponding left and right power values.
 *
 * Write a method called runIntake which takes a Direction and sets the
 * power of the Intake's left and right motors to the Direction's left
 * and right power values, respectively.
 *
 * Use with:
 * https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/Intake.java
 */

public class Intake {
    public DcMotor left;
    public DcMotor right;

    public enum Direction {
        IN(1, -1),
        OUT(-0.3, 0.3),
        STOP(0, 0);

        public final double LEFT_POWER;
        public final double RIGHT_POWER;

        // create a constructor which takes 2 parameters:
        Direction(double LEFT_POWER, double RIGHT_POWER) {
            this.LEFT_POWER = LEFT_POWER;
            this.RIGHT_POWER = RIGHT_POWER;
        }
    }

    public void runIntake(Direction dir) {
        left.setPower(dir.LEFT_POWER);
        right.setPower(dir.RIGHT_POWER);
    }
}
