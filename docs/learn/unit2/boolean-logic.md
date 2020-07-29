---
layout: default
title: Boolean Logic
permalink: learn/unit2/boolean-logic
parent: Unit 2
grand_parent: Learn
nav_order: 1
---

<!-- prettier-ignore-start -->
# Unit 2: Boolean Logic
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}
<!-- prettier-ignore-end -->

## Boolean Logic

Boolean logic in programming revolves around three key components: AND, OR, and NOT. These operators can compare multiple booleans together to see if a statement is true or false. In Java, these operators use different symbols.

## Logical Operators

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
