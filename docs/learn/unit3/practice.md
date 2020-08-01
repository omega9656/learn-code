---
layout: default
title: Unit 3 Practice
permalink: learn/unit3/practice
parent: Unit 3
grand_parent: Learn
nav_order: 4
---

<!-- prettier-ignore-start -->

# Unit 3: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Practice

### Area Triangle

<!-- prettier-ignore-start -->

if statements
{: .label }
boolean logic
{: .label }
Math class
{: .label }

<!-- prettier-ignore-end -->

Create a class called `AreaTriangle` which prompts the user for 3 sides of a triangle.
Given those sides, calculate and print the area. (Your program should also check to make
sure that the side lengths given form a [valid triangle](https://www.mathsisfun.com/geometry/triangle-inequality-theorem.html). If they do not, print an error message
instead of the triangle's area.) Hint: Use [Heron's formula](https://www.mathsisfun.com/geometry/herons-formula.html).

**Example Output**

```
Enter s1 s2 s3: 3 4 5 [Enter ↩]
The area of that triangle is 6.0
```

**Template Code**

```java
public class AreaTriangle {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/practice/AreaTriangle.java){: .btn }

### Compute Distance

<!-- prettier-ignore-start -->

Scanner
{: .label }
Math class
{: .label }

<!-- prettier-ignore-end -->

Create a class called `ComputeDistance` which prompts the user to enter 2 (x, y) coordinates.
Given those 2 points, calculate and print the [distance](https://www.mathsisfun.com/algebra/distance-2-points.html) between them.

**Example Output**

```
Enter x1 y1: 5 6 [Enter ↩]
Enter x2 y2: 12 -6.3 [Enter ↩]
The distance between those 2 points is 14.152384958020328
```

**Template Code**

```java
public class ComputeDistance {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/practice/ComputeDistance.java){: .btn }

### Practice Arrays

<!-- prettier-ignore-start -->

arrays
{: .label }
for loops
{: .label }

<!-- prettier-ignore-end -->

Create a class called `PracticeArrays` with solution code for the exercises below.

#### Part 1
Initialize an array of `String`s which contain words in your favorite quote.
Use a for loop to print the entire quote in one line.
Bonus points if you can also code a solution using a for each loop!

**Example Quote to Array**
Quote: "The man dies in all who keep silent in the face of tyranny".
Array:

```java
String[] quote = {
    "The",
    "man",
    "dies",
    "in",
    "all",
    "who",
    "keep",
    "silent",
    "in",
    "the",
    "face",
    "of",
    "tyranny"
};
```

**Note**: Remember that Java ignores whitespace (for the most part), so separating each element
with a new line is valid. In fact, it is good practice in this case since the array is so long.

**Note**: Some developers prefer to add what is called a _trailing comma_ at the end of the last element
in the array. This may seem odd since there's no comma afterward, which is why we normally don't do this.
However, there are [some benefits](https://medium.com/@nikgraf/why-you-should-enforce-dangling-commas-for-multiline-statements-d034c98e36f8).

**Example Output**

```
The man dies in all who keep silent in the face of tyranny
```

#### Part 2
Ask the user to enter the length of an array. Initialize an array of integers of the given length.
Use a for loop to assign even numbers to the array. Use another for loop to print the result.

**Example Output**

```
Enter the length of the array: 6 [Enter ↩]
0
2
4
6
8
10
```

**Template Code**

```java
public class PracticeArrays {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/practice/PracticeArrays.java){: .btn }

### Print Reverse

<!-- prettier-ignore-start -->

arrays
{: .label }
loops
{: .label }

<!-- prettier-ignore-end -->

Given an array of numbers (below), print the items in reverse order
using a for loop. Your code should be in a class called `PrintReverse`.

**Array**

```java
int[] numbers = { 1, 2, 3, 4, 5 };
```

**Example Output**

```
5
4
3
2
1
```

**Template Code**

```java
public class PrintReverse {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/practice/PrintReverse.java){: .btn }

### Repeat Print

<!-- prettier-ignore-start -->

loops
{: .label }

<!-- prettier-ignore-end -->

Create a class called `RepeatPrint` which prints a message of your choice to the console 5 times.
Bonus points if you can solve this problem in 2 ways: one solution with a for loop, and the other
with a while loop.

**Example Output**

```
Hail Hydra
Hail Hydra
Hail Hydra
Hail Hydra
Hail Hydra
```

**Template Code**

```java
public class RepeatPrint {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/practice/RepeatPrint.java){: .btn }

## Challenges

### Find Factor

<!-- prettier-ignore-start -->

while loop
{: .label }
break
{: .label }
boolean logic
{: .label }

<!-- prettier-ignore-end -->

Create a class called `FindFactor` which asks the user for a number greater than 2.
Find and print the smallest factor of that number that is not 1.

Bonus points if you can do it in 3 ways:

1. Without using a boolean variable or `break` statement
2. Using a `break` statement
3. Using a boolean variable

**Example Output**

```
Enter a number greater than 2: 87 [Enter ↩]
The smallest factor of 87 is 3.
```

**Template Code**

```java
public class FindFactor {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/FindFactor.java){: .btn }

### Hailstone

<!-- prettier-ignore-start -->

if statements
{: .label }
while loops
{: .label }
arithmetic operators
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Hailstone` which asks the user for a positive integer n and
display their input (the first number in the hailstone sequence).

If n is even, divide n by 2. If n is odd, multiply n by 3 and add 1.
Print the result (the current number in the hailstone sequence).

Keep doing this until n converges on 1 (it is the last item in the sequence,
which you should also print) then print the number of items in the sequence
and the average of all the numbers in the sequence.

**Example Output**

```
Enter starting positive number n: 10 [Enter ↩]
10
5
16
8
4
2
1
Number of items: 7
Average: 6.571428571428571
```

**Template Code**

```java
public class Hailstone {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/Hailstone.java){: .btn }

### Locker Puzzle

<!-- prettier-ignore-start -->

arrays
{: .label }
for loops
{: .label }
nested loops
{: .label }
logical operators
{: .label }

<!-- prettier-ignore-end -->

Create a class called `LockerPuzzle` which contains your solution code.

In a school, there are 100 lockers numbered 1 to 100. There are 100 students in the school.
All of the lockers are initially closed.

Student 1 goes through each locker and opens them.

Student 2 goes through every other locker and opens them if they are closed,
and closes them if they are open.

Student 3 goes through every 3 lockers and opens them if they are closed,
and closes them if they are open.

Students 4-100 follow the same pattern, opening/closing
every 4th locker, 5th locker, 6th locker, ..., and 100th locker.

**Visualization of Lockers**
(0 is closed, 1 is open)

| Locker Numbers             | 1    | 2    | 3    | 4    | 5    |
| :------------------------- | :--- | :--- | :--- | :--- | :--- |
| Initial State (all closed) | 0    | 0    | 0    | 0    | 0    |
| After Student 1            | 1    | 1    | 1    | 1    | 1    |
| After Student 2            | 1    | 0    | 1    | 0    | 1    |
| After Student 3            | 1    | 0    | 0    | 0    | 1    |

Print the numbers of the lockers that are open after student 100 is
done opening/closing their locker(s).

You should get the same output every time (it's a series of special numbers).

**Template Code**

```java
public class LockerPuzzle {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/LockerPuzzle.java){: .btn }

### Phone Word

<!-- prettier-ignore-start -->

loops
{: .label }
String methods
{: .label }
if statements
{: .label }
switch statements
{: .label }

<!-- prettier-ignore-end -->

Create a class called `PhoneWord` which asks the user to enter a phone word,
which is then converted to a phone number if it is 7 characters or longer.

The program will only convert the first 7 characters to a phone number.

The program should be case insensitive (a is the same as A) and it should ignore
any characters that aren't letters or digits.

Use a for loop or while loop.

Hint 1: Wait, what's a phone word? Look at your phone's keypad. There are usually
3 letters that correspond with each number that could be combined to form a phone number.
For example, the phone word for3V3R would translate into 367-3837.

(Basically, your program should preserve numbers as they are and convert letters
to numbers based on a phone keypad.)

Hint 2: You might want to use [regular expressions](https://howtodoinjava.com/java-regular-expression-tutorials/) to get rid of all the characters
that aren't numbers or letters!

Bonus points if you can format the phone number such that there is a hyphen where
there usually is (between the 3rd and 4th digit).

**Note**: To complete this challenge, you will need to know `String` methods in Java.
You can read about them [here](https://www.w3schools.com/java/java_ref_string.asp).

**Example Output**

```
Enter a phone word: For3v3R [Enter ↩]
The number is 367-3837
```

**Template Code**

```java
public class PhoneWord {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (For Loop)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/PhoneWordForLoop.java){: .btn }

<!-- prettier-ignore -->
[Solution (While Loop)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/PhoneWordWhileLoop.java){: .btn }

### Statistics

<!-- prettier-ignore-start -->

Scanner
{: .label }
while loop
{: .label }
arithmetic operators
{: .label }
Math class
{: .label }
boolean logic
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Statistics` which asks the user to enter prices until they want
to quit. After the user quits, display the number of items, average price (if possible),
and sample standard deviation of the prices (if possible). Make sure the standard deviation
is only up to 2 decimal points of precision (use `System.out.printf` and `%.2f`).

**Note**: How to calculate sample standard deviation for this problem (since you don't know all the data at once)

1. Keep a count of the number of items (e.g. numItems)
2. Keep a running sum of each price squared (e.g. sumSquares) (ex. if the prices are 5, 6, and 1, the sum of each price squared is 25 + 36 + 1)
3. Keep a running sum of each price (e.g. sumItems) (ex. if the prices are 5, 6, and 1, the sum is 12)
4. Sample standard deviation will be (not in Java syntax): `sqrt((numItems * sumSquares - sumItems * sumItems) / (numItems * (numItems - 1)))`

**Example Output 1**

```
Enter the price, or -1 to quit: $4 [Enter ↩]
Enter the price, or -1 to quit: $5 [Enter ↩]
Enter the price, or -1 to quit: $6.45 [Enter ↩]
Enter the price, or -1 to quit: $-1 [Enter ↩]
Number of items: 3
Average price is $5.15
Standard deviation of prices is $1.23
```

**Example Output 2**

```
Enter the price, or -1 to quit: $5 [Enter ↩]
Enter the price, or -1 to quit: $-1 [Enter ↩]
Number of items: 1
Average price is $5.00
Cannot calculate standard deviation for one item
```

**Example Output 3**

```
Enter the price, or -1 to quit: $-1 [Enter ↩]
Number of items: 0
No data entered. Cannot calculate statistics.
```

**Template Code**

```java
public class Statistics {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit3/challenges/Statistics.java){: .btn }
