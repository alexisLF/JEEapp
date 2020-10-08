package com.example.appjee.services;

import com.example.appjee.entities.Employee;

import java.util.List;
import java.util.Optional;


public interface IEmployeeService {
    Employee AddEmployee(Employee employee);
    List<Employee> findAll();
    Optional<Employee> findById(Long employeeId);
}
