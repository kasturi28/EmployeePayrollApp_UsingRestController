package com.bridgelabz.Employeepayroll.service;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    @Override
    public List<Employee> getEmployeePayrollData() {
        List<Employee> empDataList = new ArrayList<>();
        empDataList.add(new Employee(1, new EmployeeDTO("Kasturi", 900000)));
        empDataList.add(new Employee(2, new EmployeeDTO("Sagar", 800000)));
        return empDataList;
    }

    @Override
    public Employee getEmployeePayrollDataById(long id) {
        Employee empData = null;
        empData = new Employee(1, new EmployeeDTO("Nilesh", 750000));
        return empData;
    }

    @Override
    public Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee empData = null;
        empData = new Employee(1, empPayrollDTO);
        return empData;
    }

    @Override
    public Employee updateEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee empData = null;
        empData = new Employee(1, empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(long id) {

    }
}
