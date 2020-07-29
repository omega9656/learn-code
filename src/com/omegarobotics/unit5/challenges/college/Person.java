package com.omegarobotics.unit5.challenges.college;

public class Person {
    private String name;
    private String address;
    private long phoneNumber;
    private String emailAddress;

    /** Constructs a default Person object */
    public Person() {
        name = "";
        address = "";
        phoneNumber = 0;
        emailAddress = "";
    }

    /**
     * Constructs a Person object
     * @param name  name of this Person
     * @param address  address of this Person
     * @param phoneNumber  phone number of this Person as a {@code long}
     * @param emailAddress  email address of this Person
     */
    public Person(
        String name,
        String address,
        long phoneNumber,
        String emailAddress
    ) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * Returns this Person's name
     * @return this Person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets this Person's name to
     * a new value
     * @param name  new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns this Person's address
     * @return this Person's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets this Person's address
     * to a new address
     * @param address  new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns this Person's phone number
     * @return this Person's phone number
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets this Person's phone number
     * to a new phone number
     * @param phoneNumber  new phone number ({@code long})
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns this Person's email address
     * @return this Person's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets thi Person's email address
     * to a new value
     * @param emailAddress  new email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person, name: " + name;
    }
}
