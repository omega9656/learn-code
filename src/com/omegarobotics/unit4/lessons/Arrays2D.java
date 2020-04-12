package com.omegarobotics.unit4.lessons;

/*
Topics:
- 2D arrays
- Representing arrays as tables (rows, cols)
- Multi-dimensional arrays
- Ragged arrays
 */

public class Arrays2D {
    public static void main(String[] args) {
        // length of coordinates: 5
        // length of each subarray: 2
        int[][] coordinates = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        System.out.println("Print each item in coordinates in order:");
        for (int row = 0; row < coordinates.length; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println(coordinates[row][col]);
            }
        }

        System.out.println();

        // ragged arrays don't have the same length for each subarray
        int[][] raggedArray = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2},
                {1}
        };

        System.out.println("Print each item in raggedArray in order:");
        for (int row = 0; row < raggedArray.length; row++) {
            for (int col = 0; col < raggedArray[row].length; col++) {
                System.out.println(raggedArray[row][col]);
            }
        }

        System.out.println();

        // multi-dimensional arrays
        int[][][] array3D = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6},
                        {7, 8},
                        {9, 10}
                },

                {
                        {1, 2},
                        {3, 4},
                        {5, 6},
                        {7, 8},
                        {9, 10}
                },

                {
                        {1, 2},
                        {3, 4}, // line 71 prints out 3 from this array
                        {5, 6},
                        {7, 8},
                        {9, 10}
                }
        };

        System.out.println("array3D[2][1][0] is: " + array3D[2][1][0]);
    }
}
