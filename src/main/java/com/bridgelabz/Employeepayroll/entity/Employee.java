package com.bridgelabz.Employeepayroll.entity;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Employee {


    private long id;
    private String name;

    private long salary;

    public Employee(long id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
