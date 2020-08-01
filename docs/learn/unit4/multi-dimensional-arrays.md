---
layout: default
title: Multi-Dimensional Arrays
permalink: learn/unit4/multi-dimensional-arrays
parent: Unit 4
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 4: Multi-Dimensional Arrays
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Multi-Dimensional Arrays

So far we have learned about 1D arrays, which means that there are no arrays within arrays.
Multi-dimensional arrays get slightly more complicated, but the basic principles are the same.
It's just that instead of having individual elements in an array, the elements themselves are arrays.

Here's an example of a 2D array.

```java
int[] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
}
```

Here's that same 2D array, except visualized as a table with _rows_ and _columns_.

|       | 0    | 1    | 2    |
| :---- | :--- | :--- | :--- |
| **0** | 1    | 2    | 3    |
| **1** | 4    | 5    | 6    |
| **2** | 7    | 8    | 9    |

You retrieve data from a multi-dimensional array the same way you would a normal array - through indexing.

For example, if I wanted to retrieve the element `8`, I would write `numbers[2][1]` because we need the
inner array at index 2 (which is `{7, 8, 9}`) and the element at index 1 in that inner array (`8`).

Notice that the row number represents the index of the outer array and the column number represents the
index of the inner array.

**Note**: You can have what are called _ragged arrays_, where the inner arrays are not all the same length.

```java
int[] numbers = {
    {1, 2, 3},
    {4, 5},
    {6},
}
```

**Note**: You can theoretically have 3D, 4D, etc. arrays, but usually we don't go past 2 because it
starts getting unnecessarily complicated.

## Applications

Before, it was pretty obvious why we could use 1D arrays - for example, if we wanted to store a list
of values. What about 2D arrays? Well, we can use 2D arrays to group information. For example, I could
have a 2D array with inner arrays of length 2 that represent (x, y) coordinates.

## Iteration (Nested Loops)

As with 1D arrays, it's impractical to individually go through each element using its index.
That's where for loops (and for each loops) come in.

This time, instead of having 1 for loop, we're going to have a for loop inside of a for loop
(this is a type of nested loop, since it's a loop within a loop). The outer loop is used to
iterate through each inner array, while the inner loop is used to iterate through each element
in the current inner array.

The example below uses a nested for loop to print all of the items in `numbers` in order.

```java
int[] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
}

for (int row = 0; row < numbers.length; row++) {
    for (int col = 0; col < numbers[row].length; col++) {
        System.out.println(numbers[row][col]);
    }
}
```

Output:

```
1
2
3
4
5
6
7
8
9
```

**Note**: Notice that for the inner for loop, I used `col < numbers[row].length` to generalize
the length of the current inner array.
