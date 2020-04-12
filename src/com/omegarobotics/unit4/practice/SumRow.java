package com.omegarobotics.unit4.practice;

/*
Topics:
- Practice with 2D arrays, loops
 */

public class SumRow {
    /*
    Given a 2D array of integers,
    print the sum of each row.
    Note: The subarrays are not necessarily
    of equal length.
    Hint: Create a method:
    public static int sumRow(int[][] list, int row)
    Test sumRow in the main method.
     */

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2},
                {1}
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Sum of row %d: %d\n", i, sumRow(numbers, i));
        }
    }

    /**
     * sum row method
     * @param list  a 2D array of integers
     * @param rowIndex  the index of the row you are summing
     * @return the sum of each number in that row in the list
     */
    public static int sumRow(int[][] list, int rowIndex) {
        int sum = 0;
        for (int number: list[rowIndex]) {
            sum += number;
        }
        return sum;
    }
}
