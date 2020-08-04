---
layout: default
title: Abstract Classes
permalink: learn/unit6/abstract-classes
parent: Unit 6
grand_parent: Learn
nav_order: 1
---

<!-- prettier-ignore-start -->

# Unit 6: Abstract Classes
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Abstract Classes

So far we have learned about regular classes. _Abstract classes_ are even more
generalized versions of classes that allow for greater flexibility when
designing classes.

An abstract class is declared as follows, using the `abstract` keyword:

```java
modifier(s) abstract class ClassName {
    // class body here
}
```

For example, I could declare an abstract `GeometricObject` like so (fields and
methods are omitted for brevity):

```java
public abstract class GeometricObject {
    ...
}
```

**Note**: On a UML diagram, abstract class names are _italicized_.

## Abstract Methods

The cool thing about abstract classes is that they can have _abstract methods_.
Abstract methods simply include the method signature and do not have a method
body (no implementation). Thus, rather than having curly braces, you simply end
the abstract method declaration with a semicolon, like so:

```java
modifier(s) abstract returnType methodName(parameterType parameterName, ...)
```

For example, since all `GeometricObject`s have an area and perimeter, I can
define the `getArea` and `getPerimeter` methods as `abstract` in the
`GeometricObject` class. This makes sense because superclasses are supposed to
include common fields and methods for _all_ of its subclasses.

It also helps us avoid the need to cast objects to their subclasses when calling
methods on elements in a superclass array (see
[Polymorphism](/learn-code/learn/unit5/polymorphism)). Additionally, it gives us
flexibility to customize how the method is implemented in subclasses. This is
because you don't have one definitive formula to calculate the area or perimeter
for all `GeometricObject`s. However, once we get to a more specific subclass,
like `Circle` or `Rectangle`, we do have area and perimeter formulas.

Some fields and methods are omitted for brevity.

```java
public abstract class GeometricObject {
    ...

    public abstract double getArea();

    public abstract double getPerimeter();
}
```

So how exactly do we implement the `getArea` method? We need to override it in a
subclass of the abstract class. For example, let's override the `getArea` method
in the `Circle` and `Rectangle` classes. (Some fields and methods are omitted
for brevity.)

**Circle**

```java
public class Circle extends GeometricObject {
    private double radius;

    ...

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    ...
}
```

**Rectangle**

```java
public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    ...

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    ...
}
```

**Note**: On a UML diagram, abstract methods are _italicized_.

### Abstract vs Concrete

Since abstract classes are abstract, you cannot create an instance of an
abstract class. (This is because abstract classes may contain abstract methods,
which do not have an implementation yet.) You can, however, create an instance
of a _concrete_ class which extends an abstract class. That object is considered
both an instance of the concrete class and the abstract class (see
[Polymorphism](/learn-code/learn/unit5/polymorphism)). To put it in simple
terms, you can't create an instance of an abstract class using `new`, but you
can use it as a data type.

## Applications in FTC

In the FTC SDK, there are some abstract classes that you will use often, such as
`OpMode` and `LinearOpMode`. When you create your own opmodes to control your
robot during auto or teleop, you extend one of those abstract classes. This
forces you to implement methods like `init()`, `loop()`, or `runOpMode()`, which
are executed in varying stages of the game.

See [Unit 8](/learn-code/learn/unit8) for more on the FTC SDK.

You can view `OpMode` and `LinearOpMode` documentation
[here](https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/eventloop/opmode/OpMode.html)
and
[here](https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/eventloop/opmode/LinearOpMode.html),
respectively.

## Notes on Abstract Classes

_This section is an excerpt from Ch. 13.2.2 Interesting Points about Abstract
Classes in Introduction to Java Programming (Comprehensive), 10th ed. by Y.
Daniel Liang_

> The following points about abstract classes are worth noting:
>
> -   An abstract method cannot be contained in a nonabstract class. If a
>     subclass of an abstract superclass does not implement all the abstract
>     methods, the subclass must be defined as abstract. In other words, in a
>     nonabstract subclass extended from an abstract class, all the abstract
>     methods must be implemented. Also note that abstract methods are
>     nonstatic.
>
> -   An abstract class cannot be instantiated using the `new` operator, but you
>     can still define its constructors, which are invoked in the constructors
>     of its subclasses. For instance, the constructors of `GeometricObject` are
>     invoked in the `Circle` class and the `Rectangle` class.
>
> -   A class that contains abstract methods must be abstract. However, it is
>     possible to define an abstract class that doesn’t contain any abstract
>     methods. In this case, you cannot create instances of the class using the
>     `new` operator. This class is used as a base class for defining
>     subclasses.
>
> -   A subclass can override a method from its superclass to define it as
>     abstract. This is very unusual, but it is useful when the implementation
>     of the method in the superclass becomes invalid in the subclass. In this
>     case, the subclass must be defined as abstract.
>
> -   A subclass can be abstract even if its superclass is concrete. For
>     example, the `Object` class is concrete, but its subclasses, such as
>     `GeometricObject`, may be abstract.
>
> -   You cannot create an instance from an abstract class using the `new`
>     operator, but an abstract class can be used as a data type. Therefore, the
>     following statement, which creates an array whose elements are of the
>     `GeometricObject` type, is correct.
>
> `GeometricObject[] objects = new GeometricObject[10];`
>
> You can then create an instance of GeometricObject and assign its reference to
> the array like this:
>
> `objects[0] = new Circle();`
