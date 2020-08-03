package com.omegarobotics.unit5.lessons.zoo;

public class Animal {
    String name = "";
    int hunger = 50;

    public Animal() {}

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
