---
layout: default
title: Polymorphism
permalink: learn/unit5/polymorphism
parent: Unit 5
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 5: Polymorphism
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Polymorphism

Polymorphism is how an object can take on many forms. More specifically, the concept
deals with the fact that an instance of a subclass is both an instance of the subclass
_and_ of the superclass.

For example, let's look at the `Animal` and `Chicken` classes again.

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

    @Override
    public String toString() {
        return "Animal, name: " + name;
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

    @Override
    public void makeNoise() {
        System.out.println("Cluck!");
    }

    @Override
    public String toString() {
        return "Chicken, name: " + name;
    }
}
```

Let's add one more subclass of `Animal`, called `Lion`.

**Lion Class**

```java
public class Lion extends Animal {
    int numberOfTeeth = 30;

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    public Lion(String name, int numberOfTeeth) {
        super(name);
        this.numberOfTeeth = numberOfTeeth;
    }

    @Override
    public void makeNoise() {
        System.out.println("ROAR!");
    }

    @Override
    public String toString() {
        return "Lion, name: " + name;
    }
}
```

Recall that `Chicken` and `Lion` extend `Animal`. Thus, all `Chicken` and `Lion` objects
are also `Animal` objects. This allows us to do fun things like making an array
of `Animal` objects that can contain `Chicken`s and `Lion`s - even though they're not
exactly the same type, they can be treated as such because of their relationship through
inheritance.

```java
public class TestAnimals {

    public static void main(String[] args) {
        Animal[] animals = {
            new Lion(),
            new Animal(),
            new Chicken(),
            new Animal("Kaz"),
            new Lion("Matthias", 50),
            new Chicken("Jordie"),
            new Chicken("Inej", 3000),
            new Lion("Nina"),
        };

        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
```

**Output**

```
Lion, name: 
Animal, name: 
Chicken, name: 
Animal, name: Kaz
Lion, name: Matthias
Chicken, name: Jordie
Chicken, name: Inej
Lion, name: Nina
```

**Note**: In the example above, we noted that the `Chicken` and `Lion` objects in the `animals` array
were treated as `Animal` objects because of their relationship through inheritance.

Because they are treated as `Animal` objects, if you attempt to access a subclass-specific field
or method during runtime, you will receive an error unless you first cast the object to its
subclass type.
