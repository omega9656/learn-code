package com.omegarobotics.unit4.practice;

/*
Topics:
- Practice with methods, loops, arrays
 */

public class LinearSearch {

  /*
    Create a method called search:
    public static int search(int[] list, int key)
    That returns the index of the item in the list
    if the key matches it and -1 otherwise.
    Call the method to test it in the main method.
     */

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    System.out.println("3 is located at index " + search(numbers, 3));
    System.out.println("0 is located at index " + search(numbers, 0));
  }

  /**
   * search method
   * @param list  an array of integers to search from
   * @param key  the integer you're looking for in the list
   * @return the index of the item in list that matches key, or -1
   * if key is not found in the list
   */
  public static int search(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] == key) {
        return i;
      }
    }
    return -1;
  }
}
