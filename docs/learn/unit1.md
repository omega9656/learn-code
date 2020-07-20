---
layout: unit
title: Unit 1
permalink: learn/unit1
parent: Learn
nav_order: 2
---

# Unit 1: Introduction to Java
{: .no_toc }

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Introduction to Java
### What is programming?
Programming is basically the act of writing instructions for a computer. The good news is that a computer will do exactly what you tell it to do. The bad new is... a computer will do exactly what you tell it to do.

This means that to be a successful programmer, you will not only need to know the syntax (rules) of a programming language (such as Java), you will also need to be detail-oriented when using those rules.

### What is Java?
Java is an object-oriented programming language (OOP). That 
categorization will make more sense when you learn more about 
objects in [Unit 5](/learn-code/learn/unit5).

Java is also a compiled language, which means that once you write the source code it goes through a compiler before running in order to convert the code into bytecode, which machines can understand. This is nice because a lot of errors can be caught during compile, which prevents things from going wrong if you were to just run the code right away.

The reason why we're teaching it here is because most FTC 
teams use Java to program their robots. Java is also a widely popular language for a variety of reasons we're not going to 
get into here. 

If you want to learn more about Java, here's its [Wikipedia article](https://en.wikipedia.org/wiki/Java_(programming_language)).

### Your First Java Program
It's time to fire up your IDE or editor and start coding!

To preface this exercise, we will explain everything later. 
For now, just type what you see exactly as you see it. (We 
also recommend *not* copying and pasting example code because 
that kinda defeats the point of learning how to code.)

1. Open your IDE or editor. From now on, we'll assume that you're using IntelliJ, but other IDEs and editors probably use similar user interfaces. (You may need to create a new project or working directory (folder)).
2. Create a new file by going to File > New > Java class
3. Name it `HelloWorld.java`
4. Type the following code into the file:
```java
public class HelloWorld {
    public static void main(String[] args) {
        // Prints Hello world! to the console
        System.out.println("Hello world!");
    }
}
```
5. Press the green play button next to `public class HelloWorld`. This should run your program and you should see this output:
```
Hello world!
```

Wow, you've just written your first few lines of Java code!
Let's break down what happened.

```java
public class HelloWorld {
    ...
}
```

First, you declared a class called `HelloWorld`. We're going 
to learn more about classes in [Unit 5](/learn-code/learn/unit5). For now, all you need to know is that all Java files 
contain a *public class* and the name of that class must match 
the file name *exactly*. (Notice that you created a file 
called `HelloWorld.java`.)

Also, everything inside of the class is contained within the 
curly braces. We'll use curly braces to denote the start and 
end of a lot of things in Java.

Another thing to note is that class names are named in a 
special way such that each word in the class name is 
capitalized and there are no spaces between each word.

```java
public class HelloWorld {
    public static void main(String[] args) {
        ...
    }
}
```

Inside of the `HelloWorld` class is the `main` method. Everything inside of the `main` method executes when you run your program.

You might be wondering what is the `public static void` or `String[] args` stuff is. We'll get to that later, for now whenever you write a program, make sure you have a main method header that looks exactly like the one you just wrote.

```java
public class HelloWorld {
    public static void main(String[] args) {
        // Prints Hello world! to the console
        System.out.println("Hello world!");
    }
}
```

As you may have noticed, the rest of the code is what actually does the magic of printing "Hello world!" to the console. We'll talk more about what specifically those remaining 2 lines means in the next section.

Before we get to that, I want to point out some things about Java:

- All Java statements end with a semicolon (for example, `System.out.println("Hello world!");`)
- For the most part, whitespace (stuff without characters in it like spaces, empty lines, tabs, etc.) doesn't matter in Java. However, you should indent properly (more on that later). For example, this:
```java
public class HelloWorld {
    public static void main(String[] args) {
        // Prints Hello world! to the console
        System.out.println("Hello world!");
    }
}
```
is the same as this:
```java
public class HelloWorld { public static void main(String[] args) {
// Prints Hello world! to the console
System.out.println("Hello world!");}}
```
It's just *a lot* harder to read and is considered bad style. So make sure you leave whitespace appropriately and indent!
- Speaking of hard to read, try to keep your lines of code within your frame of view (80 characters or less per line)

**Note: From now on, in some code snippets, we will omit the class and main method declarations for brevity. Just know that in order for the program to actually work in real life, you'll need both of these things.**

## Comments
**What are comments?**

Comments are essentially notes that a programmer leaves in their source code. Comments are an important part of any good program because it makes the program more *readable*.

Comments are completely ignored by the computer when your 
program runs, so you can write whatever you want in them.
Obviously, don't use comments to write *anything*. Your 
comments should do things like describe what your program 
does. Some coders also use comments to write *pseudocode*, 
which is a technique coders use to plan out their programs.

When learning, you should make it a habit to add comments to all of your programs. It's good programming style!

**Writing Comments**

There are 3 types of comments in Java: Single line 
comments, multi-line comments, and JavaDoc comments. We'll 
get to JavaDocs later in [Unit 4](/learn-code/learn/unit4).

```java
// This is a single line comment

/*
This is
a multi-line
comment.
*/

/**
 * This is a JavaDoc comment.
 * It can be multiple lines and is used
 * to describe structures in Java like
 * classes or methods, which we'll learn later.
 */
```

Notice that a single line comment starts with `//` and can only be on one line. 

