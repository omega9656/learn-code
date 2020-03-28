package com.omegarobotics.unit2.lessons;

/*
Topics:
- logical operators
 */

public class LogicalOperators {
    public static void main(String[] args) {
        // logical AND
        boolean bool1 = true && true; // true
        boolean bool2 = true && false; // false (order doesn't matter)
        boolean bool3 = false && false; // false

        // logical OR
        boolean bool4 = true || true; // true
        boolean bool5 = true || false; // true (order doesn't matter)
        boolean bool6 = false || false; // false

        // logical XOR (exclusive OR)
        boolean bool7 = true ^ true; // false
        boolean bool8 = true ^ false; // true (order doesn't matter)
        boolean bool9 = false ^ false; // false

        // logical NOT
        boolean bool10 = !true; // false
        boolean bool11 = !false; // true

        // examples
        boolean isHungry = true;
        boolean isFoodLeft = false;

        if (isHungry && isFoodLeft) {
            System.out.println("Eating food");
        }

        boolean isInRobotics = true;
        boolean isInSpeechAndDebate = false;

        if (isInRobotics || isInSpeechAndDebate) {
            System.out.println("You are officially a typical EVHS nerd");
        }

        int number = 9;

        if (number % 3 == 0 ^ number % 2 == 0) {
            System.out.println("Number is divisible by 3 but not by 2");
        }

        boolean isRaining = false;

        if(!isRaining) {
            System.out.println("Go for a walk!");
        }
    }
}
