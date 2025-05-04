package com.project.beneficiary.service;

import com.project.beneficiary.entity.Beneficiary;
import com.project.beneficiary.repository.BeneficiaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BeneficiaryServiceImplement implements BeneficiaryService{
    private BeneficiaryRepository beneficiaryRepository;
    private EmailService emailService;

    @Override
    public Beneficiary createBeneficiary(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    @Override
    public Beneficiary editBeneficiary(Integer id, Beneficiary beneficiary) {
        return beneficiaryRepository.findById(id)
                .map(b -> {
                    b.setName(beneficiary.getName());
                    b.setRelation(beneficiary.getRelation());
                    b.setContact(beneficiary.getContact());
                    return beneficiaryRepository.save(b);
                }).orElseThrow(() -> new RuntimeException("Beneficiary not found"));
    }

    @Override
    public void deleteBeneficiary(Integer id) {
        beneficiaryRepository.deleteById(id);
    }

    @Override
    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    @Override
    public Beneficiary getBeneficiary(Integer id) {
        return beneficiaryRepository.findById(id).orElseThrow(() -> new RuntimeException("Beneficiary not found"));
    }
}