Also note that a multi-line comment begins with `/*` and ends with `*/`, and it can span multiple lines.

You should write comments above code that the comment refers to, or on the side. For example:

```java
// Prints Hello world! to the console
System.out.println("Hello world!");
```

or

```java
System.out.println("Hello world!"); // Prints Hello world!
```

## Output
You can use the `System.out.println` method to print something to the console.

```java
// Prints Hello world! to the console
System.out.println("Hello world!");
```

Output:
```
Hello world!
```

The `System.out.println` method automatically adds a newline character (`\n`) to the end of whatever it prints. Basically that means that whatever you put in parentheses is printed on its own line. 

On the other hand, if you want things to be printed right next to each other, use `System.out.print`.

```java
System.out.println("This starts a new line");
System.out.print("This does");
System.out.print(" not");
```

Output:
```
This starts a new line
This does not
```

Another way to print things is using the `System.out.printf` method, which allows you to format output. We'll cover this in more detail in [Variables](#variables).

## Variables
You've probably used variables in math class when dealing with algebra. Variables in programming are similar, but they're definitely not the same.

Think of variables in programming as a box with a label on it. You can put stuff in this box, and that stuff represents the value of the variable. You can change what you put in the box or you can look into the box and see what is already there.

Variables are useful because they can store different values and can be reused multiple times. They can also give meaning to otherwise meaningless values, thereby making programs easier to read.

So what "stuff" can you put into a variable? Let's talk about the different data types in Java.

### Primitive Data Types
The most basic types are called *primitives*. They're the building blocks for more sophisticated types of data called *objects*. Here are commonly used primitives:

| Primitive Type | In Java Syntax | Examples |
| :------------- | :------------- | :------- |
| integer        | `int`          | `5`, `0`, `-23636` |
| long           | `long`         | `253252362646135`, `5346464623531` |
| double         | `double`       | `5.2`, `10.0`, `-36.236235` |
| character      | `char`         | `'c'`, `'1'`, `'%'` |
| boolean        | `boolean`      | `true`, `false` |

`int` and `long` are both types of integers, except that `long` is used for really big integers.

Note that `10.0` is considered a `double` since it has a decimal point.

Note that `char` types are enclosed within single quotes.

Note that a `boolean` can only have 2 values, `true` or `false`.

### Strings
Strings are a series of characters strung together. (Hence the name.) Strings are objects. You can remember this by noticing that the type `String` has a capital s. All objects are named in the same way as classes because (as we will learn later) objects are instances of classes.

Strings are enclosed within double quotes. For example, `"Hello world!"`, `"this is a string"`, `"12"`, `"   "`, and `"c"` are all strings.

TODO *concatenation*

### Declaring, Initializing, and Updating Variables
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

### Constants
Sometimes you will want to make a variable that stores only one value that never changes, such as a conversion rate. This is a special type of variable called a *constant*. In Java, you can declare a constant using the `final` keyword.

```java
final DAYS_PER_WEEK = 7;
```

The final keyword makes it so that if you attempt to update the value of the constant, it gives you an error.

### Naming
**The Rules**

All identifiers <sup id="a1">[1](#f1)</sup> (names that identify elements, such as classes, methods, or variables) must:
- Be a sequence of characters that consists of letters, digits, underscores (_), and dollar signs ($).
- Start with a letter, an underscore (_), or a dollar sign ($). It cannot start with a digit. 

They cannot:
- Be a reserved word (e.g. `class`, `public`, `final`)
- Be `true`, `false`, or `null`

Note that identifiers are case sensitive, so `java`, `Java`, and `JAVA` are all different elements.

**The Conventions**

Identifiers can also be as long as you want; however, you should try to make identifiers as concise as possible. 

Concise doesn't necessarily mean short. For example, don't name a variable `a` when it represents someone's age. Just use `age`. (Sometimes, however, it's ok to have variables that are just one letter long. Usually these are more generic or throwaway variables.)

Regular variables should be named in the camelCase convention, which means that each word in the name of the variable is capitalized except the first one. For example, `age`, `numberOfTissues`, and `backpackWeight` are all good variable names.

Constants should be named using snake case, with all uppercase letters. Snake case means that all words are separated by underscores. For example, `DAYS_PER_WEEK`, `PI`, and `FILE_NAME` are all good constant names.

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
*Note that you can concatenate other types with strings.*

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
**Addition, Subtraction, Multiplication, & Division**

Addition, subtraction, and multiplication are pretty straightforward. However, there are 2 types of division in Java: *integer division* and *floating point division*. Integer division happens whenever you divide 2 integers. This results in an integer since any decimals get truncated. Floating point division happens if you divide at least 1 floating point number, such as a `double`. (There are 2 floating point numeric types in Java, `double` and `float`. The former is more widely used.)

**Modulus**
You probably don't recognize the `%` operator if you've never programmed before. This is the *modulus* operator, which gives you the remainder of a division. In the example, `10 % 3` equals `1` because 10 divided by 3 is 3 remainder 1.

Modulus is useful when you need to check if a number is divisible by another number (since the remainder would be 0) and for certain unit conversions.

**Formatting**
`System.out.printf`


## Augmented Assignment Operators

## Increment and Decrement

## Footnotes
<b id="f1">1</b> Identifier rules from *Introduction to Java Programming (Comprehensive)*, 10th ed. by Y. Daniel Liang. [↩](#a1) 

## Practice

## Quiz
