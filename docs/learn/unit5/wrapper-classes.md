---
layout: default
title: Wrapper Classes
permalink: learn/unit5/wrapper-classes
parent: Unit 5
grand_parent: Learn
nav_order: 5
---

<!-- prettier-ignore-start -->

# Unit 5: Wrapper Classes
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Wrapper Classes

Now that you've learned about classes, you must feel a bit less excited about
primitive types. After all, primitives don't have cool methods or fields that
you can use. However, a way you can get around that is by using Java's built-in
_wrapper classes_.

Basically, these wrapper classes function as primitives, but have the
capabilities of classes such as methods that can help you manipulate the
primitive type. There is a wrapper class for every primitive type, and the name
of the wrapper class is simply the full name of the primitive. For example, the
wrapper class for `int` is `Integer`.

## Uses

### Methods and Fields

As mentioned previously, wrapper classes have useful fields. For instance, you
can access the maximum and minimum value of different numeric types through
wrapper classes (for example, `Integer.MIN_VALUE` or `Double.MAX_VALUE`).
Programmers often use these for sorting.

There are also handy methods that belong to wrapper classes, such as parsing
methods (basically conversion between one type to another). For example,
`Double.parseDouble("100")` would return `100.0`.

### Generics

If you go on to learn more advanced Java data structures such as `ArrayList`s,
wrapper classes will come in handy because `ArrayList`s can only be made up of
objects (while regular arrays can be made up of objects _or_ primitives).

## Auto-boxing and -unboxing

Another neat feature of wrapper classes (for numeric types specifically) is
auto-boxing and -unboxing. Basically what this means is that Java will
automatically convert from a primitive to the wrapper class and vice versa when
needed.

```java
// auto-boxing (int to Integer)
Integer intObject = 2;
// equivalent to:
// Integer intObject = new Integer(2);

// auto-unboxing (Integer to int)
int x = intObject;
```
