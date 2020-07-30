---
layout: default
title: Selection
permalink: learn/unit2/selection
parent: Unit 2
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 2: Selection
{: .no_toc }

In development
{: .label .label-purple }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

Selection in programming languages makes it possible to take a certain action if
a condition is met. This offers many possibilities as you can make the program
do anything once something else was true or false.

## If Statements

If statements are statements that check for certain conditions in the program.
If that boolean condition is true, then a certain block of code is executed.
Here is the general form of an if statement:

```java
if (condition) {
    // code here is executed if condition is true
}
```

For example, the following code prints `"You can vote!"`.

```java
int age = 25;

if (age >= 18) {
    System.out.println("You can vote!");
}
```

### Else

You can also make the program do something when a condition is not met by using
an else statement after the if statement. In the example below, assume a `Scanner`
object `input` has already been initialized.

```java
// prompt user for their age
System.out.print("Enter your age: ");
int age = input.nextInt();

// print whether they can vote
if (age >= 18) {
    System.out.println("You can vote!");
} else {
    System.out.println("You can't vote.");
}
```

Example output 1:

```
Enter your age: 19 [Enter ↩]
You can vote!
```

Example output 2:

```
Enter your age: 10 [Enter ↩]
You can't vote.
```

### Else If

You can check for multiple conditions using an else if statment after the if
statement. This means that the code first checks the if statement, and if that
condition is not met, then it would continue through the other else if
statements below it.

```java
// prompt user for their age
System.out.print("Enter your age: ");
int age = input.nextInt();

// print whether they can vote and/or if they're a teen
if (age >= 18) {
    System.out.println("You can vote!");
} else if (age >= 13) {
    System.out.println("You can't vote, but you're a teen.");
} else {
    System.out.println("You can't vote and you're not a teen.");
}
```

Note that having the final `else` clause is not technically required,
but is recommended to catch all other conditions you may not have thought of.

Example output 1:

```
Enter your age: 56 [Enter ↩]
You can vote!
```

Example output 2:

```
Enter your age: 15 [Enter ↩]
You can't vote, but you're a teen.
```

Example output 3:

```
Enter your age: 10 [Enter ↩]
You can't vote and you're not a teen.
```

### Why We Use Braces

Technically, for if statements with only one line of code in them, you don't need the curly
braces for the code to work. That might make you tempted to omit braces entirely. However,
we _highly recommend_ that you _always_ use braces no matter what to avoid logic errors.

Analyze the following code to avoid 4 common errors.

```java
double radius = 5;
double area;

// common error 1: forgetting necessary braces
// wrong
if (radius >= 0) area = radius * radius * Math.PI;
//            System.out.println("The area is " + area); // this line should be unindented

// correct
if (radius >= 0) {
    area = radius * radius * Math.PI;
    System.out.println("The area is " + area);
}

// common error 2: wrong semicolon at the if line
if (radius >= 0); // logic error: this line is equivalent to: if (radius >= 0) { }; (an empty if block)
    area = radius * radius * Math.PI;
    System.out.println("The area is " + area);

// common error 3: redundant testing of boolean values
boolean even = 6 % 2 == 0;

// not wrong, but could be better
if (even == true) {
    System.out.println("It is even.");
}

// code below is equivalent and better than code above
if (even) {
    System.out.println("It is even.");
}

// common error 4: dangling else ambiguity
int i = 1, j = 2, k = 3;

// not wrong, but ambiguous - to which if does the last else belong to?
if (i > j) 
    if (i > k) 
        System.out.println("A");
else System.out.println("B");

// equivalent to above code with correct indentation
if (i > j) 
    if (i > k)
        System.out.println("A");
    else
        // else clause always matches most recent 
        // unmatched if clause in the same block
        System.out.println("B");
```

### Common Pitfalls

Here is some code demonstrating common pitfalls when dealing with selection
structures.

```java
// common pitfall 1: simplifying boolean variable assignment
int number = 4;
boolean even;

if (number % 2 == 0) {
    even = true;
} else {
    even = false;
}

// equivalent but shorter than code above
even = number % 2 == 0;

// common pitfall 2: avoiding duplicate code in different cases
boolean inState = true;
double tuition;

if (inState) {
    tuition = 5000;
    System.out.println("The tuition is " + tuition); // repeated
} else {
    tuition = 15000;
    System.out.println("The tuition is " + tuition); // repeated
}

// better
if (inState) {
    tuition = 5000;
} else {
    tuition = 15000;
}
System.out.println("The tuition is " + tuition);
```

