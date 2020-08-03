---
layout: default
title: UML
permalink: learn/unit5/uml
parent: Unit 5
grand_parent: Learn
nav_order: 4
---

<!-- prettier-ignore-start -->

# Unit 5: UML
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## UML

UML stands for Unified Modeling Language. UML diagrams are used by developers
to repesent classes and relationships between classes. There are quite a bit of rules
on how to make these diagrams, so we'll just go over the basics.

## Overall Structure

A UML diagram for a class is essentially a table with 3 rows. The 1st row contains
the class name, the 2nd row contains the fields, and the 3rd row contains the methods.

Let's start creating a UML diagram for the `Human` class.

```java
public class Human {
    private String name;
    private int age;
    private String gender;

    public Human() {
        name = "Jane Doe";
        age = 18;
        gender = "female";
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food) {
        System.out.println(name + " ate " + food);
    }

    public void walk(double miles) {
        System.out.println(name + " walked " + miles + " miles");
    }

    public void talk(String message) {
        System.out.println(name + " said " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
```

**UML Diagram**

{% include uml/human1.html %}

## Visibility Modifiers

When listing fields and methods, you should use special symbols to denote the visibility modifier
associated with that field/method.

| Visibility Modifier | UML Diagram Symbol |
| :--- | :--- |
| `private` | - |
| default | n/a |
| `protected` | # |
| `public` | + |

## Fields

To list a field, you need to specify its visibility, name, and type. For example:

{% include uml/human2.html %}

## Methods

To list a method, you need to specify its visibility, name, parameter names, parameter
types, and return type.

Note that for constructors, you don't need to specify a return type. However, if a method
returns `void`, you need to explicitly specify that in the diagram.

{% include uml/human3.html %}

## More UML Rules

If you want to learn more rules regarding UML diagrams, you can read this [tutorial](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/).
