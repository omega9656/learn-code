---
layout: unit
title: Unit 2
permalink: learn/unit2
parent: Learn
nav_order: 3
---

# Unit 2: Selection and Boolean Logic
{: .no_toc }

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Boolean Logic
Boolean logic in programming revolves around three key components: AND, OR, and NOT. These operators can compare multiple booleans together to see if a statement is true or false. In Java, these operators use different symbols.

### AND
The AND operator in Java is `&&`, and separates two booleans. It checks to see if the two boolean statements are both true. If they are both true, then the complete boolean statement would be true.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = true;
        boolean isCloudy = true;

        System.out.println(isRaining && isCloudy); //prints true
    }
}
```
However, if one or both of the booleans are false, then the whole boolean statement would be false.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isCloudy = true;

        System.out.println(isRaining && isCloudy); //prints false
    }
}
```

### OR
The OR operator in Java is `||`, and checks to see if at least one of the booleans statements is true. If both are true, then the complete boolean statement would be true.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = true;
        boolean isCloudy = true;

        System.out.println(isRaining || isCloudy); //prints true
    }
}
```

If one boolean statement is true, and the other was false, the OR operator would still return true.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isCloudy = true;

        System.out.println(isRaining && isCloudy); //prints true
    }
}
```

Only if both statements were false, then the complete boolean statement would return false.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isCloudy = false;

        System.out.println(isRaining && isCloudy); //prints false
    }
}
```

### NOT
The NOT operator in Java is `!`, and is a little bit different from the AND and OR operators. Instead of comparing two different boolean statements, the NOT operator simply gives the opposite of a boolean statement. In this example, if the NOT operator is used, the print statement would print true.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = false;

        System.out.println(!isRaining); //prints true
    }
}
```
The NOT operator can be used on any boolean statements, which means that it can be used with the AND and OR operators as well.

```java
public class HelloWorld{
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isCloudy = true;

        System.out.println(!(isRaining && isCloudy)); //prints true
    }
}
```
Note that there needs to be parentheses around the operators if you are using multiple.


## Selection
Selection in programming languages makes it possible to take a certain action if a condition is met. This offers many possibilities as you can make the program do anything once something else was true or false.

### If Statements
If statements are statements that check for certain conditions in the program. If that boolean condition is  true, then the program could do something.

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
You can also make the program do something when a condition is not met by using an else statement after the if statement.

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
You can check for multiple conditions using an else if statment after the if statement. This means that the code first checks the if statement, and if that condition is not met, then it would continue through the other else if statements below it.

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
In this case, if the program was run, the output would be "Grade is B" because that condition was met.

### Switch Statement
Switch case statements are an easier way to check a certain value of a variable. For example, using the grade example from before, we can write this in a much simpler way.

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

### Ternary Operator

## Practice

## Quiz
