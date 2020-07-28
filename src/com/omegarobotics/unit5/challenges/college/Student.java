package com.omegarobotics.unit5.challenges.college;

public class Student extends Person {
    private String classStatus;
    private final long STUDENT_ID_NUMBER;

    /** Constructs a default Student object */
    public Student() {
        classStatus = "freshman";
        STUDENT_ID_NUMBER = 0;
    }

    /**
     * Constructs a Student object with given class
     * status and ID number
     * @param classStatus  freshman, sophomore, junior, or senior
     * @param STUDENT_ID_NUMBER  Student's ID number
     */
    public Student(String classStatus, long STUDENT_ID_NUMBER) {
        this.classStatus = classStatus;
        this.STUDENT_ID_NUMBER = STUDENT_ID_NUMBER;
    }

    /**
     * Constructs a Student object with given name,
     * address, phone number, email address, class status,
     * and ID number
     * @param name  Student's name
     * @param address  Student's home address
     * @param phoneNumber  Student's phone number as a {@code long}
     * @param emailAddress  Student's email address
     * @param classStatus  Student's class status (freshman, sophomore, junior, or senior)
     * @param STUDENT_ID_NUMBER  Student's ID number
     */
    public Student(
        String name,
        String address,
        long phoneNumber,
        String emailAddress,
        String classStatus,
        long STUDENT_ID_NUMBER
    ) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
        this.STUDENT_ID_NUMBER = STUDENT_ID_NUMBER;
    }

    /**
     * Returns this Student's class status
     * @return this Student's class status
     */
    public String getClassStatus() {
        return classStatus;
    }

    /**
     * Sets this Student's class status
     * @param classStatus  new class status
     */
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    /**
     * Returns this Student's ID number
     * @return this Student's ID number
     */
    public long getStudentIDNumber() {
        return STUDENT_ID_NUMBER;
    }

    @Override
    public String toString() {
        return "Student, name: " + super.getName();
    }
}
