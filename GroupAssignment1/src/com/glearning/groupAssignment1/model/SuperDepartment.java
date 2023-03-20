package com.glearning.groupAssignment1.model;

public class SuperDepartment {

    // Class variables
    protected String departmentName;
    protected String todayWork;
    protected String workDeadline;
    protected String isTodayHoliday;

    // Constructor
    public SuperDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter method for department name
    public String departmentName() {
        return departmentName;
    }

    // Method for getting today's work
    public String getTodayWork() {
        return "No work as of now";
    }

    // Method for getting work deadline
    public String getWorkDeadline() {
        return "NIL";
    }

    // Method for checking if today is a holiday
    public String isTodayHoliday() {
        return "Today is not a Holiday";
    }
}
