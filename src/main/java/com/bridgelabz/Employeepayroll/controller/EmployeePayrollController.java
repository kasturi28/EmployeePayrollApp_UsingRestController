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

    @PostMapping("/insert")
    public Employee insertData(@RequestBody EmployeeDTO employeeDTO){
        Employee employeeData = new Employee( 1, new EmployeeDTO("Kasturi" , 200000));
        return employeeData;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("id") long id) {
        Employee emp = null;
        emp = new Employee(2 , new EmployeeDTO("Sagar", 700000));
        ResponseDTO response = new ResponseDTO("Get call success", emp);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeeDTO employeeDTO) {
        Employee emp = null;
        emp= new Employee(2, employeeDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee payroll Data : ", employeeDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("id") long id) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Employee Data ", id);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


}
