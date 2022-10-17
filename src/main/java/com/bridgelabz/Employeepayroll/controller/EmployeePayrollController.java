package com.bridgelabz.Employeepayroll.controller;

import com.bridgelabz.Employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.Employeepayroll.dto.ResponseDTO;
import com.bridgelabz.Employeepayroll.entity.Employee;
import com.bridgelabz.Employeepayroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<Employee> empDataList = null;
        empDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", empDataList);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayrollData(@RequestBody EmployeeDTO empPayrollDTO){
        Employee empData = null;
        empData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("id") int id)
    {
        Employee empPayrollData = null;
        empPayrollData = employeePayrollService.getEmployeePayrollDataById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successfull", empPayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("id") int id,
                                                                 @RequestBody EmployeeDTO empPayrollDTO){

        Employee employeePayrollData = employeePayrollService.updateEmployeePayrollData(id, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee payroll Data for: ", empPayrollDTO);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("id") int id){
        employeePayrollService.deleteEmployeePayrollData(id);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " +id);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


}
