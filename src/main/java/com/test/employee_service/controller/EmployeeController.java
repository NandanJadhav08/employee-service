package com.test.employee_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.employee_service.model.Employee;
import com.test.employee_service.service.EmployeeService;



@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/users")
    public List<Employee> getUsers() {
        return employeeService.getAllUsers();
    }

    @PostMapping("/adduser")
    public Employee addUser(@RequestBody Employee employee) {
        return employeeService.addUser(employee);
    }
}