package com.healthcare.healthcare.Services;

import com.healthcare.healthcare.Entities.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatient(Patient patient);

    Patient getPatientById(Long id);

    List<Patient> getAllPatients();

    Patient updatePatient(Patient patient);

    void deletePatient(Long id);

    // Add other business logic methods if needed
}

