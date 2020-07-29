---
layout: default
title: Classes
permalink: learn/unit5/classes
parent: Unit 5
grand_parent: Learn
nav_order: 1
---

<!-- prettier-ignore-start -->

# Unit 5: Classes

{: .no_toc }

In development {: .label .label-purple }

## Table of Contents

{: .no_toc .text-delta }

1. TOC {:toc}
 <!-- prettier-ignore-end -->

## Objects & Classes

As said earlier, Java is an object-oriented programming language, meaning
everything is treated as an Object. Objects in Java are like Objects in real
life, such as a Vehicle or an Animal. Objects can have attributes, such as a
Vehicle having a color and wheels. Classes are what comprise of the Object. A
car or animal would be the name of a class. A class can be used as a
non-primitive datatype, where primitive datatypes are doubles, ints, booleans,
chars, etc. A string is an example of a non-primitive data type, meaning that
"String" is actually a name of a class with its own attributes that you can look
at. In order to make an object from a class, the class needs a constructor. The
constructor is actually what initializes the object. Constructors look like
normal methods but do not have a return type or _static_ in them. The name of
the constructor is the same as the name of the class. When constructing, you
want `this` object to equal the parameters, so do as the following in a file
named **Human.java**:

```java
public class Human {
    public String name;
    public int age;
    public String gender;
    public double height;


    public Human(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
}
```

What is happening in this example is that **this** refers to the new object
being created. It is assigning each attribute of **this** object to each
parameter in the constructor. In order to test out this class, you have to make
another file which will test out this class. In order to make an object of the
`Car` class, you use `Car` as the type and use the `new` keyword before putting
the constructor and the arguments in:

```java
public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Dwight Schrute", 30, "male", 187.96);
    }
}
```

One issue right now is that we aren't able to have a default human constructor.
To achieve this, we can make another method called `Human` just like the
previous one, except we can change the parameters or even remove them.

```java
public class Human {
    public String name;
    public int age;
    public String gender;
    public double height;


    public Human(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public Human() {
        this.name = "John Doe";
        this.age = 30;
        this.gender = "male";
        this.height = 150;
    }
}
```

Now, putting nothing inside of the parenthesis when making a new Human would
yield "John Doe", who is 30 years old, is male, and is 150cm tall.

If we want our class to be more useful, we can put different methods inside of
the class which can manipulate our object in different ways. As you may have
seen earlier, the toString method in Java is used to return the String of any
object. It has a default return value for any objects, but we want to return the
string in a certain way. In order to override Java's default method, we can use
`@Override` right above the toString method.

```java
public class Human {
    public String name;
    public int age;
    public String gender;
    public double height;


    public Human(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public Human() {
        this.name = "John Doe";
        this.age = 30;
        this.gender = "male";
        this.height = 150;
    }

    @Override
    public String toString() {
        return this.name + " is a " + this.age + " year old " + this.gender
         + " and is " + this.height + "cm tall.";
    }
}
```

We can test this out again.

```java
public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human();
        System.out.println(human1.toString());
        // prints "John Doe is a 30 year old male and is 150.0cm tall."
    }
}
```
