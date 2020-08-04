package com.omegarobotics.unit6.lessons.enums;

/*
 * Topics:
 * - Using enums (initialization, switch)
 * - Enum built-in methods (name, ordinal, values)
 */

public class TestDay {

    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day.name()); // prints the value's name
        System.out.println(day.ordinal()); // prints the ordinal (index)

        switch (day) {
            case SUNDAY:
                System.out.println("Time to read a book");
                break;
            case MONDAY:
                System.out.println("Time to go to work");
                break;
            case TUESDAY:
                System.out.println("Time to go out with friends");
                break;
            case WEDNESDAY:
                System.out.println("Time to watch Agents of SHIELD");
                break;
            case THURSDAY:
                System.out.println("Time to go to the park");
                break;
            case FRIDAY:
                System.out.println("Time to go to the movies");
                break;
            case SATURDAY:
                System.out.println("Time for family game night");
                break;
        }

        System.out.println();

        // values method returns an
        // array of all the enum's values
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }
    }
}
