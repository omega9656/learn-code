---
layout: default
title: Interfaces
permalink: learn/unit6/interfaces
parent: Unit 6
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 6: Interfaces
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Interfaces

Want to get even more generalized? Let's talk about _interfaces_. You can think
of interfaces as another level of abstraction when it comes to classes. By convention,
interface names can be nouns or adjectives, such as `Animal` or `Edible`.

To declare an interface, simply use the `interface` keyword. In general, it looks like this:

```java
modifier(s) interface InterfaceName {
    // interface body
}
```

### Interface Inheritance

A class or abstract class can inherit from an interface. This is called _interface inheritance_.
Interface inheritance (we'll just call it inheritance from now on) represents an _is-kind-of relationship_.
It's weaker than regular inheritance. For example, we might have an interface called
`Edible`, which is implemented by `Fruit`. `Apple` extends `Fruit`. An `Apple` is `Edible`, but
it is more closely related to `Fruit`.

Interface inheritance also allows us to relate classes that otherwise might be unrelated.
For example, we might have a `Plant` class which is extended by `Basil`. `Basil` could
implement `Edible`, even though it's clearly unrelated to `Fruit`.

```
            Edible
            /    \      
        Fruit     \   Plant
        /          \  /
    Apple         Basil
```

To inherit from an interface, you use the `implements` keyword. It generally looks like this:

```java
modifier(s) class ClassName implements InterfaceName
```

This is what our `Edible` example might look like with interface and class bodies omitted.

```java
public interface Edible {
    ...
}
```

```java
public class Fruit implements Edible {
    ...
}
```

```java
public class Apple extends Fruit {
    ...
}
```

```java
public class Plant {
    ...
}
```

```java
public class Basil extends Plant implements Edible {
    ...
}
```

**Note**: A class can only extend 1 superclass, but it can implement multiple interfaces
(just separate them with commas).

**Note**: Interfaces are basically treated like superclasses, so the subclass inherits
all of the interface's fields and methods. Additionally, an instance of a subclass
is also treated as an instance of the interface. (For example, an `Apple` object
is an instance of `Edible` and `Fruit`.)

### Fields

Interfaces can only contain constants. All fields in an interface are
`public static final`, so you can choose to explicitly write that in front
of all of the interface's fields, or omit them.

For example, the two interfaces below are equivalent.

```java
public interface Example {
    public static final MY_CONSTANT = 50;
}
```

```java
public interface Example {
    MY_CONSTANT = 50;
}
```

Note that since the constants are `static`, you access them through the interface name.
In the example above, we could access the constant by writing `Example.MY_CONSTANT`.

### Methods

All interface methods are `public abstract`, so those keywords can
also be omitted or explicitly stated when defining an interface.

The two interfaces below are equivalent.

```java
public interface Example {
    public static final MY_CONSTANT = 50;

    public abstract void someMethod();
}
```

```java
public interface Example {
    MY_CONSTANT = 50;

    void someMethod();
}
```

## Interfaces vs Abstract Classes

Remember that while both interfaces and abstract classes are more "generalized"
forms of classes, they _are not identical!_ Here is a table that summarizes
differences between the two.

| Interfaces                           | Abstract Classes                    |
| :----------------------------------- | :---------------------------------- |
| All methods are `public abstract`    | Methods can be concrete or abstract |
| All fields are `public static final` | Fields don't need to be constants   |
| Inherit using `implements`           | Inherit using `extends`             |
| Can inherit multiple interfaces      | Can only inherit 1 class            |
| Weak inheritance                     | Somewhat stronger inheritance       |
| No constructors                      | Can have constructor(s), but can't make instance using `new` |
| Name can be noun or adjective        | Name is a noun                      |

## Comparable

There are many interfaces built-in to Java. One that is useful is the `Comparable`
interface, which contains the abstract `compareTo` method. This allows a developer
to define what it means for an object to be greater than, less than, or equal to
another object.

### Generics

Before we talk about `Comparable`, we need to do a very brief and simplified
introduction to generics in Java. Basically, generics allow you to turn classes
into parameters for things like methods or interfaces. You can tell that a structure uses
generics if it has the `<` and `>` symbols. For example:

```java
public interface Comparable<T>
```

The `T` is simply a placeholder for a class type (it doesn't work with primitives).
For example, if you want to implement `Comparable` to compare two `Point` objects,
you would replace `T` with `Point`:

```java
public class Point implements Comparable<Point> {
    ...
}
```

### compareTo

Since `Comparable` contains the abstract `compareTo` method,
we need to implement it in our concrete `Point` class.

The `compareTo` method is defined as follows in the `Comparable` interface:

```java
public interface Comparable<T> {
    public int compareTo(T o);
}
```

Notice that the type is listed as `T`. That's because we're generalizing the
`compareTo` method to work for any class. `T` could be replaced with `Point`,
`Circle`, `Apple`, or any other class.

Another thing to notice is that the return type is `int`. This is because
a positive integer represents "greater than", 0 represents "equal to", and a
negative integer represents "less than."

Analyze the code below, which implements the `compareTo` method in the `Point`
class such that the two objects' x coordinates are checked, and then y coordinates.
For example, (5, 5) is considered "greater than" (4, 5).

**Point**

```java
public class Point implements Comparable<Point> {
    public double x;
    public double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point pt) {
        // compare on x coordinate first
        if (x > pt.x) {
            return 1;
        } else if (x == pt.x) {
            // if x coordinates are equal, compare y
            if (y > pt.y) {
                return 1;
            } else if (y == pt.y) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
```

Now let's actually use the `compareTo` method in a driver class, `TestPoint`.
Analyze the code and output below.

**TestPoint**

```java
public class TestPoint {
    public static void main(String[] args) {
        Point[] points = {
            new Point(5, 5),
            new Point(4, 5),
            new Point(5, 5),
            new Point(6, 5),
            new Point(5, 6),
        };

        for (int i = 1; i < points.length; i++) {
            int comparisonResult = points[0].compareTo(points[i]);
            if (comparisonResult > 0) {
                System.out.println("Greater than");
            } else if (comparisonResult == 0) {
                System.out.println("Equal to");
            } else {
                System.out.println("Less than");
            }
        }
    }
}
```

**Output**

```
Greater than
Equal to
Less than
Less than
```

**Note**: The `compareTo` method is often used to determine the `natural ordering`
of elements. That is why the `Arrays.sort(arr)` method sorts elements in an array
using the `compareTo` method. If you'd like to see a demonstration, see
[SortPoints.java]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/lessons/comparable/SortPoints.java).

**Note**: When implementing the `compareTo` and `equals` methods, you should make sure
that `compareTo` returns `0` if and only if `equals` returns `true` to be consistent.

**Note**: For more information on the `Comparable` interface, you can read
its documentation [here](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Comparable.html).
