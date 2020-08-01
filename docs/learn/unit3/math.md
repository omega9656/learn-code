---
layout: default
title: Math
permalink: learn/unit3/math
parent: Unit 3
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 3: Math
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## What is the Math class?

The `Math` class is a built-in class in Java that allows you to
perform more advanced calculations. You do not need to import this class
(unlike `Scanner`, for example).

However, you will need to prepend all method calls with `Math.` (dot notation).
For example, to use the method `max(a, b)`, you would do `Math.max(a, b)`.
The same goes for accessing constants in the `Math` class.

## Math constants

| Constant (symbol)    | Syntax    | Value          |
| :------------------- | :-------- | :------------- |
| pi (π)               | `Math.PI` | `3.1415926...` |
| Euler's number (_e_) | `Math.E`  | `2.71828...`   |

## Math methods

Note that for brevity the `Math.` is omitted from the method name.

| Method           | Description                                          |
| :--------------- | :--------------------------------------------------- |
| `max(a, b)`      | Returns the maximum of a and b                       |
| `min(a, b)`      | Returns the minimum of a and b                       |
| `pow(a, b)`      | Returns a <sup>b</sup>                               |
| `exp(x)`         | Returns _e_ <sup>x</sup>                             |
| `log(x)`         | Returns _ln x_                                       |
| `log10(x)`       | Returns _log_ <sub>10</sub> _x_                      |
| `sqrt(x)`        | Returns √x                                           |
| `toRadians(deg)` | Returns the result of converting `deg` to radians    |
| `toDegrees(rad)` | Returns the result of converting `rad` to degrees    |
| `sin(x)`         | Returns _sin x_ (**Note that _x_ is in radians**)    |
| `cos(x)`         | Returns _cos x_ (**Note that _x_ is in radians**)    |
| `tan(x)`         | Returns _tan x_ (**Note that _x_ is in radians**)    |
| `asin(x)`        | Returns _arcsin x_ (**Note that _x_ is in radians**) |
| `acos(x)`        | Returns _arccos x_ (**Note that _x_ is in radians**) |
| `atan(x)`        | Returns _arctan x_ (**Note that _x_ is in radians**) |
| `abs(x)`         | Returns \|_x_ \|                                      |
| `floor(x)`       | Returns the [floor](https://www.mathsisfun.com/sets/function-floor-ceiling.html) of _x_ |
| `ceil(x)`        | Returns the [ceiling](https://www.mathsisfun.com/sets/function-floor-ceiling.html) of _x_ |
| `round(x)`       | Returns _x_ rounded to the nearest unit              |
