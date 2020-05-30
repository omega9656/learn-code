package com.omegarobotics.unit5.challenges.college;

/*
Modified Exercise 11.2 from Liang, Intro to Java (Comprehensive) 10th ed.

Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee.

A person has a name, address, phone number (long), and email address.
A student has a class status (freshman, sophomore, junior, or senior) and and student ID number (long).
    Define the student ID number as a constant.
An employee has an office address, salary, employee ID number (long), and date hired (MyDate).
    Use and implement a custom MyDate class for the date hired. (See below)
    Define the employee ID number and date hired as a constant.
A faculty member has office hours and a department.
A staff member has a title.

Note: For addresses, just put the first line of a made-up address for brevity.

Override the toString method in each class to display the class name and the person’s name.

Design a class called MyDate with the following attributes: day, month, year
Override the toString method in MyDate to print the date in the following format: MM/DD/YYYY
(You don't need to add an extra zero if the month or day is 1 digit)

Note: All of the classes should implement constructors, getters, and setters where appropriate.
All fields should be private. Unless otherwise specified, choose the most appropriate data-type for each field.

Bonus points for Javadoc comments and for writing UML diagrams for each class.

Write a test program called TestCollegeRoles
that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods (print them).
 */

public class TestCollegeRoles {
    public static void main(String[] args) {
        MyDate dateHiredJesper = new MyDate(5, 29, 2020);
        MyDate dateHiredWylan = new MyDate(2, 28, 1876);
        MyDate dateHiredNina = new MyDate(6, 12, 1945);

        Person[] people = {
                new Person("Kaz Brekker", "1234 Geldstraat Ave",
                        555_555_5555L, "dirtyhands@kerch.com"),

                new Student("Inej Ghafa", "1234 Os Alta St",
                        555_555_5555L, "thewraith@kerch.com", "senior", 56789L),

                new Employee("Jesper Fahey", "1234 Makker's Wheel Dr",
                        555_555_5555L, "idonthavemoney@kerch.com",
                        "5678 Crow Club Pkwy", 1234000, 12345L, dateHiredJesper),

                new Faculty("Wylan Van Eck", "5678 Zelverstraat Blvd",
                        555_555_5555L, "totallykuwei@kerch.com",
                        "5678 Crow Club Pkwy", 1_000_000, 12345L, dateHiredWylan,
                        "5 PM - 10 PM", "chemistry"),

                new Staff("Nina Zenik", "1234 Os Kervo St",
                        555_555_5555L, "heartrender@ravka.com",
                        "5678 Little Palace Circ", 500_000, 1357L, dateHiredNina, "Heartrender")
        };

        for (Person p: people) {
            System.out.println(p);
        }
    }
}
