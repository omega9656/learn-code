---
layout: default
title: Comments
permalink: learn/unit1/comments
parent: Unit 1
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 1: Comments
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## What are comments?

Comments are essentially notes that a programmer leaves in their source code.
Comments are an important part of any good program because it makes the program
more _readable_.

Comments are completely ignored by the computer when your program runs, so you
can write whatever you want in them. Obviously, don't use comments to write
_anything_. Your comments should do things like describe what your program does.
Some coders also use comments to write _pseudocode_, which is a technique coders
use to plan out their programs.

When learning, you should make it a habit to add comments to all of your
programs. It's good programming style!

## Writing Comments

There are 3 types of comments in Java: Single line comments, multi-line
comments, and JavaDoc comments. We'll get to JavaDocs later in
[Unit 4](/learn-code/learn/unit4).

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

Also note that a multi-line comment begins with `/*` and ends with `*/`, and it
can span multiple lines.

You should write comments above code that the comment refers to, or on the side.
For example:

```java
// Prints Hello world! to the console
System.out.println("Hello world!");
```

or

```java
System.out.println("Hello world!"); // Prints Hello world!
```
