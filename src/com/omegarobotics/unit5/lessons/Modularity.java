package com.omegarobotics.unit5.lessons;

/*
 * Topics:
 * - Aggregation/Modularity
 */

public class Modularity {

    public static void main(String[] args) {
        Toaster myToaster = new Toaster();
        myToaster.power.turnOn();
        System.out.println(myToaster);
    }
}

class Battery {
    private double voltage;
    private boolean on;

    public Battery() {
        voltage = 120;
        on = false;
    }

    public Battery(int voltage) {
        this.voltage = voltage;
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public double getVoltage() {
        return voltage;
    }

    public String toString() {
        return voltage + "V (" + ((on) ? "ON" : "OFF") + ")";
    }
}

class Toaster {
    private int slices;
    private int slots;
    public Battery power;

    public Toaster() {
        slices = 0;
        slots = 2;
        power = new Battery();
    }

    public Toaster(int slices, int slots, int voltage) {
        this.slices = slices;
        this.slots = slots;
        this.power = new Battery(voltage);
    }

    public int getSlices() {
        return slices;
    }

    public int getSlots() {
        return slots;
    }

    public void insertBread(int n) {
        if (power.isOn() && n > 0 && slices + n <= slots) {
            slices += n;
        }
    }

    public void popBread() {
        if (power.isOn()) {
            slices = 0;
        }
    }

    public String toString() {
        return (
            slots +
            " slot toaster " +
            power.toString() +
            " with " +
            slices +
            " slices(s) in toaster"
        );
    }
}
