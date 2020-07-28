package com.omegarobotics.unit2.lessons;

/*
Topics:
- if
- if, else
- if, else if, else
 */

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
        // ask user if it's sunny and if it's raining
        Scanner input = new Scanner(System.in);

        System.out.print("Is it sunny? Enter true or false: ");
        boolean isSunny = input.nextBoolean();

        System.out.print("Is it raining? Enter true or false: ");
        boolean isRaining = input.nextBoolean();

        input.close();

        // if
        if (isSunny) {
            System.out.println("It's sunny!");
        }

        // if-else
        if (isSunny) {
            System.out.println("It's sunny!");
        } else {
            System.out.println("It's not sunny.");
        }

        // if-else if-else
        if (isSunny) {
            System.out.println("It's sunny!");
        } else if (isRaining) {
            System.out.println("It's raining.");
        } else {
            System.out.println("It's not sunny nor raining.");
        }
    }
}
