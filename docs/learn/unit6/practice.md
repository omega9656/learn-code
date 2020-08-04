---
layout: default
title: Unit 6 Practice
permalink: learn/unit6/practice
parent: Unit 6
grand_parent: Learn
nav_order: 4
---

<!-- prettier-ignore-start -->

# Unit 6: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Practice

### Geometric

<!-- prettier-ignore-start -->

classes
{: .label }
abstract classes
{: .label }
abstract methods
{: .label }
inheritance
{: .label }
Comparable interface
{: .label }

<!-- prettier-ignore-end -->

**GeometricObject**

Rewrite the `GeometricObject` class from
[Unit 5](/learn-code/learn/unit5/inheritance#geometric-object) so that it is
abstract and contains 2 abstract methods: `getArea` and `getPerimeter`.

```java
public abstract class GeometricObject {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/practice/geometric/GeometricObject.java){: .btn }

**Circle**

Rewrite the `Circle` class from
[Unit 5](/learn-code/learn/unit5/inheritance#geometric-object) so that it
extends the abstract `GeometricObject` class you just wrote.

```java
public class Circle extends GeometricObject {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/practice/geometric/Circle.java){: .btn }

**Rectangle**

Rewrite the `Rectangle` class from
[Unit 5](/learn-code/learn/unit5/practice#geometric) so that it extends the
abstract `GeometricObject` class you just wrote.

```java
public class Rectangle extends GeometricObject {
    // write your code here
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/practice/geometric/Rectangle.java){: .btn }

**TestGeometricObject**

Write a class called `TestGeometricObject` which tests the `getArea`,
`getPerimeter`, and `compareTo` methods of `Circle` and `Rectangle`.

To do this, create an array of `Circle` and `Rectangle` objects. For each
`GeometricObject` in the array, print its area and perimeter. To test the
`compareTo` method, use `Arrays.sort` on the array and print the sorted array.
(The `Arrays.sort` method sorts the array in place. For example, if you called
your array `shapes`, you would write `Arrays.sort(shapes)`.)

```java
import java.util.Arrays; // so that you can use Arrays.sort()

public class TestGeometricObject {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/practice/geometric/TestGeometricObject.java){: .btn }

## Challenges

### Robot

<!-- prettier-ignore-start -->

enumerated types
{: .label }
finite state machines
{: .label }
classes
{: .label }
methods
{: .label }
aggregation
{: .label }

<!-- prettier-ignore-end -->

The code referenced in the following exercises was for the 2019-2020 FTC season,
[Skystone](https://www.youtube.com/watch?v=XiGB_8Ppnbs).

The `DcMotor` and `Servo` classes that are provided in the following exercises
are extremely simplified versions which model the actual classes that are
built-in to the FTC SDK. You should either download or copy and paste the code
since you will use them in the classes you'll write.

<!-- prettier-ignore -->
[View DcMotor]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/challenges/robot/DcMotor.java){: .btn }

<!-- prettier-ignore -->
[View Servo]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/challenges/robot/Servo.java){: .btn }

**Arm**

Partially rewrite the
[Arm](https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/Arm.java)
class so that there is only 1 field called `motor` of type `DcMotor`.

Create an enum called `Position` whose values are the names of each position the
arm can be in. It should have 1 field, `ENCODER_VALUE`, a constant `int`. Write
a constructor for the enum so that each arm position has its corresponding
encoder value.

The `Arm` class should have 1 method called `moveArm` which takes a `Position`
and sets the position of the `Arm`'s `motor` to the `Position`'s encoder value.

```java
public class Arm {
    // field here

    public enum Position {
        // write your code here
    }

    public void moveArm(Position pos) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/challenges/robot/Arm.java){: .btn }

**FoundationGripper**

Partially rewrite the
[FoundationGripper](https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/FoundationGripper.java)
class so that there is only 1 field called `gripper` of type `Servo`.

Create an enum called `Position` whose values are the names of each position the
foundation gripper can be in. It should have 1 field, `SERVO_POSITION`, a
constant `double`. Write a constructor for the enum so that each foundation
gripper position has its corresponding servo position value.

Write a method called `moveGripper` which takes a `Position` and sets the
position of the foundation gripper's servo (`gripper`) to the `Position`'s
`SERVO_POSITION` value.

```java
public class FoundationGripper {
    // field here

    public enum Position {
        // write your code here
    }

    public void moveGripper(Position pos) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/challenges/robot/FoundationGripper.java){: .btn }

**Intake**

Partially rewrite the
[Intake](https://github.com/omega9656/skystone-worlds/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/hardware/Intake.java)
class so that there are 2 fields `left` and `right`, both of type `DcMotor`.

Create an enum called `Direction` whose values are the names of each direction
the intake can be going in. It should have 2 fields, `LEFT_POWER` and
`RIGHT_POWER`, both constant `double`s. Write a constructor for the enum so that
each direction has its corresponding left and right power values.

Write a method called `runIntake` which takes a `Direction` and sets the power
of the `Intake`'s `left` and `right` motors to the `Direction`'s left and right
power values, respectively.

```java
public class Intake {
    // fields here

    public enum Direction {
        // write your code here
    }

    public void runIntake(Direction dir) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit6/challenges/robot/Intake.java){: .btn }
