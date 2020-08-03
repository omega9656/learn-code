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

If you can write JavaDoc comments, do so for all of the methods you write! Also
add the `@Override` annotation whenever applicable.

Also, class specifications are given in loose UML diagram format.

## Practice

### Point

<!-- prettier-ignore-start -->

classes
{: .label }
methods
{: .label }
overloading
{: .label }
overriding
{: .label }
driver class
{: .label }

<!-- prettier-ignore-end -->

**Point**

Create a class called `Point` that has 2 `public` fields `x` and `y` (`double`).
The class should have the following methods:

-   A default constructor which sets the `Point` to be at the origin
-   A 2-argument constructor
-   A `getDistance(Point pt)` method which returns the distance between this
    `Point` and the given `Point`
-   A `getDistance(double x, double y)` method which overloads the previous
    method
-   A `toString` method which displays the `Point` as an (x, y) coordinate

Do not create getters/setters (since `x` and `y` are `public`).

```java
public class Point {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/Point.java){: .btn }

**TestPoint**

Create a class called `TestPoint` which tests the `Point` class. In the `main`
method, you should create 2 `Point` objects by using the default constructor and
2-argument constructor. Then call both `getDistance` methods to test them.

```java
public class TestPoint {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/TestPoint.java){: .btn }

### Finance (Part 1)

<!-- prettier-ignore-start -->

classes
{: .label }
methods
{: .label }
getters and setters
{: .label }
overloading
{: .label }
overriding
{: .label }
driver class
{: .label }

<!-- prettier-ignore-end -->

**Account**

Create a class called `Account` which has the following fields:

-   number (`long`): the account number
-   balance (`double`)
-   name (`String`): name of the person who owns the account

Implement the following methods (all are public):

-   Account()
-   Account(name: String, number: long)
-   Account(name: String, number: long, balance: double)
-   getters and setters for name, number, and balance.
    -   HOWEVER, do not make a setter for number, since you don't change your
        account number once the account is made.
-   deposit(amount: double): boolean (if deposit was successful, return `true`)
    -   You should not be able to deposit a negative amount.
-   withdraw(amount: double): boolean (if withdrawal was successful, return
    `true`)
    -   You should not be able to withdraw more than you have in the account.
-   transferTo(acct: Account, amount: double): boolean (if transfer was
    successful, return `true`)
    -   You should not be able to transfer more than you have in the account.
    -   You should not be able to transfer a negative amount.

Override the `toString` method such that a print statement prints the name,
number, and balance.

Override the `equals` method such that 2 accounts that have the same account
number are equal.

```java
public class Account {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/finance/Account.java){: .btn }

**TestAccount**

Create a driver class for `Account` called `TestAccount`. In the `main` method,
test all of the methods in `Account` at least once.

```java
public class TestAccount {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/finance/TestAccount.java){: .btn }

### Geometric

<!-- prettier-ignore-start -->

classes
{: .label }
inheritance
{: .label }
methods
{: .label }
getters and setters
{: .label }
driver class
{: .label }

<!-- prettier-ignore-end -->

**Rectangle**

Create a class called `Rectangle` which has the following specifications.

Fields (all `private`):

-   length: `double`
-   width: `double`

Methods (all `public`):

-   Rectangle()
-   Rectangle(length: double, width: double)
-   Getters and setters for length and width
-   getArea(): double
-   getPerimeter(): double

Override:

-   `toString` so that it displays the length and width of the `Rectangle`
-   `equals` so that 2 `Rectangles` are equal if they have the same area

```java
public class Rectangle {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/Rectangle.java){: .btn }

**RectangleInherit**

Create a class called `RectangleInherit` which extends `GeometricObject`. (You
can view the code for `GeometricObject`
[here]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/lessons/geometric/GeometricObject.java)).
It also has the following specifications.

Fields (all `private`):

-   length: double
-   width: double

Methods (all `public`):

-   All the methods that `Rectangle` has, in addition to a 3rd constructor
    (below)
-   RectangleInherit(length: double, width: double, x: double, y: double, color:
    String, filled: boolean)

Override:

-   Same methods as `Rectangle`

```java
// import GeometricObject if needed

public class RectangleInherit extends GeometricObject {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/RectangleInherit.java){: .btn }

