---
layout: default
title: Enumerated Types
permalink: learn/unit6/enumerated-types
parent: Unit 6
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 6: Enumerated Types
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Enumerated Types

Enumerated types are a list of fixed values. They are useful
when you have a finite number of values that something can be.
For example, I could have an enumerated type called `Day` which
has the following enumerated values:

- `SUNDAY`
- `MONDAY`
- `TUESDAY`
- `WEDNESDAY`
- `THURSDAY`
- `FRIDAY`
- `SATURDAY`

In Java syntax, it would look like this:

```java
public enum Day { // always static, so static keyword is implicit
    SUNDAY, // enum values
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
}
```

From now on, we'll refer to enumerated types as enums for short.

To declare and initialize a variable with an enum value, use the following format:

```java
EnumName variableName = EnumName.VALUE_NAME;
```

For example:

```java
Day day = Day.FRIDAY;
```

### Built-In Methods

There some built-in methods for all enum values: `name` and `ordinal`.

`name` returns a `String`, which is the name of the enum value.

`ordinal` returns an `int`, which is basically the index of the enum value.
(Indexing starts at 0).

To call an enum method, simply use dot notation.

```java
Day day = Day.FRIDAY;
System.out.println(day.name());
System.out.println(day.ordinal());
```

Output

```
FRIDAY
5
```

There is also the `values` method which returns an array containing
all of the values in an enum.

```java
Day[] days = Day.values();
for (Day d: days) {
    System.out.println(d);
}
```

Output

```
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
```

### Switch

Because enums can only be certain values, they are typically
used in conjunction with `switch` statements, where each case
is an enum value.

```java
Day day = Day.FRIDAY;

switch (day) {
    case SUNDAY:
        System.out.println("Time to read a book");
        break;
    case MONDAY:
        System.out.println("Time to go to work");
        break;
    case TUESDAY:
        System.out.println("Time to go out with friends");
        break;
    case WEDNESDAY:
        System.out.println("Time to watch Agents of SHIELD");
        break;
    case THURSDAY:
        System.out.println("Time to go to the park");
        break;
    case FRIDAY:
        System.out.println("Time to go to the movies");
        break;
    case SATURDAY:
        System.out.println("Time for family game night");
        break;
```

Output

```
Time to go to the movies
```

### Constructors, Fields, and Methods

Enums can have constructors. Unlike regular constructors, enum constructors
are `private` and are invoked inside of the enum declaration. Enums can also have
fields and methods. For example:

```java
public enum TrafficLight {
    // enum values
    RED("Please stop"), // invoke constructor
    GREEN("Please go"),
    YELLOW("Please caution"); // semicolon at the end

    private String description;

    // all enum constructors are private, so private keyword is implicit
    TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
```

**Note**: Since all enum constructors are `private`, the modifier can be omitted.

**Note**: Notice that the final enum value in the list of values must end with a semicolon
rather than a comma.

Let's test the `TrafficLight` enum with a driver class, `TestTrafficLight`.

```java
public class TestTrafficLight {

    public static void main(String[] args) {
        TrafficLight light = TrafficLight.GREEN;
        System.out.println(light.getDescription());
    }
}
```

Output

```
Please go
```

### Notes on Enums

- Enums are a subclass of `Object` and implement `Comparable`
    - Thus, you can call `equals`, `toString`, and `compareTo`
- `equals` method returns `true` if the enum values have the same ordinal
- `compareTo` method returns the result of subtracting the 2 ordinal values
- You can put an enum...
    - In its own file
    - Inside a class declaration
    - Outside a class declaration
- Enums are always `static`, so the modifier can be omitted

## Finite State Machines

A practical application of enums in FTC programming is modeling a finite state machine (FSM).
Basically, finite state machines model something that has various states that it can be in.
A FSM can only be in one state at a time, and transitions between those states.

Many subassemblies in FTC can be programmed as FSMs. For example, an intake can have 3 states:
`IN`, `OUT`, and `STOP`. During those states, we might want certain actions to take place,
such as setting the motors running the intakes at a certain power. We can use an enum and `switch`
statement to do this. (The actual implementation of something like this is left as an exercise.
See [Unit 6: Practice - Challenges](/learn-code/learn/unit6/practice#challenges)).
