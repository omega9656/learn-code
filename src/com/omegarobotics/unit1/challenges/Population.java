package com.omegarobotics.unit1.challenges;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        /*
        Given a number of years from 0, calculate the
        population as a function of birth, death, and
        migrations per second over that period of years.

        Assume that the number of births, deaths, and migrations
        per year remains constant over that period of years.

        Values you'll need:
        - Birth rate: 7 (7 sec/birth)
        - Death rate: 13 (13 sec/death)
        - Migration rate: 45 (45 sec/new person migrated to country)
        - Population base: 312,032,486 (population at year 0, in people)

        Hint: Create constants and do unit conversions.
         */

        final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;
        final double BIRTH_RATE = 7;
        final double DEATH_RATE = 13;
        final double MIGRATION_RATE = 45;
        final int POPULATION_BASE = 312032486;

        // prompt user for number of years
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        input.close();

        // calculate births, deaths, and migrations per year
        double BIRTHS_PER_YEAR = SECONDS_PER_YEAR / BIRTH_RATE;
        double DEATHS_PER_YEAR = SECONDS_PER_YEAR / DEATH_RATE;
        double MIGRATIONS_PER_YEAR = SECONDS_PER_YEAR / MIGRATION_RATE;

        // calculate overall change in population, assuming
        // number of births, deaths, and migrations per year
        // are the same each year
        double changeInPopulation = years * (BIRTHS_PER_YEAR - DEATHS_PER_YEAR + MIGRATIONS_PER_YEAR);

        // calculate and display the projected population
        int population = (int) (POPULATION_BASE + changeInPopulation);
        System.out.println("Projected population will be " + population);
    }
}
