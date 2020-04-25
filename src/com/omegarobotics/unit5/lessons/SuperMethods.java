package com.omegarobotics.unit5.lessons;

/*
Topics:
- Calling superclass methods using the super keyword
 */

public class SuperMethods {
    public static void main(String[] args) {
        Guitar taylorGuitar = new Guitar("acoustic", "steel");
        System.out.println(taylorGuitar);
        taylorGuitar.strum();
    }
}

class Instrument {
    private String name;

    public Instrument() {
        name = "";
    }

    public Instrument(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing instrument");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instrument, name: " + name;
    }
}

class Guitar extends Instrument {
    private String type;
    private String stringType;

    public Guitar() {
        super("guitar");
        type = "acoustic";
        stringType = "steel";
    }

    public Guitar(String type, String stringType) {
        super("guitar");
        this.type = type;
        this.stringType = stringType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public void strum() {
        for (int i = 0; i < 6; i++) {
            super.play(); // use super.methodName() to call a superclass method
        }
    }

    @Override
    public String toString() {
        return stringType + "-string " + type + " guitar";
    }
}
