---
layout: default
title: Unit 1 Practice
permalink: learn/unit1/practice
parent: Unit 1
grand_parent: Learn
nav_order: 9
---

# Unit 1: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Practice

### Circle Area
import
{: .label }
Scanner
{: .label }
variables
{: .label }
constants
{: .label }
concatenation
{: .label }

Create a class called `CircleArea` which prompts the user to enter the radius of a circle.
Calculate the area of that circle and print the result. Hint: You should use the built-in constant
`Math.PI` rather than your own constant for pi since it will be more accurate.

**Template Code**
```java
public class CircleArea {
    public static void main(String[] args) {
        // write your code here
    }
}
```

[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit1/practice/CircleArea.java){: .btn }


### Compute Average
import
{: .label }
Scanner
{: .label }
double division
{: .label }

Create a class called `ComputeAverage` which prompts the user for 3 numbers (`double`).
Calculate the average and print the result.

**Template Code**
```java
public class ComputeAverage {
    public static void main(String[] args) {
        // write your code here
    }
}
```

[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit1/practice/ComputeAverage.java){: .btn }

### Compute Change
constants
{: .label }
Scanner
{: .label }
modulus
{: .label }
casting
{: .label }
tab
{: .label }
newline
{: .label }

Prompt the user for an amount of money in standard format (ex. 11.56).
Print the number of dollars, quarters, dimes, nickels, and
pennies that makes up the given amount of money.
Hint: Convert the amount of money to cents.

**Example Output**
```
Enter amount of money: $11.56 [Enter ↩]
Your amount $11.56 consists of:
    11 dollar(s)
    2 quarter(s)
    0 dime(s)
    1 nickel(s)
    1 penny/pennies
```

**Template Code**
```java
public class ComputeChange {
    public static void main(String[] args) {
        // write your code here
    }
}
```

[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit1/practice/ComputeChange.java){: .btn }

### Convert Minutes

Scanner
{: .label }
modulus
{: .label }
constants
{: .label }

Create a class called `ConvertMinutes` which prompts the user to enter a number of minutes.
Convert the total minutes to hours and minutes. Print the result.

**Example Output**
```
Enter a number of minutes: 123 [Enter ↩]
123 minutes is
2 hours, 3 minutes
```

**Template Code**
```java
public class ConvertMinutes {
    public static void main(String[] args) {
        // write your code here
    }
}
```

[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit1/practice/ConvertMinutes.java){: .btn }

## Challenges

### Population

Scanner
{: .label }
constants
{: .label }
arithmetic operators
{: .label }

Given a number of years from 0, create a class `Population`
which calculates the population as a function of birth, death, and
migrations per second over that period of years.

Assume that the number of births, deaths, and migrations
per year remains constant over that period of years.

Values you'll need:
- Birth rate: 7 (7 sec/birth)
- Death rate: 13 (13 sec/death)
- Migration rate: 45 (45 sec/new person migrated to country)
- Population base: 312,032,486 (population at year 0, in people)

Hint: Create constants and do unit conversions.

**Template Code**
```java
public class Population {
    public static void main(String[] args) {
        // write your code here
    }
}
```

[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit1/challenges/Population.java){: .btn }