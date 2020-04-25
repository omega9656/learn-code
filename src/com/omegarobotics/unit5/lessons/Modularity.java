package com.omegarobotics.unit5.lessons;

/*
Topics:
- Modularity
- Aggregation
- Composition
 */

public class Modularity {
    public static void main(String[] args) {
        Toaster myToaster = new Toaster();
        // myToaster.turnOn(); won't work
        myToaster.power.turnOn();

        System.out.println(myToaster);

    }
}

/* PowerSupply has two fields:
 * voltage (120 or 240 - 120 default)
 * on: boolean - default false
 *
 * It has a no-argument constructor and a two-argument constructor
 * It has a getter/setter for on
 * It has a getter for voltage
 *
 * It has convenience methods turnOn() and turnOff()
 */
class PowerSupply {
    private int voltage;
    private boolean on;

    public PowerSupply() {
        voltage = 120;
        on = false;
    }

    public PowerSupply(int voltage) {
        this.voltage = voltage;
        on = false;
    }

    public void setOn(boolean status) {
        on = status;
    }

    public boolean getOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public int getVoltage() {
        return voltage;
    }

    public String toString() {
        return voltage + "V (" + ((on) ? "ON": "OFF") + ")";
    }
}

/* Toaster contains these fields:
 *
 * slices (integer, default 0)
 * slots (integer, default 2)
 * power (PowerSupply object)
 *
 * No-argument constructor
 * Three argument constructor slices, slots, and voltage
 *
 * getter and setter for slices
 * getter for slots
 * convenience methods insertBread() and popBread()
 */
class Toaster {
    int slices;
    int slots;
    PowerSupply power;

    Toaster() {
        slices = 0;
        slots = 2;
        power = new PowerSupply();
    }

    Toaster(int slices, int slots, int voltage) {
        this.slices = slices;
        this.slots = slots;
        this.power = new PowerSupply(voltage);
    }

    public void setSlices(int n) {
        if (n > 0 && n <= slots) {
            slices = n;
        }
    }

    public int getSlices() {
        return slices;
    }

    public int getSlots() {
        return slots;
    }

    public void insertBread(int n) {
        if (n > 0 && slices + n <= slots) {
            slices += n;
        }
    }

    public void popBread() {
        slices = 0;
    }

    public String toString() {
        String result =
                slots + " slot toaster " +
                        power.toString() + " with " + slices + " slices(s) in toaster";
        return result;
    }
}
