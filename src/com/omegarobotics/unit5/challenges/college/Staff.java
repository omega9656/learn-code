package com.omegarobotics.unit5.challenges.college;

public class Staff extends Employee {
	private String title;

	public Staff() {
		title = "";
	}

	public Staff(String officeAddress, double salary, long employeeIDNumber, MyDate dateHired) {
		super(officeAddress, salary, employeeIDNumber, dateHired);
		title = "";
	}

	public Staff(String officeAddress, double salary, long employeeIDNumber, int day, int month, int year, String title) {
		super(officeAddress, salary, employeeIDNumber, day, month, year);
		this.title = title;
	}

	public Staff(String name, String address, long phoneNumber, String emailAddress, String officeAddress,
				 double salary, long employeeIDNumber, MyDate dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, officeAddress, salary, employeeIDNumber, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff, name: " + super.getName();
	}
}
