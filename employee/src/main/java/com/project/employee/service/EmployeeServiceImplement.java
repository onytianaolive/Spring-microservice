package com.project.employee.service;

import com.project.employee.entity.Employee;
import com.project.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImplement implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee editEmployee(Integer id, Employee employee) {
        return employeeRepository.findById(id)
                .map(e -> {
                    e.setAddress(employee.getAddress());
                    e.setName(employee.getName());
                    e.setInsurrenceNumber(employee.getInsurrenceNumber());
                    return employeeRepository.save(e);
                }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public List<Employee> listEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}
