---
layout: default
title: Input
permalink: learn/unit1/input
parent: Unit 1
grand_parent: Learn
nav_order: 5
---

<!-- prettier-ignore-start -->
# Unit 1: Input
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}
<!-- prettier-ignore-end -->

## Scanner

Now that we've talked about how to display output to the user, let's talk about how to get input from the user. To do this, you will need to import the `Scanner` class.

```java
import java.util.Scanner;
```

Once you have imported the `Scanner` class, you can use Scanner _methods_. We'll talk about methods [later](/learn-code/learn/unit4). For now, just think of _methods_ as things you can use to accomplish a task. No need to worry about how it actually works.

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

Then you should display a _prompt_ to the user which tells the user what input you want from them. (For example, `System.out.print("Enter the price of an apple: ")`.) You should make this as specific as possible. Also, don't forget to add a space after the prompt so that the cursor isn't awkwardly next to the prompt.

Finally, you will need to get the input and store that value in a variable. You will need to assign a variable to the result of calling a method on the `Scanner` object you created. For example, `double price = input.nextDouble();`. Notice that the variable type should match the method that was called (`nextDouble()`). Also notice that to call the method, you need to use _dot notation_. That is, you need to use the variable that represents the `Scanner` object (in this case, we named it `input`), then a dot (.), and then the method.

## Scanner Methods

Here are commonly used `Scanner` methods you should know:

| Method         | Return Type | Example Usage         |
| :------------- | :---------- | :-------------------- |
| `nextInt()`    | `int`       | `input.nextInt();`    |
| `nextDouble()` | `double`    | `input.nextDouble();` |
| `nextLine()`   | `String`    | `input.nextLine();`   |

Note that there is no `nextChar()` method.
