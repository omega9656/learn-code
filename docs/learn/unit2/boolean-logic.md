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

Boolean logic, named after mathematician
[George Boole](https://en.wikipedia.org/wiki/George_Boole), is how we form
conditional statements in programming. This is important because sometimes we
only want certain code to run if certain conditions are met.

## Logical Operators

Boolean logic in programming revolves around three key components: AND, OR, and
NOT. These operators can compare multiple booleans together to see if a
statement is true or false. In Java, these operators use different symbols.

### AND

The AND operator in Java is `&&`, and separates two booleans. It checks to see
if the two boolean statements are both true. If they are both true, then the
complete boolean statement would be true.

```java
boolean isRaining = true;
boolean isCloudy = true;

System.out.println(isRaining && isCloudy); // prints true
```

However, if one or both of the booleans are false, then the whole boolean
statement would be false.

```java
boolean isRaining = true;
boolean isCloudy = false;

System.out.println(isRaining && isCloudy); // prints false
```

**Truth Table**

| `var1`  | `var2`  | `var1 && var2` |
| :------ | :------ | :------------- |
| `true`  | `true`  | `true`         |
| `true`  | `false` | `false`        |
| `false` | `true`  | `false`        |
| `false` | `false` | `false`        |

**Note**: The logical AND (`&&`) is different from the bitwise AND (`&`)!

### OR

The OR operator in Java is `||`, and checks to see if at least one of the
booleans statements is true. If both are true, then the complete boolean
statement would be true.

```java
boolean isRaining = true;
boolean isCloudy = false;

System.out.println(isRaining || isCloudy); // prints true
```

Only if both statements were false, then the complete boolean statement would
return false.

```java
boolean isRaining = false;
boolean isCloudy = false;

System.out.println(isRaining || isCloudy); // prints false
```

**Truth Table**

| `var1`  | `var2`  | `var1 || var2` |
| :------ | :------ | :------------- |
| `true`  | `true`  | `true`         |
| `true`  | `false` | `true`         |
| `false` | `true`  | `true`         |
| `false` | `false` | `false`        |

**Note**: The logical OR (`||`) is different from the bitwise OR (`|`)!

### NOT

The NOT operator in Java is `!`, and is a little bit different from the AND and
OR operators. Instead of comparing two different boolean statements, the NOT
operator simply gives the opposite of a boolean statement. In this example, if
the NOT operator is used, the print statement would print true.

```java
boolean isRaining = false;

System.out.println(!isRaining); // prints true
```

**Truth Table**

| `var`   | `!var`  |
| :------ | :------ |
| `true`  | `false` |
| `false` | `true`  |

Note that you can combine operators however you wish. Just make sure that you
use parentheses to make it clear in what order you want the boolean expressions
to be evaluated!

### XOR

There is another logical operator called XOR (exclusive OR), which is `^`. It is
not commonly used, but it's nice to know for reference. The result of an XOR is
`true` only if _exactly one_ value is `true`.

**Truth Table**

| `var1`  | `var2`  | `var1 ^ var2` |
| :------ | :------ | :------------ |
| `true`  | `true`  | `false`       |
| `true`  | `false` | `true`        |
| `false` | `true`  | `true`        |
| `false` | `false` | `false`       |

## Relational Operators

As their name suggests, relational operators deal with the relationships between
two values.

| Relational Operator | In words                 | Example             |
| :------------------ | :----------------------- | :------------------ |
| `>`                 | greater than             | `5 > 3` is `true`   |
| `<`                 | less than                | `5 < 3` is `false`  |
| `>=`                | greater than or equal to | `5 >= 5` is `true`  |
| `<=`                | less than or equal to    | `3 <= 2` is `false` |
| `==`                | equal to                 | `5 == 5` is `true`  |
| `!=`                | not equal to             | `5 != 5` is `false` |

The greater `>`, `<`, `>=`, and `<=` operators are used with numbers. `==` and
`!=` can be used with numbers or other values. Note that the equality and
inequality operators can be tricky because technically they check if two values
are located in the same place in memory. We will later learn that even if the
value of a variable is identical to another, it may not be "equal" using the
equality operator.
