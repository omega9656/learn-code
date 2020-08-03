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

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Objects and Classes

As said earlier, Java is an object-oriented programming language. Recall that objects
are advanced data types (basically, they're not primitives). You can think of classes as
the blueprint and objects as the house built from that blueprint. All houses share common
characteristics and function, but individual houses have slight differences, like paint color
or the number of rooms.

**Note**: Objects are also called _instances_ of a class.

## Attributes and Behaviors

Objects in Java model objects in real life, such as a Vehicle or an Animal. Objects have
attributes and behaviors. That is, they have characteristics and things that they can do.
In programming, this translates to classes having _fields_ (variables that belong to that class)
and _methods_ (things that the class can do).

For example, if you wanted to model a human being in code, you could write a class called
`Human` with fields like `name`, `age`, or `gender` (characteristics that all humans share)
and methods like `eat`, `walk`, or `talk` (things that all humans can do).

```java
public class Human {
    private String name;
    private int age;
    private String gender;

    public void eat(String food) {
        System.out.println(name + " ate " + food);
    }

    public void walk(double miles) {
        System.out.println(name + " walked " + miles + " miles");
    }

    public void talk(String message) {
        System.out.println(name + " said " + message);
    }
}
```

Notice that all of the fields are `private`. This is due to a concept in Java
called [encapsulation](https://www.tutorialspoint.com/java/java_encapsulation.htm)
that we're not really going to discuss. Generally, you should make class fields
private and access/modify them through `public` methods.

Also notice that `private` class fields are accessible throughout the entire class,
which is why we can use `name` in all of the methods.

## Accessors and Modifiers

Accessors and modifiers, more commonly called _getters_ and _setters_, are `public`
methods in a class that allow a programmer to access or modify `private` fields.
Generally, you should have a getter and setter for each field, unless you
don't want a field to be viewed or changed. (For example, you may not want
a student's ID number to change, and thus would not have a setter for that.)

Analyze the code below. The fields and other methods have been omitted for brevity.

```java
public class Human {
    ...

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

    ...
}
```

Notice that getters start with `get` and setters start with `set`.
The only exception to this rule is that getters for fields of type `boolean`
start with `is`. For example, if I have a `boolean` field called `hungry`,
the getter would be called `isHungry`.

Notice that getter methods have the same return type as the field itself
(which makes sense). Setter methods return `void`.

### This

Something new in the code above is the `this` keyword. `this` is used to refer
to the object itself ("this" object). Note that when we do `this.name = name`, we're
using dot notation to assign this object's `name` field to the value of `name`,
which is different (it's the parameter of the setter method, not the object's field).

If you find this confusing, you can always use a different parameter name.
It's just a bit longer and unwieldy. For example:

```java
public void setName(String newName) {
    name = newName;
}
```

## Constructors

We've talked about a class's methods, but we haven't learned about its
most important method - its constructor. A _constructor_ is a special
method that all classes have that is called every time a new instance
of that class is created. 

Constructors have the exact same name as the name of the class, and do not
have a return type or the `static` modifier. They are also all `public`.

Constructors are typically used to initialize the class's fields. Analyze
the constructor in the class below. (All other methods have been omitted for brevity.)

```java
public class Human {
    // fields
    private String name;
    private int age;
    private String gender;

    // constructor
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    ...
}
```

The `Human` constructor is assigning each attribute of `this` object to each
parameter in the constructor. 

### Multiple Constructors

You can have more than 1 constructor to customize the initial state of your object.
In fact, you should generally have at least 2 constructors: the default constructor,
which has no parameters and creates a default object, and a constructor with enough
parameters to give each of your fields values.

In the code below, the fields, getters, and setters have been omitted for brevity.

```java
public class Human {
    ...

    /** Default constructor */
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

    ...
}
```

**Note**: Rather than have the default constructor assign values,
some developers prefer to initialize fields immediately and leave
the default constructor blank. For example:

```java
public class Human {
    // fields
    private String name = "Jane Doe";
    private int age = 18;
    private String gender = "female";

    /** Default constructor */
    public Human() {
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    ...
}
```

## Using Classes

Now that we've created a class, let's use it. We can make another class (a "test class"
or _driver class_) to test the class we just wrote.

```java
public class TestHuman {
    public static void main(String[] args) {
        // test the Human class here
    }
}
```

**Note**: Since `Human` was declared as a `public` class, `TestHuman` can
access it and its `public` methods.

**Note**: You can have multiple classes in one file, but this is generally
not a good practice because it makes your code harder to maintain. If you really
want to do it though, you should make your driver class `public` and the class
you're testing default visibility (no modifier). (Remember that every Java file
can only have 1 `public` class.)

### New

First, let's construct a new `Human` object. To do this, we need to use the
`new` keyword and a constructor. In the code below, we are initializing a new variable
`person`, which references a `Human` object.

```java
public class TestHuman {
    public static void main(String[] args) {
        Human person = new Human("Dwight Schrute", 30, "male");
    }
}
```

### Dot Notation

We use dot notation to access class fields (assuming they are visible, which
in this case they aren't) and call class methods. The general form is like so:
`objectName.fieldName` or `objectName.methodName(args)`.

For example, let's try calling the `talk` method on the `Human` we just created.

```java
public class TestHuman {
    public static void main(String[] args) {
        Human person = new Human("Dwight Schrute", 30, "male");
        person.talk("Tahiti, it's a magical place!");
    }
}
```

Output

```
Dwight Schrute said Tahiti, it's a magical place!
```

One issue right now is that we aren't able to have a default human constructor.
To achieve this, we can make another method called `Human` just like the
previous one, except we can change the parameters or even remove them.

### Static

Remember the `static` modifier? In [Unit 4](/learn-code/learn/unit4), we simply told
you to use it for all of your methods. However, now that we've learned about class
methods, you may have noticed that they do not include the `static` modifier.

This is because the methods we just declared are _instance methods_. They are
instance methods because they are reliant on an object being created.

_Static methods_, on the other hand, can be called without the object being created.
They basically belong to the class itself. For example, `Math.sqrt` is a static method - 
you don't need to create a `Math` object, you just use it.

On the other hand, if you tried to call the `eat` method from the `Human` class _without_
creating an object, you would get an error.

## Applications

### Why Classes

You may be thinking, why do I need to write classes though? Can't I just put
everything in the `main` method and turn fields into regular old variables?
Can't I just write regular old `static` methods and call them in `main`?

Well, yes, you could do that. But it's just unwieldy, results in a lot of
repeated code, and is generally harder to maintain. Writing classes is an
intuitive way to represent every aspect of something in real life. So do it!

If you're still not convinced, you can take a look at [WhyClasses.java]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit5/lessons/WhyClasses.java).

So far, our class fields have been primitive types. However, you can have classes which make up
other classes! This is called _composition_ because there are classes that are part of
a "bigger" class. You can read more about composition (a special type of _aggregation_) [here](https://www.geeksforgeeks.org/association-composition-aggregation-java/).

### Toaster

For example, think of a toaster. You can think of a `Toaster` class which is made up of a `Battery`.
Each of these classes might have other fields that are primitive types, and methods that are special
to those classes. Scan the code below and see if you can figure out how it works/what it does.

```java
public class Composition {

    public static void main(String[] args) {
        Toaster myToaster = new Toaster();
        myToaster.power.turnOn();
        System.out.println(myToaster);
    }
}

class Battery {
    private double voltage;
    private boolean on;

    public Battery() {
        voltage = 120;
        on = false;
    }

    public Battery(int voltage) {
        this.voltage = voltage;
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public double getVoltage() {
        return voltage;
    }

    public String toString() {
        return voltage + "V (" + ((on) ? "ON" : "OFF") + ")";
    }
}

class Toaster {
    private int slices;
    private int slots;
    public Battery power;

    public Toaster() {
        slices = 0;
        slots = 2;
        power = new Battery();
    }

    public Toaster(int slices, int slots, int voltage) {
        this.slices = slices;
        this.slots = slots;
        this.power = new Battery(voltage);
    }

    public int getSlices() {
        return slices;
    }

    public int getSlots() {
        return slots;
    }

    public void insertBread(int n) {
        if (power.isOn() && n > 0 && slices + n <= slots) {
            slices += n;
        }
    }

    public void popBread() {
        if (power.isOn()) {
            slices = 0;
        }
    }

    public String toString() {
        return (
            slots +
            " slot toaster " +
            power.toString() +
            " with " +
            slices +
            " slices(s) in toaster"
        );
    }
}
```

Output

```
2 slot toaster 120.0V (ON) with 0 slices(s) in toaster
```

### Robot

Similarly, we can make different classes to represent subassemblies of a robot.
For instance, we can have a `Drivetrain`, `Intake`, and `Lift` class which all
make up a `Robot`.

The following classes are _extremely simplified_ versions of what you might have
when structuring your own code in FTC.

**Drivetrain Class**

```java
public class Drivetrain {

    public Drivetrain() {
        // initialize hardware
    }
}
```

**Intake Class**

```java
public class Intake {

    public Intake() {
        // initialize hardware
    }

    public void in() {
        // intake
    }

    public void out() {
        // outtake
    }
}
```

**Lift Class**

```java
public class Lift {
    public int level = 0;
    public final int MAX_LEVEL = 5;

    public Lift() {
        // initialize hardware
    }

    public void up() {
        if (level < MAX_LEVEL) {
            level++;
        }
    }

    public void down() {
        if (level > 0) {
            level--;
        }
    }
}
```

**Robot Class**

```java
public class Robot {
    public Drivetrain dt;
    public Intake intake;
    public Lift lift;

    public Robot() {
        // initialize hardware
        dt = new Drivetrain();
        intake = new Intake();
        lift = new Lift();
    }
}
```

**OpMode Class**

When you use the FTC SDK, you will use OpModes (operational modes)
which is basically where you put the code to control what your robot
does in autonomous or teleop. In this _extremely simplified dummy version_
of an OpMode, we simply "initialize" the robot's hardware and make the lift
go "up" 1 level.

```java
public class OpMode {

    public void runOpMode() {
        // initialize robot hardware
        Robot omegaBot = new Robot();

        // tell robot to do things (auto), OR
        // continuously check gamepads for input
        // and do stuff depending on which buttons are pressed
        omegaBot.lift.up();
    }
}
```

We'll learn more about the FTC SDK and OpModes in [Unit 8](/learn-code/learn/unit8).

### Pickaxe

Another example is a basic class which could model a pickaxe in Minecraft.

```java
public class Pickaxe {
    private double durability;
    private String material;

    public Pickaxe() {
        durability = 100;
        material = "wood";
    }

    public Pickaxe(String material) {
        durability = 100;
        this.material = material;
    }

    public void pick() {
        switch (material) {
            case "wood":
                durability -= 30;
            case "gold":
                durability -= 25;
            case "iron":
                durability -= 15;
            case "diamond":
                durability -= 5;
        }
    }
}
```
