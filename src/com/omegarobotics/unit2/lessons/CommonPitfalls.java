package com.omegarobotics.unit2.lessons;

/*
Topics:
- Common pitfalls when doing selections
 */

public class CommonPitfalls {

    public static void main(String[] args) {
        // common pitfall 1: simplifying boolean variable assignment
        int number = 4;
        boolean even;

        if (number % 2 == 0) {
            even = true;
        } else {
            even = false;
        }

        // equivalent but shorter than code above
        even = number % 2 == 0;

        // common pitfall 2: avoiding duplicate code in different cases
        boolean inState = true;
        double tuition;

        if (inState) {
            tuition = 5000;
            System.out.println("The tuition is " + tuition); // repeated
        } else {
            tuition = 15000;
            System.out.println("The tuition is " + tuition); // repeated
        }

        // better
        if (inState) {
            tuition = 5000;
        } else {
            tuition = 15000;
        }
        System.out.println("The tuition is " + tuition);
    }
}
