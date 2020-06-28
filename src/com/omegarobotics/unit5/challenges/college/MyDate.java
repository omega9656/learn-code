package com.omegarobotics.unit5.challenges.college;

public class MyDate {
    private int day;
    private int month;
    private int year;

    /** Constructs a default MyDate object */
    public MyDate() {
        day = 1;
        month = 1;
        year = 2000;
    }

    /**
     * Constructs a MyDate object with given
     * day, month, and year
     * @param day  the day (an {@code int})
     * @param month  the month (an {@code int})
     * @param year  the full 4-digit year (an {@code int})
     */
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Returns the day
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the day to a new value
     * @param day  new day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Returns the month
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the month to a new value
     * @param month  new month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Returns the year
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year to a new value
     * @param year  new year
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
