package com.omegarobotics.unit2.lessons;

/*
Topics:
- why we use braces (common if/else errors)
 */

public class WhyWeUseBraces {
    public static void main(String[] args) {
        double radius = 5;
        double area;

        // common error 1: forgetting necessary braces
        // wrong
        if (radius >= 0)
            area = radius * radius * Math.PI;
//            System.out.println("The area is " + area); // this line should be unindented

        // correct
        if (radius >= 0) {
            area = radius * radius * Math.PI;
            System.out.println("The area is " + area);
        }

        // common error 2: wrong semicolon at the if line
        if (radius >= 0); // logic error: this line is equivalent to: if (radius >= 0) { }; (an empty if block)
        {
            area = radius * radius * Math.PI;
            System.out.println("The area is " + area);
        }

        // common error 3: redundant testing of boolean values
        boolean even = 6 % 2 == 0;

        // not wrong, but could be better
        if (even == true) {
            System.out.println("It is even.");
        }

        // code below is equivalent and better than code above
        if (even) {
            System.out.println("It is even.");
        }

        // common error 4: dangling else ambiguity
        int i = 1, j = 2, k = 3;

        // not wrong, but ambiguous - to which if does the last else belong to?
        if (i > j)
            if (i > k)
                System.out.println("A");
        else
            System.out.println("B");

        // equivalent to above code with correct indentation
        if (i > j)
            if (i > k)
                System.out.println("A");
            else // else clause always matches most recent unmatched if clause in the same block
                System.out.println("B");
    }
}
