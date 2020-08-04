package com.omegarobotics.unit6.challenges.robot;

/*
 * Topics:
 * - Enums
 * - State machines
 * - Preview FTC SDK
 */

/*
 * Partially rewrite the Arm class (see link below) so that
 * there is only 1 field called motor of type DcMotor.
 *
 * Create an enum called Position whose values are the names of each
 * position the arm can be in. It should have 1 field, ENCODER_VALUE, a constant int.
 * Write a constructor for the enum so that each arm position has its corresponding
 * encoder value.
 *
 * The Arm class should have 1 method called moveArm which takes a Position
 * and sets the position of the Arm's motor to the Position's encoder value.
 *
 * Use with:
 * https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/Arm.java
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

    public void moveArm(Position pos) {
        motor.setPosition(pos.ENCODER_VALUE);
    }
    // alternatively, if the enum doesn't have fields,
    // use a switch statement to set position
    //	public void moveArm(Position pos) {
    //		switch (pos) {
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
