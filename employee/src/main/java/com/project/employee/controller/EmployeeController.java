package com.project.employee.controller;

import com.project.employee.entity.Employee;
import com.project.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.listEmployee();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
         employeeService.deleteEmployee(id);
    }
    @PutMapping("/edit/{id}")
    public Employee editEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        return employeeService.editEmployee(id, employee);
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }
}
