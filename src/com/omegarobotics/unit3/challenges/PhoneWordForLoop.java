package com.omegarobotics.unit3.challenges;

import java.util.Scanner;

public class PhoneWordForLoop {

  public static void main(String[] args) {
    /*
        Asks user to enter a phone word,
        which is then converted to a phone
        number if it is 7 characters or longer.

        The program will only convert the first
        7 characters to a phone number.

        The program should be case insensitive
        (a is the same as A) and it should ignore
        any characters that aren't letters or digits.

        Use a for loop.

        Hint 1: Wait, what's a phone word? Look
        at your phone's keypad. There are usually
        3 letters that correspond with each number
        that could be combined to form a phone number.
        For example, the phone word for3V3R would
        translate into 367-3837.

        (Basically, your program should preserve
        numbers as they are and convert letters
        to numbers based on a phone keypad.)

        Hint 2: You might want to use regular
        expressions to get rid of all the characters
        that aren't numbers or letters!

        Bonus points if you can format the phone
        number such that there is a hyphen where
        there usually is (between the 3rd and 4th
        digit).
         */

    // Ask user to enter a phone word
    System.out.print("Enter a phone word: ");
    Scanner input = new Scanner(System.in);
    String phoneWord = input.nextLine();
    input.close();

    // Convert phone word to lowercase
    phoneWord = phoneWord.toLowerCase();

    // Remove all characters that aren't letters or digits
    phoneWord = phoneWord.replaceAll("[^a-z0-9]", "");

    // Check if phone word is less than 7 characters
    // If it is, print an error message and end the program
    if (phoneWord.length() < 7) {
      System.out.println(
        "Your phone word is not long enough for a phone number."
      );
    } else { // Else, convert the phone word to a phone number
      String number = "";

      // Convert each letter to its corresponding number
      // Only convert the first 7 characters of the phone word
      for (int i = 0; i < 7; i++) {
        char c = phoneWord.charAt(i);

        switch (c) {
          case 'a':
          case 'b':
          case 'c':
            number += "2";
            break;
          case 'd':
          case 'e':
          case 'f':
            number += "3";
            break;
          case 'g':
          case 'h':
          case 'i':
            number += "4";
            break;
          case 'j':
          case 'k':
          case 'l':
            number += "5";
            break;
          case 'm':
          case 'n':
          case 'o':
            number += "6";
            break;
          case 'p':
          case 'q':
          case 'r':
          case 's':
            number += "7";
            break;
          case 't':
          case 'u':
          case 'v':
            number += "8";
            break;
          case 'w':
          case 'x':
          case 'y':
          case 'z':
            number += "9";
            break;
          // If character in the phone word is a digit, keep the digit
          default:
            number += Character.toString(c);
            break;
        }
      }

      // Add a hyphen after the 3rd number in the phone number
      number = number.substring(0, 3) + "-" + number.substring(3, 7);

      // Print the phone number
      System.out.println("The number is " + number);
    }
  }
}
