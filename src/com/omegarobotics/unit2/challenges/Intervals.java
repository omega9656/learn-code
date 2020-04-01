package com.omegarobotics.unit2.challenges;

import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        /*
        Prompt the user to enter start and end times
        for an earlier interval and a later interval
        in 24-hour format.

        The program should then calculate the duration
        of each time interval and display:
        - The duration of each interval
        - Which interval is longer
        - Whether the intervals of time overlap

        Bonus points if you can implement a solution
        where if the user switches the start and end times
        and/or switches earlier and later intervals,
        the program will still function properly.

        Example output:

        Enter earlier start and end times (in 24-hour format): 1200 1545
        Enter later start and end times (in 24-hour format): 1500 1732
        The earlier interval is 225 minutes long.
        The later interval is 152 minutes long.
        The earlier interval is longer.
        The intervals overlap.

        Hint: Use modulus and convert everything into
        minutes after midnight (00:00).
         */

        // Ask user to enter start and end times for the
        // earlier interval. Times must be in 24-hour format.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter earlier start and end times (in 24-hour format): ");
        int earlierStartTime = input.nextInt();
        int earlierEndTime = input.nextInt();

        // Ask user to enter start and end times for the
        // later interval. Times must be in 24-hour format.
        System.out.print("Enter later start and end times (in 24-hour format): ");
        int laterStartTime = input.nextInt();
        int laterEndTime = input.nextInt();

        input.close();

        // Get the hours and minutes of each time
        int earlierStartHours = earlierStartTime / 100;
        int earlierStartMinutes = earlierStartTime % 100;

        int earlierEndHours = earlierEndTime / 100;
        int earlierEndMinutes = earlierEndTime % 100;

        int laterStartHours = laterStartTime / 100;
        int laterStartMinutes = laterStartTime % 100;

        int laterEndHours = laterEndTime / 100;
        int laterEndMinutes = laterEndTime % 100;

        // Calculate total minutes from midnight (00:00) for each time
        int earlierStartTotal = earlierStartHours * 60 + earlierStartMinutes;
        int earlierEndTotal = earlierEndHours * 60 + earlierEndMinutes;

        int laterStartTotal = laterStartHours * 60 + laterStartMinutes;
        int laterEndTotal = laterEndHours * 60 + laterEndMinutes;

        // Check if the user entered the start and end times correctly
        // If they did not, switch the values

        int temp; // holds a time value temporarily so that a switch can be done

        if (earlierStartTotal > earlierEndTotal) {
            temp = earlierStartTotal;
            earlierStartTotal = earlierEndTotal;
            earlierEndTotal = temp;
        }

        if (laterStartTotal > laterEndTotal) {
            temp = laterStartTotal;
            laterStartTotal = laterEndTotal;
            laterEndTotal = temp;
        }

        // Check if the user entered the earlier and later pairs correctly
        // If they did not, switch the values

        if (earlierStartTotal > laterStartTotal) {
            temp = earlierStartTotal;
            earlierStartTotal = laterStartTotal;
            laterStartTotal = temp;

            temp = earlierEndTotal;
            earlierEndTotal = laterEndTotal;
            laterEndTotal = temp;
        }

        // Calculate duration of each interval
        // and display to the user each duration
        int earlierDuration = earlierEndTotal - earlierStartTotal;
        int laterDuration = laterEndTotal - laterStartTotal;

        System.out.println("The earlier interval is " + earlierDuration + " minutes long.");
        System.out.println("The later interval is " + laterDuration +  " minutes long.");

        // Determine which interval is longer than the other
        // or if the intervals are of equal length.
        // Then display that message to the user.
        if (earlierDuration > laterDuration) {
            System.out.println("The earlier interval is longer.");
        } else if (laterDuration > earlierDuration) {
            System.out.println("The later interval is longer.");
        } else {
            System.out.println("The intervals are equally long.");
        }

        // Determine if the intervals overlap
        // and display a message to the user if they do or don't
        if (earlierEndTotal > laterStartTotal) {
            System.out.println("The intervals overlap.");
        } else {
            System.out.println("These intervals do not overlap.");
        }
    }
}
