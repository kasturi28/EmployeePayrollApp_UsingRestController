package com.bridgelabz.Employeepayroll.entity;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {


    private long id;
    private String name;

    private long salary;

    public Employee(long id, EmployeeDTO employeeDTO) {
        this.id = id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
    }



}
