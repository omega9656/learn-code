package com.omegarobotics.unit6.challenges.robot;

/*
 * Topics:
 * - Enums
 * - State machines
 * - Preview FTC SDK
 */

/*
 * Partially rewrite the Arm class so that
 * there is only 1 field called motor of type DcMotor.
 *
 * Create an enum called Position which stores the
 * names of each position and its corresponding encoder value
 * as a constant (see link below).
 *
 * Write a method called moveArm which takes a Position
 * and sets the position of the Arm's motor to
 * the Position's encoder value.
 *
 * Use with:
 * https://github.com/FTC-9656-Omega-Robotics/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/Arm.java
 */

public class Arm {
    public DcMotor motor;

    public enum Position {
        INIT(-250),
        UP(-100),
        DOWN(-1400),
        TRAVELING(-210),
        DEPOSIT(-1700),
        INTAKING(-350);

        public final int ENCODER_VALUE;

        Position(int ENCODER_VALUE) {
            this.ENCODER_VALUE = ENCODER_VALUE;
        }
    }

    public void moveArm(Position position) {
        motor.setPosition(position.ENCODER_VALUE);
    }
    // alternatively, if the enum doesn't have fields,
    // use a switch statement to set position/power
    //	public void moveArm(Position position) {
    //		switch (position) {
    //			case INIT:
    //				motor.setPosition(-250);
    //				break;
    //			case UP:
    //				motor.setPosition(-100);
    //				break;
    //			case DOWN:
    //				motor.setPosition(-1400);
    //				break;
    //			case TRAVELING:
    //				motor.setPosition(-210);
    //				break;
    //			case DEPOSIT:
    //				motor.setPosition(-1700);
    //				break;
    //			case INTAKING:
    //				motor.setPosition(-350);
    //				break;
    //		}
    //	}
}
