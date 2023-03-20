package com.glearning.groupAssignment1.service;

import com.glearning.groupAssignment1.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

    // Constructor for TechDepartment that initializes department name
    public TechDepartment(String departmentName) {
        super(departmentName);
    }

    // Overrides the departmentName method from SuperDepartment
    @Override
    public String departmentName() {
        return this.departmentName;
    }

    // Overrides the getTodayWork method from SuperDepartment
    @Override
    public String getTodayWork() {
        return "Complete coding of module 1";
    }

    // Overrides the getWorkDeadline method from SuperDepartment
    @Override
    public String getWorkDeadline() {
        return "complete by EOD";
    }

    // Method specific to TechDepartment that returns tech stack information
    public String getTechStackInformation(){
        return "Core Java";
    }
}
