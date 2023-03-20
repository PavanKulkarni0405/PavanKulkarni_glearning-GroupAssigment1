package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class HRDepartment extends SuperDepartment {

    // Constructor for HRDepartment class that takes the department name as input
    public HRDepartment(String departmentName) {
        super(departmentName);
    }

    // Overriding the departmentName method from the SuperDepartment class
    @Override
    public String departmentName() {
        return this.departmentName;
    }

    // Overriding the getTodayWork method from the SuperDepartment class
    @Override
    public String getTodayWork() {
        return "Team Lunch";
    }

    // Overriding the getWorkDeadline method from the SuperDepartment class
    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }

    // Custom method for HRDepartment class that returns a specific activity
    public String doActivity(){
        return "Fill today's timesheet and mark your attendance";
    }
}
