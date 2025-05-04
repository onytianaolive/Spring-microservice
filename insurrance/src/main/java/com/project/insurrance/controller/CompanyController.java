package com.project.insurrance.controller;

import com.project.insurrance.entity.CompanyDTO;
import com.project.insurrance.service.ServiceCompanyClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CompanyController {
    private ServiceCompanyClient serviceCompanyClient;

    @GetMapping("/company")
    public List<CompanyDTO> getAllCompanies(){
        return serviceCompanyClient.getAllCompanies();
    }

    @GetMapping("/company/{id}")
    public CompanyDTO getById(@PathVariable Integer id){
        return serviceCompanyClient.getByID(id);
    }
}
