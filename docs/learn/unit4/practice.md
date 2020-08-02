---
layout: default
title: Unit 4 Practice
permalink: learn/unit4/practice
parent: Unit 4
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 4: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Note on all problems

If you can write JavaDoc comments, do so for all of the methods you write!

## Practice

### Grades

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Grades` which contains your solution code.

Create a method called `printGrade` which takes the test score
of a student and prints the letter grade. It does not return anything.
Call `printGrade` in the `main` method with 3 different scores.

Create another method called `getGrade` which takes the test score
of a student and returns the grade, a `char`. Print the result of calling `printGrade`
in the `main` method with 3 different scores.

**Template Code**

```java
public class Grades {
    public static void main(String[] args) {
        // write your code here
    }

    // write methods here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/practice/Grades.java){: .btn }

### Linear Search

<!-- prettier-ignore-start -->

methods
{: .label }
arrays
{: .label }
for loops
{: .label }
return
{: .label }

<!-- prettier-ignore-end -->

Create a class called `LinearSearch` which contains your solution code.

Create a method called `search` (method signature is given in template code)
that returns the index of the item in the list if the key matches it and `-1`
otherwise. Call the method to test it in the `main` method. (Print the value that is returned.)

**Example Input**

Array: `{ 5, 1, 2, 4, 3 }`
Key: 3

**Example Output**

```
4
```

**Template Code**

```java
public class LinearSearch {
    public static void main(String[] args) {
        // write your code here
    }

    public static int search(int[] list, int key) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/practice/LinearSearch.java){: .btn }

### Max

<!-- prettier-ignore-start -->

methods
{: .label }
if statements
{: .label }
return
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Max` which contains your solution code.

Create a method called `max` which has 2 parameters, which are numbers
(both `double`). Return the maximum of those 2 numbers. Call the method
in the `main` method and print the result of calling it on 3 sets of 2 numbers.

**Template Code**

```java
public class Max {
    public static void main(String[] args) {
        // write your code here
    }

    // write your method here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/practice/Max.java){: .btn }

### Prime Number

<!-- prettier-ignore-start -->

methods
{: .label }
if statements
{: .label }
loops
{: .label }
return
{: .label }

<!-- prettier-ignore-end -->

Create a class called `PrimeNumber` which contains your solution code.

Create a method called `isPrime` that returns `true` if the number (`int`)
given as an argument is prime and `false` otherwise. Call it in the `main`
method and print the result of that call.

**Template Code**

```java
public class PrimeNumber {
    public static void main(String[] args) {
        // write your code here
    }

    // write your method here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/practice/PrimeNumber.java){: .btn }

### Sum Row

<!-- prettier-ignore-start -->

methods
{: .label }
for loops
{: .label }
return
{: .label }

<!-- prettier-ignore-end -->

Create a class called `SumRow` which contains your solution code.

Given a 2D array of integers, print the sum of each row.
Note: The subarrays are not necessarily of equal length.
To do this, create a method called `sumRow` (see template code
for the method signature). Test `sumRow` by calling it in the `main` method.
You should use a loop to iterate through each array in a 2D array and
call `sumRow` on the current inner array.

**Example Input**
Array:

```java
int[][] numbers = {
    { 1, 2, 3, 4, 5 },
    { 1, 2, 3, 4 },
    { 1, 2, 3 },
    { 1, 2 },
    { 1 },
};
```

**Example Output**

```
Sum of row 0: 15
Sum of row 1: 10
Sum of row 2: 6
Sum of row 3: 3
Sum of row 4: 1
```

**Template Code**

```java
public class SumRow {
    public static void main(String[] args) {
        // write your code here
    }

    public static int sumRow(int[][] list, int rowIndex) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/practice/SumRow.java){: .btn }

## Challenges

### Digit Sum

<!-- prettier-ignore-start -->

Scanner
{: .label }
while loops
{: .label }
methods
{: .label }
arithmetic operators
{: .label }
return
{: .label }

<!-- prettier-ignore-end -->

Create a class called `DigitSum` which contains your solution code.

Write a method called `sumDigits` that computes the sum of the
digits in a positive integer. The method header is in the template code below.

The `main` method will repeatedly ask for a number, call `sumDigits` with that number,
and print the result, until the user enters `-1`.

**Example Output**

```
Enter a positive integer, or -1 to quit: 12345 [Enter ↩]
Total of the sum of the digits in the number: 15
Enter a positive integer, or -1 to quit: 1000 [Enter ↩]
Total of the sum of the digits in the number: 1 
Enter a positive integer, or -1 to quit: 0 [Enter ↩]
Total of the sum of the digits in the number: 0 
Enter a positive integer, or -1 to quit: 34 [Enter ↩]
Total of the sum of the digits in the number: 7 
Enter a positive integer, or -1 to quit: -1 [Enter ↩]
```

**Template Code**

```java
public class DigitSum {
    public static void main(String[] args) {
        // write your code here
    }

