---
layout: default
title: Introduction to Java
permalink: learn/unit1/introduction-to-java
parent: Unit 1
grand_parent: Learn
nav_order: 1
---

# Unit 1: Introduction to Java

{: .no_toc }

## Table of Contents

{: .no_toc .text-delta }

1. TOC
   {:toc}

## What is programming?

Programming is basically the act of writing instructions for a computer. The good news is that a computer will do exactly what you tell it to do. The bad new is... a computer will do exactly what you tell it to do.

This means that to be a successful programmer, you will not only need to know the syntax (rules) of a programming language (such as Java), you will also need to be detail-oriented when using those rules.

## What is Java?

Java is an object-oriented programming language (OOP). That
categorization will make more sense when you learn more about
objects in [Unit 5](/learn-code/learn/unit5).

Java is also a compiled language, which means that once you write the source code it goes through a compiler before running in order to convert the code into bytecode, which machines can understand. This is nice because a lot of errors can be caught during compile, which prevents things from going wrong if you were to just run the code right away.

The reason why we're teaching it here is because most FTC
teams use Java to program their robots. Java is also a widely popular language for a variety of reasons we're not going to
get into here.

If you want to learn more about Java, here's its [Wikipedia article](<https://en.wikipedia.org/wiki/Java_(programming_language)>).

## Your First Java Program

It's time to fire up your IDE or editor and start coding!

To preface this exercise, we will explain everything later.
For now, just type what you see exactly as you see it. (We
also recommend _not_ copying and pasting example code because
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
to learn more about classes in [Unit 5](/learn-code/learn/unit5).
For now, all you need to know is that all Java files
contain a _public class_ and the name of that class must match
the file name _exactly_. (Notice that you created a file
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

-   All Java statements end with a semicolon (for example, `System.out.println("Hello world!");`)
-   For the most part, whitespace (stuff without characters in it like spaces, empty lines, tabs, etc.) doesn't matter in Java. However, you should indent properly (more on that later). For example, this:

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

It's just _a lot_ harder to read and is considered bad style. So make sure you leave whitespace appropriately and indent!

-   Speaking of hard to read, try to keep your lines of code within your frame of view (80 characters or less per line)

**Note: From now on, in some code snippets, we will omit the class and main method declarations for brevity. Just know that in order for the program to actually work in real life, you'll need both of these things.**
