---
layout: default
title: Increment and Decrement
permalink: learn/unit1/increment-and-decrement
parent: Unit 1
grand_parent: Learn
nav_order: 8
---

<!-- prettier-ignore-start -->

# Unit 1: Increment and Decrement

{: .no_toc }

## Table of Contents

{: .no_toc .text-delta }

1. TOC {:toc}
 <!-- prettier-ignore-end -->

## Increment and Decrement

Other operations that come up often in computer science is increment and
decrement (adding 1 and subtracting 1).

Increment operator: `++`

Decrement operator: `--`

Note that the increment and decrement operators are _unary operators_, which
mean they operate on 1 thing (arithmetic, assignment, and augmented assignment
operators are all _binary operators_).

There are 2 types of increment and decrement: post and pre. These determine when
the variable is incremented or decremented. Analyze the code below.

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

Note that pre-increment and pre-decrement puts the `++` or `--` _before_ the
variable name, while post-increment and post-decrement puts the `++` or `--`
_after_ the variable name.

**Note**: If you are simply incrementing or decrementing a variable and not
doing anything else, post- and pre-increment or decrement won't matter. You only
need to be careful when you're mixing a bunch of operators.
