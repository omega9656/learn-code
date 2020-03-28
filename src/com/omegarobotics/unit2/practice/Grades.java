package com.omegarobotics.unit2.practice;

/*
Topics:
- Practice with if/else if/else
- Practice with boolean logic
 */

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        /*
        Prompt the user for a test score.
        Depending on the score, print the
        letter grade received.
         */

        // prompt user for a test score
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a test score: ");
        double score = input.nextDouble();

        // print letter grade received
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

/*        // common mistakes:
        // 1. unnecessary checks
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) { // if the score failed first check, we know it must be less than 90 already
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 2. no else
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else if (score < 60) { // while it works fine, it's better to do else here to cover all cases
            System.out.println("F");
        }

        // 3. not counting extra credit
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else { // over 100 would become an F
            System.out.println("F");
        }*/
    }
}
