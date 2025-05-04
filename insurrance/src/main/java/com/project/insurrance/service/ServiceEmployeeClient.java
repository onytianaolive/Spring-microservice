package com.project.insurrance.service;

import com.project.insurrance.entity.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employee")
public interface ServiceEmployeeClient {
    @GetMapping("/employee")
    List<EmployeeDTO> getEmployee();

    @GetMapping("/employee/{id}")
    EmployeeDTO getById(@PathVariable Integer id);

}
