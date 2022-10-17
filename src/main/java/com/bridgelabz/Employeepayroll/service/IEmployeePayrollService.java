package com.bridgelabz.Employeepayroll.service;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    List<Employee> getEmployeePayrollData();

    Employee getEmployeePayrollDataById(int id);

    Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO);

    Employee updateEmployeePayrollData(int id,EmployeeDTO empPayrollDTO);

    void deleteEmployeePayrollData(int id);
}
