package com.healthcare.healthcare.Services;

import com.healthcare.healthcare.Entities.Appointment;

import java.util.List;

public interface AppointmentService {

    Appointment saveAppointment(Appointment appointment);

    Appointment getAppointmentById(Long id);

    List<Appointment> getAllAppointments();

    Appointment updateAppointment(Appointment appointment);

    void deleteAppointment(Long id);

    // Add other business logic methods if needed
}

