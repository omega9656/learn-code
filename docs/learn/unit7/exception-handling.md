---
layout: default
title: Exception Handling
permalink: learn/unit7/exception-handling
parent: Unit 7
grand_parent: Learn
nav_order: 1
---

<!-- prettier-ignore-start -->

# Unit 7: Exception Handling
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Exception Handling

Throughout your programming journey, you have probably encountered something
like this (probably in glaring red text) when you ran your program:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at com.omegarobotics.unit7.lessons.exceptions.Exception.main(Exception.java:6)
```

Messages like this are displayed whenever your program has some sort of error.
To be more specific, this happens when your program _throws_ an _exception_
(notice that it said `Exception in thread "main"`).

### Exception Messages

If you were a diligent programmer, you would have noticed that exception
messages are pretty detailed. They tell you what type of exception was thrown
(in this case, `java.lang.ArrayIndexOutOfBoundsException`), in what file the
exception occurred
(`com/omegarobotics/unit7/lessons/exceptions/TestException.java`) and at what
line the exception occurred (line 6 since it said `TestException.java:7`).

### Exception Classes

What you might _not_ have known is that exceptions are actually classes, and
that you can customize how those exceptions are handled in the event that they
are thrown.

**Note**: All exception classes extend the `Exception` class and share common
methods, which we will learn later.

**Note**: You can actually write your own exception classes if you want!

## Try-Catch

When an exception is thrown, by default the program will terminate and the
message will be printed to the console. However, as a programmer, you can
_catch_ a thrown exception and decide what happens after that.

To do this, you need to use a try-catch block. They look generally like this:

```java
try {
    // write some code that could throw an exception
} catch (ExceptionClassName ex) {
    // handle the exception somehow
}
```

A programmer would put code inside the `try` block if they think an exception
could be thrown when executing that code. If indeed an exception is thrown
during the `try` block, the rest of the `try` block is skipped. Instead, code
inside the first `catch` block with the corresponding exception class will run.

Note that the variable `ex` can be called whatever you want it to be (of course,
follow Java identifier naming rules). This variable is what you will use to
refer to the exception object (for example, if you want to call a method from
the exception class).

**Note**: You can have multiple `catch` blocks which are tested one after
another when an exception is thrown. For example:

```java
try {
    // write some code that could throw an exception
} catch (ExceptionClassName1 ex) {
    // handle the exception somehow
} catch (ExceptionClassName2 ex) {
    // handle the exception somehow
} catch (ExceptionClassName3 ex) {
    // handle the exception somehow
}
```

Similar to an if-else statement, once code in a `catch` block is executed, the
rest of the `catch` blocks are skipped.

Let's see a try-catch block in action. Analyze the code and output below.

```java
import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        try {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (ArithmeticException ex) {
            System.out.println("Error, division by zero");
        }
    }
}
```

**Example Output 1**

```
Enter two integers: 5 0
Error, division by zero
```

**Example Output 2**

```
Enter two integers: 24 6
24 / 6 = 4
```

The program above prompts the user for 2 integers and divides them. Notice that
if the divisor is 0, there will be a division by 0, which as we know is
undefined. Without a try-catch, a division by 0 would result in an
`ArithmeticException`.

Using the try-catch block, we can catch the `ArithmeticException` that is thrown
and avoid the messy error message that wouldn't be readable to a non-programmer.
Instead, we can print a user friendly message: `"Error, division by zero"`.

### Exception Methods

As mentioned previously, since all exception classes extend `Exception`, they
have common methods. One of those methods is `printStackTrace()`, which allows
you to print the regular error message that would be printed if you hadn't
caught the exception.

For example, let's modify the code from the `Quotient` class so that it calls
the `printStackTrace()` method instead of printing a short error message.

```java
import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        try {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}
```

**Example Output**

```
Enter two integers: 5 0
java.lang.ArithmeticException: / by zero
        at com.omegarobotics.unit7.lessons.exceptions.Quotient.main(Quotient.java:25)
