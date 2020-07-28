package com.omegarobotics.unit5.challenges.college;

public class Staff extends Employee {
  private String title;

  /** Constructs a default Staff object */
  public Staff() {
    title = "";
  }

  /**
   * Constructs a Staff object given the
   * office address, salary, employee ID number,
   * and date hired
   * @param officeAddress  where this Staff member works
   * @param salary  how much money this Staff member makes
   * @param EMPLOYEE_ID_NUMBER  ID number of this Staff member
   * @param DATE_HIRED  date this Staff member was hired
   */
  public Staff(
    String officeAddress,
    double salary,
    long EMPLOYEE_ID_NUMBER,
    MyDate DATE_HIRED
  ) {
    super(officeAddress, salary, EMPLOYEE_ID_NUMBER, DATE_HIRED);
    title = "";
  }

  /**
   * Constructs a Staff object given the
   * name, address, phone number, email address,
   * office address, salary, ID number, date hired,
   * and title of this Staff member
   * @param name  Staff member's name
   * @param address  home address of this Staff member
   * @param phoneNumber  Staff member's phone number, as a {@code long}
   * @param emailAddress  Staff member's email address
   * @param officeAddress  where this Staff member works
   * @param salary  how much many this Staff member makes
   * @param EMPLOYEE_ID_NUMBER  ID number of this Staff member
   * @param DATE_HIRED  date this Staff member was hired
   * @param title  name of the position this Staff member holds
   */
  public Staff(
    String name,
    String address,
    long phoneNumber,
    String emailAddress,
    String officeAddress,
    double salary,
    long EMPLOYEE_ID_NUMBER,
    MyDate DATE_HIRED,
    String title
  ) {
    super(
      name,
      address,
      phoneNumber,
      emailAddress,
      officeAddress,
      salary,
      EMPLOYEE_ID_NUMBER,
      DATE_HIRED
    );
    this.title = title;
  }

  /**
   * Returns the title of this Staff member
   * @return the title of this Staff member
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of this Staff member
   * to a new value
   * @param title  new title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Staff, name: " + super.getName();
  }
}
