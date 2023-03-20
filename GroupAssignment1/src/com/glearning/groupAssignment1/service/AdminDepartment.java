package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
    // Constructor that takes the department name as a parameter and calls the SuperDepartment constructor
    public AdminDepartment(String departmentName) {
        super(departmentName);
    }

    // Override method to return the department name
    @Override
    public String departmentName() {
        return this.departmentName;
    }

    // Override method to return the today's work for the Admin Department
    @Override
    public String getTodayWork() {
        return "Complete your documents Submission";
    }

    // Override method to return the work deadline for the Admin Department
    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }
}
