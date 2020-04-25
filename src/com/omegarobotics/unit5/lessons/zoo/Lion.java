package com.omegarobotics.unit5.lessons.zoo;

public class Lion extends Animal {
    int numberOfTeeth = 30;

    public Lion() {
        // super();
    }

    public Lion(String name) {
        // super();
        // super(name);
    }

    public Lion(String name, int numberOfTeeth) {
        // super(name);
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
