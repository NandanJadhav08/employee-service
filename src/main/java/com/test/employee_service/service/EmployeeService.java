package com.test.employee_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.employee_service.model.Employee;
import com.test.employee_service.repository.EmployeeRepository;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllUsers() {
        return employeeRepository.findAll();
    }

    public Employee addUser(Employee employee) {
        return employeeRepository.save(employee);
    }
}