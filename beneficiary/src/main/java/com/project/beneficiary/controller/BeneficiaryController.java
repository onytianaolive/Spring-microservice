package com.project.beneficiary.controller;

import com.project.beneficiary.entity.Beneficiary;
import com.project.beneficiary.service.BeneficiaryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/beneficiary")
public class BeneficiaryController {
    private BeneficiaryService beneficiaryService;

    @PostMapping("/add")
    public Beneficiary create(@RequestBody Beneficiary beneficiary){
        return beneficiaryService.createBeneficiary(beneficiary);
    }

    @GetMapping
    public List<Beneficiary> getAllBeneficiaries(){
        return beneficiaryService.getAllBeneficiaries();
    }

    @GetMapping("/{id}")
    public Beneficiary getById(@PathVariable Integer id){
        return beneficiaryService.getBeneficiary(id);
    }

    @PutMapping("/edit/{id}")
    public Beneficiary edit(@PathVariable Integer id, @RequestBody Beneficiary beneficiary){
        return beneficiaryService.editBeneficiary(id, beneficiary);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        beneficiaryService.deleteBeneficiary(id);
    }
}
