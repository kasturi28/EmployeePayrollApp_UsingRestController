package com.bridgelabz.Employeepayroll.dto;

public class EmployeeDTO {

    public static String name;
    public static long salary;

    // Constructors
    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "name = " + name + " salary = " + salary;
    }
}