**TestRectangle**

Create a driver class called `TestRectangle` which tests every method in the
`Rectangle` and `RectangleInherit` classes.

```java
public class TestRectangle {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/practice/geometric/TestRectangle.java){: .btn }

## Challenges

### College

<!-- prettier-ignore-start -->

classes
{: .label }
inheritance
{: .label }
aggregation
{: .label }
methods
{: .label }
driver classes
{: .label }
polymorphism
{: .label }
UML diagrams
{: .label }

<!-- prettier-ignore-end -->

_Modified from Exercise 11.2 in Introduction to Java Programming
(Comprehensive), 10th ed. by Y. Daniel Liang_

Create the following classes:

-   `Person`
-   `Employee` extends `Person`
-   `Faculty` extends `Employee`
-   `Staff` extends `Employee`
-   `MyDate`
-   `Student` extends `Person`

Your classes should follow the specifications in the [UML
diagrams]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/college/UML).

**TestCollegeRoles**

Create a class called `TestCollegeRoles` to test the classes you wrote. In the
`main` method, create a `Person` array with `Person`, `Student`, `Employee`,
`Faculty`, and `Staff` objects. Then print all of them.

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
[Solutions]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/college){: .btn }

### Finance (Part 2)

<!-- prettier-ignore-start -->

classes
{: .label }
inheritance
{: .label }
methods
{: .label }
overriding
{: .label }
driver classes
{: .label }
polymorphism
{: .label }

<!-- prettier-ignore-end -->

**CreditCardAccount**

Create a class called `CreditCardAccount` which extends `Account` (see
[Finance (Part 1)](#finance-part-1)).

Fields (all `private`):

-   apr: `double`, the annual percentage rate (APR) for interest, as a decimal
-   creditLimit: `double`, the credit limit for the card

**Wait, what's APR?**

It's an interest rate used to calculate the monthly minimum payment. (See that
method below.)

**Wait, what's a credit limit?**

Credit cards allow you to withdraw money even if you'd go into debt as a result
of the withdrawal. The credit limit allows you to do this up to an extent - you
can withdraw any amount less than or equal to `balance` + `creditLimit`.

Methods (all `public`):

-   CreditCardAccount()
-   CreditCardAccount(name: String, number: long, balance: double)
-   CreditCardAccount(name: String, number: long, balance: double, apr: double,
    creditLimit: double)
-   getApr(): double
-   setApr(): void
-   getCreditLimit(): double
-   setCreditLimit(): void
-   withdraw(amount: double): boolean
    -   Overrides superclass method and lets you withdraw more than you have in
        your balance, as long as it is not over the credit limit.
    -   Returns `true` if the withdrawal was successful.
-   calculatePayment(): double
    -   Returns monthly minimum payment based on current balance
    -   How is this calculated? If your balance is positive, you don't have to
        pay anything. Otherwise, your monthly payment is whichever is less:
        \$20, or `(apr / 12) * (-balance)`

Override:

-   `toString` so that it includes `name`, `number`, `balance`, `apr`,
    `creditLimit`, and monthly minimum payment

```java
// import Account if needed

public class CreditCardAccount extends Account {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/CreditCardAccount.java){: .btn }

**SavingsAccount**

Create a class called `SavingsAccount` which extends `Account`.

Fields (all `private`):

-   apr: `double`, annual percentage rate (APR) for interest as a decimal

Methods (all `public`):

-   SavingsAccount()
-   SavingsAccount(number: long, balance: double, apr: double),
-   getApr(): double
-   setApr(): void
-   calculateInterest(): double
    -   Returns annual interest earned based on current balance and APR
    -   How is this calculated? It's `balance * apr`

Override:

-   `toString`: String, includes `name`, `number`, `balance`, `apr`, and annual
    interest earned

```java
// import Account if needed

public class SavingsAccount extends Account {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/SavingsAccount.java){: .btn }

**TestAccounts**

Create a driver program called `TestAccounts` to test the `CreditCardAccount`
and `SavingsAccount` classes.

In the `main` method, create an array of `Account` objects and print the status
of each account after depositing and withdrawing a certain amount.

```java
public class TestAccounts {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/challenges/finance/TestAccounts.java){: .btn }
