package com.omegarobotics.unit5.challenges.college;

public class Student extends Person {
    private final String classStatus;
    private final long studentIDNumber;

    public Student() {
        classStatus = "freshman";
        studentIDNumber = 0;
    }

    public Student(String classStatus, long studentIDNumber) {
        this.classStatus = classStatus;
        this.studentIDNumber = studentIDNumber;
    }

    public Student(String name, String address, long phoneNumber, String emailAddress,
                   String classStatus, long studentIDNumber) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
        this.studentIDNumber = studentIDNumber;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public long getStudentIDNumber() {
        return studentIDNumber;
    }

    @Override
    public String toString() {
        return "Student, name: " + super.getName();
    }
}
