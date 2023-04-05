package com.demo.controller;

import com.demo.payload.EmployeeDto;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Employees")
public class EmployeeController {
@Autowired
    private EmployeeService employeeService;


//http://localhost:8080/api/Employees
    @PostMapping
    public ResponseEntity<EmployeeDto>saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto dto = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }
}
