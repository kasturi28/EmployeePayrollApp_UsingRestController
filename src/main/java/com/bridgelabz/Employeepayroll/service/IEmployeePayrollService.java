package com.bridgelabz.Employeepayroll.service;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    List<Employee> getEmployeePayrollData();

    Employee getEmployeePayrollDataById(long id);

    Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO);

    Employee updateEmployeePayrollData(EmployeeDTO empPayrollDTO);

    void deleteEmployeePayrollData(long id);
}
