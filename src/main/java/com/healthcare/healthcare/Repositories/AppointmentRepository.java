package com.healthcare.healthcare.Repositories;

import com.healthcare.healthcare.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

