package com.omegarobotics.unit3.lessons;

/*
Topics:
- What is an array?
- Zero indexing
- Initializing an array (with number of items, with elements)
- Assigning elements to an array
- Retrieving elements from an array
- ArrayIndexOutOfBoundsException
 */

public class IntroToArrays {

  public static void main(String[] args) {
    // METHOD 1: Initializing using length
    // type[] nameOfArray = new type[length];

    // initialize an array of integers of length 5
    int[] array = new int[5]; // starts as {0, 0, 0, 0, 0}

    // assign elements to an array
    array[0] = 5;
    array[1] = 2;
    array[2] = 9;
    array[3] = 10;
    array[4] = 6;
    // array[5] doesn't exist! ArrayIndexOutOfBoundsException

    // print each item in the array
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);

    // METHOD 2: Initializing an array with elements
    // type[] nameOfArray = {element1, element2, ... elementN};

    // initialize an array of characters
    char[] name = { 'O', 'm', 'e', 'g', 'a' };

    // print each item in the array
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
