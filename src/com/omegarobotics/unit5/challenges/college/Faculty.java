package com.omegarobotics.unit5.challenges.college;

public class Faculty extends Employee {
	private String officeHours;
	private String department;

	/** Constructs a default Faculty object */
	public Faculty() {
		officeHours = "";
		department = "";
	}

	/**
	 * Constructs a Faculty object with given
	 * office address, salary, employee ID number,
	 * and date hired
	 * @param officeAddress  where this Faculty member works
	 * @param salary  how much money this Faculty member makes
	 * @param EMPLOYEE_ID_NUMBER  employee ID number of this Faculty member
	 * @param DATE_HIRED  the date this Faculty member was hired
	 */
	public Faculty(String officeAddress, double salary, long EMPLOYEE_ID_NUMBER, MyDate DATE_HIRED) {
		super(officeAddress, salary, EMPLOYEE_ID_NUMBER, DATE_HIRED);
		officeHours = "";
		department = "";
	}


	/**
	 * Constructs a Faculty object with given
	 * name, address, phone number, email address,
	 * office address, salary, employee ID number,
	 * and date hired
	 * @param name  Faculty member's name
	 * @param address  Faculty member's home address
	 * @param phoneNumber  Faculty member's phone number as a {@code long}
	 * @param emailAddress  Faculty member's email address
	 * @param officeAddress  where this Faculty member works
	 * @param salary  how much money this Faculty member makes
	 * @param EMPLOYEE_ID_NUMBER  employee ID number of this Faculty member
	 * @param DATE_HIRED  the date this Faculty member was hired
	 * @param officeHours  when this Faculty member has office hours
	 * @param department  Faculty member's department
	 */
	public Faculty(String name, String address, long phoneNumber, String emailAddress,
				   String officeAddress, double salary, long EMPLOYEE_ID_NUMBER, MyDate DATE_HIRED,
				   String officeHours, String department) {
		super(name, address, phoneNumber, emailAddress, officeAddress, salary, EMPLOYEE_ID_NUMBER, DATE_HIRED);
		this.officeHours = officeHours;
		this.department = department;
	}

	/**
	 * Returns this Faculty member's office hours
	 * @return this Faculty member's office hours
	 */
	public String getOfficeHours() {
		return officeHours;
	}

	/**
	 * Sets this Faculty member's office hours
	 * to a new value
	 * @param officeHours  new office hours
	 */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/**
	 * Returns this Faculty member's department
	 * @return this Faculty member's department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets this Faculty member's department to
	 * a new value
	 * @param department  new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Faculty, name: " + super.getName();
	}
}
