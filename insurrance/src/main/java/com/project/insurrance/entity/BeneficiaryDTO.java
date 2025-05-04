package com.project.insurrance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryDTO {
    private Integer id;
    private String name;
    private String relation;
    private String contact;
}
