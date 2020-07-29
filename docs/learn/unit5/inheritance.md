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

In development {: .label .label-purple }

## Table of Contents

{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Inheritance

Inheritance is something in java that allows a class to extend, or get all
attributes from another class and then add onto it. For example, we could have a
class named `Animal`, and the `Human` class could extend it. When a class is
extended, not only all values are used from the parent or superclass, but also
the methods such as the constructor:

```java
public class Animal {
    public int age;
    public String gender;
    public double height;

    public Animal() {
        this.age = 0;
        this.gender = "Female";
        this.height = 0;
    }

    public Animal(int age, String gender, double height) {
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return this.gender + " age " + this.age + ", " + this.height + "cm tall.";
    }
}
```

From this, our new and improved Human class can extend it. The keyword `extends`
is used after the name of the class. In our example, it would be
`public class Human extends Animal`. In order to use any methods or access any
attributes of `Animal`, we can use the `super` keyword/function with all the
parameters that are already in the `Animal` class as shown below:

```java
public class Human extends Animal {
    public String name;

    public Human() {
        super();
        this.name = "John Doe";
    }

    public Human(int age, String gender, double height, String name) {
        super(age, gender, height);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " is " + super.toString();
    }
}
```
