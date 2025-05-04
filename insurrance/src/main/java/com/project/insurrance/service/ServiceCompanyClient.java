package com.project.insurrance.service;

import com.project.insurrance.entity.CompanyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "company")
public interface ServiceCompanyClient {
    @GetMapping("/company")
    List<CompanyDTO> getAllCompanies();

    @GetMapping("/company/{id}")
    CompanyDTO getByID(@PathVariable Integer id);
}
