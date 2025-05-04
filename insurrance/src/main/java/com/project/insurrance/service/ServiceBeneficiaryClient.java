package com.project.insurrance.service;

import com.project.insurrance.entity.BeneficiaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "beneficiary")
public interface ServiceBeneficiaryClient {
    @GetMapping("/beneficiary")
    List<BeneficiaryDTO> getAllBeneficiaries();

    @GetMapping("/beneficiary/{id}")
    BeneficiaryDTO getById(@PathVariable Integer id);
}
