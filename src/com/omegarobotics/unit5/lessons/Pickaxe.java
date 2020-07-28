package com.omegarobotics.unit5.lessons;

/*
Topics:
- Review what classes are (using an example from Minecraft)
 */

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
