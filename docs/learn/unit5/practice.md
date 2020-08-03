---
layout: default
title: Unit 5 Practice
permalink: learn/unit5/practice
parent: Unit 5
grand_parent: Learn
nav_order: 6
---

<!-- prettier-ignore-start -->

# Unit 5: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Note on all problems

If you can write JavaDoc comments, do so for all of the methods you write!

## Practice

### Point

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

And TestPoint

Create a class called `Point` which 

Create a class called Point
that has 2 public fields x and y (doubles)

+ Create a default and 2-arg constructor
+ Create a getDistance(Point pt) method to calculate
  the distance between this Point and the given Point
+ Create a getDistance(double x, double y) method to calculate
  the distance between this Point and the given point
+ Override the toString method

Do not create getters/setters (since x and y are public)

Bonus points for javadoc comments on each method
(except toString) and on the class itself.

**Template Code**

```java
public class Point {
    // write your code here
}
```

```java
public class TestPoint {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (Point)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/Point.java){: .btn }

<!-- prettier-ignore -->
[Solution (TestPoint)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/TestPoint.java){: .btn }

### Finance

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Account` which 

`TestAccount`

**Template Code**

```java
public class Account {
    // write your code here
}
```

```java
public class TestAccount {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (Account)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/finance/Account.java){: .btn }

<!-- prettier-ignore -->
[Solution (TestAccount)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/finance/TestAccount.java){: .btn }

### Geometric

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Rectangle
RectangleInherit
TestRectangle

Create a class called `Rectangle` which 

`RectangleInherit`

`TestRectangle`

TODO link geometric object code on github

**Template Code**

```java
public class Rectangle {
    // write your code here
}
```

```java
// either import the GeometricObject class...

public class RectangleInherit extends GeometricObject {
    // write your code here
}

// ...or copy and paste it here
```

```java
public class TestRectangle {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (Rectangle)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/Rectangle.java){: .btn }

<!-- prettier-ignore -->
[Solution (RectangleInherit)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/RectangleInherit.java){: .btn }

<!-- prettier-ignore -->
[Solution (TestRectangle)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/TestRectangle.java){: .btn }

## Challenges

### College

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Person`  which 
`Employee`
`Faculty`
`Staff`

`MyDate`

`Student`

`TestCollegeRoles`

**Template Code**

```java
public class Person {
    // write your code here
}
```

```java
public class Employee extends Person {
    // write your code here
}
```

```java
public class Faculty extends Employee {
    // write your code here
}
```

```java
public class Staff extends Employee {
    // write your code here
}
```

```java
public class MyDate {
    // write your code here
}
```

```java
public class Student extends Person {
    // write your code here
}
```

```java
public class TestCollegeRoles {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (Classes)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/college){: .btn }

<!-- prettier-ignore -->
[Solution (UML)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/college/UML){: .btn }

### Finance

<!-- prettier-ignore-start -->

methods
{: .label }
return
{: .label }
if statement
{: .label }

<!-- prettier-ignore-end -->

Create a class called `CreditCardAccount` which 

`SavingsAccount`
`TestAccounts`

TODO import Account class or link it (copy and paste)

**Template Code**

```java
public class CreditCardAccount {
    // write your code here
}
```

```java
public class SavingsAccount {
    // write your code here
}
```

```java
public class TestAccounts {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution (CreditCardAccount)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/CreditCardAccount.java){: .btn }

<!-- prettier-ignore -->
[Solution (SavingsAccount)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/SavingsAccount.java){: .btn }

<!-- prettier-ignore -->
[Solution (TestAccounts)]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/TestAccounts.java){: .btn }