    public static int sumDigits(long n) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/challenges/DigitSum.java){: .btn }

### Find Closest Pair

<!-- prettier-ignore-start -->

2D arrays
{: .label }
methods
{: .label }
for loops
{: .label }
nested loops
{: .label }
Math class
{: .label }

<!-- prettier-ignore-end -->

Create a class called `FindClosestPair` which contains your solution code.

Given a 2D double array of (x, y) coordinates, find the closest pair of points.
Print the coordinates of that pair and the distance between them.

Hint: Create multiple methods to break the problem into parts.

-   `distance` - returns the distance between 2 points
-   `findClosestPair` - returns a 2D `double` array containing the 2 closest points
-   `printPair` - prints the 2 closest points and the distance between them in a readable way

See the template code below for method signatures.

**Example Input**

```java
double[][] coordinates = {
    { -1, 3 },
    { -1, -1 },
    { 1, 1 },
    { 2, 0.5 },
    { 2, -1 },
    { 3, 3 },
    { 4, 2 },
    { 4, -0.5 },
};
```

**Example Output**

```
The closest pair is: 
(1.000000, 1.000000) and (2.000000, 0.500000)
The distance between those points is 1.118033988749895
```

**Template Code**

```java
public class FindClosestPair {
    public static void main(String[] args) {
        // write your code here
    }

    /** Returns the distance between 2 points */
    public static double distance(double x1, double y1, double x2, double y2) {
        // write your code here
    }

    /** Returns a 2D double array containing the 2 closest points */
    public static double[][] findClosestPair(double[][] coordinates) {
        // write your code here
    }

    /** 
     * Prints the 2 closest points and
     * the distance between them in a readable way
     */
    public static void printPair(double[][] pair) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/challenges/FindClosestPair.java){: .btn }

### Matrix Multiplication

<!-- prettier-ignore-start -->

2D arrays
{: .label }
methods
{: .label }
arithmetic operators
{: .label }
Scanner
{: .label }

<!-- prettier-ignore-end -->

Create a class called `MatrixMult` which asks the user to enter values
for 2 matrices `A`, `B` and then multiplies them (if possible).

If `AB` exists, the program displays the product matrix `C`. 
If `AB` doesn't exist, an error message is displayed.

You can read more about matrix multiplication [here](https://www.mathsisfun.com/algebra/matrix-multiplying.html).

Hint: Break the problem into multiple methods.

-   `multiplyMatrix` - returns a 2D array which is the result of multiplying 2 matrices
-   `getMatrix` - returns a 2D array which represents a matrix from user input

See the template code below for method signatures.

**Example Output**

```
Matrix A
Enter number of rows: 3 [Enter ↩]
Enter number of columns: 2 [Enter ↩]
Enter row 1: 1 2 [Enter ↩]
Enter row 2: 3 4 [Enter ↩]
Enter row 3: 5 6 [Enter ↩]

Matrix B
Enter number of rows: 2 [Enter ↩]
Enter number of columns: 2 [Enter ↩]
Enter row 1: 7 8 [Enter ↩]
Enter row 2: 9 10 [Enter ↩]

Matrix C is
25.0 28.0 
57.0 64.0 
89.0 100.0 
```

**Template Code**

```java
public class MatrixMult {
    public static void main(String[] args) {
        // write your code here
    }

    /** 
     * Returns a 2D array which is the
     * result of multiplying 2 matrices
     */
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        // write your code here
    }

    /** 
     * Returns a 2D array which represents
     * a matrix from user input
     */
    public static double[][] getMatrix() {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/challenges/MatrixMult.java){: .btn }

### Merge

<!-- prettier-ignore-start -->

methods
{: .label }
arrays
{: .label }
loops
{: .label }
if statements
{: .label }
Scanner
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Merge` which asks the user to enter 2 lists of integers
ordered from least to greatest, then prints each list and a merged list
(with duplicates).

Create 3 methods:

-   `merge` - Merges 2 arrays of integers that are sorted in ascending order
-   `getArray` - Prompts user to enter elements of an array of integers
-   `printArray` - Prints the array like so: [ 1 2 3 4 5 ... n ]

See the template code below for method signatures.

You might find [this animation](http://cs.armstrong.edu/liang/animation/web/MergeList.html) to be helpful
when figuring out how to merge the arrays.

**Example Output**

```
Enter size of list: 4 [Enter ↩]
Enter items in list: 1 3 6 10 [Enter ↩]
Enter size of list: 3 [Enter ↩]
Enter items in list: 2 4 7 [Enter ↩]
list1 is [ 1 3 6 10 ]
list2 is [ 2 4 7 ]
The merged list is [ 1 2 3 4 6 7 10 ]
```

**Template Code**

```java
public class Merge {
    public static void main(String[] args) {
        // write your code here
    }

    /** 
     * Merges 2 arrays of integers
     * that are sorted in ascending order 
     */
    public static int[] merge(int[] list1, int[] list2) {
        // write your code here
    }

    /**
     * Prompts user to enter elements
     * of an array of integers
     */
    public static int[] getArray() {
        // write your code here
    }

    /**
     * Prints the array like so:
     * [ 1 2 3 4 5 ... n ]
     */
    public static void printArray(int[] arr) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/challenges/Merge.java){: .btn }

### Selection Sort

<!-- prettier-ignore-start -->

arrays
{: .label }
methods
{: .label }
for loop
{: .label }
nested loop
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Create a class called `SelectionSort` which contains your solution code.

Create a method called `sort` which sorts an array of integers using
the [Selection Sort](https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm) algorithm.

In the `main` method, call the `sort` method on an unsorted array of integers.
Print the unsorted array and then the sorted array.

**Example Output**

```
5 23 -25 0 -14 100 34 
-25 -14 0 5 23 34 100 
```

**Template Code**

```java
public class SelectionSort {
    public static void main(String[] args) {
        // write your code here
    }

    /** Sorts an array using Selection Sort */
    public static void sort(int[] list) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit4/challenges/SelectionSort.java){: .btn }
