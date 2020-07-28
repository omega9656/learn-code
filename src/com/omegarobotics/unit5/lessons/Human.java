package com.omegarobotics.unit5.lessons;

/*
Topics:
- Review what classes are as a concept
 */

import com.omegarobotics.unit5.lessons.zoo.Animal;
import com.omegarobotics.unit5.lessons.zoo.Chicken;
import com.omegarobotics.unit5.lessons.zoo.Lion;

public class Human {
  private String name;
  private String gender;
  private String eyeColor;
  private String hairColor;
  private double height;
  private int age;
  private boolean isHungry;
  private boolean isSleepy;
  private Animal[] pets = new Animal[2];

  public Human() {
    name = "Jane Doe";
    gender = "female";
    eyeColor = "brown";
    hairColor = "brown";
    height = 5.5;
    age = 18;
    isHungry = true;
    isSleepy = true;
    pets[0] = new Chicken();
    pets[1] = new Lion();
  }

  public void eat() {
    isHungry = false;
  }

  public void sleep() {
    isSleepy = false;
  }

  public void walk() {
    isHungry = true;
  }

  public void work() {
    isSleepy = true;
  }
}
