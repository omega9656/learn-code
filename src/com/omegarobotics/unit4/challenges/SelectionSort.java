package com.omegarobotics.unit4.challenges;

/*
Create a method called sort which sorts an array of integers using
the Selection Sort algorithm.
https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm

In the main method, call the sort method on an unsorted array of integers.
Print the unsorted array and then the sorted array.
*/

public class SelectionSort {

    public static void main(String[] args) {
        // unsorted array
        int[] numbers = { 5, 23, -25, 0, -14, 100, 34 };

        // print unsorted array
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // sort the array
        sort(numbers);

        // print sorted array
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    /**
     * Sorts an array of integers in place using
     * Selection Sort
     * @param list  array of integers to sort
     */
    public static void sort(int[] list) {
        // list.length - 1 because don't need to check last element
        // since it will be sorted already
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            // find the smallest element
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            // swap it with whatever is in the
            // first position of unsorted array if needed
            if (minIndex != i) {
                int temp = list[i];
                list[i] = min;
                list[minIndex] = temp;
            }
        }
    }
}
