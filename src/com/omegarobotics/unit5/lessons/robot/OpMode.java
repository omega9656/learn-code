package com.omegarobotics.unit5.lessons.robot;

/*
 * Topics:
 * - Aggregation/Modularity
 */

public class OpMode {

  public void runOpMode() {
    // initialize robot hardware
    Robot omegaBot = new Robot();

    // tell robot to do things (auto), OR
    // continuously check gamepads for input
    // and do stuff depending on which buttons are pressed
    omegaBot.lift.up();
  }
}
