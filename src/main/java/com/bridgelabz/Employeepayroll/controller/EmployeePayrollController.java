package com.bridgelabz.Employeepayroll.controller;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {

    @PostMapping("/insert")
    public Employee insertData(@RequestBody EmployeeDTO employeeDTO){
        Employee employeeData = new Employee( 1, employeeDTO.name , employeeDTO.salary);
        return employeeData;
    }
}
