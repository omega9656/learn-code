package com.omegarobotics.unit3.challenges;

/*
Problem description:
In a school, there are 100 lockers numbered 1 to 100.
There are 100 students in the school.
All of the lockers are initially closed.

(0 is closed, 1 is open)
1 2 3 4 5 locker #s
0 0 0 0 0 initial
1 1 1 1 1 after student 1
1 0 1 0 1 after student 2
1 0 0 0 1 after student 3

Student 1 goes through each locker and opens them.
Student 2 goes through every other locker and opens them
if they are closed, and closes them if they are open.
Student 3 goes through every 3 lockers and opens them
if they are closed, and closes them if they are open.

Students 4-100 follow the same pattern, opening/closing
every (4th locker, 5th locker, 6th locker, ... 100th locker).

Print the numbers of the lockers that are open
after student 100 is done opening/closing their locker(s).
 */

public class LockerPuzzle {

    public static void main(String[] args) {
        // Create a lockers array with 100 boolean values,
        // representing the state of the 100 lockers
        // (open = true, closed = false)
        // All lockers are initially closed
        boolean[] lockers = new boolean[100];

        // Iterate through the 100 student numbers (1-100, inclusive)
        for (int student = 1; student <= 100; student++) {
            /* Iterate through necessary lockers
             * Locker x is at index x - 1
             * Increment locker number by the student number
             * (ex. student 3 starts at locker 3 and checks every third locker)
             */
            for (int locker = student - 1; locker < 100; locker += student) {
                // Open the locker if it's closed,
                // close the locker if it's open
                // (switch the boolean values)
                lockers[locker] = !lockers[locker];
            }
        }

        // Display all open locker numbers separated by 1 space
        System.out.print("The open lockers are: ");
        for (int i = 0; i < 100; i++) {
            int lockerNum = i + 1; // i is the index, but i + 1 is the locker number
            if (lockers[i]) {
                System.out.print(lockerNum + " ");
            }
        }

        System.out.println(); // moves cursor to next line
    }
}
