---
layout: default
title: Variables
permalink: learn/unit1/variables
parent: Unit 1
grand_parent: Learn
nav_order: 4
---

# Unit 1: Variables
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## What are variables?
You've probably used variables in math class when dealing with algebra. Variables in programming are similar, but they're definitely not the same.

Think of variables in programming as a box with a label on it. You can put stuff in this box, and that stuff represents the value of the variable. You can change what you put in the box or you can look into the box and see what is already there.

Variables are useful because they can store different values and can be reused multiple times. They can also give meaning to otherwise meaningless values, thereby making programs easier to read.

So what "stuff" can you put into a variable? Let's talk about the different data types in Java.

## Primitive Data Types
The most basic types are called *primitives*. They're the building blocks for more sophisticated types of data called *objects*. Here are commonly used primitives:

| Primitive Type | In Java Syntax | Examples                           |
| :------------- | :------------- | :--------------------------------- |
| integer        | `int`          | `5`, `0`, `-23636`                 |
| long           | `long`         | `253252362646135`, `5346464623531` |
| double         | `double`       | `5.2`, `10.0`, `-36.236235`        |
| character      | `char`         | `'c'`, `'1'`, `'%'`                |
| boolean        | `boolean`      | `true`, `false`                    |

`int` and `long` are both types of integers, except that `long` is used for really big integers.

Note that `10.0` is considered a `double` since it has a decimal point.

Note that `char` types are enclosed within single quotes.

Note that a `boolean` can only have 2 values, `true` or `false`.

## Strings
Strings are a series of characters strung together. (Hence the name.) Strings are objects. You can remember this by noticing that the type `String` has a capital s. All objects are named in the same way as classes because (as we will learn later) objects are instances of classes.

Strings are enclosed within double quotes. For example, `"Hello world!"`, `"this is a string"`, `"12"`, `"   "`, and `"c"` are all strings.

### Concatenation
String *concatenation* is when you combine two or more strings. You do it like this:
```java
System.out.println("string 1" + "string 2");
```

Output:
```
string1string2
```

## Declaring, Initializing, and Updating Variables
Now that we know what can be stored in a variable, let's talk about how to make one.

To declare a variable in Java, you simply state the type and name of the variable.

```java
String name;
```

To initialize (give a first value) to the variable, use the assignment operator `=`.

```java
String name;
name = "Jane Doe";
```

Note that you can declare and initialize in one step:

```java
String name = "Jane Doe";
```

Now that we've declared and initialized a variable, we can do things with the variable, such as printing it.

```java
String name = "Jane Doe";
System.out.println(name);
```

Output:
```
Jane Doe
```

## Constants
Sometimes you will want to make a variable that stores only one value that never changes, such as a conversion rate. This is a special type of variable called a *constant*. In Java, you can declare a constant using the `final` keyword.

```java
final DAYS_PER_WEEK = 7;
```

The final keyword makes it so that if you attempt to update the value of the constant, it gives you an error.

## Naming
### The Rules

All identifiers <sup id="a1">[1](#f1)</sup> (names that identify elements, such as classes, methods, or variables) must:
- Be a sequence of characters that consists of letters, digits, underscores (_), and dollar signs ($).
- Start with a letter, an underscore (_), or a dollar sign ($). It cannot start with a digit. 

They cannot:
- Be a reserved word (e.g. `class`, `public`, `final`)
- Be `true`, `false`, or `null`

Note that identifiers are case sensitive, so `java`, `Java`, and `JAVA` are all different elements.

### The Conventions

Identifiers can also be as long as you want; however, you should try to make identifiers as concise as possible. 

Concise doesn't necessarily mean short. For example, don't name a variable `a` when it represents someone's age. Just use `age`. (Sometimes, however, it's ok to have variables that are just one letter long. Usually these are more generic or throwaway variables.)

Regular variables should be named in the camelCase convention, which means that each word in the name of the variable is capitalized except the first one. For example, `age`, `numberOfTissues`, and `backpackWeight` are all good variable names.

Constants should be named using snake case, with all uppercase letters. Snake case means that all words are separated by underscores. For example, `DAYS_PER_WEEK`, `PI`, and `FILE_NAME` are all good constant names.

## Footnotes
<b id="f1">1</b> Identifier rules from *Introduction to Java Programming (Comprehensive)*, 10th ed. by Y. Daniel Liang. [↩](#a1)