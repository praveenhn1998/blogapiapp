package com.demo.service;
import com.demo.entity.Employee;
import com.demo.payload.EmployeeDto;
import com.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setEmail(employeeDto.getEmail());
        employee.setCity(employeeDto.getCity());
        Employee newEmployee = employeeRepository.save(employee);


        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setEmpid( newEmployee.getEmpid());
        employeeDto1.setName(newEmployee.getName());
        employeeDto1.setCity(newEmployee.getCity());
        employeeDto1.setEmail(newEmployee.getEmail());
        return employeeDto1;
    }
}

