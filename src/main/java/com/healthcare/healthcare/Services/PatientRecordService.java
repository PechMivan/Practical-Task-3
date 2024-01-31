package com.healthcare.healthcare.Services;

import com.healthcare.healthcare.Entities.PatientRecord;

import java.util.List;

public interface PatientRecordService {

    PatientRecord savePatientRecord(PatientRecord patientRecord);

    PatientRecord getPatientRecordById(Long id);

    List<PatientRecord> getAllPatientRecords();

    PatientRecord updatePatientRecord(PatientRecord patientRecord);

    void deletePatientRecord(Long id);

    // Add other business logic methods if needed
}

