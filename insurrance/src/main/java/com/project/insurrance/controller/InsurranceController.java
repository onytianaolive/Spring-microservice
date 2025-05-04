package com.project.insurrance.controller;

import com.project.insurrance.entity.Insurrance;
import com.project.insurrance.service.InsurranceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insurrance")
@AllArgsConstructor
public class InsurranceController {
    private InsurranceService insurranceService;

    @PostMapping("/add")
    public Insurrance create(@RequestBody Insurrance insurrance) {
        return insurranceService.createInsurrance(insurrance);
    }

    @GetMapping
    public List<Insurrance> getAll(){
        return insurranceService.getAllInsurrances();
    }
}
