---
layout: default
title: Inheritance
permalink: learn/unit5/inheritance
parent: Unit 5
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 5: Inheritance
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Inheritance

Inheritance is something in Java that allows a class to _extend_ or get all
attributes and behaviors from another class and then add onto it. Inheritance describes an _is-a_
relationship. For example, we could have a class named `Animal` which the `Chicken`
class extends. This makes sense because all chickens are animals, and thus have the
characteristics and behaviors of animals in addition to whatever characteristics
and behaviors that are unique to chickens.

**Note**: A class can only extend _one_ other class. When a subclass extends
a superclass, it inherits all of the fields and methods from its superclass.

To inherit from a class (referred to as the _parent class_ or _superclass_), you
use the `extends` keyword. (The class that extends another class is referred to
as the _child class_ or _subclass_.)

**Animal Class**

```java
public class Animal {
    ...
}
```

**Chicken Class**

```java
public class Chicken extends Animal {
    ...
}
```

## Super

Analyze the `Animal` and `Chicken` classes below.

**Animal Class**

```java
public class Animal {
    String name = "";
    int hunger = 50;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Makes noise");
    }

    public void eat() {
        hunger -= 10;
    }

    public void move() {
        hunger += 10;
    }

    public boolean isHungry() {
        return hunger > 50;
    }
}
```

**Chicken Class**

```java
public class Chicken extends Animal {
    int numberOfFeathers = 5_000;

    public Chicken() {
    }

    public Chicken(String name) {
        super(name);
    }

    public Chicken(String name, int numberOfFeathers) {
        super(name);
        this.numberOfFeathers = numberOfFeathers;
    }
}
```

You may have noticed in the code that there is a keyword `super`. Similar to the
`this` keyword, `super` refers to the instance of the superclass. To call a superclass
constructor, you would use `super(args)` (if there are any arguments to be given).

You can reference superclass variables and methods using `super` as well. Just use
dot notation. For example, I could use `super.eat()` in the `Chicken` class. In this case,
you can't use `super.name` because `name` is a `private` field. (Instead, you would use
the getter method.)

**Note**: You may have noticed that we set the default number of feathers
for a `Chicken` to be `5_000`. This is the same as `5000`. The `_` is there
to make it easier to read long numbers, and is valid Java syntax.

### Subclass Constructors

Subclass constructors implicitly call the default superclass constructor. That is,
these two versions of declaring the `Chicken` constructor are equivalent.

```java
public Chicken() {
}
```

```java
public Chicken() {
    super();
}
```

You have the option to explicitly call a superclass constructor with argument(s)
if you want to customize how the subclass constructor works. For example, this is done
in the 1- and 2-argument `Chicken` constructors.

```java
public Chicken(String name) {
    super(name);
}

public Chicken(String name, int numberOfFeathers) {
    super(name);
    this.numberOfFeathers = numberOfFeathers;
}
```

If you would like to learn about constructor chaining, you can take a look at
[ConstructorChaining.java]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/lessons/ConstructorChaining.java)

### Geometric Object

You can also use inheritance to model relationships between shapes.
Let's create a class called `GeometricObject` which models a general shape
and a subclass called `Circle` which inherits from `GeometricObject`.

**GeometricObject Class**

```java
public class GeometricObject {
    private double x; // x coordinate of the center
    private double y; // y coordinate of the center
    private String color;
    private boolean filled;

    /** Constructs a default {@code GeometricObject} */
    public GeometricObject() {
        x = 0;
        y = 0;
        color = "white";
        filled = false;
    }

    /**
     * Constructs a {@code GeometricObject} with center at (x, y) and given color
     * @param x  x coordinate of center of this {@code GeometricObject}
     * @param y  y coordinate of center of this {@code GeometricObject}
     * @param color  color of this {@code GeometricObject}
     * @param filled  whether this {@code GeometricObject} is filled with the given color
     */
    public GeometricObject(double x, double y, String color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    /**
     * Returns the x coordinate of the center
     * of this {@code GeometricObject}
     * @return the x coordinate of the center
     * of this {@code GeometricObject}
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x coordinate of the center
     * of this {@code GeometricObject}
     * @param x  new x coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Returns the y coordinate of the center
     * of this {@code GeometricObject}
     * @return the y coordinate of the center
     * of this {@code GeometricObject}
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y coordinate of the center
     * of this {@code GeometricObject}
     * @param y  new y coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Returns the color of this {@code GeometricObject}
     * @return the color of this {@code GeometricObject}
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the geometric object
     * @param color  new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns whether the geometric object is filled
     * @return {@code true} if this {@code GeometricObject} is filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Sets the whether or not the geometric object is filled
     * @param filled  new status of filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
```

**Note**: The `{@code some text here}` content in the JavaDoc comments format
the text inside braces as code. You can also use `<code>some text here</code>`
to do this.

**Circle Class**

```java
public class Circle extends GeometricObject {
    private double radius;

    /** Constructs a default {@code Circle} object */
    public Circle() {
        super();
        radius = 0;
    }

    /**
     * Constructs a {@code Circle} object with given radius
     * @param radius  radius of this {@code Circle} object
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructs a {@code Circle} object with given radius, center (x, y), color, and filled value
     * @param radius  radius of this {@code Circle} object
     * @param x  x coordinate of the center of this {@code Circle} object
     * @param y  y coordinate of the center of this {@code Circle} object
     * @param color  color of this {@code Circle} object
     * @param filled  whether this {@code Circle} object is filled with the given color
     */
    public Circle(
        double radius,
        double x,
        double y,
        String color,
        boolean filled
    ) {
        super(x, y, color, filled);
        this.radius = radius;
    }

    /**
     * Returns the radius of this {@code Circle} object
     * @return the radius of this {@code Circle} object
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets this {@code Circle} object's radius to given radius
     * @param radius  new radius
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    /**
     * Returns the diameter
     * @return the diameter
     */
    public double getDiameter() {
        return radius * 2;
    }

    /**
     * Returns the area of this {@code Circle} object
     * @return the area of this {@code Circle} object
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the perimeter of this {@code Circle} object
     * @return the perimeter of this {@code Circle} object
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // for use during TestCircle.java
    @Override
    public String toString() {
        return "Circle radius " + radius;
    }
}
```

