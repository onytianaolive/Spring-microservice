package com.project.insurrance.service;

import com.project.insurrance.entity.Insurrance;

import java.util.List;

public interface InsurranceService {
    public Insurrance createInsurrance(Insurrance insurrance);
    public List<Insurrance> getAllInsurrances();
}
