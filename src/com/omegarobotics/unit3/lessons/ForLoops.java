package com.omegarobotics.unit3.lessons;

/*
Topics:
- for loops
- for each loops
- iterating through an array
- when to use a for loop
 */

public class ForLoops {

  public static void main(String[] args) {
    // for loop structure:
    // for (initialize control variable; condition to keep loop running; action after each iteration)
    for (int i = 0; i < 5; i++) {
      System.out.println("Merry Christmas, ya filthy animals!");
    }

    // iterating through an array
    String[] message = { "Merry", "Christmas", "ya", "filthy", "animals" };
    for (int i = 0; i < message.length; i++) {
      System.out.println(message[i]);
    }

    // for each loop structure:
    // for (type elementVariableName : iterableName)
    for (String word : message) {
      System.out.println(word);
    }
  }
}
