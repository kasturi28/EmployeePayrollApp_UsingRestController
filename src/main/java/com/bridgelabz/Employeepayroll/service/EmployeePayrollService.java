package com.bridgelabz.Employeepayroll.service;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    private List<Employee> employeePayrollList = new ArrayList<>();

    /**
     * Method for All Employee Payroll data List
     */
    @Override
    public List<Employee> getEmployeePayrollData() {
        return employeePayrollList;
    }

    /**
     * Method for get an employee data by id
     */
    @Override
    public Employee getEmployeePayrollDataById(int id) {
        return employeePayrollList.get(id-1);
    }

    /**
     * Method to Create an Employee Payroll data
     */
    @Override
    public Employee createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        Employee emp = null;
        emp = new Employee(employeePayrollList.size()+1, empPayrollDTO);
        employeePayrollList.add(emp);
        return emp;
    }

    /**
     * Method to Update an Employee Payroll data
     */
    @Override
    public Employee updateEmployeePayrollData(int id, EmployeeDTO empPayrollDTO) {
        Employee empData = this.getEmployeePayrollDataById(id);
        empData.setName(empPayrollDTO.name);
        empData.setSalary(empPayrollDTO.salary);
        employeePayrollList.set(id-1, empData);
        return empData;
    }

    /**
     * Method to Delete an Employee Payroll data
     */
    @Override
    public void deleteEmployeePayrollData(int id) {
        employeePayrollList.remove(id-1);
    }
}
