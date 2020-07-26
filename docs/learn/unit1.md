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

**Concatenation**
String *concatenation* is when you combine two or more strings. You do it like this:
```java
System.out.println("string 1" + "string 2");
```

Output:
```
string1string2
```

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

## Input
Now that we've talked about how to display output to the user, let's talk about how to get input from the user. To do this, you will need to import the `Scanner` class.
```java
import java.util.Scanner;
```

Once you have imported the `Scanner` class, you can use Scanner *methods*. We'll talk about methods [later](/learn-code/learn/unit4). For now, just think of *methods* as things you can use to accomplish a task. No need to worry about how it actually works.

For example, if I wanted to get the price of an apple from the user, I could do this:
```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of an apple: ");
        double price = input.nextDouble();
    }
}
```

Let's break down this code. First, we imported the `Scanner` class using `import java.util.Scanner;`. Then we constructed a `Scanner` object using `Scanner input = new Scanner(System.in);`. Again, you don't really need to know what objects are yet. Just know that whenever you want to get user input, you'll need to do this. (Also note that `input` is simply the name that references the `Scanner` object, so you can name it whatever you want as long as you follow the identifier naming rules.)

Then you should display a *prompt* to the user which tells the user what input you want from them. (For example, `System.out.print("Enter the price of an apple: ")`.) You should make this as specific as possible. Also, don't forget to add a space after the prompt so that the cursor isn't awkwardly next to the prompt.

Finally, you will need to get the input and store that value in a variable. You will need to assign a variable to the result of calling a method on the `Scanner` object you created. For example, `double price = input.nextDouble();`. Notice that the variable type should match the method that was called (`nextDouble()`). Also notice that to call the method, you need to use *dot notation*. That is, you need to use the variable that represents the `Scanner` object (in this case, we named it `input`), then a dot (.), and then the method.

Here are commonly used `Scanner` methods you should know:

| Method         | Return Type | Example Usage         |
| :------------- | :---------- | :-------------------- |
| `nextInt()`    | `int`       | `input.nextInt();`    |
| `nextDouble()` | `double`    | `input.nextDouble();` |
| `nextLine()`   | `String`    | `input.nextLine();`   |

Note that there is no `nextChar()` method.

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
*Note that you can concatenate some other types with strings.*

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

You can use string formatting to format output in a nice way. A common way to do this is using `System.out.printf` (you can think of this as **print** **f**ormat).

In string formatting, we use special symbols as placeholders for certain data types.

| Symbol | Data Type |
| :----- | :-------- |
| `%s`   | `String`  |
| `%d`   | `int`, `long` |
| `%f`   | `double`, `float` |

For example:
```java
double price = 5.36;
System.out.printf("The price is $%f", price);
```

Output:
```
The price is $5.36
```

Notice that `%f` is replaced by the value of `price`.

**Note**: `System.out.printf` does not automatically add a newline character (`\n`) to the end, so you may want to do that depending on how you want your output to look.

**Note**: You can basically have an infinite number of placeholders, in which case you need to separate each value by a comma. Also make sure that you put each value in the order that it appears in the string. For example:
```java
int a = 5;
int b = 10;
System.out.printf("a is %d while b is %d", a, b);
```

Output:
```
a is 5 while b is 10
```

**Note**: If you want to display a certain amount of decimals for a floating point number, you can do something like this:
```java
final double PI = 3.1415926;
System.out.printf("Pi is approximately %.2f", PI);
```

Output:
```
Pi is approximately 3.14
```

Notice that to display up to 2 decimals of precision, we prepended `.2` to `f`. If I wanted to do 4 decimals of precision, I would write `%.4f`.

If you want to learn more about string formatting in Java, see [this article](https://dzone.com/articles/java-string-format-examples).

## Augmented Assignment Operators
A lot of times in programming you'll need to update a value relative to itself. For instance, when you're playing a video game and you collect a coin, your score might go up by 5 points relative to what it was before.

In Java, that would look like this (assume a variable `score` has already been delcared and initialized):
```java
score = score + 5;
```

Augmented assignment operators allow us to do that with less typing:
```java
score += 5;
```

There are augmented assignment operators for each of the arithmetic operators. In the table below, assume `var` is a variable that has been declared and initialized.

| Augmented Assignment Operator | Normal          | Augmented Assignment |
| :---------------------------- | :-------------- | :------------------- |
| `+=`                          | `var = var + 5` | `var += 5`           |
| `-=`                          | `var = var - 5` | `var -= 5`           |
| `*=`                          | `var = var * 5` | `var *= 5`           |
| `/=`                          | `var = var / 5` | `var /= 5`           |
| `%=`                          | `var = var % 5` | `var %= 5`           |

## Increment and Decrement
Other operations that come up often in computer science is increment and decrement (adding 1 and subtracting 1).

Increment operator: `++`

Decrement operator: `--`

Note that the increment and decrement operators are *unary operators*, which mean they operate on 1 thing (arithmetic, assignment, and augmented assignment operators are all *binary operators*).

There are 2 types of increment and decrement: post and pre. These determine when the variable is incremented or decremented. Analyze the code below.

```java
int i = 1;
int j;

// pre-increment
j = ++i; // increment i, then assign that to j
System.out.println("j: " + j + ", i: " + i);

// post-increment
i = 1; // reset
j = i++; // assign i to j, then increment i
System.out.println("j: " + j + ", i: " + i);

// pre-decrement
i = 1; // reset
j = --i; // decrement i, then assign that to j
System.out.println("j: " + j + ", i: " + i);

// post-decrement
i = 1; // reset
j = i--; // assign i to j, then decrement i
System.out.println("j: " + j + ", i: " + i);
```

Output:
```
j: 2, i: 2
j: 1, i: 2
j: 0, i: 0
j: 1, i: 0
```

Note that pre-increment and pre-decrement puts the `++` or `--` *before* the variable name, while post-increment and post-decrement puts the `++` or `--` *after* the variable name.

**Note**: If you are simply incrementing or decrementing a variable and not doing anything else, post- and pre-increment or decrement won't matter. You only need to be careful when you're mixing a bunch of operators.

## Footnotes
<b id="f1">1</b> Identifier rules from *Introduction to Java Programming (Comprehensive)*, 10th ed. by Y. Daniel Liang. [↩](#a1) 

## Practice

### Circle Area

### Compute Average

### Compute Change

### Convert Minutes

## Challenges

### Population

## Quiz
