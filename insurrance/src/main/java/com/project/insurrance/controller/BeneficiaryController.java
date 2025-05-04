package com.project.insurrance.controller;

import com.project.insurrance.entity.BeneficiaryDTO;
import com.project.insurrance.service.ServiceBeneficiaryClient;
import jakarta.ws.rs.Path;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BeneficiaryController {
    private ServiceBeneficiaryClient serviceBeneficiaryClient;

    @GetMapping("/beneficiary")
    public List<BeneficiaryDTO> getAllBeneficiaries(){
        return serviceBeneficiaryClient.getAllBeneficiaries();
    }

    @GetMapping("/beneficiary/{id}")
    public BeneficiaryDTO getById(@PathVariable Integer id){
        return serviceBeneficiaryClient.getById(id);
    }
}
