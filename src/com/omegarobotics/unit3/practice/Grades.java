package com.omegarobotics.unit3.practice;

/*
Topics:
- Methods practice
- return
- void
- if/else if/else
 */

public class Grades {
    /*
    Create a method called printGrade which takes the test score
    of a student and prints the letter grade. It does not return anything.

    Create another method called getGrade which takes the test score
    of a student and prints the letter grade. It returns the grade, a char.
    Print the result of the call in the main method.
     */

    public static void main(String[] args) {
        printGrade(100);
        printGrade(56);
        printGrade(88);

        System.out.println(getGrade(100));
        System.out.println(getGrade(56));
        System.out.println(getGrade(88));
    }

    /**
     * Prints the letter grade of a student
     * based on a test score.
     * @param testScore
     */
    public static void printGrade(double testScore) {
        if (testScore >= 90) {
            System.out.println("A");
        } else if (testScore >= 80) {
            System.out.println("B");
        } else if (testScore >= 70) {
            System.out.println("C");
        } else if (testScore >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    /**
     * Gets the letter grade of a student
     * based on a test score.
     * @param testScore
     * @return the letter grade received
     */
     public static char getGrade(double testScore) {
         if (testScore >= 90) {
             return 'A';
         } else if (testScore >= 80) {
             return 'B';
         } else if (testScore >= 70) {
             return 'C';
         } else if (testScore >= 60) {
             return 'D';
         } else {
             return 'F';
         }
     }
}
