package com.omegarobotics.unit3.lessons;

/*
Topics:
- while loop
- do-while loop
- when to use a while loop
- infinite loop
- break
 */

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // infinite loop
//        while (true) {
//            System.out.println("This is an infinite loop!");
//        }

        // while loop to simulate 2019-2020 SKYSTONE auto
        int seconds = 10;
        boolean opModeIsActive = true;

        while (opModeIsActive) {
            System.out.println("Scanning for skystones...");
            boolean skystoneDetected = Math.random() * 10 < 5; // this would be replaced with actual CV

            if (skystoneDetected) {
                System.out.println("Skystone detected!");
                break;
            }

            seconds++;
            opModeIsActive = seconds > 0;
        }

        // like a for loop
        // in this case, it's better to use a for loop
        int count = 0;
        while (count < 5) {
            System.out.println("Your lack of faith is disturbing.");
            count++; // don't forget to update!
        }

        Scanner input = new Scanner(System.in);

        // when to use a do-while loop: user input
        boolean isRaining = true;
        while(isRaining) {
            System.out.print("WHILE LOOP: Is it raining? Enter true or false: ");
            isRaining = input.nextBoolean();
        }

        // since we always need to ask for input first, it's better
        // to use a do-while loop
        do {
            System.out.print("DO-WHILE LOOP: Is it raining? Enter true or false: ");
            isRaining = input.nextBoolean();
        } while (isRaining);
    }
}
