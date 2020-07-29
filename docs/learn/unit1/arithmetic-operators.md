---
layout: default
title: Arithmetic Operators
permalink: learn/unit1/arithmetic-operators
parent: Unit 1
grand_parent: Learn
nav_order: 6
---

# Unit 1: Arithmetic Operators

{: .no_toc }

## Table of Contents

{: .no_toc .text-delta }

1. TOC
   {:toc}

## Arithmetic Operators

You know what computers are really good at? Crunching numbers. You can do basic arithmetic with Java by using arithmetic operators.

```java
a = 1 + 1
b = 5 - 2
c = 2 * 10

d = 12 / 3
e = 10 / 3
f = 10.0 / 3

g = 10 % 3

System.out.println("a: " + a);
System.out.println("b: " + b);
System.out.println("c: " + c);
System.out.println("d: " + d);
System.out.println("e: " + e);
System.out.println("f: " + f);
System.out.println("g: " + g);
```

_Note that you can concatenate some other types with strings, as you can see above._

Output:

```
a: 2
b: 3
c: 20
d: 4
e: 3
f: 3.333333333333
g: 1
```

## Addition, Subtraction, Multiplication, & Division

Addition, subtraction, and multiplication are pretty straightforward. However, there are 2 types of division in Java: _integer division_ and _floating point division_. Integer division happens whenever you divide 2 integers. This results in an integer since any decimals get truncated. Floating point division happens if you divide at least 1 floating point number, such as a `double`. (There are 2 floating point numeric types in Java, `double` and `float`. The former is more widely used.)

## Modulus

You probably don't recognize the `%` operator if you've never programmed before. This is the _modulus_ operator, which gives you the remainder of a division. In the example, `10 % 3` equals `1` because 10 divided by 3 is 3 remainder 1.

Modulus is useful when you need to check if a number is divisible by another number (since the remainder would be 0) and for certain unit conversions.

## Formatting

You can use string formatting to format output in a nice way. A common way to do this is using `System.out.printf` (you can think of this as **print** **f**ormat).

In string formatting, we use special symbols as placeholders for certain data types.

| Symbol | Data Type         |
| :----- | :---------------- |
| `%s`   | `String`          |
| `%d`   | `int`, `long`     |
| `%f`   | `double`, `float` |

For example:

```java
double price = 5.36;
System.out.printf("The price is $%f", price);
```

Output:

```
The price is $5.36
```

Notice that `%f` is replaced by the value of `price`.

**Note**: `System.out.printf` does not automatically add a newline character (`\n`) to the end, so you may want to do that depending on how you want your output to look.

**Note**: You can basically have an infinite number of placeholders, in which case you need to separate each value by a comma. Also make sure that you put each value in the order that it appears in the string. For example:

```java
int a = 5;
int b = 10;
System.out.printf("a is %d while b is %d", a, b);
```

Output:

```
a is 5 while b is 10
```

**Note**: If you want to display a certain amount of decimals for a floating point number, you can do something like this:

```java
final double PI = 3.1415926;
System.out.printf("Pi is approximately %.2f", PI);
```

Output:

```
Pi is approximately 3.14
```

Notice that to display up to 2 decimals of precision, we prepended `.2` to `f`. If I wanted to do 4 decimals of precision, I would write `%.4f`.

If you want to learn more about string formatting in Java, see [this article](https://dzone.com/articles/java-string-format-examples).
