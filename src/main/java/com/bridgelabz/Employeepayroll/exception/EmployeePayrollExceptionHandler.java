package com.bridgelabz.Employeepayroll.exception;

import com.bridgelabz.Employeepayroll.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {

    private static final String message = "Exception while processing REST request";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errMsg = errorList.stream()
                .map(objErr -> objErr.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO ("Exception while processing REST request", errMsg);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<ResponseDTO> handleEmployeePayrollException(EmployeePayrollException exception){
        ResponseDTO respDTO = new ResponseDTO( message, exception.getMessage());
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.BAD_REQUEST);
    }

}
