package com.project.company.service;

import com.project.company.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    public Company createCompany( Company company );
    public List<Company> getAllCompanies();
    public void deleteCompany(Integer id);
    public Company getCompanyById(Integer id);
}