```

**Note**: Remember that calling an exception method isn't the only thing you can
do in the `catch` block. If you wanted to, you could add statements before or
after method calls. That's why try-catch blocks are cool - they give you the
flexibility to handle exceptions rather than being stuck with an error message
every time.

### Finally

There's an additional clause you can add to a try-catch block called `finally`.
This code runs at the end of a try-catch block no matter what happens in
between. It generally looks like this:

```java
try {
    // write some code that could throw an exception
} catch (ExceptionClassName ex) {
    // handle the exception somehow
} finally {
    // code in this block is executed at the end
    // no matter what happens
}
```

We can rewrite the `Quotient` class to include a thank you message to the user
at the end of the program using the `finally` block.

```java
import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        try {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } catch (ArithmeticException ex) {
            System.out.println("Error, division by zero");
        } finally {
            System.out.println("Thanks for using the program");
        }
    }
}
```

**Example Output 1**

```
Enter two integers: 5 0
Error, division by zero
Thanks for using the program
```

**Example Output 2**

```
Enter two integers: 24 6
24 / 6 = 4
Thanks for using the program
```

Notice that `"Thanks for using the program"` is _always_ printed, even if an
exception is not caught.

## Throwing Exceptions

Now that you know how to catch exceptions, what about throwing them? It turns
out you can do that in Java too!

### Throw

You can throw an exception in Java by using the `throw` keyword.

For example, let's write a `setRadius` method for a class called `Circle`. We
want our `setRadius` method to only accept radii which are greater than or equal
to 0. Otherwise, we want to tell the user that the argument provided is
illegal - perfect for the `IllegalArgumentException`.

Some methods are omitted for brevity.

```java
public class Circle {
    private double radius;

    ...

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    ...
}
```

```java
public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.setRadius(-5);
    }
}
```

**Example Output**

```
Exception in thread "main" java.lang.IllegalArgumentException: Radius cannot be negative
        at com.omegarobotics.unit7.lessons.exceptions.Circle.setRadius(ThrowingExceptions.java:68)
        at com.omegarobotics.unit7.lessons.exceptions.TestCircle.main(TestCircle.java:4)
```

**Note**: Line numbers may be different for you.

Notice that when we threw the exception, we had to use the `new` operator and
the exception class's constructor. This is because you technically need to make
an instance of the exception class and _then_ throw it.

Thus, these are equivalent:

```java
throw new IllegalArgumentException("Radius cannot be negative");
```

```java
IllegalArgumentException ex = new IllegalArgumentException("Radius cannot be negative");
throw ex;
```

Also notice that the exception class's constructor took 1 argument, the error
message. All exception classes have this constructor. They also have a default
constructor which doesn't take any arguments. For example:

```java
throw new IllegalArgumentException();
```

### Throws

If you want to declare that your method throws an exception, you can use the
`throws` keyword in the method signature. Note that you only need to do this for
_checked exceptions_. To learn more about checked and unchecked exceptions, you
can read
[this article](https://www.baeldung.com/java-checked-unchecked-exceptions).

A method signature with the `throws` keyword generally looks like this:

```java
modifier(s) returnType methodName(ParameterType parameterName, ...) throws ExceptionName
```

For example:

```java
public void setRadius(double radius) throws IllegalArgumentException
```

**Note**: In the case of the `setRadius` method, you actually _do not_ need to
declare that it throws the `IllegalArgumentException` because that is an
_unchecked exception_.

### @throws

Recall that there is an `@throws` annotation for JavaDoc comments that allow you
to document the fact that your method throws an exception.

For example:

```java
/**
 * Sets a new radius
 * @param radius  new radius
 * @throws IllegalArgumentException if the new radius is negative
 */
public void setRadius(double radius) throws IllegalArgumentException {
    if (radius >= 0) {
        this.radius = radius;
    } else {
        throw new IllegalArgumentException("Radius cannot be negative");
    }
}
```
