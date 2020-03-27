package com.omegarobotics.unit1.lessons;

public class Variables {
    public static void main(String[] args) {
        // declaring a variable - saying the variable exists
        // type nameOfVariable
        // variable naming: use camelCase for regular variables and be specific
        int age;

        // initializing a variable - giving it a value
        // nameOfVariable = value;
        age = 17; // integers

        // can declare and initialize in one step
        // type nameOfVariable = value;
        double price = 5.67; // decimal numbers
        boolean isRaining = false; // true or false - use for testing conditions
        char initial = 'R'; // one symbol - single quotes
        String message = "Tahiti, it's a magical place."; // string of characters - double quotes

        // declaring a constant - can't be changed
        // final type NAME_OF_VARIABLE = value;
        final int MINUTES_PER_HOUR = 60;

        // multiple declarations/initializations - must be same type!
        int a, b, c;
        int d = 1, e = 2, f = 3;

        // print each variable to the console
        System.out.println(age);
        System.out.println(price);
        System.out.println(isRaining);
        System.out.println(initial);
        System.out.println(message);
        System.out.println(MINUTES_PER_HOUR);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // assigning new values - don't need the type
        isRaining = true;
        System.out.println(isRaining);

        message = "May the Force be with you.";
        System.out.println(message);

        /*
        Common mistakes:
        - misspelling variables (case sensitive!)
        - assigning in reverse (1 = x)
         */
    }
}
