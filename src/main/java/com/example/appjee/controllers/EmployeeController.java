package com.example.appjee.controllers;

import com.example.appjee.daos.EmployeeDao;
import com.example.appjee.entities.Employee;
import com.example.appjee.models.EmployeeModel;
import com.example.appjee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemployee")
    Employee newEmployee(@RequestBody EmployeeModel newEmployee) {
        Employee employee = new Employee();
        employee.setFirstname(newEmployee.getFirstname());
        employee.setLastname(newEmployee.getLastname());
        return employeeService.AddEmployee(employee);
    }

    @GetMapping("/employees")
    public @ResponseBody
    List<Employee> getEmployees()
    {
        return employeeService.findAll();
    }

    @GetMapping(value = "/employee/{employeeId}")
    public @ResponseBody
    Optional<Employee> getEmployee(@PathVariable Long employeeId)
    {
        return employeeService.findById(employeeId);
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
