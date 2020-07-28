package com.omegarobotics.unit5.lessons;

/*
Topics:
- Constructor chaining
 */

public class ConstructorChaining {

  public static void main(String[] args) {
    Faculty teacher = new Faculty();
  }
}

class Faculty extends Employee {

  public Faculty() {
    System.out.println("(4) Performs Faculty's tasks");
  }
}

class Employee extends Person {

  public Employee() {
    this("(2) Invoke Employee's overloaded constructor");
    System.out.println("(3) Performs Employee's tasks");
  }

  public Employee(String s) {
    System.out.println(s);
  }
}

class Person {

  public Person() {
    System.out.println("(1) Performs Person's tasks");
  }
}
