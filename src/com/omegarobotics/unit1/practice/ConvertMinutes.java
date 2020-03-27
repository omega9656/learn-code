package com.omegarobotics.unit1.practice;

/*
Topics:
- Scanner, user input
- Modulus practice
- Using constants
 */

import java.util.Scanner;

public class ConvertMinutes {
    public static void main(String[] args) {
        /*
        Prompt the user to enter a number of minutes.
        Convert the total minutes to hours and minutes.
        Print the result.
         */

        final int MINUTES_PER_HOUR = 60;

        // get number of minutes from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of minutes: ");
        int totalMinutes = input.nextInt();

        // convert minutes to hours and minutes
        int hours = totalMinutes / MINUTES_PER_HOUR;
        int minutes = totalMinutes % MINUTES_PER_HOUR;

        // print the result
        System.out.println(totalMinutes + " minutes is");
        System.out.println(hours + " hours, " + minutes + " minutes");
    }
}
