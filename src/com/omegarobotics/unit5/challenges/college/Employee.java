package com.omegarobotics.unit5.challenges.college;

public class Employee extends Person {
    private String officeAddress;
    private double salary;
    private final long EMPLOYEE_ID_NUMBER;
    private final MyDate DATE_HIRED;

    /** Constructs a default Employee object */
    public Employee() {
        officeAddress = "";
        salary = 0;
        EMPLOYEE_ID_NUMBER = 0;
        DATE_HIRED = new MyDate();
    }

    /**
     * Constructs an Employee object with given
     * office address, salary, employee ID number,
     * and date hired
     * @param officeAddress  address of this Employee's office
     * @param salary  how much money this Employee makes
     * @param EMPLOYEE_ID_NUMBER  ID number of this Employee
     * @param DATE_HIRED  the date this Employee was hired
     */
    public Employee(String officeAddress, double salary, long EMPLOYEE_ID_NUMBER, MyDate DATE_HIRED) {
        this.officeAddress = officeAddress;
        this.salary = salary;
        this.EMPLOYEE_ID_NUMBER = EMPLOYEE_ID_NUMBER;
        this.DATE_HIRED = DATE_HIRED;
    }

    /**
     * Constructs an Employee object with given name,
     * address, phone number, email address,
     * office address, salary, employee ID number,
     * and date hired
     * @param name  name of Employee
     * @param address  Employee's home address
     * @param phoneNumber  Employee's phone number as a {@code long}
     * @param emailAddress  Employee's email address
     * @param officeAddress  address of this Employee's office
     * @param salary  how much money this Employee makes
     * @param EMPLOYEE_ID_NUMBER  ID number of this Employee
     * @param DATE_HIRED  the date this Employee was hired
     */
    public Employee(String name, String address, long phoneNumber, String emailAddress,
                    String officeAddress, double salary, long EMPLOYEE_ID_NUMBER, MyDate DATE_HIRED) {
        super(name, address, phoneNumber, emailAddress);
        this.officeAddress = officeAddress;
        this.salary = salary;
        this.EMPLOYEE_ID_NUMBER = EMPLOYEE_ID_NUMBER;
        this.DATE_HIRED = DATE_HIRED;
    }

    @Override
    public String toString() {
        return "Employee, name: " + super.getName();
    }
}
