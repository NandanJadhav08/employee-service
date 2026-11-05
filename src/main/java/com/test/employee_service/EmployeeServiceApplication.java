package com.test.employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.test.employee_service.model.Employee;
import com.test.employee_service.repository.EmployeeRepository;



@SpringBootApplication
public class EmployeeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeEmployees(
            EmployeeRepository employeeRepository) {

        return args -> {

            if (employeeRepository.count() == 0) {

                employeeRepository.save(
                    new Employee(1, "Nandan", 24));

                employeeRepository.save(
                    new Employee(2, "Abhishek", 30));
            }
        };
    }
}