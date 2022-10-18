package com.bridgelabz.Employeepayroll.dto;

import lombok.Data;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Data
public class EmployeeDTO {
@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is invalid")
@NotEmpty(message = "Name should not be empty")
    public String name;

@Min(value = 300000, message = "Minimum salary should be Rs.300000" )
    public long salary;




}
