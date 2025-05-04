package com.project.insurrance.repository;

import com.project.insurrance.entity.Insurrance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurranceRepository extends JpaRepository<Insurrance, Integer> {
}
