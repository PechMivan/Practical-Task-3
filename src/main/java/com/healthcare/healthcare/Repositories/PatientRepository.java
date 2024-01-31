package com.healthcare.healthcare.Repositories;

import com.healthcare.healthcare.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> { }

