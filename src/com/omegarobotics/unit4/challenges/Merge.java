package com.omegarobotics.unit4.challenges;

/*
main method:
Ask user to enter 2 lists of integers
ordered from least to greatest, then
prints each list and a merged list
(with duplicates).

merge method:
public static int[] merge(int[] list1, int[] list2)
Merge 2 arrays of integers.

getArray method:
public static int[] getArray(String listName)
Prompts user to enter elements of an array
of integers. listName is the name of the
array, which is used in the prompt.

printArray method:
public static void printArray(int[] arr)
Prints the array like so: [ 1 2 3 4 5 ... n ]
 */

import java.util.Scanner;

public class Merge {
    /**
     * Main method
     *
     * Asks user for 2 arrays
     * Prints each array
     * Prints the merged array
     */
    public static void main(String[] args) {
        // Get 2 arrays from user
        int[] list1 = getArray("list 1");
        int[] list2 = getArray("list 2");

        // Print each array's items
        System.out.print("list1 is ");
        printArray(list1);

        System.out.print("list2 is ");
        printArray(list2);

        // Merge the 2 lists and print the result
        int[] mergedList = merge(list1, list2);
        System.out.print("The merged list is ");
        printArray(mergedList);
    }

    /**
     * Merge 2 arrays
     * @param list1  first array of integers
     * @param list2  second array of integers
     * @return a merged array (keeping duplicates)
     */
    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        // variables that hold the index of each list
        int current1 = 0; // list1
        int current2 = 0; // list2
        int current3 = 0; // mergedList


        // while the lists can be compared, compare them
        while (current1 < list1.length && current2 < list2.length) {
            // Compare and merge current values of each list
            // Add the lesser value to mergedList
            if (list2[current2] < list1[current1]) {
                mergedList[current3] = list2[current2];
                current2++;
            } else if (list1[current1] < list2[current2]) {
                mergedList[current3] = list1[current1];
                current1++;
            } else {
                // Add both values if they're equal
                mergedList[current3] = list1[current1];
                current1++;
                current3++;

                mergedList[current3] = list2[current2];
                current2++;
            }

            current3++;
        }

        // Add all remaining items of list 1 to mergedList
        while (current1 < list1.length) {
            mergedList[current3] = list1[current1];
            current3++;
            current1++;
        }

        // Add all remaining items of list 2 to mergedList
        while (current2 < list2.length) {
            mergedList[current3] = list2[current2];
            current3++;
            current2++;
        }

        return mergedList;
    }

    /**
     * Gets array from user input
     * @param listName  name of the array
     * @return an array of integers with elements from user input
     */
    public static int[] getArray(String listName) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of " + listName + ": ");
        int listLength = input.nextInt();

        int[] list = new int[listLength];

        System.out.print("Enter items in " + listName + ": ");

        for (int i = 0; i < listLength; i++) {
            list[i] = input.nextInt();
        }

        return list;
    }

    /**
     * Prints each item in the array separated by spaces
     * @param arr  the array to print
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println(); // moves cursor to next line
    }
}
