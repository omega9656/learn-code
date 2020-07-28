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
 * Create an enum called Position which stores the
 * names of each position and its corresponding servo position
 * as a constant (see link below).
 *
 * Write a method called moveGripper which takes a Position
 * and sets the position of the Foundation Gripper's servo to
 * the Position's servo position value.
 *
 * Use with:
 * https://github.com/FTC-9656-Omega-Robotics/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/FoundationGripper.java
 */

public class FoundationGripper {
  public Servo gripper;

  public enum Position {
    UP(0.55),
    DOWN(1),
    READY(0.85);

    public final double SERVO_POSITION;

    Position(double SERVO_POSITION) {
      this.SERVO_POSITION = SERVO_POSITION;
    }
  }

  public void moveGripper(Position p) {
    gripper.setPosition(p.SERVO_POSITION);
  }
}
