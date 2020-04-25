package com.omegarobotics.unit5.lessons.zoo;

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
                new Lion("Nina")
        };

        for (Animal a: animals) {
            System.out.println(a);
        }
    }
}