## Switch Statement

Switch statements are an easier way to execute code based on the value of a variable.
Once again, assume in the example below that a `Scanner` object called `input` has been
initialized.

```java
// prompt user for their rating
System.out.print("Enter your rating: ");
int rating = input.nextInt();

switch (rating) {
    case 1:
        System.out.println("Poor");
        break;
    case 2:
        System.out.println("Bad");
        break;
    case 3:
        System.out.println("Fair");
        break;
    case 4:
        System.out.println("Good");
        break;
    case 5:
        System.out.println("Great");
        break;
}
```

The switch statement above is equivalent to this if-else if chain.

```java
// prompt user for their rating
System.out.print("Enter your rating: ");
int rating = input.nextInt();

if (rating == 1) {
    System.out.println("Poor");
} else if (rating == 2) {
    System.out.println("Bad");
} else if (rating == 3) {
    System.out.println("Fair");
} else if (rating == 4) {
    System.out.println("Good");
} else if (rating == 5) {
    System.out.println("Great");
}
```


Example output 1:

```
Enter your rating: 5 [Enter ↩]
Great
```

Example output 2:

```
Enter your rating: 3 [Enter ↩]
Fair
```

Note that you can basically have as many cases as you want and execute
basically as much code as you want for each case.

### Fall Through

Notice that at the end of each case in a switch statement, there is a `break`
statement. This `break` statement is important because it ends the switch statement
once a case has been executed. If you don't write a `break` statement, you will
observe what is called _fall through behavior_.

What happens is that the switch checks the value of the variable against the cases
from top to bottom. Once it matches a case, all of the code for that case and the ones
below it are executed, until either the switch statement ends or there is a `break`.

For example, analyze the code below. Notice that we have removed the `break`
statements for cases 1-3 and that `rating` is set to `2`.

```java
int rating = 2;

switch (rating) {
    case 1:
        System.out.println("Poor");
    case 2:
        System.out.println("Bad");
    case 3:
        System.out.println("Fair");
    case 4:
        System.out.println("Good");
        break;
    case 5:
        System.out.println("Great");
        break;
}
```

Output:

```
Bad
Fair
Good
```

Notice that since `rating` is `2`, it matches `case 2` and the code there
is executed. Since there are no `break` statement in `case 2` and `case 3`,
it falls through and the code in `case 3` and `case 4` are executed. Once
we finish the code in `case 4`, there is a `break` statement, so we exit
the switch statement.

### Default

There is another special optional case in a switch statement called
the `default` case. If the value of the variable fails to match any
of the explicit cases, the code in the `default` case will run. It's
similar to having an `else` clause.

```java
int rating = 10;

switch (rating) {
    case 1:
        System.out.println("Poor");
        break;
    case 2:
        System.out.println("Bad");
        break;
    case 3:
        System.out.println("Fair");
        break;
    case 4:
        System.out.println("Good");
        break;
    case 5:
        System.out.println("Great");
        break;
    default:
        System.out.println("Not a valid rating");
}
```

_Note that there is no `break` at the end of the `default` case._
_You could technically have a `break`, but since it's the end of the switch_
_it doesn't matter if you have one or not._

Output:

```
Not a valid rating
```

## Ternary Operator

The final selection structure we'll discuss is the ternary operator.
It is not commonly used, but for reference we'll include it. It's essentially
a shortened way to write an if-else statement to assign a value to a variable.

The general form of a statement using the ternary operator is:

```java
var = (condition) ? ifValue : elseValue;
```

If `condition` is `true`, then `var` will be assigned the value
of `ifValue`. Otherwise, it will be assigned the value of `elseValue`.
For example, let's use a ternary operator to decide how many days
are in the month of February. (Assume all variables are declared and initialized.)

```java
daysInMonth = (month == 2 && isLeapYear) ? 29 : 28;
```

The code above is equivalent to the code below.

```java
if (month == 2 && isLeapYear) {
    daysInMonth = 29;
} else {
    daysInMonth = 28;
}
```
