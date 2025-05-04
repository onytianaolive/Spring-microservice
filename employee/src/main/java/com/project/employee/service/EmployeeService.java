package com.project.employee.service;

import com.project.employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public Employee editEmployee(Integer id, Employee employee);
    public List<Employee> listEmployee();
    public void deleteEmployee(Integer id);
    public Employee getById(Integer id);
}
