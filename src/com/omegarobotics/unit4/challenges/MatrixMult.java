package com.omegarobotics.unit4.challenges;

/*
Ask user to enter values for 2 matrices A, B
and then multiplies them (if possible).

If AB exists, the program displays the product
matrix C. If AB doesn't exist, an error message
is displayed.
 */

import java.util.Scanner;

public class MatrixMult {

  /**
   * Main method
   *
   * Asks user to enter data for
   * 2 matrices. Multiplies the matrices
   * if possible and displays the result.
   * If multiplication isn't possible,
   * displays an error message.
   */
  public static void main(String[] args) {
    // get elements for first matrix from user
    System.out.println("Matrix A");
    double[][] a = getMatrix();

    System.out.println();

    // get elements for second matrix from user
    System.out.println("Matrix B");
    double[][] b = getMatrix();

    System.out.println();

    // Check if matrices can be multiplied (colsA = rowsB)
    // if so, multiply them and display the product
    if (a[0].length == b.length) {
      System.out.println("Matrix C is");
      double[][] c = multiplyMatrix(a, b);

      // print c formatted as a matrix
      for (int row = 0; row < c.length; row++) {
        for (int col = 0; col < c[0].length; col++) {
          System.out.print(c[row][col] + " ");
        }
        System.out.println(); // move to next row
      }
    } else {
      // display error message
      System.out.println("Error, matrices are not compatible.");
      System.out.println(
        "Number of columns in Matrix A must be " +
        "equal to number of rows in Matrix B."
      );
    }
  }

  /**
   * Multiplies 2 matrices A, B
   * Pre-condition: A and B can be multiplied
   * @param a  first matrix
   * @param b  second matrix
   * @return the product matrix
   */
  public static double[][] multiplyMatrix(double[][] a, double[][] b) {
    // store number of rows and columns for the matrices
    // this is for readability during the multiplication
    int numRowsA = a.length;
    int numColsA = a[0].length;

    int numColsB = b[0].length;

    double[][] productMatrix = new double[numRowsA][numColsB];

    // Multiply the matrix

    // for each row in matrix A
    for (int rowA = 0; rowA < numRowsA; rowA++) {
      // find the dot product of that row and each column in B

      // for each column in B
      for (int colB = 0; colB < numColsB; colB++) {
        // reset the dotProduct every time
        // you move to the next column in B
        double dotProduct = 0;

        // for each element in rowA, multiply it with
        // each element in colB and add the result to
        // the dot product
        for (int colA = 0; colA < numColsA; colA++) {
          double product = a[rowA][colA] * b[colA][colB];
          dotProduct += product;
        }

        productMatrix[rowA][colB] = dotProduct;
      }
    }

    return productMatrix;
  }

  /**
   * Gets matrix from user input
   * @return a matrix as a 2D double array
   */
  public static double[][] getMatrix() {
    Scanner input = new Scanner(System.in);

    // Ask user for dimensions of the matrix
    System.out.print("Enter number of rows: ");
    int rows = input.nextInt();

    System.out.print("Enter number of columns: ");
    int cols = input.nextInt();

    double[][] matrix = new double[rows][cols];

    // Ask user for matrix elements by row
    for (int row = 0; row < rows; row++) {
      System.out.printf("Enter row %d: ", (row + 1));
      for (int col = 0; col < cols; col++) {
        matrix[row][col] = input.nextDouble();
      }
    }

    return matrix;
  }
}
