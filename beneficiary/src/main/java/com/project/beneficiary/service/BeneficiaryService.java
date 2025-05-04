package com.project.beneficiary.service;

import com.project.beneficiary.entity.Beneficiary;

import java.util.List;
import java.util.Optional;

public interface BeneficiaryService {
    public Beneficiary createBeneficiary(Beneficiary beneficiary);
    public Beneficiary editBeneficiary(Integer id, Beneficiary beneficiary);
    public void deleteBeneficiary(Integer id);
    public List<Beneficiary> getAllBeneficiaries();
    public Beneficiary getBeneficiary(Integer id);
}
