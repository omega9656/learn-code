package com.omegarobotics.unit5.challenges.college;

public class Employee extends Person {
    private String officeAddress;
    private double salary;
    private final long employeeIDNumber;
    private final MyDate dateHired;

    public Employee() {
        officeAddress = "";
        salary = 0;
        employeeIDNumber = 0;
        dateHired = new MyDate();
    }

    public Employee(String officeAddress, double salary, long employeeIDNumber, MyDate dateHired) {
        this.officeAddress = officeAddress;
        this.salary = salary;
        this.employeeIDNumber = employeeIDNumber;
        this.dateHired = dateHired;
    }

    public Employee(String officeAddress, double salary, long employeeIDNumber, int day, int month, int year) {
        this.officeAddress = officeAddress;
        this.salary = salary;
        this.employeeIDNumber = employeeIDNumber;
        this.dateHired = new MyDate(day, month, year);
    }

    public Employee(String name, String address, long phoneNumber, String emailAddress, String officeAddress,
                    double salary, long employeeIDNumber, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.officeAddress = officeAddress;
        this.salary = salary;
        this.employeeIDNumber = employeeIDNumber;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee, name: " + super.getName();
    }

}
