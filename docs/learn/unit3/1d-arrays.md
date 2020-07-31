---
layout: default
title: 1D Arrays
permalink: learn/unit3/1d-arrays
parent: Unit 3
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 3: 1D Arrays
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Arrays

Arrays are basically a collection of items in Java. Think of them
as ordered lists with fixed sizes that can only store one data type.

### Initialization

There are 2 main ways to initialize an array in Java. First, you can
initialize an array of a certain length (number of items). The example
below initializes an array of integers of length 50.

```java
int[] numbers = new int[50];
```

The general form is as follows:

```java
type[] nameOfArray = new type[length];
```

Note that when you initialize an array in this way, all of the values
are set to default values such as `0` for `int` arrays and `false` for `boolean` arrays.

Also notice the `new` keyword. This indicates that arrays are _not_ primitive
types, and are rather _objects_ that must be created. For now, you can think
of objects as more advanced data types.

You can also initialize an array with given values. The example below
initializes an integer array with the values 5, 12, -2, 4, and 0.

```java
int[] numbers = {5, 12, -2, 4, 0};
```

Note that here, you do not need to use the `new` keyword. Also notice that elements in the array
are separated by commas.

### Indexing

Now that we can create arrays, how do we access data in the array?
In Java, we use something called _indexing_. Because arrays are ordered lists,
we can retrieve data based on its position in the array, or its _index_.

Like a lot of things in programming, array indexing starts at 0. That means
that the first element is at index 0, the second element is at index 1, and so on.
(It also means that the last element is at index n - 1, where n is the length of the array.)

Let's take the `numbers` array from the previous example. The table below shows you
conceptually how indexing works.

| index   | 0    | 1    | 2    | 3    | 4    |
| :------ | :--- | :--- | :--- | :--- | :--- |
| element | 5    | 12   | -2   | 4    | 0    |

### Retrieving & Updating Elements

To update or retrieve an element in an array, you simply use the element's index.
Analyze the code below.

```java
int[] numbers = {5, 12, -2, 4, 0};

System.out.println(numbers[1]); // prints 12

System.out.println(numbers[3]); // prints 4
numbers[3] = -52;
System.out.println(numbers[3]); // prints -52
```

Let's break down what happened. First, we initialized an array of integers. Then we
printed the element at index 1, which is `12`. Next, we printed the element at index 3,
which is `4`. Finally, we updated the element at index 3 to be `-52`, so when we print the element
at index 3 again, it prints `-52`.

As you may have guessed, the general form for retrieving/updating elements is `nameOfArray[index]`.

## Iteration

Obviously in programming our datasets will not always be 5 items long. So how
can be iterate through the elements in our array and perform operations on them?
That's where loops come in -- more specifically, for loops (you can technically use
while loops, but for loops are kinda built for this kind of thing).

To iterate through each element in the array in order, you can use the control variable
in your for loop to act as your current index.

```java
int[] numbers = {5, 12, -2, 4, 0};

for (int index = 0; index < 5; index++) {
    System.out.println(numbers[index]);
}
```

Output:

```
5
12
-2
4
0
```

To generalize this even further, we can use the `length` property of an array
so that the index goes up to index n - 1, where n is the length of the array.
This ensures that the index never goes _out of bounds_.

```java
for (int index = 0; index < nameOfArray.length; index++) {
    System.out.println(nameOfArray[index]);
}
```

For example:

```java
int[] numbers = {5, 12, -2, 4, 0};

for (int index = 0; index < numbers.length; index++) {
    System.out.println(numbers[index]);
}
```

Output:

```
5
12
-2
4
0
```

### For Each Loop

Java developers knew that using a for loop to iterate through each item
in an array is something programmers would do a lot, so there's actually
a special kind of for loop called a _for each loop_ that allows you to access
elements in an array in order with less syntax.

The downside is that you can only retrieve values; you can't update them.
Also, you have to go in order from index 0 to the final index.

Here's the general form of a for each loop.

```java
for (type elementName: nameOfIterable) {
    // do something with elementName
}
```

For example:

```java
int[] numbers = {5, 12, -2, 4, 0};

for (int n: numbers) {
    System.out.println(n);
}
```

Output:

```
5
12
-2
4
0
```

Notice that `type` needs to match the type of the elements in the array.
Also notice that `elementName` can be set to basically whatever you want
as long as it follows Java identifier naming rules.
