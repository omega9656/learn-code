---
layout: default
title: Augmented Assignment Operators
permalink: learn/unit1/augmented-assignment-operators
parent: Unit 1
grand_parent: Learn
nav_order: 7
---

<!-- prettier-ignore-start -->

# Unit 1: Augmented Assignment Operators

{: .no_toc }

## Table of Contents

{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Augmented Assignment Operators

A lot of times in programming you'll need to update a value relative to itself.
For instance, when you're playing a video game and you collect a coin, your
score might go up by 5 points relative to what it was before.

In Java, that would look like this (assume a variable `score` has already been
delcared and initialized):

```java
score = score + 5;
```

Augmented assignment operators allow us to do that with less typing:

```java
score += 5;
```

There are augmented assignment operators for each of the arithmetic operators.
In the table below, assume `var` is a variable that has been declared and
initialized.

| Augmented Assignment Operator | Normal          | Augmented Assignment |
| :---------------------------- | :-------------- | :------------------- |
| `+=`                          | `var = var + 5` | `var += 5`           |
| `-=`                          | `var = var - 5` | `var -= 5`           |
| `*=`                          | `var = var * 5` | `var *= 5`           |
| `/=`                          | `var = var / 5` | `var /= 5`           |
| `%=`                          | `var = var % 5` | `var %= 5`           |
