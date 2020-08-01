---
layout: default
title: Loops
permalink: learn/unit3/loops
parent: Unit 3
grand_parent: Learn
nav_order: 1
---

<!-- prettier-ignore-start -->

# Unit 3: Loops
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## What are loops?

So far, we've gone over selection structures. Those are all neat and good,
but what if we want to repeat code? You could just copy and paste the code,
but that takes way too much effort and is hard to maintain.

Enter loops. Loops are programming structures that allow us to repeat code
in specific ways.

## For Loop

_For loops_ are used when you have a relatively good idea of how many times
you want your code to run. For example, if you wanted you to print `"Hello World"`
100 times, a for loop would be a great choice.

The general form of a for loop is as follows:

```java
for (initialization; condition; action) {
    // code in the loop body repeats
}
```

For example, this code prints `"Hello World"` 100 times:

```java
for (int i = 0; i < 100; i++) {
    System.out.println("Hello World");
}
```

Let's break down this code.

### Initialization

The first part of the for loop above was `int i = 0`. This initializes
the loop's control variable. The control variable usually changes throughout
each iteration of the loop so that eventually we will exit the loop.

Note that you can call it whatever you want, and it doesn't necessarily need
to be `i`, be an `int`, or start at `0`.

### Condition

The second part of the for loop was `i < 100`. This is the condition that
is checked at the beginning of each iteration of the loop. The for loop continues
repeating the code in the for loop body as long as that condition is `true`.

### Action

The last part of the for loop was `i++`. This part of the for loop is executed
every time the current iteration of the loop ends. In this case, each loop, `i`
is incremented. This is also crucial to making sure the loop eventually terminates,
because eventually `i` will equal `100` and thus `i < 100` is `false`.

If you're still having trouble thinking about how this translates to `"Hello World"`
being printed 100 times, consider this table which tracks the loop's output and
current state of the control variable `i`.

| `i`   | `i < 100`           | Output                                          |
| :---- | :------------------ | :---------------------------------------------- |
| `0`   | `true`              | `Hello World`<br>                               |
| `1`   | `true`              | `Hello World`<br>`Hello World`                  |
| `2`   | `true`              | `Hello World`<br>`Hello World`<br>`Hello World` |
| ...   | `true`              | ...                                             |
| `99`  | `true`              | `Hello World` (x100)                            |
| `100` | `false` (loop ends) | `Hello World` (x100 - no change)                |

### Multiple Initializations and Actions

You can technically have more than one initialization and action in a for loop.
In that case, you would separate each statement with a colon rather than a semicolon.
However, this is not very common.

Example:

```java
int i = 0;
int j = 0;

for (i = 1, j = 1; i < 7; i++, j += 2) {
    System.out.printf("i: %d, j: %d, i + j: %d\n", i, j, i + j);
}
```

Output:

```
i: 1, j: 1, i + j: 2
i: 2, j: 3, i + j: 5
i: 3, j: 5, i + j: 8
i: 4, j: 7, i + j: 11
i: 5, j: 9, i + j: 14
i: 6, j: 11, i + j: 17
```

## While Loop

What if we want to repeat code, but we're not exactly sure how many times we want
to repeat it? In that case, a _while loop_ would be useful. The code inside of a
while loop runs as long as a certain condition is `true`.

The general form of a while loop is below.

```java
while (condition) {
    // code inside is repeated while condition is true
}
```

The condition is checked at the beginning of each loop to determine whether another
iteration of the while loop will run.

Here's an example of a while loop in action.

```java
int n = 50;

while (n > 2) {
    n /= 3;
    System.out.println(n);
}
```

Output:

```
16
5
1
```

Let's see what happened here with a table.

| `n`   | `n > 2`             | Output             |
| :---- | :------------------ | :----------------- |
| `50`  | `true`              | `16`               |
| `16`  | `true`              | `16`<br>`5`        |
| `1`   | `false` (loop ends) | `16`<br>`5`<br>`1` |

