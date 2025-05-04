package com.project.insurrance.service;

import com.project.insurrance.entity.BeneficiaryDTO;
import com.project.insurrance.entity.CompanyDTO;
import com.project.insurrance.entity.EmployeeDTO;
import com.project.insurrance.entity.Insurrance;
import com.project.insurrance.repository.InsurranceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InsurranceServiceImplement implements InsurranceService {
    private final ServiceBeneficiaryClient serviceBeneficiaryClient;
    private final ServiceCompanyClient serviceCompanyClient;
    private InsurranceRepository insurranceRepository;
    private ServiceEmployeeClient serviceEmployeeClient;

    @Override
    public Insurrance createInsurrance(Insurrance insurrance) {
        EmployeeDTO employee = serviceEmployeeClient.getById(insurrance.getIdEmployee());
        BeneficiaryDTO beneficiary = serviceBeneficiaryClient.getById(insurrance.getIdBeneficiary());
        CompanyDTO company = serviceCompanyClient.getByID(insurrance.getIdCompany());

        if(employee != null && beneficiary != null && company != null) {
            return insurranceRepository.save(insurrance);
        } else {
            throw new RuntimeException("Aucun employé trouvé avec l'ID: " + insurrance.getId());
        }
    }

    @Override
    public List<Insurrance> getAllInsurrances() {
        return insurranceRepository.findAll();
    }
}
