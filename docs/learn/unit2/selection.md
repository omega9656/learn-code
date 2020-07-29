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
If that boolean condition is true, then the program could do something.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean condition = true;

        if (condition){
            System.out.println("Condition is met");
        }
    }
}
```

You can also make the program do something when a condition is not met by using
an else statement after the if statement.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean condition = true;

        if (condition){
            System.out.println("Condition is met");
        } else {
            System.out.println("Condition is not met");
        }
    }
}
```

You can check for multiple conditions using an else if statment after the if
statement. This means that the code first checks the if statement, and if that
condition is not met, then it would continue through the other else if
statements below it.

```java
public class HelloWorld{
    public static void main(String[] args){
        String grade = "B";

        if (grade == "A"){
            System.out.println("Grade is A");

        } else if (grade == "B"){
            System.out.println("Grade is B");

        } else if (grade == "C"){
            System.out.println("Grade is C");

        } else if (grade == "D"){
            System.out.println("Grade is D");

        } else {
            System.out.println("Grade is F")
        }
    }
}
```

In this case, if the program was run, the output would be "Grade is B" because
that condition was met.

## Switch Statement

Switch case statements are an easier way to check a certain value of a variable.
For example, using the grade example from before, we can write this in a much
simpler way.

```java
public class HelloWorld{
    public static void main(String[] args){
        String grade = "B";

        switch(grade){
            case "A":
                System.out.println("Grade is A");
                break;
            case "B":
                System.out.println("Grade is B");
                break;
            case "C":
                System.out.println("Grade is C");
                break;
            case "D":
                System.out.println("Grade is D");
                break;
            case "F":
                System.out.println("Grade is F");
                break;
        }
    }
}
```

## Ternary Operator

<!-- prettier-ignore-start -->

Coming soon
{: .label .label-yellow }

<!-- prettier-ignore-end -->