**Note**: In the source code on GitHub, it is called the `CircleInherit` class
instead of the `Circle` class.

## Overriding Methods

You may have noticed the `@Override` annotation above the `toString` method in the `Circle`
class. What does _override_ mean? What does the `@Override` do? And what is the `toString` method?

Overriding a method occurs when a subclass changes the implementation of a method
defined in the superclass. Let's look at the `Animal` and `Chicken` classes again.
(Some fields and methods have been omitted for brevity.)

**Animal Class**

```java
public class Animal {
    ...

    public void makeNoise() {
        System.out.println("Makes noise");
    }

    ...
}
```

**Chicken Class**

```java
public class Chicken extends Animal {
    ...

    @Override
    public void makeNoise() {
        System.out.println("Cluck!");
    }
}
```

**TestChicken Class**

```java
public class TestChicken {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Chicken myChicken = new Chicken();
        myChicken.makeNoise();
    }
}
```

**Output**

```
Makes noise
Cluck!
```

Notice that the method signatures in both classes are _exactly the same_. However,
the method bodies are different - we call that a different _implementation_ because
they do different things.

### @Override

The `@Override` annotation is an optional thing you can put directly above method signatures
in order to indicate that the method you are writing overrides another method. This is useful
not only so that you and other people on your programming team know that it overrides a method,
but also helps you avoid errors during compile. If the Java compiler detects an `@Override` annotation
on a method that doesn't actually override anything, it will give you an error.

### To String

The `toString` method is used to get the object in `String` form.
All classes have a `toString` method, even if you don't realize it. This is
because all classes automatically extend the built-in `Object` class, which
defines common fields and methods for _all_ classes in Java.

This is the method signature for the `toString` method:

```java
public String toString()
```

By default, the `toString` method basically returns a `String` containing
information about where the object is in memory, which isn't very helpful to
humans. That's why we often override the `toString` method so that it displays
something readable.

**Note**: The `toString` method is called implicitly whenever you attempt to print
an object.

To see an example of the `toString` method in action, analyze the following code.

**Point Class**

```java
public class Point {
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
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
```

**TestPoint Class**

```java
public class TestPoint {
    public static void main(String[] args) {
        Point pt = new Point(5, 6);
        System.out.println(pt);
    }
}
```

**Output**

```
(5, 6)
```

### Equals

Another commonly overriden method that originates from the `Object` class
is the `equals` method. This method is used to check if two objects have
the same content. It should return `true` if the given object and this object
are equal in content, and return `false` otherwise.

You might be thinking, wait, why do we need a method for that when we already
have the equality operator (`==`)? Well, we need a method for this because
the equality operator actually checks if two things reference the same location
in memory. For things like primitives, it happens to be that this means that they're equal.
However, for objects, even if two objects are the exact same type and have the exact same
fields, they won't be "equal" according to the equality operator.

If you're interested in seeing a demonstration of this concept, you can take a look
at [CompareObjects.java]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/lessons/CompareObjects.java).

Another reason why having an `equals` method is important is because it allows
the developer to decide under what circumstances 2 objects are equal. How do
we tell if 2 `Circle`s are equal? We could compare area, circumference, radius,
diameter, center point, color, etc. Having an `equals` method in the `Circle` class
allows us to specify exactly what we mean when we say 2 `Circle`s are equal.

This is the method signature for the `equals` method:

```java
public boolean equals(Object obj)
```

Let's see the `equals` method in action using the `Circle` class. Some fields
and methods are omitted for brevity.

```java
public class Circle extends GeometricObject {
    ...

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            return ((Circle) obj).getArea() == this.getArea();
        }
        return false;
    }
}
```

Time to break down what the code above is actually doing. First, we have the `@Override`
annotation to tell the Java compiler that we are overriding a method. Next, we match
the `equals` method signature that is in the `Object` class in order to override it.

Next, we check if the given `Object` is an instance of `Circle` using the `instanceof`
keyword. If this is not the case, we definitely know the two objects are not equal,
so we return `false`. 

However, if the object is an instance of `Circle`, we check if they have the same area.
Notice that we need to cast `obj` to a `Circle` in order to use the `getArea` method.
If the 2 `Circle`s have the same area, we consider them equal and return `true`. Otherwise,
we return `false`.

### Overload vs Override

Programmers often confuse overloading and overriding methods. Sometimes they use the terms
interchangeably. However, they are definitely _not the same thing!_ Here are some pointers
to help you remember the difference.

| Overloading                                        | Overriding                       |
| :------------------------------------------------- | :------------------------------- |
| Same method name, different parameter list         | EXACT same method signature      |
| Can happen in same class or subclasses             | Happens in subclasses            |
| Preserves general functionality                    | Changes method implementation    |
| Can overload a method many times in the same class | Can only override once per class |
| Doesn't have an annotation                         | Has the `@Override` annotation   |

To view a demonstration of some of these concepts, you can take a look at
[OverloadVersusOverride.java]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/lessons/OverloadVersusOverride.java).
