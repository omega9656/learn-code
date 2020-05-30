package com.omegarobotics.unit5.challenges.college;

public class Faculty extends Employee {
	private String officeHours;
	private String department;

	public Faculty() {
		officeHours = "";
		department = "";
	}

	public Faculty(String officeAddress, double salary, long employeeIDNumber, MyDate dateHired) {
		super(officeAddress, salary, employeeIDNumber, dateHired);
		officeHours = "";
		department = "";
	}

	public Faculty(String officeAddress, double salary, long employeeIDNumber,
				   int day, int month, int year, String officeHours, String department) {
		super(officeAddress, salary, employeeIDNumber, day, month, year);
		this.officeHours = officeHours;
		this.department = department;
	}

	public Faculty(String name, String address, long phoneNumber, String emailAddress,
				   String officeAddress, double salary, long employeeIDNumber, MyDate dateHired,
				   String officeHours, String department) {
		super(name, address, phoneNumber, emailAddress, officeAddress, salary, employeeIDNumber, dateHired);
		this.officeHours = officeHours;
		this.department = department;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Faculty, name: " + super.getName();
	}
}
