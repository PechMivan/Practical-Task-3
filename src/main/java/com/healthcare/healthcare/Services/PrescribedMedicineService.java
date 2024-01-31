package com.healthcare.healthcare.Services;

import com.healthcare.healthcare.Entities.PrescribedMedicine;

import java.util.List;

public interface PrescribedMedicineService {

    PrescribedMedicine savePrescribedMedicine(PrescribedMedicine prescribedMedicine);

    PrescribedMedicine getPrescribedMedicineById(Long id);

    List<PrescribedMedicine> getAllPrescribedMedicines();

    PrescribedMedicine updatePrescribedMedicine(PrescribedMedicine prescribedMedicine);

    void deletePrescribedMedicine(Long id);

    // Add other business logic methods if needed
}

