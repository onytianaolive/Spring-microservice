package com.project.company.controller;

import com.project.company.entity.Company;
import com.project.company.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {
    private CompanyService companyService;

    @PostMapping("/add")
    public Company create(@RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Company getByID(@PathVariable Integer id) {
        return companyService.getCompanyById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        companyService.deleteCompany(id);
    }
}
