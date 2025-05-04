package com.project.insurrance.controller;

import com.project.insurrance.entity.EmployeeDTO;
import com.project.insurrance.service.ServiceEmployeeClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private ServiceEmployeeClient serviceEmployeeClient;

    @GetMapping("/employee")
    public List<EmployeeDTO> getEmployee() {
        return serviceEmployeeClient.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public EmployeeDTO getById(@PathVariable Integer id) {
        return serviceEmployeeClient.getById(id);
    }

}
