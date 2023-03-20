package com.glearning.groupAssignment1.client;

import com.glearning.groupAssignment1.service.AdminDepartment;
import com.glearning.groupAssignment1.service.HRDepartment;
import com.glearning.groupAssignment1.service.TechDepartment;

public class Client {

    public static void main(String[] args) {

        // Creating an object of AdminDepartment
        AdminDepartment adminDepartment = new AdminDepartment("Admin");
        System.out.println("Welcome to " + adminDepartment.departmentName() + " Department");
        System.out.println(adminDepartment.getTodayWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));

        // Creating an object of HRDepartment
        HRDepartment hrDepartment = new HRDepartment("HR");
        System.out.println("Welcome to "+ hrDepartment.departmentName() + " Department");
        System.out.println(hrDepartment.getTodayWork());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));

        // Creating an object of TechDepartment
        TechDepartment techDepartment = new TechDepartment("Tech");
        System.out.println("Welcome to  " + techDepartment.departmentName() + " Department");
        System.out.println(techDepartment.getTodayWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayHoliday());
        System.out.println("-".repeat(40));
    }
}
