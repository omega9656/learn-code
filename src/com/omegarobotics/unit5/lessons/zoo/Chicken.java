package com.omegarobotics.unit5.lessons.zoo;

public class Chicken extends Animal {
    int numberOfFeathers = 5_000;

    public Chicken() {
        // super();
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
