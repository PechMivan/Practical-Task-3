package com.healthcare.healthcare.Repositories;

import com.healthcare.healthcare.Entities.PrescribedMedicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescribedMedicineRepository extends JpaRepository<PrescribedMedicine, Long> {
}