### Infinite Loops

An _infinite loop_ happens when a loop runs forever. This usually happens
if the programmer forgets to update the control variable or sets a condition
that will never be `false`, and thus the loop will never terminate.

Here is an example of an infinite loop.

```java
int n = 0;
n++;
while (n < 50) {
    System.out.println(n)
}
```

Notice that the `n++` happens _outside_ of the while loop, so `n` will always be `1`
inside the while loop. Thus, `n < 50` will _always_ be true, and the loop will print `1`
forever (well, until the computer crashes or the programmer manually stops the program).

To avoid infinite loops, make sure that your condition is reachable and that your control
variable is being updated somehow.

## Do While Loop

There is another kind of while loop called a _do while loop_ which basically is the same
as a while loop, except that you are guaranteed that the code inside the loop will run
at least once. This is good for things like continuously getting user input, since you know
you'll always need to ask the user at least once.

The general form of a do while loop is as follows.

```java
do {
    // code inside is executed at least once
    // and continues executing while the condition is true
} while (condition);
```

Notice that there is a semicolon at the end of the do while loop.

In the example below, assume `isRaining` has been declared and that
a `Scanner` object called `input` has been initialized.

```java
do {
    // ask user if it's raining
    System.out.print("Is it raining? Enter true or false: ");
    isRaining = input.nextBoolean();
} while (isRaining);
```

Example output:

```
Is it raining? Enter true or false: true [Enter ↩]
Is it raining? Enter true or false: true [Enter ↩]
Is it raining? Enter true or false: false [Enter ↩]
```

## Break and Continue

Loops are great, but sometimes we want to stop looping
or skip the current iteration of the loop. That's where
`break` and `continue` come in.

Note that you can use these keywords inside the bodies
of any type of loop (whether it's a for loop or while loop).

### Break

The `break` statement, as you may recall from [Unit 2](/learn-code/learn/unit2/selection#switch-statement),
is used to immediately terminate a control structure. In the case of loops,
once you hit a `break` statement, you immediately exit the loop. Any code that is
inside the loop body but _after_ the `break` statement will _not_ run.

### Continue

The `continue` statement is used to terminate the _current iteration_ of the loop
rather than terminate the loop completely. Like the `break` statement, any code
inside the loop body but _after_ the `continue` statement will _not_ run.

### Break vs Continue

Analyze the code below to learn the difference between `break` and `continue`.

```java
// Testing the continue keyword
System.out.println("Testing continue");

int sum = 0;
int number = 0;

// Print the current number from 1-10,
// but skip 7 and 8.
// Also keep a running sum of the numbers.
while (number < 10) {
    number++;
    if (number == 7 || number == 8) {
        continue;
    }
    sum += number;
    System.out.printf("number: %d sum: %d.\n", number, sum);
}

System.out.println("The sum is " + sum);

// Testing the break keyword
System.out.println("\n\nTesting break");

sum = 0;
number = 0;

// Print the current number from 1-6.
// Also keep a running sum of the numbers.
while (number < 10) {
    number++;
    if (number == 7) { // will never reach 8
        break;
    }
    sum += number; // 7 is never added to the sum
    System.out.printf("number: %d sum: %d.\n", number, sum);
}

System.out.println("The sum is " + sum);
```

Output

```
Testing continue
number: 1 sum: 1.
number: 2 sum: 3.
number: 3 sum: 6.
number: 4 sum: 10.
number: 5 sum: 15.
number: 6 sum: 21.
number: 9 sum: 30.
number: 10 sum: 40.
The sum is 40


Testing break
number: 1 sum: 1.
number: 2 sum: 3.
number: 3 sum: 6.
number: 4 sum: 10.
number: 5 sum: 15.
number: 6 sum: 21.
The sum is 21
```

Notice that when we tested `continue`, we skipped when `number` was `7` or `8`, but
the loop kept going. On the other hand, when we tested `break`, once `number` hit `7`,
the loop ended completely.
