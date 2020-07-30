---
layout: default
title: Unit 2 Practice
permalink: learn/unit2/practice
parent: Unit 2
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 2: Practice
{: .no_toc }

Coming soon
{: .label .label-yellow }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Practice

### Grades

<!-- prettier-ignore-start -->

Scanner
{: .label }
if statements
{: .label }
boolean logic
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Grades` which prompts the user for a test score.
Depending on the score, print the letter grade received.

**Example Output**

```
Enter a test score: 85.23 [Enter ↩]
B
```

**Template Code**

```java
public class Grades {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/practice/Grades.java){: .btn }

### Month

<!-- prettier-ignore-start -->

Scanner
{: .label }
switch
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Month` which prompts the user for a number from 1 to 12
Using a switch, print the month that corresponds with that number.
If the number is not from 1 to 12, give an error message.

**Example Output**

```
Enter a number from 1 to 12: 11 [Enter ↩]
November
```

**Template Code**

```java
public class Month {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/practice/Month.java){: .btn }

### Vote

<!-- prettier-ignore-start -->

Scanner
{: .label }
if statement
{: .label }
relational operators
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Vote` which prompts the user for their age.
Depending on their age, print to the console whether or not they can vote.

**Example Output**

```
Enter your age: 5 [Enter ↩]
Sorry, you can't vote yet.
```

**Template Code**

```java
public class Vote {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/practice/Vote.java){: .btn }

### Zodiac

<!-- prettier-ignore-start -->

Scanner
{: .label }
switch
{: .label }
modulus
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Zodiac` which prompts the user for their birth year.
Using a switch, print their zodiac sign. Hint: Zodiac signs repeat every 12 years.

Order of zodiac signs:
1. monkey
2. rooster
3. dog
4. pig
5. rat
6. ox
7. tiger
8. rabbit
9. dragon
10. snake
11. horse
12. sheep

**Example Output**

```
Enter your birth year: 2003 [Enter ↩]
sheep
```

**Template Code**

```java
public class Zodiac {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/practice/Zodiac.java){: .btn }

## Challenges

### Intervals

<!-- prettier-ignore-start -->

Scanner
{: .label }
modulus
{: .label }
integer division
{: .label }
if statement
{: .label }
relational operators
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Intervals` which prompts the user to enter start and end times
for an earlier interval and a later interval in 24-hour format.

The program should then calculate the duration of each time interval and display:
- The duration of each interval
- Which interval is longer
- Whether the intervals of time overlap

Bonus points if you can implement a solution where if the user switches the start and end times
and/or switches earlier and later intervals, the program will still function properly.

Hint: Use modulus and convert everything into minutes after midnight (00:00).

Note: You can use 2 consecutive calls to `nextInt()` to get 2 integers that are separated by a space.

**Example Output**

```
Enter earlier start and end times (in 24-hour format): 1200 1545 [Enter ↩]
Enter later start and end times (in 24-hour format): 1500 1732 [Enter ↩]
The earlier interval is 225 minutes long.
The later interval is 152 minutes long.
The earlier interval is longer.
The intervals overlap.
```

**Template Code**

```java
public class Intervals {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/challenges/Intervals.java){: .btn }

### Pay Calculator

<!-- prettier-ignore-start -->

Scanner
{: .label }
if statement
{: .label }
arithmetic operators
{: .label }
relational operators
{: .label }
print formatting
{: .label }

<!-- prettier-ignore-end -->

Create a class called `PayCalculator` which prompts the user to enter the
number of hours worked that week and the hourly pay rate.

The program will compute the total pay for that week, paying time and a half
for any hours over 40.

It should format the total pay in standard money form - that is, 2 decimal places of precision.

Hint: Time and a half means that if you work over 40 hours, your total will be the number
of hours you worked * pay rate, plus an overtime bonus. The overtime bonus is calculated by
taking the number of hours overtime worked * half the normal pay rate. (Hence, time and a half.)

**Example Output 1**

```
Enter number of hours: 23 [Enter ↩]
Enter pay rate per hour: $5.30 [Enter ↩]
Your total pay is $121.90.
```

**Example Output 2**

```
Enter number of hours: 45 [Enter ↩]
Enter pay rate per hour: $12.00 [Enter ↩]
Your total pay is $570.00.
```

**Template Code**

```java
public class PayCalculator {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit2/challenges/PayCalculator.java){: .btn }
