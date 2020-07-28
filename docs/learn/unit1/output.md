---
layout: default
title: Output
permalink: learn/unit1/output
parent: Unit 1
grand_parent: Learn
nav_order: 3
---

# Unit 1: Output
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Printing
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

Another way to print things is using the `System.out.printf` method, which allows you to format output. We'll cover this in more detail in [Variables](/learn-code/learn/unit1/variables/).