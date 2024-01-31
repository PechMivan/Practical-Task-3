package com.healthcare.healthcare.Repositories;

import com.healthcare.healthcare.Entities.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
}

